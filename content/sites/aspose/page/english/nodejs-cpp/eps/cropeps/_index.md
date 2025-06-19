---
title: AsposeCropEPS
second_title: Aspose.Page for JavaScript via C++
description: Crop EPS
type: docs
weight: 10
url: /nodejs-cpp/eps/cropeps/
---
## AsposeCropEPS function

Crops EPS file. It saves initial EPS file with updated existing %%BoundingBox or new one will be created.

```js
function AsposeCropEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    left,
    top,
    right,
    bottom
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Blob object | Content of source file. |
| fileName | string | Source file name. |
| fileNameResult | string | Result file name. |
| left | float | Specifies left bound of crop box. |
| top | float | Specifies top bound of crop box. |
| right | float | Specifies right bound of crop box. |
| bottom | float | Specifies bottom bound of crop box. |

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

const eps_file = "./data/PAGENET-361-10.eps";

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    //CropEPS - working with EPS
    const json = AsposePageModule.AsposeCropEPS(eps_file, "croped.eps", 30, 5, 240, 36);
    console.log("CropEPS => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [AsposeResizeEps](../resizeeps/)
