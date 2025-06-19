---
title: "AsposePageAbout"
second_title: Aspose.Page for JavaScript via C++
description: "Get info about Product."
type: docs
url: /nodejs-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

Get info about Product.

```js
function AsposePageAbout()
```

### Return value

JSON object 
| Field | Description |
| ----- | ----------- |
| errorCode | code error (0 no error) |
| errorText | text error ("" no error) |
| product | Product name |
| version | Product version |
| islicensed | Product is licensed |


```js
const AsposePage = require('asposepagenodejs');

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    //PageAbout - Get info about Product
    const json = AsposePageModule.AsposePageAbout();
    console.log("PageAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```
