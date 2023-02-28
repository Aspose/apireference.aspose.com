---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR لمرجع .NET API
description: AsposeOcr طريقة. تحقق مما إذا كانت الصورة تحتوي على جزء النص المقدم.
type: docs
weight: 80
url: /ar/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

تحقق مما إذا كانت الصورة تحتوي على جزء النص المقدم.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath | String | مسار الصورة. |
| text | String | جزء نصي للبحث في الصورة. |
| settings | RecognitionSettings | إعدادات التعرف. |
| ignoreCase | Boolean | صحيح - يعني بحث غير حساس لحالة الأحرف. |

### قيمة الإرجاع

صحيح إذا كانت الصورة تحتوي على جزء من النص. خطأ - الصورة لا تحتوي على جزء نصي.

### ملاحظات

يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../../recognitionsettings/) . يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

### أنظر أيضا

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

تحقق مما إذا كان نص الصورة يطابق التعبير العادي المقدم.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath | String | مسار الصورة. |
| regex | Regex | كائن System.Text.RegularExpressions مع النمط والخيارات المتوفرة. |
| settings | RecognitionSettings | إعدادات التعرف. |

### قيمة الإرجاع

صحيح إذا تطابق نص الصورة مع التعبير العادي المقدم.

### ملاحظات

يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../../recognitionsettings/) . يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

### أنظر أيضا

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)


