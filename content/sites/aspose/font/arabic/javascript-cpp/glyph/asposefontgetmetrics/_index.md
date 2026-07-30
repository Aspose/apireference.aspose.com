---
title: "FontGetFontMetrics"
second_title: "Aspose.Font للـ JavaScript عبر C++"
description: "الحصول على معلومات (metadata) من ملف Font-file."
type: docs
url: /ar/javascript-cpp/glyph/asposefontgetmetrics/
---
## FontGetFontMetrics function

_احصل على عدد الرموز في الخط._

```js
function FontGetFontMetrics(
    fileBlob,
    fileName
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى الخط المصدر للتحويل. |
| fileName | string | اسم الملف. |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | رمز الخطأ (0 لا خطأ) |
|  | errorText | نص الخطأ ("" لا خطأ) |
|  | المقاييس | كائن JSON |
| * الصعود |
| * النزول |
| * lineGap |
| * advanceWidthMax |
| * minLeftSideBearing |
| * minRightSideBearing |
| * xMaxExtent |

### أمثلة

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    evt.data == "ready"
      ? "loaded!"
      : evt.data.json.errorCode == 0
      ? JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetMetrics = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get metrics of font - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetMetrics', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```

**Simple example**:
```js
  var ffileFontGetGlyphCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = FontGetFontMetrics(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Glyph count: " + json.glyphCount;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
