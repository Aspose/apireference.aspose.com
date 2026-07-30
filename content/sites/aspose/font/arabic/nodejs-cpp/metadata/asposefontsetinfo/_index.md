---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font لـ Node.js عبر C++"
description: "تعيين المعلومات (البيانات الوصفية) في ملف الخط."
type: docs
url: /ar/nodejs-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_تعيين المعلومات (البيانات الوصفية) في ملف الخط._

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

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileName | سلسلة | اسم الملف. |
| nameId | TtfNameTableNameId | معرف الاسم، فئة السلسلة المنطقية، محدد بواسطة تعداد [`NameId`](../../enumerations/ttfnametablenameid/). |
|  | platformId | TtfNameTablePlatformId | معرف المنصة |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة. يرجى استخدام قيمة من أحد هذه التعدادات - [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). التعداد الذي يجب استخدامه يُحدَّد حسب السياق (*platformId* parameter). |
| languageId | int | معرف اللغة. يرجى استخدام قيمة من تعداد [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) أو تعداد [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/) حسب السياق، المحدد بواسطة معامل *platformId*. |
|  | نص | سلسلة | بيانات السلسلة الفعلية |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا يوجد خطأ) |
|  | errorText | خطأ النص ("" لا يوجد خطأ) |
|  | fileNameResult | اسم ملف النتيجة |

### أمثلة

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

### انظر أيضًا

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
