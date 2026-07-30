---
title: "AsposeFontConvertToSVG"
second_title: "Aspose.Font per Node.js via C++"
description: "Converte il Font nel formato svg"
type: docs
weight: 10
url: /it/nodejs-cpp/convert/asposefontconverttosvg/
---
## AsposeFontConvertToSVG function

Converte il Font nel formato SVG.

```js
function AsposeFontConvertToSVG(
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
    //call AsposeFontConvertToSVG to convert font
    const json = AsposeFontModule.AsposeFontConvertToSVG(font_file,AsposeFontModule.FontType.TTF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

const json = AsposeFontModule.AsposeFontConvertToSVG(font_file,AsposeFontModule.FontType.TTF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### Vedi anche

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
