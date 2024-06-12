---
title: "AsposeFontAbout"
second_title: Aspose.Font for Node.js via C++
description: "Get info about Product."
type: docs
url: /nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

Get info about Product.

```js
function AsposeFontAbout()
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


## Example
**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    json = AsposeFontModule.AsposeFontAbout();
    console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeFontAbout - Get info about Product
const json = AsposeFontModule.AsposeFontAbout();
console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
```
