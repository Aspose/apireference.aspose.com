---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR لمرجع .NET API
description: AsposeOcr طريقة. قارن النصوص الموجودة على الصورتين وأعد رقمًا يمثل مدى تشابههما من 0 إلى 1 .
type: docs
weight: 90
url: /ar/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

قارن النصوص الموجودة على الصورتين وأعد رقمًا يمثل مدى تشابههما (من 0 إلى 1) .

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath1 | String | الطريق إلى الصورة الأولى. |
| fullPath2 | String | الطريق إلى الصورة الثانية. |
| settings | RecognitionSettings | إعدادات التعرف. |
| ignoreCase | Boolean | صحيح - يعني بحث غير حساس لحالة الأحرف. |

### قيمة الإرجاع

0 يعني أن النصوص مختلفة تمامًا ؛ 1 يعني أن النصوص متطابقة.

### أنظر أيضا

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)


