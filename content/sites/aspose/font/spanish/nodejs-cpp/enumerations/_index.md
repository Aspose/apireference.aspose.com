---
title: "Enumeraciones"
second_title: "Aspose.Font para Node.js mediante C++"
description: "Funciones para convertir fuentes a formatos TrueType."
type: docs
url: /es/nodejs-cpp/enumerations/
---

## Enumeraciones

| Enumeración | Descripción |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | Especifica el tipo de fuente. |
| [FontType](./fonttype/) | Especifica el tipo de fuente. |
| [TtfNameTableNameId](./ttfnametablenameid/) | Especifica NameId. |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | Representa la enumeración PlatformId. |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | Representa la enumeración MSPlatformSpecificId. |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | Representa la enumeración MacPlatformSpecificId. |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | Representa la enumeración UnicodePlatformSpecificId. |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | Enumeración de identificador de idioma de la plataforma Macintosh. |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | Enumeración de identificador de idioma de la plataforma Microsoft. |

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