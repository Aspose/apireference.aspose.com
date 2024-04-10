---
title: "AsposeFontPrepare"
second_title: Aspose.Font for JavaScript via C++
description:  "Save the BLOB in the Memory FS for processing."
type: docs
url: /javascriptcpp/core/asposefontprepare/
---

_Save the BLOB in the Memory FS for processing._

```js
function AsposeFontPrepare(
    fileBlob,
    fileName
)
```

**Parameters**: 

* **fileBlob** Blob object 
* **fileName** file name 

**Return**: 
JSON object 
  * **errorCode** - code error (0 no error)
  * **errorText** - text error ("" no error)
  * **fileNameResult** - result file name


**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'loaded!' :
      (evt.data.json.errorCode == 0) ?
        `Result:\n${(evt.data.operation == 'AsposeFontPrepare') ?
          'Saved the BLOB to memory FS for processing':
          '...main operation, see AsposeFontAddImage as an example...'}` :
        `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileImage = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Save the BLOB in the Memory FS for processing*/
      AsposeFontWebWorker.postMessage(
        { "operation": 'AsposeFontPrepare', "params": [event.target.result, e.target.files[0].name] },
        [event.target.result]
      );
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```
**Simple example**:
```js
  var ffileImage = function (e) {
    const file_reader = new FileReader();
    /*Set the image filename*/
    const fileImage = e.target.files[0].name;
    file_reader.onload = (event) => {
      /*Save the BLOB in the Memory FS for processing*/
      AsposeFontPrepare(event.target.result, fileImage);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```
