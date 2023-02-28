---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR لمرجع .NET API
description: RecognitionResult طريقة. ابحث عن الكلمات التي بها أخطاء إملائية مع التهجئات المقترحة لنص إدخال معين.
type: docs
weight: 110
url: /ar/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

ابحث عن الكلمات التي بها أخطاء إملائية مع التهجئات المقترحة لنص إدخال معين.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| language | SpellCheckLanguage | القاموس المراد استخدامه. |
| dictionaryPath | String | اختياريا. المسار الكامل إلى قاموس المستخدم (قاموس التردد). تنسيق ملف القاموس: ملف نصي عادي بترميز UTF-8. يتم الفصل بين تردد الكلمات والكلمة بمسافة أو علامة تبويب ، ويُتوقع وجود الكلمة في العمود الأول والتردد في العمود الثاني. زوج التردد في سطر منفصل. يتم تعريف السطر على أنه تسلسل من الأحرف متبوعًا بتغذية سطر ("\ n") ، أو حرف إرجاع ("\ r") ، أو أو حرف إرجاع متبوعًا مباشرة بموجز سطر ("\ r \ n") . من المتوقع أن تكون كل كلمة بأحرف صغيرة . |

### قيمة الإرجاع

قائمة بكائن SpellCheckError يمثل الكلمات التي بها أخطاء إملائية مع قوائم مقترحة تهجئة صحيحة لكل كلمة بها أخطاء إملائية ، ومع مسافة التحرير.

### أنظر أيضا

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* مساحة الاسم [Aspose.OCR](../../recognitionresult/)
* المجسم [Aspose.OCR](../../../)


