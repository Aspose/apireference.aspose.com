---
title: "AsposeXMPAddSimpleProperties"
second_title: "Aspose.Page जावास्क्रिप्ट के लिए C++ के माध्यम से"
description: "XMP मेटाडेटा प्राप्त करें"
type: docs
weight: 40
url: /hi/javascript-cpp/xmp/xmpaddsimpleproperties/
---
## AsposeXMPAddSimpleProperties function

एक संरचना में नामित मान जोड़ता है।

```js
function AsposeXMPAddSimpleProperties(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| पैरामीटर | प्रकार | विवरण |
| --------- | ---- | ----------- |
| fileBlob | ब्लॉब ऑब्जेक्ट | स्रोत फ़ाइल की सामग्री। |
| fileName | string | स्रोत फ़ाइल का नाम। |
| fileNameResult | string | परिणाम फ़ाइल का नाम। |


### वापसी मान

JSON ऑब्जेक्ट
| फ़ील्ड | विवरण |
| ----- | ----------- |
|  | errorCode | कोड त्रुटि (0 कोई त्रुटि नहीं) |
|  | errorText | पाठ त्रुटि ("" कोई त्रुटि नहीं) |
|  | XMP | मेटाडेटा मानों की सरणी |
|  | fileNameResult | परिणाम फ़ाइल नाम |

### उदाहरण

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const key = "tmp:newKey";
      const value = "NewValue";
      const json = AsposeXMPAddSimpleProperties(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", key, value);
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
      const key = "tmp:newKey";
      const value = "NewValue";
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXMPAddSimpleProperties', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", key, value] }, [event.target.result]);
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

### संबंधित देखें

* function [AsposeXMPAddArrayItem](../xmpaddarrayitem/)
* function [AsposeXMPNamedValue](../xmpaddnamedvalue/)
* function [AsposeXMPNamespace](../xmpaddnamespace/)
