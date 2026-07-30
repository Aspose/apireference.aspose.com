---
title: "AsposeFontConvert"
second_title: "Aspose.Font para Node.js mediante C++"
description: "Convierte la fuente a otro formato"
type: docs
weight: 10
url: /es/nodejs-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

Convierte la fuente a otro formato.

```js
function AsposeFontConvert(
    fileName,
    fontType,
    fontSavingFormat
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileName | string | Nombre de archivo. |
| fontType | FontType | Tipo de fuente a convertir. |
| fontSavingFormat | FontSavingFormats | Formato de fuente al que convertir. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | error de código (0 sin error) |
|  | errorText | error de texto (\"\" sin error) |
|  | fileNameResult | nombre de archivo de resultado |

### Observaciones

Nota: El tipo de fuente TTF ahora solo está soportado.

### Ejemplos

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

### Ver también

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
