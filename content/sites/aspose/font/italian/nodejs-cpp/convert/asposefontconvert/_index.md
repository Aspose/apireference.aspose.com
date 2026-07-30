---
title: "AsposeFontConvert"
second_title: "Aspose.Font per Node.js via C++"
description: "Converte il Font in un altro formato"
type: docs
weight: 10
url: /it/nodejs-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

Converte il Font in un altro formato.

```js
function AsposeFontConvert(
    fileName,
    fontType,
    fontSavingFormat
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileName | string | Nome file. |
| fontType | FontType | Tipo di Font da convertire. |
| fontSavingFormat | FontSavingFormats | Formato del Font in cui convertire. |

### Valore restituito

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | codice errore (0 nessun errore) |
|  | errorText | errore di testo ("" nessun errore) |
|  | fileNameResult | nome file risultato |

### Osservazioni

Nota: il tipo di Font TTF è ora supportato solo.

### Esempi

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

### Vedi anche

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
