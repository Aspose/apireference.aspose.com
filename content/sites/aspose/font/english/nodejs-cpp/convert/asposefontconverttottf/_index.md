---
title: AsposeFontConvertToTTF
second_title: Aspose.Font for Node.js via C++
description: Converts the Font into ttf format
type: docs
weight: 10
url: /nodejs-cpp/convert/asposefontconverttottf/
---
## AsposeFontConvertToTTF function

Converts the Font into TTF format.

```js
function AsposeFontConvertToTTF(
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
    //call AsposeFontConvert to convert font
    const json = AsposeFontModule.AsposeFontConvertToTTF(font_file,AsposeFontModule.FontType.TTF,AsposeFontModule.FontSavingFormats.WOFF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript/ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';
const font_file ="./fonts/arial.ttf";
const AsposeFontModule = await AsposeFont();
console.log('Aspose.Font for Node.js via C++ example');
const json = AsposeFontModule.AsposeFontConvertToTTF(font_file,AsposeFontModule.FontType.TTF,AsposeFontModule.FontSavingFormats.WOFF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### See Also

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
