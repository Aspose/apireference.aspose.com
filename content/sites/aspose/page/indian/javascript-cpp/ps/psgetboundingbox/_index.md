---
title: "AsposePSGetBoundingBox"
second_title: "Aspose.Page जावास्क्रिप्ट के लिए C++ के माध्यम से"
description: "बाउंडिंग बॉक्स प्राप्त करें"
type: docs
weight: 10
url: /hi/javascript-cpp/ps/psgetboundingbox/
---
## AsposePSGetBoundingBox function

EPS फ़ाइल को पढ़ता है और EPS छवि का बाउंडिंग बॉक्स %%BoundingBox टिप्पणी से या डिफ़ॉल्ट पृष्ठ आकार (0, 0, 595, 842) के बाउंड्स से निकालता है यदि वह मौजूद नहीं है।

```js
function AsposePSGetBoundingBox(
    fileBlob,
    fileName
)
```

| पैरामीटर | प्रकार | विवरण |
| --------- | ---- | ----------- |
| fileBlob | ब्लॉब ऑब्जेक्ट | स्रोत फ़ाइल की सामग्री। |
| fileName | string | स्रोत फ़ाइल का नाम। |

### वापसी मान

JSON ऑब्जेक्ट
| फ़ील्ड | विवरण |
| ----- | ----------- |
|  | errorCode | कोड त्रुटि (0 कोई त्रुटि नहीं) |
|  | errorText | पाठ त्रुटि ("" कोई त्रुटि नहीं) |
|  | bbox | EPS छवि का बाउंडिंग बॉक्स। |

### उदाहरण

```js
  var fPSGetBoundingBox = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSGetBoundingBox(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Bounds: " + json.bbox.toString();
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
      (evt.data.json.errorCode == 0) ? `Boundibg box: ${evt.data.json.bbox}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fPSGetBoundingBox = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSGetBoundingBox', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

  }

```

### संबंधित देखें

* function [AsposePSExtractText](../psextracttext/)
