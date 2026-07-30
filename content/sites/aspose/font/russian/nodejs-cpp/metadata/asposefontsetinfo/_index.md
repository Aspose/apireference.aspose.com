---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font для Node.js через C++"
description: "Установить информацию (метаданные) в файл шрифта."
type: docs
url: /ru/nodejs-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_Установить информацию (метаданные) в файл шрифта._

```js
function AsposeFontSetInfo(
    fileName,
    nameId, 
    platformId, 
    platformSpecificId, 
    languageId, 
    text
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileName | string | Имя файла. |
| nameId | TtfNameTableNameId | Идентификатор имени, логическая категория строки, указанная перечислением [`NameId`](../../enumerations/ttfnametablenameid/) |
|  | platformId | TtfNameTablePlatformId | Идентификатор платформы |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы. Пожалуйста, используйте значение из одного из следующих перечислений — [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). Какое перечисление использовать, определяется контекстом (параметр *platformId*). |
| languageId | int | Идентификатор языка. Пожалуйста, используйте значение из перечислений [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) или [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/), в зависимости от контекста, определяемого параметром *platformId*. |
|  | текст | string | Фактические данные строки |

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

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    //AsposeSetInfo - set metadata info into font
    const nameId = AsposeFontModule.TtfNameTableNameId.Description;
    const platformId = AsposeFontModule.TtfNameTablePlatformId.Microsoft;
    const platformSpecificId = AsposeFontModule.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
    const langID = Module.TtfNameTableMSLanguageId.English_United_States.value;
    const text = "Updated description";
    
    const json = AsposeFontSetInfo(font_file, nameId, platformId, platformSpecificId, langID, text);
    console.log("AsposeFontSetInfo => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeSetInfo - set metadata info into font
const nameId = AsposeFontModule.TtfNameTableNameId.Description;
const platformId = AsposeFontModule.TtfNameTablePlatformId.Microsoft;
const platformSpecificId = AsposeFontModule.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
const langID = Module.TtfNameTableMSLanguageId.English_United_States.value;
const text = "Updated description";

const json = AsposeFontModule.AsposeFontSetInfo(font_file, nameId, platformId, platformSpecificId, langID, text);
console.log("AsposeFontSetInfo => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### См. также

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
