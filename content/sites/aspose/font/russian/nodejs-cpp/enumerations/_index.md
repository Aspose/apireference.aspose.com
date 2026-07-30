---
title: "Перечисления"
second_title: "Aspose.Font для Node.js через C++"
description: "Функции преобразования шрифтов в форматы TrueType."
type: docs
url: /ru/nodejs-cpp/enumerations/
---

## Перечисления

| Перечисление | Описание |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | Указывает тип шрифта. |
| [FontType](./fonttype/) | Указывает тип шрифта. |
| [TtfNameTableNameId](./ttfnametablenameid/) | Указывает NameId. |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | Представляет перечисление PlatformId. |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | Представляет перечисление MSPlatformSpecificId. |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | Представляет перечисление MacPlatformSpecificId. |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | Представляет перечисление UnicodePlatformSpecificId. |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | Перечисление идентификаторов языков платформы Macintosh. |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | Перечисление идентификаторов языков платформы Microsoft. |

### Example of using enumarations
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    //define parameters for AsposeFontSetInfo
    const nameId = AsposeFontModule.TtfNameTableNameId.Description;
    const platformId = AsposeFontModule.TtfNameTablePlatformId.Microsoft;
    const platformSpecificId = AsposeFontModule.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
    const langID = Module.TtfNameTableMSLanguageId.English_United_States.value;
    const text = "Updated description";
    
    const json = AsposeFontSetInfo(font_file, nameId, platformId, platformSpecificId, langID, text);
    console.log("AsposeFontSetInfo => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```