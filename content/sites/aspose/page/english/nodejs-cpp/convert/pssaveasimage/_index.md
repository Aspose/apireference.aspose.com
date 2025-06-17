---
title: PSSaveAsImage
second_title: Aspose.Page for JavaScript via C++
description: Converts the Postscript to image
type: docs
weight: 10
url: /nodejs-cpp/convert/pssaveasimage/
---
## PSSaveAsImage function

Converts the Postscript to image.

```js
function AsposePSSaveAsImage(
    fileBlob, 
    fileName, 
    imageFormat, 
    supressErrors
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Blob object | Content of source font for convert. |
| fileName | string | File name. |
| imageFormat | ImageFormat | image format to convert into. |
| supressErrors | bool | Specifies whether errors must be suppressed or not. |

### Return Value

JSON object 
| Field | Description |
| ----- | ----------- |
| errorCode | code error (0 no error)
| errorText | text error ("" no error)
| fileNameResult | result file name

### Examples

```js
const AsposePage = require('asposepagenodejs');

const ps_file = "./data/program_13.ps";

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    //PSSaveAsImage - convert to postscript to image
    const json = AsposePageModule.AsposePSSaveAsImage(ps_file, AsposePageModule.ImageFormat.Png, true);
    console.log("PSSaveAsImage => %O",  json.errorCode == 0 ? "Files(pages) count: " + json.filesCount.toString() + json.filesNameResult.toString() : json.errorText);

},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [PSSaveAsPdf](../pssaveaspdf/)
* enum [ImageFormat](../../enumerations/imageformat/)
