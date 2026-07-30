---
title: "AsposeFontConvert"
second_title: "Aspose.Font для Node.js через C++"
description: "Преобразует шрифт в другой формат"
type: docs
weight: 10
url: /ru/nodejs-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

Преобразует шрифт в другой формат.

```js
function AsposeFontConvert(
    fileName,
    fontType,
    fontSavingFormat
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileName | string | Имя файла. |
| fontType | FontType | Тип шрифта для преобразования. |
| fontSavingFormat | FontSavingFormats | Формат шрифта для преобразования. |

### Возвращаемое значение

JSON-объект
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 нет ошибки) |
|  | errorText | текстовая ошибка (\"\" нет ошибки) |
|  | fileNameResult | имя результирующего файла |

### Примечания

Примечание: тип шрифта TTF теперь поддерживается только.

### Примеры

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

### См. также

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
