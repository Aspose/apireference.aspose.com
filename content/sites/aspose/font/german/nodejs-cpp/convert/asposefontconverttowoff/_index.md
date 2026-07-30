---
title: "AsposeFontConvertToWOFF"
second_title: "Aspose.Font für Node.js via C++"
description: "Konvertiert die Schrift in das woff-Format"
type: docs
weight: 10
url: /de/nodejs-cpp/convert/asposefontconverttowoff/
---
## AsposeFontConvertToWOFF function

Konvertiert die Schrift in das WOFF-Format.

```js
function AsposeFontConvertToWOFF(
    fileName,
    fontType
)
```

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileName | string | Dateiname. |
| fontType | FontType | Schrifttyp zum Konvertieren. |

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Textfehler ("" kein Fehler) |
|  | fileNameResult | Ergebnisdateiname |

### Beispiele

**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log('Aspose.Font for Node.js via C++ example');

AsposeFont().then(AsposeFontModule => {
    //call AsposeFontConvertToWOFF to convert font
    const json = AsposeFontModule.AsposeFontConvertToWOFF(font_file,AsposeFontModule.FontType.TTF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

const json = AsposeFontModule.AsposeFontConvertToWOFF(font_file,AsposeFontModule.FontType.TTF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### Siehe auch

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
