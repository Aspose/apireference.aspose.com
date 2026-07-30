---
title: "AsposeFontConvertToSVG"
second_title: "Aspose.Font لـ Node.js عبر C++"
description: "يقوم بتحويل الخط إلى تنسيق svg"
type: docs
weight: 10
url: /ar/nodejs-cpp/convert/asposefontconverttosvg/
---
## AsposeFontConvertToSVG function

يقوم بتحويل الخط إلى تنسيق SVG.

```js
function AsposeFontConvertToSVG(
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
    //call AsposeFontConvertToSVG to convert font
    const json = AsposeFontModule.AsposeFontConvertToSVG(font_file,AsposeFontModule.FontType.TTF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

const json = AsposeFontModule.AsposeFontConvertToSVG(font_file,AsposeFontModule.FontType.TTF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### انظر أيضًا

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
