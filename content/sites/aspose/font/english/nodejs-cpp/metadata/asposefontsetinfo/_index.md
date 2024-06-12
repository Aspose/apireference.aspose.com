---
title: "AsposeFontSetInfo"
second_title: Aspose.Font for Node.js via C++
description: "Set info (metadata) into a Font-file."
type: docs
url: /nodejs-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_Set info (metadata) into a Font-file._

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

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileName | string | File name. |
| nameId |  TtfNameTableNameId | Name identifier, logical string category, specified by [`NameId`](../../enumerations/ttfnametablenameid/) enumeration |
| platformId | TtfNameTablePlatformId | Platform identifier
| platformSpecificId | int | Platform-specific encoding identifier. Please, use value from one of such enumerations - [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). What enumeration to use is defined by context (*platformId* parameter) |
| languageId | int | Language identifier. Please, use value from [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) or [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/) enumerations depend from context, defined by *platformId* parameter. |
| text | string | Actual string data 

### Return Value

JSON object 
| Field | Description |
| ----- | ----------- |
| errorCode | code error (0 no error)
| errorText | text error ("" no error)
| fileNameResult | result file name

### Examples

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

### See Also

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
