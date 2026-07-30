---
title: "الواجهة IFontCharactersMerger"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الواجهة Aspose.Font.TtfHelpers.IFontCharactersMerger. تُعلن عن وظائف المساعدين لدمج خطوط TrueType. الخط الذي يُمرَّر كمعامل font1 يُعتبر أساسيًا. وهذا يعني أن العديد من الخصائص المتعلقة بالخط المدمج النهائي مثل المقاييس، الترميز، الهيكل وغيرها ستُؤخذ من هذا الخط الأساسي."
type: docs
weight: 990
url: /ar/net/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger interface

يعلن عن وظائف المساعدين لدمج خطوط TrueType. يُعتبر الخط الممرّر كمعامل font1 هو الخط الأساسي. وهذا يعني أن العديد من الخصائص المتعلقة بالخط المدمج النهائي، مثل المقاييس، بنية الترميز وغيرها، ستُؤخذ من هذا الخط الأساسي.

```csharp
public interface IFontCharactersMerger
```

## الطرق

| الاسم | الوصف |
| --- | --- |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts)(GlyphId[], GlyphId[], string) | يدمج الخطوط بناءً على قوائم glyphs المرسلة. يبحث عن رمز حرف لكل glyph مرسل ويضيف رمز الحرف المكتشف مع glyph المقابل إلى الخط الجديد الناتج. |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts_1)(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) | تم تصميم نسخة هذه الطريقة للحالات التي ترغب فيها بتعيين رموز الأحرف للglyphs في الخط الناتج بشكل صريح. ليس من الضروري أن يكون الرمز للglyph الذي قدمته موجودًا في الخط الأصلي. معنى الرمز الممرر هو أنه سيُربط بمعرف glyph المقابل في الخط الناتج. لذلك، القاعدة لمعالجة كل زوج يُمرر عبر معلمة القاموس [code, glyph ideitifier] هي أن معرف glyph سيُؤخذ فقط من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون ذلك مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني. |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts_2)(uint[], uint[], string) | يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الرموز من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور على glyphs المرتبطة بالرموز الممررة تلقائيًا. على سبيل المثال، إذا كنت تريد تضمين في الخط الناتج glyphs المرتبطة بالحروف A و B من الخط الأول والglyphs المرتبطة بالحروف C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا: |

### انظر أيضاً

* namespace [Aspose.Font.TtfHelpers](../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../)


