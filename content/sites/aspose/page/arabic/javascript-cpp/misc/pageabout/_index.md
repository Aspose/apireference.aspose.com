---
title: "AsposePageAbout"
second_title: "Aspose.Page للـ JavaScript عبر C++"
description: "الحصول على معلومات حول المنتج."
type: docs
url: /ar/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

الحصول على معلومات حول المنتج.

```js
function AsposePageAbout()
```

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
| errorCode | خطأ الكود (0 لا خطأ) |
| errorText | خطأ النص ("" لا خطأ) |
| المنتج | اسم المنتج |
| الإصدار | إصدار المنتج |
| islicensed | المنتج مرخص |


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
