---
title: "Enumerazioni"
second_title: "Aspose.Font per Node.js via C++"
description: "Funzioni per convertire i font in formati TrueType."
type: docs
url: /it/nodejs-cpp/enumerations/
---

## Enumerazioni

| Enumerazione | Descrizione |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | Specifica il tipo di Font. |
| [FontType](./fonttype/) | Specifica il tipo di Font. |
| [TtfNameTableNameId](./ttfnametablenameid/) | Specifica NameId. |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | Rappresenta l'enumerazione PlatformId. |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | Rappresenta l'enumerazione MSPlatformSpecificId. |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | Rappresenta l'enumerazione MacPlatformSpecificId. |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | Rappresenta l'enumerazione UnicodePlatformSpecificId. |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | Enumerazione degli ID lingua della piattaforma Macintosh. |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | Enumerazione degli ID lingua della piattaforma Microsoft. |

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