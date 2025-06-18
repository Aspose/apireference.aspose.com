---
title: AsposeXPSMergeToXps
second_title: Aspose.Page for JavaScript via C++
description: Merge the XPS files to one XPS
type: docs
weight: 10
url: /nodejs-cpp/merge/xpsmergetoxps/
---
## AsposeXPSMergeToXps function

Merge the several XPS files to one XPS file.

```js
function AsposeXPSMergeXps(
    fileNames, 
    fileNameResult, 
    supressErrors
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileNames | string | The names of files for merge. |
| fileNameResult | string | The name of result xps file. |
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

const xps_files = "./data/example.xps,./data/transforms.xps";

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    const json = AsposePageModule.AsposeXPSMergeToXps(xps_files,"XpsMergedToXpsResult.xps");
    console.log("XPSMergeToXps => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [XPSMergeToPdf](../xpsmergetopdf/)
