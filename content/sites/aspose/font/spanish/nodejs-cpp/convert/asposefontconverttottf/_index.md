---
title: "AsposeFontConvertToTTF"
second_title: "Aspose.Font para Node.js mediante C++"
description: "Convierte la fuente al formato ttf"
type: docs
weight: 10
url: /es/nodejs-cpp/convert/asposefontconverttottf/
---
## AsposeFontConvertToTTF function

Convierte la fuente al formato TTF.

```js
function AsposeFontConvertToTTF(
    fileName,
    fontType
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileName | string | Nombre de archivo. |
| fontType | FontType | Tipo de fuente a convertir. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | error de código (0 sin error) |
|  | errorText | error de texto (\"\" sin error) |
|  | fileNameResult | nombre de archivo de resultado |

### Ejemplos

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

### Ver también

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
