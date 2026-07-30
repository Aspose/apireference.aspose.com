---
title: "AsposeFontConvert"
second_title: "Aspose.Font لـ Node.js عبر C++"
description: "يقوم بتحويل الخط إلى تنسيق آخر"
type: docs
weight: 10
url: /ar/nodejs-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

يقوم بتحويل الخط إلى تنسيق آخر.

```js
function AsposeFontConvert(
    fileName,
    fontType,
    fontSavingFormat
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileName | سلسلة | اسم الملف. |
| fontType | FontType | نوع الخط للتحويل. |
| fontSavingFormat | FontSavingFormats | تنسيق الخط للتحويل إليه. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا يوجد خطأ) |
|  | errorText | خطأ النص ("" لا يوجد خطأ) |
|  | fileNameResult | اسم ملف النتيجة |

### ملاحظات

ملاحظة: نوع الخط TTF مدعوم الآن فقط.

### أمثلة

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

### انظر أيضًا

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
