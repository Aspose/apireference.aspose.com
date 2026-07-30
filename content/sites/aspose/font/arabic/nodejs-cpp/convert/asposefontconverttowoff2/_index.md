---
title: "AsposeFontConvertToWOFF2"
second_title: "Aspose.Font لـ Node.js عبر C++"
description: "يقوم بتحويل الخط إلى تنسيق woff2"
type: docs
weight: 10
url: /ar/nodejs-cpp/convert/asposefontconverttowoff2/
---
## AsposeFontConvertToWOFF2 function

يقوم بتحويل الخط إلى تنسيق WOFF2.

```js
function AsposeFontConvertToWOFF2(
    fileName,
    fontType
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileName | سلسلة | اسم الملف. |
| fontType | FontType | نوع الخط للتحويل. |

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

console.log('Aspose.Font for Node.js via C++ example');

AsposeFont().then(AsposeFontModule => {
    //call AsposeFontConvertToWOFF2 to convert font
    const json = AsposeFontModule.AsposeFontConvertToWOFF2(font_file,AsposeFontModule.FontType.TTF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

const json = AsposeFontModule.AsposeFontConvertToWOFF2(font_file,AsposeFontModule.FontType.TTF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### انظر أيضًا

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
