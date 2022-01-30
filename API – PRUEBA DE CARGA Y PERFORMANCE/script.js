import http from 'k6/http';
import { check, sleep } from 'k6';

const URL = "https://order-pizza-api.herokuapp.com/api/"
let access_token;
let Order_ID;
const headers = { 'Content-Type': 'application/json' }

export let options = {
    stages: [
        { duration: '2m30s', target: 60 },
        { duration: '5m', target: 100 }
    ],
};

export default function() {

    // - - - - Auth method - - - - //
    let authRes = http.post(
        URL + 'auth', // URL
        JSON.stringify({
            password: "test",
            username: "test"
        }), // Body
        { headers } // Header
    );

    sleep(3);
    // Chech if status code is 200
    check(authRes, { 'status code': (r) => r.status === 200 });
    console.log('Status code of auth method: ' + authRes.status);
    console.log('Response time was: ' + String(authRes.timings.duration));
    // the access token is saved
    access_token = JSON.parse(authRes.body).access_token

    // - - - - GET Method - - - - //
    let getRes = http.get(
        URL + 'orders', // URL
        { headers } // Header
    );

    // Chech if status code is 200
    console.log('Status code of get order method: ' + getRes.status);
    console.log('Response time was: ' + String(getRes.timings.duration));
    check(getRes, { 'status code': (r) => r.status === 200 });

    // - - - - POST Method - - - - //
    let postRes = http.post(
        URL + 'orders', // URL
        JSON.stringify({
            "Crust": "Crust",
            "Flavor": "Flavor",
            "Size": "Size",
            "Table_No": Math.floor(Math.random() * 1000)
        }), // Body
        {
            headers: {
                'Content-Type': 'application/json',
                Authorization: 'Bearer ' + access_token
            }
        } // Header
    );

    // Chech if status code is 201
    console.log('Status code of post order method: ' + postRes.status);
    console.log('Response time was: ' + String(postRes.timings.duration));
    check(postRes, { 'status code': (r) => r.status === 201 });
    sleep(3);
    // the Order_ID is saved
    Order_ID = JSON.parse(postRes.body).Order_ID

    // - - - - DELETE Method - - - - //
    let deleteRes = http.del(
        URL + 'orders/' + Order_ID, // URL
        { headers } // Header
    );
    sleep(3);
    // Chech if status code is 200
    console.log('Status code of delete order method: ' + deleteRes.status);
    console.log('Response time was: ' + String(deleteRes.timings.duration));
    check(deleteRes, { 'status code': (r) => r.status === 200 });
}