---
title: "طريقة Aspose::Font::Common_FontMerger::MergeFonts"
linktitle: "MergeFonts"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts. يدمج الخطوط بناءً على قوائم glyphs الممررة. يبحث عن رمز حرف لكل glyph ممرر ويضيف رمز الحرف المكتشف مع glyph المقابل إلى الخط الجديد الناتج في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


يدمج الخطوط بناءً على قوائم الرموز (glyphs) الممررة. يبحث عن رمز حرف لكل رمز (glyph) ممرر ويضيف رمز الحرف المكتشف مع الرمز المقابل إلى الخط الناتج الجديد.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> primaryFontGlyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> secondaryFontGlyphs, System::String newFontName)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | قائمة glyphs لأخذها من الخط الأساسي |
| secondaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | قائمة glyphs لأخذها من الخط الثانوي |
| newFontName | System::String | الاسم المطلوب للخط الناتج |

### ReturnValue

خط مدمج

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الرموز (symbol codes) من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور تلقائيًا على [Glyphs](../../../aspose.font.glyphs/) المرتبطة بالرموز الممررة. على سبيل المثال، إذا كنت تريد تضمين glyphs المرتبطة بالحروف A و B من الخط الأول و glyphs المرتبطة بالحروف C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")**

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> primaryFontCharCodes, System::ArrayPtr<uint32_t> secondaryFontCharCodes, System::String newFontName)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontCharCodes | System::ArrayPtr\<uint32_t\> | الرموز التي يجب أخذها من الخط الأساسي |
| secondaryFontCharCodes | System::ArrayPtr\<uint32_t\> | الرموز التي يجب أخذها من الخط الثانوي |
| newFontName | System::String | الاسم المطلوب للخط الناتج |

### ReturnValue

خط مدمج

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


تم تصميم نسخة هذه الطريقة للحالات التي تريد فيها تعيين رموز الحروف للرموز (glyphs) في الخط الناتج بشكل صريح. ليس من الضروري أن يكون الرمز للرمز (glyph) الذي قدمته موجودًا في الخط الأصلي. معنى الرمز الممرر هو أنه سيُربط بمعرف الرمز المقابل في الخط الناتج. لذلك، القاعدة لمعالجة كل زوج يُمرر عبر معلمة القاموس [code, glyph identifier] هي أن معرف الرمز فقط سيُؤخذ من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون ذلك مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> primaryFontDict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> secondaryFontDict, System::String newFontName)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الأساسي |
| secondaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الثانوي |
| newFontName | System::String | الاسم المطلوب للخط الناتج |

### ReturnValue

خط مدمج

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
