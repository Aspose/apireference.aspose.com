---
title: "AsposeFontAbout"
second_title: "Aspose.Font لـ Node.js عبر C++"
description: "الحصول على معلومات حول المنتج."
type: docs
url: /ar/nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

الحصول على معلومات حول المنتج.

```js
function AsposeFontAbout()
```

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
| errorCode | خطأ الكود (0 لا يوجد خطأ) |
| errorText | خطأ النص ("" لا يوجد خطأ) |
| المنتج | اسم المنتج |
| الإصدار | إصدار المنتج |
| مرخص | المنتج مرخص |


## مثال
**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    json = AsposeFontModule.AsposeFontAbout();
    console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeFontAbout - Get info about Product
const json = AsposeFontModule.AsposeFontAbout();
console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
```
