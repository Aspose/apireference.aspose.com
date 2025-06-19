---
title: PSSaveAsPdf
second_title: Aspose.Page for JavaScript via C++
description: Converts the Postscript to PDF
type: docs
weight: 10
url: /nodejs-cpp/convert/pssaveaspdf/
---
## PSSaveAsPdf function

Converts the Postscript to PDF.

```js
function AsposePSSaveAsPdf(
    fileBlob, 
    fileName, 
    supressErrors
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Blob object | Content of source font for convert. |
| fileName | string | File name. |
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
```js
const AsposePage = require('asposepagenodejs');

const ps_file = "./data/program_13.ps";

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    const json = AsposePageModule.AsposePSSaveAsPdf(ps_file, true);
    console.log("PSSaveAsPdf => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [PSSaveAsImage](../pssaveasimage/)
