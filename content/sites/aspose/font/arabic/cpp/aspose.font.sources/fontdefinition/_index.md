---
title: "الفئة Aspose::Font::Sources::FontDefinition"
linktitle: "FontDefinition"
second_title: "Aspose.Font لـ C++"
description: "الفئة Aspose::Font::Sources::FontDefinition. تمثل تعريف مجموعة ملفات الخط. تحتوي هذه الفئة على حقول لا تتعلق ببيانات الخط الداخلية. تصف هذه الحقول موضع الخط وبيانات أخرى ضرورية لتحميل الخط من مصدر خط ما (ملف، ذاكرة، إلخ) في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


تمثل تعريف مجموعة ملفات [Font](../../aspose.font/font/). تحتوي هذه الفئة على حقول لا تتعلق ببيانات الخط الداخلية. تصف هذه الحقول موضع الخط وبيانات أخرى ضرورية لتحميل الخط من مصدر خط ما (ملف، ذاكرة، إلخ).

```cpp
class FontDefinition : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | ينشئ تعريفًا لملف [Font](../../aspose.font/font/) واحد. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | ينشئ تعريفًا لملف [Font](../../aspose.font/font/) واحد. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | ينشئ تعريفًا لملف [Font](../../aspose.font/font/) واحد. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | ينشئ تعريفًا لملف [Font](../../aspose.font/font/) واحد. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | ينشئ تعريفًا لملف [Font](../../aspose.font/font/) واحد. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | ينشئ تعريفًا لملف [Font](../../aspose.font/font/) واحد. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | ينشئ تعريفًا لملفات متعددة من نوع [Font](../../aspose.font/font/). |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | ينشئ تعريفًا لملفات متعددة من نوع [Font](../../aspose.font/font/). |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | ينشئ تعريفًا لملفات متعددة من نوع [Font](../../aspose.font/font/). |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | ينشئ تعريفًا لملفات متعددة من نوع [Font](../../aspose.font/font/). |
| [get_FileDefinitions](./get_filedefinitions/)() const | يحصل على مجموعة تعريفات الملفات. |
| virtual [get_FontName](./get_fontname/)() | يرجع اسم [Font](../../aspose.font/font/). |
| virtual [get_FontNames](./get_fontnames/)() | يحصل على أسماء [Font](../../aspose.font/font/) كـ [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| [get_FontType](./get_fonttype/)() const | يحصل على نوع [Font](../../aspose.font/font/). |
| virtual [get_PostscriptName](./get_postscriptname/)() | يحصل على اسم [Font](../../aspose.font/font/) بوستسكريبت. |
| [get_PostscriptNames](./get_postscriptnames/)() const | يحصل على أسماء [Font](../../aspose.font/font/) بوستسكريبت كـ [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | يعيد [FontDefinition](./) لملف الخط ونوع الخط. |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | يعيد [FontDefinition](./) لمصدر تدفق الخط ونوع الخط. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
