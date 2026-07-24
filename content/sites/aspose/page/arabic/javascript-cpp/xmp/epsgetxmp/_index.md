---
title: "AsposeEPSGetXmp"
second_title: "Aspose.Page للـ JavaScript عبر C++"
description: "احصل على بيانات XMP الوصفية"
type: docs
weight: 10
url: /ar/javascript-cpp/xmp/epsgetxmp/
---
## AsposeEPSGetXmp function

يقرأ ملف PS/EPS ويستخرج XmpMetdata إذا كان موجودًا بالفعل.
إذا لم يحتوي ملف EPS على بيانات XMP الوصفية، نحصل على واحدة جديدة مملوءة بالقيم من تعليقات بيانات PS الوصفية (%%Creator، %%CreateDate، %%Title إلخ).
سيتم حفظ ملف EPS مع بيانات XMP الوصفية المملوءة في fileNameResult.

```js
function AsposeEPSGetXmp(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى ملف المصدر. |
| fileName | string | اسم ملف المصدر. |
| fileNameResult | string | اسم ملف النتيجة. |


### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | خطأ الكود (0 لا خطأ) |
|  | errorText | خطأ النص ("" لا خطأ) |
|  | XMP | مصفوفة قيم البيانات الوصفية |
|  | fileNameResult | اسم ملف النتيجة |

### أمثلة

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeEPSGetXMP(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps");
      if (json.errorCode == 0) {
          document.getElementById('output').textContent = json.XMP;
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
  const fPsAsPdf = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeEPSGetXMP', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps"] }, [event.target.result]);
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

* function [XPSSaveAsImage](../xpssaveasimage/)
