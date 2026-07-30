---
title: "AsposeFontAbout"
second_title: "Aspose.Font für Node.js via C++"
description: "Lese Informationen über das Produkt."
type: docs
url: /de/nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

Lese Informationen über das Produkt.

```js
function AsposeFontAbout()
```

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
| errorCode | Fehlercode (0 kein Fehler) |
| errorText | Textfehler ("" kein Fehler) |
| Produkt | Produktname |
| Version | Produktversion |
| islicensed | Produkt ist lizenziert |


## Beispiel
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
