---
title: "AsposeResizeEPS"
second_title: "Aspose.Page للـ JavaScript عبر C++"
description: "تغيير حجم EPS"
type: docs
weight: 10
url: /ar/javascript-cpp/eps/resizeeps/
---
## AsposeResizeEPS function

يقوم بتغيير حجم ملف EPS. يحفظ ملف EPS الأصلي مع تحديث %%BoundingBox الموجود أو يتم إنشاء واحد جديد.

```js
function AsposeResizeEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    width,
    height,
    units
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى ملف المصدر. |
| fileName | string | اسم ملف المصدر. |
| fileNameResult | string | اسم ملف النتيجة. |
| width | float | يحدد عرض صندوق الحدود الجديد. |
| height | float | يحدد ارتفاع صندوق الحدود الجديد. |
| unit | Module.Units | يحدد نوع الحجم الجديد. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا خطأ) |
|  | errorText | خطأ النص ("" لا خطأ) |
|  | fileNameResult | اسم ملف النتيجة |

### أمثلة

```js
  var fResizeEPS = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeResizeEPS(event.target.result, e.target.files[0].name,  e.target.files[0].name + "_resized.eps", 200, 100, Module.Units.Points);
      if (json.errorCode == 0) {
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
  const fResizeEps = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeResizeEPS', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_resized.eps", 200, 100, 'Module.Units.Points'] }, [event.target.result]);
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

### انظر أيضًا

* function [Module.Units](../../enumerations/units/)
* function [AsposeCropEps](../cropeps/)
