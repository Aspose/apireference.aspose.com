---
title: AsposeFontConvertToWOFF2
second_title: Aspose.Font for Node.js via C++
description: Converts the Font into woff2 format
type: docs
weight: 10
url: /nodejs-cpp/convert/asposefontconverttowoff2/
---
## AsposeFontConvertToWOFF2 function

Converts the Font into WOFF2 format.

```js
function AsposeFontConvertToWOFF2(
    fileName,
    fontType
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileName | string | File name. |
| fontType | FontType | Font type to convert. |

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

### See Also

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
