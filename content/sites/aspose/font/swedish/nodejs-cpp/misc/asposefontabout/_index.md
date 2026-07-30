---
title: "AsposeFontAbout"
second_title: "Aspose.Font för Node.js via C++"
description: "Hämta information om produkten."
type: docs
url: /sv/nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

Hämta information om produkten.

```js
function AsposeFontAbout()
```

### Returvärde

JSON-objekt
| Fält | Beskrivning |
| ----- | ----------- |
| errorCode | felkod (0 inget fel) |
| errorText | textfel ("" inget fel) |
| produkt | Produktnamn |
| version | Produktversion |
| islicensed | Produkten är licensierad |


## Exempel
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
