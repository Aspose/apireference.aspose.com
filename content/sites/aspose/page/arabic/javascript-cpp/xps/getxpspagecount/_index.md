---
title: "AsposeGetXpsPageCount"
second_title: "Aspose.Page للـ JavaScript عبر C++"
description: "احصل على عدد الصفحات في ملف XPS"
type: docs
weight: 10
url: /ar/javascript-cpp/xps/getxpspagecount/
---
## AsposeGetXpsPageCount function

الحصول على عدد الصفحات في مستند xps.

```js
function AsposeGetXpsPageCount(
    fileBlob,
    fileName
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى ملف المصدر. |
| fileName | string | اسم ملف المصدر. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا خطأ) |
|  | errorText | خطأ النص ("" لا خطأ) |
|  | pageCount | عدد الصفحات |

### أمثلة

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

