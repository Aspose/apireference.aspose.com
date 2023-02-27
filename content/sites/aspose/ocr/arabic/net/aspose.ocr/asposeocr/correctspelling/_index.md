---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR لمرجع .NET API
description: AsposeOcr طريقة. تصحيح النص استبدال الكلمات التي بها أخطاء إملائية .
type: docs
weight: 60
url: /ar/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

تصحيح النص (استبدال الكلمات التي بها أخطاء إملائية) .

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | نص للتصحيح. |
| language | SpellCheckLanguage | القاموس المراد استخدامه. |
| dictionaryPath | String | اختياريا. المسار الكامل إلى قاموس المستخدم (قاموس التردد). تنسيق ملف القاموس: ملف نصي عادي بترميز UTF-8. يتم الفصل بين تردد الكلمات والكلمة بمسافة أو علامة تبويب ، ويُتوقع وجود الكلمة في العمود الأول والتردد في العمود الثاني. زوج التردد في سطر منفصل. يتم تعريف السطر على أنه تسلسل من الأحرف متبوعًا بتغذية سطر ("\ n") ، أو حرف إرجاع ("\ r") ، أو أو حرف إرجاع متبوعًا مباشرة بموجز سطر ("\ r \ n") . من المتوقع أن تكون كل كلمة بأحرف صغيرة . |

### قيمة الإرجاع

نص مع الكلمات المستبدلة.

### أنظر أيضا

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)


