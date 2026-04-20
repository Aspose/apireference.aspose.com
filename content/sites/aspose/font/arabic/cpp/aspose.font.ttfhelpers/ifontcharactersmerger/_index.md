---
title: "فئة Aspose::Font::TtfHelpers::IFontCharactersMerger"
linktitle: "IFontCharactersMerger"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::TtfHelpers::IFontCharactersMerger. تعلن عن وظائف المساعدين لدمج خطوط TrueType. الخط الذي يتم تمريره كمعامل font1 يُعتبر أساسيًا. هذا يعني أن العديد من الخصائص، المتعلقة بالخط المدمج النهائي، مثل المقاييس، بنية الترميز وغيرها، ستُؤخذ من هذا الخط الأساسي في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger class


تعلن عن وظائف المساعدين لدمج خطوط TrueType. [Font](../../aspose.font/font/) الذي يتم تمريره كمعامل font1 يُعتبر أساسيًا. هذا يعني أن العديد من الخصائص، المتعلقة بالخط المدمج النهائي، مثل المقاييس، بنية الترميز وغيرها، ستُؤخذ من هذا الخط الأساسي.

```cpp
class IFontCharactersMerger : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | يدمج الخطوط بناءً على قوائم الحروف المرسلة. يبحث عن رمز حرف لكل حرف مرسل ويضيف رمز الحرف المكتشف مع الحرف المقابل إلى الخط الجديد الناتج. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | يدمج الخطوط بناءً على قوائم رموز الحروف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الرموز (symbol codes) من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور تلقائيًا على [Glyphs](../../aspose.font.glyphs/) المتعلقة بالرموز الممررة. على سبيل المثال، إذا كنت تريد تضمين في الخط الناتج الرموز المتعلقة بالحروف A و B من الخط الأول والرموز المتعلقة بالحروف C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | تم تصميم نسخة هذه الطريقة للحالات التي تريد فيها تعيين رموز الحروف للرموز (glyphs) في الخط الناتج بشكل صريح. ليس من الضروري أن يكون الرمز للرمز (glyph) الذي قدمته موجودًا في الخط الأصلي. معنى الرمز الممرر هو أنه سيُربط بمعرف الرمز المقابل في الخط الناتج. لذلك، القاعدة لمعالجة كل زوج يُمرر عبر معلمة القاموس [code, glyph identifier] هي أن معرف الرمز فقط سيُؤخذ من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون ذلك مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TtfHelpers](../)
* Library [Aspose.Font for C++](../../)
