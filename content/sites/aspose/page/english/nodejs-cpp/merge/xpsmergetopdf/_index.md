---
title: AsposeXPSMergeToPdf
second_title: Aspose.Page for JavaScript via C++
description: Merge the XPS files to PDF
type: docs
weight: 10
url: /nodejs-cpp/merge/xpsmergetopdf/
---
## AsposeXPSMergeToPdf function

Merge the XPS files to PDF.

```js
function AsposeXPSMergePdf(
    fileNames, 
    fileNameResult, 
    supressErrors
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileNames | string | The names of files for merge. |
| fileNameResult | string | The name of result pdf file. |
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

    //XPSMergeToPdf - convert to postscript to image
    const json = AsposePageModule.AsposeXPSMergeToPdf(xps_files,"XPsMergedToPdfResult.pdf");
    console.log("XPSMergeToPdf => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [PSSaveAsImage](../pssaveasimage/)
