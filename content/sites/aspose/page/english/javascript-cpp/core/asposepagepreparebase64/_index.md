---
title: "AsposePagePrepareBase64"
second_title: Aspose.Page for JavaScript via C++
description:  "Save the string representation BLOB in the Memory FS for processing."
type: docs
url: /javascript-cpp/core/asposepagepreparebase64/
---
## AsposePagePrepareBase64 function
_Save the string representation BLOB in the Memory FS for processing._

```js
function AsposePagePrepareBase64(
    base64Blob,
    fileName
)
```

**Parameters**: 

* **base64Blob** string representation Blob object, with format "data:mime/type;base64,...", where 'mime/type': image/png, application/octet-stream, ...
* **fileName** file name 

### Remarks
**AsposePagePrepareBase64** doesn't work in Web Worker mode, use AsposePagePrepare

### Examples
```js
  const test_pfx = "data:application/octet-stream;base64,MIIEcQIBAzCCBDcGCSqGSIb ... ==";
  /*Create Web Worker*/
  const AsposePageWebWorker = new Worker("AsposePageforJS.js");
  AsposePageWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposePageWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 
      AsposePagePrepareBase64(test_pfx, 'test.pfx') ?? 'loaded!' :
        (evt.data.json.errorCode == 0) ?
          `Result:${'Saved the base64 data to memory FS'}` :
          `Error: ${evt.data.json.errorText}`;
  
  /*AsposePagePrepareBase64 for Web Worker*/
  const AsposePagePrepareBase64 = (base64, filename) =>
    fetch(base64)
      .then(res => res.arrayBuffer())
        .then(buffer => {
            const file_reader = new FileReader();
            /*Ask Web Worker */
            file_reader.onload = event => AsposePageWebWorker.postMessage(
                 { "operation": 'AsposePagePrepare', "params": [event.target.result, filename] },
                 [event.target.result]
               );
            file_reader.readAsArrayBuffer(new File([new Uint8Array(buffer)], filename));
          }
        );
```
**Simple example**:
```js
  var ffileBase64 = function (e) {
    const test_pfx = "data:application/octet-stream;base64,MIIEcQIBAzCCBDcGCSqGSIb ... ==";
    /*Save the string representation BLOB in the Memory FS for processing*/
    AsposePagePrepareBase64(test_pfx,"test.pfx");
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      DownloadFile('test_pfx', "application/image");
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```