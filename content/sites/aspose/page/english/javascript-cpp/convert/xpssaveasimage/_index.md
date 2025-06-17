---
title: XPSSaveAsImage
second_title: Aspose.Page for JavaScript via C++
description: Converts the XPS to image
type: docs
weight: 10
url: /javascript-cpp/convert/xpssaveasimage/
---
## PSSaveAsImage function

Converts the Postscript to image.

```js
function AsposeXPSSaveAsImage(
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
  var fXpsAsPng = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = XPSSaveAsImage(event.target.result, e.target.files[0].name, Module.ImageFormat.Png, true);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Files(pages) count: " + json.filesCount.toString();
        for (let fileIndex = 0; fileIndex < json.filesCount; fileIndex++) DownloadFile(json.filesNameResult[fileIndex], "image/png");
      }
      else 
        document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposePageWebWorker = new Worker("AsposePageforJS.js");
  AsposePageWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposePageWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'library loaded!' :
      (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "application/image", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fXpsAsPng = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a XPS to PNG and save - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'XPSSaveAsImage', "params": [event.target.result, e.target.files[0].name, 'Module.ImageFormat.Png'] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

  /*Make a link to download the result file*/
  const DownloadFile = function (filename, mime, content) {
      mime = mime || "application/octet-stream";
      var link = document.createElement("a"); 
      link.href = URL.createObjectURL(new Blob([content], {type: mime}));
      link.download = filename;
      link.textContent = filename;
      link.title = "Click here to download the file";
      document.getElementById('fileDownload').appendChild(link);
      document.getElementById('fileDownload').appendChild(document.createElement("br"));
  }

```

### See Also

* function [XPSSaveAsPdf](../xpssaveaspdf/)
* enum [ImageFormat](../../enumerations/imageformat/)
