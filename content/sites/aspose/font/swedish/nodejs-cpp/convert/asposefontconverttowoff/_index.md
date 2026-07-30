---
title: "AsposeFontConvertToWOFF"
second_title: "Aspose.Font för Node.js via C++"
description: "Konverterar teckensnittet till woff-format"
type: docs
weight: 10
url: /sv/nodejs-cpp/convert/asposefontconverttowoff/
---
## AsposeFontConvertToWOFF function

Konverterar teckensnittet till WOFF-format.

```js
function AsposeFontConvertToWOFF(
    fileName,
    fontType
)
```

| Parameter | Typ | Beskrivning |
| --------- | ---- | ----------- |
| fileName | string | Filnamn. |
| fontType | FontType | Teckensnittstyp att konvertera. |

### Returvärde

JSON-objekt
| Fält | Beskrivning |
| ----- | ----------- |
|  | errorCode | felkod (0 inget fel) |
|  | errorText | textfel ("" inget fel) |
|  | fileNameResult | resultatfilnamn |

### Exempel

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

### Se även

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
