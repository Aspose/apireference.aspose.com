---
title: "AsposeFontConvert"
second_title: "Aspose.Font för Node.js via C++"
description: "Konverterar teckensnittet till ett annat format"
type: docs
weight: 10
url: /sv/nodejs-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

Konverterar teckensnittet till ett annat format.

```js
function AsposeFontConvert(
    fileName,
    fontType,
    fontSavingFormat
)
```

| Parameter | Typ | Beskrivning |
| --------- | ---- | ----------- |
| fileName | string | Filnamn. |
| fontType | FontType | Teckensnittstyp att konvertera. |
| fontSavingFormat | FontSavingFormats | Teckensnittformat att konvertera till. |

### Returvärde

JSON-objekt
| Fält | Beskrivning |
| ----- | ----------- |
|  | errorCode | felkod (0 inget fel) |
|  | errorText | textfel ("" inget fel) |
|  | fileNameResult | resultatfilnamn |

### Anmärkningar

Obs: TTF-teckensnittstyp stöds nu endast.

### Exempel

**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log('Aspose.Font for Node.js via C++ example');

AsposeFont().then(AsposeFontModule => {
    //call AsposeFontConvert to convert font
    const json = AsposeFontModule.AsposeFontConvert(font_file,AsposeFontModule.FontType.TTF,AsposeFontModule.FontSavingFormats.WOFF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

const json = AsposeFontModule.AsposeFontConvert(font_file,AsposeFontModule.FontType.TTF,AsposeFontModule.FontSavingFormats.WOFF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### Se även

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
