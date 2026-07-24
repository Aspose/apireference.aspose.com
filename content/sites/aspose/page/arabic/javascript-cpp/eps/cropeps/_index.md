---
title: "AsposeCropEPS"
second_title: "Aspose.Page للـ JavaScript عبر C++"
description: "اقتصاص EPS"
type: docs
weight: 10
url: /ar/javascript-cpp/eps/cropeps/
---
## AsposeCropEPS function

يقص ملف EPS. يحفظ ملف EPS الأصلي مع تحديث %%BoundingBox الموجود أو سيتم إنشاء واحد جديد.

```js
function AsposeCropEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    left,
    top,
    right,
    bottom
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى ملف المصدر. |
| fileName | string | اسم ملف المصدر. |
| fileNameResult | string | اسم ملف النتيجة. |
| يسار | float | يحدد الحد الأيسر لصندوق الاقتصاص. |
| أعلى | float | يحدد الحد العلوي لصندوق الاقتصاص. |
| يمين | float | يحدد الحد الأيمن لصندوق الاقتصاص. |
| أسفل | float | يحدد الحد السفلي لصندوق الاقتصاص. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا خطأ) |
|  | errorText | خطأ النص ("" لا خطأ) |
|  | fileNameResult | اسم ملف النتيجة |

### أمثلة

```js
  var fCropEPS = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeCropEPS(event.target.result, e.target.files[0].name,  e.target.files[0].name + "_crop.eps", 30, 5, 240, 36);
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
  const fCropEps = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeCropEPS', "params": [event.target.result, e.target.files[0].name, 30, 5, 240, 36] }, [event.target.result]);
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

* function [AsposeResizeEps](../resizeeps/)
