---
title: "AsposeFontConvertToWOFF2"
second_title: "Aspose.Font per Node.js via C++"
description: "Converte il Font nel formato woff2"
type: docs
weight: 10
url: /it/nodejs-cpp/convert/asposefontconverttowoff2/
---
## AsposeFontConvertToWOFF2 function

Converte il Font nel formato WOFF2.

```js
function AsposeFontConvertToWOFF2(
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
    //call AsposeFontConvertToWOFF2 to convert font
    const json = AsposeFontModule.AsposeFontConvertToWOFF2(font_file,AsposeFontModule.FontType.TTF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

const json = AsposeFontModule.AsposeFontConvertToWOFF2(font_file,AsposeFontModule.FontType.TTF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### Vedi anche

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
