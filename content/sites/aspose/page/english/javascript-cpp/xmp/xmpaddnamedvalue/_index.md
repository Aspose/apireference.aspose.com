---
title: AsposeXMPAddNamedValue
second_title: Aspose.Page for JavaScript via C++
description: Get XMP metadata
type: docs
weight: 30
url: /javascript-cpp/xmp/xmpaddnamedvalue/
---
## AsposeXMPAddNamedValue function

Adds named value into a structure.

```js
function AsposeXMPAddNamedValue(
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
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const namedValues = [
        ["xmpTPg:MaxPageSize", [["stDim:newKey", "NewValue"],["stDim:newKey2", "NewValue2"]] ],
        ["xmpTPg:SwatchGroups", [["xmpG:newKey", "NewValue"]] ]
      ];
      const json = AsposeXMPAddNamedValue(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", namedValues);
      if (json.errorCode == 0) {
          document.getElementById('output').textContent = json.XMP;
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
  const fPsAsPdf = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      const namedValues = [
        ["xmpTPg:MaxPageSize", [["stDim:newKey", "NewValue"],["stDim:newKey2", "NewValue2"]] ],
        ["xmpTPg:SwatchGroups", [["xmpG:newKey", "NewValue"]] ]
      ];
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXMPAddNamedValue', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", namedValues] }, [event.target.result]);
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

* function [AsposeXMPAddArrayItem](../xmpaddarrayitem/)
