---
title: "AsposeXPSMergeToXps"
second_title: "Aspose.Page للـ JavaScript عبر C++"
description: "دمج ملفات XPS إلى XPS واحد"
type: docs
weight: 10
url: /ar/javascript-cpp/merge/xpsmergetoxps/
---
## AsposeXPSMergeToXps function

دمج عدة ملفات XPS إلى ملف XPS واحد.

```js
function AsposeXPSMergeXps(
    fileNames, 
    fileNameResult, 
    supressErrors
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileNames | string | أسماء الملفات للدمج. |
| fileNameResult | string | اسم ملف XPS الناتج. |
| supressErrors | bool | يحدد ما إذا كان يجب كتم الأخطاء أم لا. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا خطأ) |
|  | errorText | خطأ النص ("" لا خطأ) |
|  | fileNameResult | اسم ملف النتيجة |

### أمثلة

```js
  var fPsAsPdf = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeXPSMergeToXps(event.target.result, e.target.files[0].name, true);
      if (json.errorCode == 0) {
        DownloadFile(json.fileNameResult, "image/pdf");
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
      /*Merge a XPS to XPS - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXPSMergeToXps', "params": [event.target.result, e.target.files[0].name, true] }, [event.target.result]);
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

* function [XPSMergeToPdf](../xpsmergetopdf/)
