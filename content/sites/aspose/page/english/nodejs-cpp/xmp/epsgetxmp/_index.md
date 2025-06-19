---
title: AsposeEPSGetXmp
second_title: Aspose.Page for JavaScript via C++
description: Get XMP metadata
type: docs
weight: 10
url: /nodejs-cpp/xmp/epsgetxmp/
---
## AsposeEPSGetXmp function

Reads PS/EPS file and extracts XmpMetdata if it already exists.
If EPS file doesn't contain XMP metadata we get new one filled with values from PS metadata comments (%%Creator, %%CreateDate, %%Title etc).
EPS file with filled XMP metadata will be saved in fileNameResult.

```js
function AsposeEPSGetXmp(
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
| XMP | array of metadata values
| fileNameResult | result file name

### Examples

```js
const AsposePage = require('asposepagenodejs');

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    const json = AsposePageModule.AsposeEPSGetXMP(eps_file, img_file + "_out.eps");
    console.log("AsposeEPSGetXMP => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [XPSSaveAsImage](../xpssaveasimage/)
