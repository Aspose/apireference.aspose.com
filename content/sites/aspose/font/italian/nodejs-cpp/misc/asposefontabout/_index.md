---
title: "AsposeFontAbout"
second_title: "Aspose.Font per Node.js via C++"
description: "Ottieni informazioni sul prodotto."
type: docs
url: /it/nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

Ottieni informazioni sul prodotto.

```js
function AsposeFontAbout()
```

### Valore restituito

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
| errorCode | codice errore (0 nessun errore) |
| errorText | errore di testo ("" nessun errore) |
| prodotto | Nome prodotto |
| versione | Versione prodotto |
| islicensed | Il prodotto è licenziato |


## Esempio
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
