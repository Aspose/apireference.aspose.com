---
title: "AsposePageAbout"
second_title: "Aspose.Page जावास्क्रिप्ट के लिए C++ के माध्यम से"
description: "उत्पाद के बारे में जानकारी प्राप्त करें।"
type: docs
url: /hi/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

उत्पाद के बारे में जानकारी प्राप्त करें।

```js
function AsposePageAbout()
```

### रिटर्न मान

JSON ऑब्जेक्ट
| फ़ील्ड | विवरण |
| ----- | ----------- |
| errorCode | कोड त्रुटि (0 कोई त्रुटि नहीं) |
| errorText | पाठ त्रुटि ("" कोई त्रुटि नहीं) |
| उत्पाद | उत्पाद नाम |
| संस्करण | उत्पाद संस्करण |
| islicensed | उत्पाद लाइसेंस प्राप्त है |


**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposePageWebWorker = new Worker("AsposePageforJS.js");
  AsposePageWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposePageWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'loaded!' :
      (evt.data.json.errorCode !== 0) ? `Error: ${evt.data.json.errorText}` :
                        "Product      : " + evt.data.json.product
                    + "\nVersion      : " + evt.data.json.version
                    + "\nIs licensed  : " + evt.data.json.islicensed;

  /*Event handler*/
  const onAsposePageAbout = e => {
    /*Get info about Product - Ask Web Worker*/
    AsposePageWebWorker.postMessage({ "operation": 'AsposePageAbout', "params": [] }, []);
  };
```
**Simple example**:
```js
  var onAsposePageAbout = function () {
    /*Get info about Product*/
    const json = AsposePageAbout();
    if (json.errorCode == 0) document.getElementById('output').textContent = "Product      : " + json.product
                                                                         + "\nVersion      : " + json.version
                                                                         + "\nIs licensed  : " + json.islicensed;
    else document.getElementById('output').textContent = json.errorText;
  }
```
