---
title: "AsposeFontConvertToTTF"
second_title: "Aspose.Font per Node.js via C++"
description: "Converte il Font nel formato ttf"
type: docs
weight: 10
url: /it/nodejs-cpp/convert/asposefontconverttottf/
---
## AsposeFontConvertToTTF function

Converte il Font nel formato TTF.

```js
function AsposeFontConvertToTTF(
    fileName,
    fontType
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileName | string | Nome file. |
| fontType | FontType | Tipo di Font da convertire. |

### Valore restituito

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | codice errore (0 nessun errore) |
|  | errorText | errore di testo ("" nessun errore) |
|  | fileNameResult | nome file risultato |

### Esempi

**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');
const font_file = "./fonts/Lora-Regular.ttf";
console.log('Aspose.Font for Node.js via C++ example');
AsposeFont().then(AsposeFontModule => {
    //call AsposeFontConvert to convert font
    const json = AsposeFontModule.AsposeFontConvertToTTF(font_file,AsposeFontModule.FontType.TTF,AsposeFontModule.FontSavingFormats.WOFF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript/ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';
const font_file ="./fonts/arial.ttf";
const AsposeFontModule = await AsposeFont();
console.log('Aspose.Font for Node.js via C++ example');
const json = AsposeFontModule.AsposeFontConvertToTTF(font_file,AsposeFontModule.FontType.TTF,AsposeFontModule.FontSavingFormats.WOFF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### Vedi anche

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
