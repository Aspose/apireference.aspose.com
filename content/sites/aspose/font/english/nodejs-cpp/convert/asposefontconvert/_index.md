---
title: AsposeFontConvert
second_title: Aspose.Font for Node.js via C++
description: Converts the Font into another format
type: docs
weight: 10
url: /nodejs-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

Converts the Font into another format.

```js
function AsposeFontConvert(
    fileName,
    fontType,
    fontSavingFormat
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileName | string | File name. |
| fontType | FontType | Font type to convert. |
| fontSavingFormat | FontSavingFormats | Font format to convert into. |

### Return Value

JSON object 
| Field | Description |
| ----- | ----------- |
| errorCode | code error (0 no error)
| errorText | text error ("" no error)
| fileNameResult | result file name

### Remarks

Note: TTF Font type is now supported only.

### Examples

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

### See Also

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
