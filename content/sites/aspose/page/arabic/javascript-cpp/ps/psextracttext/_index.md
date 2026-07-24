---
title: "AsposePSExtractText"
second_title: "Aspose.Page للـ JavaScript عبر C++"
description: "استخراج النص من ملف PS"
type: docs
weight: 10
url: /ar/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

استخراج النص من ملف PS. يمكن استخراج النص فقط إذا كان مكتوبًا بخط Type 42 (TrueType) أو بخط Type 0 مع خطوط Type 42 في خريطة المتجهات الخاصة به.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى ملف المصدر. |
| fileName | string | اسم ملف المصدر. |
| ابدأ | int | يحدد الصفحة التي يبدأ منها استخراج النص. هذا المعامل مفيد للمستندات متعددة الصفحات. |
| نهاية | int | يحدد الصفحة التي ينتهي عندها استخراج النص. هذا المعامل مفيد للمستندات متعددة الصفحات. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا خطأ) |
|  | errorText | خطأ النص ("" لا خطأ) |
|  | نص | النص المستخرج |

### أمثلة

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

### انظر أيضًا

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
