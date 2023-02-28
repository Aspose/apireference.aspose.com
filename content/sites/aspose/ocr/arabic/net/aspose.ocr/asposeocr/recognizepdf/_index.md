---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR لمرجع .NET API
description: AsposeOcr طريقة. التعرف على النص من ملف pdf الممسوح ضوئيًا استخراج الصور. يتعرف على ملف pdf مع إمكانية التحديدDocumentRecognitionSettings . يدعم ملفات PDF الممسوحة ضوئيًا فقط. لا يدعم ملف PDF القابل للبحث .
type: docs
weight: 220
url: /ar/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

التعرف على النص من ملف pdf الممسوح ضوئيًا (استخراج الصور). يتعرف على ملف pdf مع إمكانية التحديد[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . يدعم ملفات PDF الممسوحة ضوئيًا فقط. لا يدعم ملف PDF القابل للبحث .

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath | String | المسار الكامل للصورة. |
| settings | DocumentRecognitionSettings | إعدادات التعرف. |

### قيمة الإرجاع

ال[`RecognitionResult`](../../recognitionresult/) مع نتائج التعرف على الصور.

### أنظر أيضا

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

التعرف على النص من ملف pdf الممسوح ضوئيًا (استخراج الصور). يتعرف على ملف pdf مع إمكانية التحديد[`RecognitionSettings`](../../recognitionsettings/) . يدعم ملفات PDF الممسوحة ضوئيًا فقط. لا يدعم ملف PDF القابل للبحث .

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | MemoryStream | تدفق الذاكرة مع ملف pdf. |
| settings | DocumentRecognitionSettings | إعدادات التعرف. |

### قيمة الإرجاع

ال[`RecognitionResult`](../../recognitionresult/) مع نتائج التعرف على الصور.

### أنظر أيضا

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)


