---
title: "AsposeGetXpsPageCount"
second_title: "Aspose.Page जावास्क्रिप्ट के लिए C++ के माध्यम से"
description: "XPS फ़ाइल में पृष्ठों की संख्या प्राप्त करें"
type: docs
weight: 10
url: /hi/javascript-cpp/xps/getxpspagecount/
---
## AsposeGetXpsPageCount function

xps-डॉक्यूमेंट में पृष्ठों की संख्या प्राप्त करें।

```js
function AsposeGetXpsPageCount(
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
|  | pageCount | पृष्ठों की संख्या |

### उदाहरण

```js
  var fGetPageCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeGetXpsPageCount(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Pages count: " + json.pageCount.toString();
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
      (evt.data.json.errorCode == 0) ? `Number of pages      : ${evt.data.json.pageCount}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fGetPagesCount = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeGetXpsPageCount', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

```

