---
title: AsposePSMergeToPdf
second_title: Aspose.Page for JavaScript via C++
description: Merge the Postscript files to PDF
type: docs
weight: 10
url: /nodejs-cpp/merge/psmergetopdf/
---
## AsposePSMergeToPdf function

Merge the Postscript files to PDF.

```js
function AsposePSMergePdf(
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

const ps_files = "./data/program_01.ps,./data/PAGENET-361-10.eps";

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    const json = AsposePageModule.AsposePSMergeToPdf(ps_files,"PsMergedToPdfResult.pdf",true);
    console.log("PSMergeToPdf => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [PSSaveAsImage](../pssaveasimage/)
