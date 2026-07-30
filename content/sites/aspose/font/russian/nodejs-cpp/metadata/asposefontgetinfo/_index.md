---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font для Node.js через C++"
description: "Получить информацию (metadata) из файла шрифта."
type: docs
url: /ru/nodejs-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_Получить информацию (метаданные) из файла шрифта._

```js
function AsposeFontGetInfo(
    fileName
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileName | string | Имя файла. |

### Возвращаемое значение

JSON-объект
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 нет ошибки) |
|  | errorText | текстовая ошибка (\"\" нет ошибки) |
|  | записи | Массив JSON-объектов : |
|  | * NameId | идентификатор имени |
|  | * PlatformId | идентификатор платформы |
|  | * PlatformSpecificId | идентификатор, специфичный для платформы |
|  | * LanguageId | идентификатор языка |
|  | * Информация | содержимое записи имени |

### Примеры

**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    //AsposeFontGetInfo - get metadata information
    const json = AsposeFontModule.AsposeFontGetInfo(font_file);
    console.log("AsposeFontGetInfo => %O",  json.errorCode == 0 ? json.records.reduce((ret, a) => ret +
        "\nNameId : " + a.NameId
        + "; PlatformId : " + a.PlatformId
        + "; PlatformSpecificId : " + a.PlatformSpecificId
        + "; LanguageId : " + a.LanguageId
        + "; Info : " + a.Info,"") : json.errorText);

});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeFontGetInfo - get metadata font information
json = AsposeFontModule.AsposeFontGetInfo(font_file);
console.log("AsposeFontGetInfo => %O",  json.errorCode == 0 ? json.records.reduce((ret, a) => ret +
    "\nNameId : " + a.NameId
  + "; PlatformId : " + a.PlatformId
  + "; PlatformSpecificId : " + a.PlatformSpecificId
  + "; LanguageId : " + a.LanguageId
  + "; Info : " + a.Info,"") : json.errorText);
```
