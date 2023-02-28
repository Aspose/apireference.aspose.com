---
title: RecognitionResult.Save
second_title: Aspose.OCR لمرجع .NET API
description: RecognitionResult طريقة. يحفظ المستند كنص عادي أو PDF أو مستند Microsoft Word .
type: docs
weight: 130
url: /ar/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

يحفظ المستند كنص عادي أو PDF أو مستند Microsoft Word .

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullFileName | String | اسم ملف مع مسار لحفظ التعرف ينتج عنه التنسيق المحدد. |
| saveFormat | SaveFormat | تنسيق المستند (Docx ، Txt ، Pdf). |
| applySpellingCorrection | Boolean | اضبط "true" لتصحيح الكلمات التي بها أخطاء إملائية في حال كان لديك مثل هذا في نتيجة التعرف. |
| language | SpellCheckLanguage | قاموس التدقيق الإملائي (اختياري). |
| dictionaryPath | String | اختياريا. المسار الكامل إلى قاموس المستخدم بتنسيق txt. التنسيق هو [كلمة - مسافة - تردد (رقم)] . مثال: 23135851162 \ n ذلك 3400031103 \ n |

### أنظر أيضا

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* مساحة الاسم [Aspose.OCR](../../recognitionresult/)
* المجسم [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

يحفظ المستند كنص عادي أو PDF أو مستند Microsoft Word .

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream لحفظ التعرف ينتج عنه التنسيق المحدد. |
| saveFormat | SaveFormat | تنسيق المستند (Docx ، Txt ، Pdf). |
| applySpellingCorrection | Boolean | اضبط "true" لتصحيح الكلمات التي بها أخطاء إملائية في حال كان لديك مثل هذا في نتيجة التعرف. |
| language | SpellCheckLanguage | قاموس التدقيق الإملائي (اختياري). |
| dictionaryPath | String | اختياريا. المسار الكامل إلى قاموس المستخدم بتنسيق txt. التنسيق هو [كلمة - مسافة - تردد (رقم)] . مثال: 23135851162 \ n ذلك 3400031103 \ n |

### أنظر أيضا

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* مساحة الاسم [Aspose.OCR](../../recognitionresult/)
* المجسم [Aspose.OCR](../../../)


