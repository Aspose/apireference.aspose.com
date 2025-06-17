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

const ps_file = "./data/program_13.ps";

console.log("Aspose.Page for Node.js via C++ examples.");

AsposePage().then(AsposePageModule => {

    const json = AsposePageModule.AsposeEPSGetXMP(eps_file, img_file + "_out.eps");
    console.log("AsposeEPSGetXMP => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

    //CropEPS - working with EPS
    json = AsposePageModule.AsposeCropEPS(eps_file, "croped.eps", 30, 5, 240, 36);
    console.log("CropEPS => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);

    //ResizeEPS - working with EPS
    json = AsposePageModule.AsposeResizeEPS(eps_file, "resized.eps", 200, 100, AsposePageModule.Units.Points);
    console.log("ResizeEPS => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);

    //PSSaveAsImage - convert to postscript to image
    json = AsposePageModule.AsposePSSaveAsImage("croped.eps", AsposePageModule.ImageFormat.Png,true);
    console.log("PSSaveAsImage => %O",  json.errorCode == 0 ? "Files(pages) count: " + json.filesCount.toString() + json.filesNameResult.toString() : json.errorText);

    //PSSaveAsPdf - convert to postscript to image
    json = AsposePageModule.AsposePSSaveAsPdf("resized.eps",true);
    console.log("PSSaveAsPdf => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

    //PSMergeToPdf - convert to postscript to image
    json = AsposePageModule.AsposePSMergeToPdf(ps_files,"PsMergedToPdfResult.pdf",true);
    console.log("PSMergeToPdf => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);


    //XPSSaveAsImage - convert to postscript to image
    json = AsposePageModule.AsposeXPSSaveAsImage(xps_file,AsposePageModule.ImageFormat.Png,true);
    console.log("XPSSaveAsImage => %O",  json.errorCode == 0 ? "Files(pages) count: " + json.filesCount.toString() + json.filesNameResult.toString() : json.errorText);

    //XPSSaveAsPdf - convert to postscript to image
    json = AsposePageModule.AsposeXPSSaveAsPdf(xps_file,true);
    console.log("XPSSaveAsPdf => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

    //XPSMergeToPdf - convert to postscript to image
    json = AsposePageModule.AsposeXPSMergeToPdf(xps_files,"XPsMergedToPdfResult.pdf");
    console.log("XPSMergeToPdf => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

    //XPSMergeToXps - convert to postscript to image
    json = AsposePageModule.AsposeXPSMergeToXps(xps_files,"XpsMergedToXpsResult.xps");
    console.log("XPSMergeToXps => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);

},
    reason => {console.log(`The unknown error has occurred: ${reason}`);}
);
```

### See Also

* function [XPSSaveAsImage](../xpssaveasimage/)
