---
title: "AsposeFontConvertToTTF"
second_title: "Aspose.Font для Node.js через C++"
description: "Преобразует шрифт в формат ttf"
type: docs
weight: 10
url: /ru/nodejs-cpp/convert/asposefontconverttottf/
---
## AsposeFontConvertToTTF function

Преобразует шрифт в формат TTF.

```js
function AsposeFontConvertToTTF(
    fileName,
    fontType
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileName | string | Имя файла. |
| fontType | FontType | Тип шрифта для преобразования. |

### Возвращаемое значение

JSON-объект
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 нет ошибки) |
|  | errorText | текстовая ошибка (\"\" нет ошибки) |
|  | fileNameResult | имя результирующего файла |

### Примеры

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

### См. также

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
