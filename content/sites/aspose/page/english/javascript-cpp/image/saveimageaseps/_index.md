---
title: AsposeSaveImageAsEps
second_title: Aspose.Page for JavaScript via C++
description: Resize EPS
type: docs
weight: 10
url: /javascript-cpp/image/saveimageaseps/
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
  var fSaveImageAsEps = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeSaveImageAsEps(event.target.result, e.target.files[0].name,  e.target.files[0].name + "_out.eps");
      if (json.errorCode == 0) {
          DownloadFile(json.fileNameResult, "image/eps");
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
  const fSaveImageAsEps = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeSaveImageAsEps', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps"] }, [event.target.result]);
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

