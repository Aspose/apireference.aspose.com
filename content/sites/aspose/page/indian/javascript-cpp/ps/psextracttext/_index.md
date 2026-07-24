---
title: "AsposePSExtractText"
second_title: "Aspose.Page जावास्क्रिप्ट के लिए C++ के माध्यम से"
description: "PS फ़ाइल से पाठ निकालें"
type: docs
weight: 10
url: /hi/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

PS फ़ाइल से पाठ निकालें। पाठ केवल तभी निकाला जा सकता है जब वह Type 42 (True Type) फ़ॉन्ट या Type 0 फ़ॉन्ट के साथ Type 42 फ़ॉन्ट्स को उसके वेक्टर मैप में शामिल करके लिखा गया हो।

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| पैरामीटर | प्रकार | विवरण |
| --------- | ---- | ----------- |
| fileBlob | ब्लॉब ऑब्जेक्ट | स्रोत फ़ाइल की सामग्री। |
| fileName | string | स्रोत फ़ाइल का नाम। |
| शुरू | int | पाठ निकालना शुरू करने वाले पृष्ठ को निर्दिष्ट करता है। यह पैरामीटर बहु-पृष्ठीय दस्तावेज़ों के लिए उपयोगी है। |
| समाप्त | int | पाठ निकालना समाप्त करने वाले पृष्ठ को निर्दिष्ट करता है। यह पैरामीटर बहु-पृष्ठीय दस्तावेज़ों के लिए उपयोगी है। |

### वापसी मान

JSON ऑब्जेक्ट
| फ़ील्ड | विवरण |
| ----- | ----------- |
|  | errorCode | कोड त्रुटि (0 कोई त्रुटि नहीं) |
|  | errorText | पाठ त्रुटि ("" कोई त्रुटि नहीं) |
|  | पाठ | निकाला गया पाठ |

### उदाहरण

```js
  var fPSExtractText = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSExtractText(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Text:" + json.text;
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
      (evt.data.json.errorCode == 0) ? 
        ((evt.data.operation == 'AsposePSExtractText') ? `Text: ${evt.data.json.text}` : `` ) : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fPSExtractText = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSExtractText', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

```

### संबंधित देखें

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
