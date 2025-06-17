---
title: AsposeSaveImageAsEps
second_title: Aspose.Page for JavaScript via C++
description: Resize EPS
type: docs
weight: 10
url: /nodejs-cpp/image/saveimageaseps/
---
## AsposeSaveImageAsEps function

Resizes EPS file. It saves initial EPS file with updated existing %%BoundingBox or new one will be created.

```js
function AsposeSaveImageAsEps(
    fileBlob,
    fileName, 
    fileNameResult
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Blob object | Content of source file. |
| fileName | string | Source file name. |
| fileNameResult | string | Result file name. |

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

const img_file = "./data/PAGENET-361-10.bmp";

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    //SaveImageAsEps - convert image to EPS
    const json = AsposePageModule.AsposeSaveImageAsEps(img_file, img_file + ".eps");
    console.log("SaveImageAsEps => %O",  json.errorCode == 0 ? "Files(pages) count: " + json.filesCount.toString() + json.filesNameResult.toString() : json.errorText);
},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

