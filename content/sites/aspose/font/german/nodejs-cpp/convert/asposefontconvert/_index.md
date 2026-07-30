---
title: "AsposeFontConvert"
second_title: "Aspose.Font für Node.js via C++"
description: "Konvertiert die Schrift in ein anderes Format"
type: docs
weight: 10
url: /de/nodejs-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

Konvertiert die Schrift in ein anderes Format.

```js
function AsposeFontConvert(
    fileName,
    fontType,
    fontSavingFormat
)
```

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileName | string | Dateiname. |
| fontType | FontType | Schrifttyp zum Konvertieren. |
| fontSavingFormat | FontSavingFormats | Schriftformat, in das konvertiert werden soll. |

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Textfehler ("" kein Fehler) |
|  | fileNameResult | Ergebnisdateiname |

### Hinweise

Hinweis: Der TTF-Schrifttyp wird derzeit nur unterstützt.

### Beispiele

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

### Siehe auch

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
