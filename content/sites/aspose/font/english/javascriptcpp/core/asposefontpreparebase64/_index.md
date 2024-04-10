---
title: "AsposeFontPrepareBase64"
second_title: Aspose.Font for JavaScript via C++
description:  "Save the string representation BLOB in the Memory FS for processing."
type: docs
url: /javascriptcpp/core/asposefontpreparebase64/
---
## AsposeFontPrepareBase64 function
_Save the string representation BLOB in the Memory FS for processing._

```js
function AsposeFontPrepareBase64(
    base64Blob,
    fileName
)
```

**Parameters**: 

* **base64Blob** string representation Blob object, with format "data:mime/type;base64,...", where 'mime/type': image/png, application/octet-stream, ...
* **fileName** file name 

### Remarks
**AsposeFontPrepareBase64** doesn't work in Web Worker mode, use AsposeFontPrepare

### Examples
```js
  const test_pfx = "data:application/octet-stream;base64,MIIEcQIBAzCCBDcGCSqGSIb ... ==";
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 
      AsposeFontPrepareBase64(test_pfx, 'test.pfx') ?? 'loaded!' :
        (evt.data.json.errorCode == 0) ?
          `Result:${'Saved the base64 data to memory FS'}` :
          `Error: ${evt.data.json.errorText}`;
  
  /*AsposeFontPrepareBase64 for Web Worker*/
  const AsposeFontPrepareBase64 = (base64, filename) =>
    fetch(base64)
      .then(res => res.arrayBuffer())
        .then(buffer => {
            const file_reader = new FileReader();
            /*Ask Web Worker */
            file_reader.onload = event => AsposeFontWebWorker.postMessage(
                 { "operation": 'AsposeFontPrepare', "params": [event.target.result, filename] },
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
    AsposeFontPrepareBase64(test_pfx,"test.pfx");
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      DownloadFile('test_pfx', "application/Font");
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```