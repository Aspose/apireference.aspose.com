---
title: AsposeResizeEPS
second_title: Aspose.Page for JavaScript via C++
description: Resize EPS
type: docs
weight: 10
url: /nodejs-cpp/eps/resizeeps/
---
## AsposeResizeEPS function

Resizes EPS file. It saves initial EPS file with updated existing %%BoundingBox or new one will be created.

```js
function AsposeResizeEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    width,
    height,
    units
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Blob object | Content of source file. |
| fileName | string | Source file name. |
| fileNameResult | string | Result file name. |
| width | float | Specifies width of new bounding box. |
| height | float | Specifies height of new bounding box. |
| unit | Module.Units | Specifies type of new size. |

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

    //ResizeEPS - working with EPS
    const json = AsposePageModule.AsposeResizeEPS(eps_file, "resized.eps", 200, 100, AsposePageModule.Units.Points);
    console.log("ResizeEPS => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [Module.Units](../../enumerations/units/)
* function [AsposeCropEps](../cropeps/)
