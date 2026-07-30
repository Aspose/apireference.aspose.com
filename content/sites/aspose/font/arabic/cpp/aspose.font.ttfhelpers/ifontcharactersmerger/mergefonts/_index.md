---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts طريقة"
linktitle: "MergeFonts"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts طريقة. يدمج الخطوط بناءً على قوائم القوالب الممررة. يبحث عن رمز حرف لكل قالب ممرر ويضيف رمز الحرف المكتشف مع القالب المقابل إلى الخط الجديد الناتج في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


يدمج الخطوط بناءً على قوائم الحروف المرسلة. يبحث عن رمز حرف لكل حرف مرسل ويضيف رمز الحرف المكتشف مع الحرف المقابل إلى الخط الجديد الناتج.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font1Glyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font2Glyphs, System::String newFontName)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font1Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | قائمة القوالب من الخط الأول |
| font2Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | قائمة القوالب من الخط الثاني |
| newFontName | System::String | الاسم المطلوب للخط الناتج |

### ReturnValue

خط مدمج

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الرموز (symbol codes) من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور تلقائيًا على [Glyphs](../../../aspose.font.glyphs/) المرتبطة بالرموز الممررة. على سبيل المثال، إذا كنت تريد تضمين glyphs المرتبطة بالحروف A و B من الخط الأول و glyphs المرتبطة بالحروف C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")**

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> font1CharCodes, System::ArrayPtr<uint32_t> font2CharCodes, System::String newFontName)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font1CharCodes | System::ArrayPtr\<uint32_t\> | الرموز التي سيتم أخذها من الخط الأول |
| font2CharCodes | System::ArrayPtr\<uint32_t\> | الرموز التي سيتم أخذها من الخط الثاني |
| newFontName | System::String | الاسم المطلوب للخط الناتج |

### ReturnValue

خط مدمج

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


تم تصميم نسخة هذه الطريقة للحالات التي تريد فيها تعيين رموز الحروف للرموز (glyphs) في الخط الناتج بشكل صريح. ليس من الضروري أن يكون الرمز للرمز (glyph) الذي قدمته موجودًا في الخط الأصلي. معنى الرمز الممرر هو أنه سيُربط بمعرف الرمز المقابل في الخط الناتج. لذلك، القاعدة لمعالجة كل زوج يُمرر عبر معلمة القاموس [code, glyph identifier] هي أن معرف الرمز فقط سيُؤخذ من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون ذلك مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font1Dict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font2Dict, System::String newFontName)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font1Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الأول |
| font2Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الثاني |
| newFontName | System::String | الاسم المطلوب للخط الناتج |

### ReturnValue

خط مدمج

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
