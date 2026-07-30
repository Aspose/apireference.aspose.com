---
title: "AsposeFontConvertToWOFF2"
second_title: "Aspose.Font للـ JavaScript عبر C++"
description: "يقوم بتحويل الخط إلى تنسيق woff2"
type: docs
weight: 10
url: /ar/javascript-cpp/convert/asposefontconverttowoff2/
---
## AsposeFontConvertToWOFF2 function

يقوم بتحويل الخط إلى تنسيق WOFF2.

```js
function AsposeFontConvertToWOFF2(
    fileBlob,
    fileName,
    fontType
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى الخط المصدر للتحويل. |
| fileName | string | اسم الملف. |
| fontType | FontType | نوع الخط للتحويل. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | رمز الخطأ (0 لا خطأ) |
|  | errorText | نص الخطأ ("" لا خطأ) |
|  | fileNameResult | اسم ملف النتيجة |

### أمثلة

```js
  var fEOT2WOFF2 = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontConvertToWOFF2(event.target.result, e.target.files[0].name, Module.FontType.OTF);
      if (json.errorCode == 0) document.getElementById('output').textContent = json.fileNameResult;
      else document.getElementById('output').textContent = json.errorText;
      DownloadFile(json.fileNameResult, "font/ttf");
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'library loaded!' :
      (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "font/ttf", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fOTFtoWOFF2 = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a OTF fonts to WOFF2 and save - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontConvertToWOFF2', "params": [event.target.result, e.target.files[0].name, 'Module.FontType.OTF'] }, [event.target.result]);
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

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
