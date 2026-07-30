---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font للـ JavaScript عبر C++"
description: "تعيين المعلومات (metadata) إلى ملف Font-file."
type: docs
url: /ar/javascript-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_ضع المعلومات (البيانات الوصفية) في ملف خط._

```js
function AsposeFontSetInfo(
    fileBlob,
    fileName,
    nameId, 
    platformId, 
    platformSpecificId, 
    languageId, 
    text
)
```

| معامل | نوع | الوصف |
| --------- | ---- | ----------- |
| fileBlob | كائن Blob | محتوى الخط المصدر للتحويل. |
| fileName | string | اسم الملف. |
| nameId | TtfNameTableNameId | معرف الاسم، فئة السلسلة المنطقية، محدد بواسطة تعداد [`NameId`](../../enumerations/ttfnametablenameid/). |
|  | platformId | TtfNameTablePlatformId | معرف المنصة |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة. يرجى استخدام قيمة من أحد هذه التعدادات - [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). التعداد الذي يجب استخدامه يُحدَّد حسب السياق (*platformId* parameter) |
| languageId | int | معرف اللغة. يرجى استخدام قيمة من تعداد [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) أو تعداد [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/) حسب السياق، المحدد بواسطة معلمة *platformId*. |
|  | text | string | بيانات السلسلة الفعلية |

### قيمة الإرجاع

كائن JSON
| حقل | الوصف |
| ----- | ----------- |
|  | errorCode | رمز الخطأ (0 لا خطأ) |
|  | errorText | نص الخطأ ("" لا خطأ) |
|  | fileNameResult | اسم ملف النتيجة |

### أمثلة

**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    (evt.data == 'ready') ? 'library loaded!' :
    (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "font/ttf", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;
 
 /*Event handler*/
  const ffileFontSetInfo = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
          const nameId = 'Module.TtfNameTableNameId.' + document.getElementById("NameId").value;
          //Value will be changed for PlatformId = PlatformId.Microsoft, PlatformSpecificId = MSPlatformSpecificId.Unicode_BMP_UCS2 (1) and languageID = 1033 (English_United_States = 0x0409)
          const platformId = 'Module.TtfNameTablePlatformId.Microsoft';
          const platformSpecificId = 'Module.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2';
          const langID = 'Module.TtfNameTableMSLanguageId.English_United_States';
          const text = document.getElementById("textValue").value;
          transfer = [event.target.result];
          params = [event.target.result, e.target.files[0].name, nameId, platformId, platformSpecificId, langID, text];
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontSetInfo', "params": params }, transfer);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```
**Simple example**:
```js
  var fFontSetInfo = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {

      const nameId = new Function("return Module.TtfNameTableNameId." + document.getElementById("NameId").value)();
      const platformId = Module.TtfNameTablePlatformId.Microsoft;
      const platformSpecificId = Module.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
      const text = document.getElementById("textValue").value;
      const langID = 1033;

      const json = AsposeFontSetInfo(blob, file.name, nameId, platformId, platformSpecificId, langID, text);
      if (json.errorCode == 0) {
        DownloadFile(json.fileNameResult);
        //DownloadFile(file.name);
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(file);
  }
```

### انظر أيضًا

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
