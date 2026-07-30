---
title: "الفئة FontCharactersMerger"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Common_FontMerger.FontCharactersMerger. تعلن عن الوظيفة لدمج الخطوط من أنواع مختلفة. يلزم زوج من الخطوط لعملية الدمج. يُعتبر أحد الخطوط في هذا الزوج أساسيًا. يعني ذلك أن العديد من الخصائص المتعلقة بالخط المدمج النهائي مثل المقاييس، الترميز، الهيكل وغيرها ستؤخذ من هذا الخط الأساسي. الخط الآخر في هذا الزوج الثانوي يوفر فقط glyphs للخط المدمج النهائي."
type: docs
weight: 150
url: /ar/net/aspose.font.common_fontmerger/fontcharactersmerger/
---
## FontCharactersMerger class

يعلن عن وظائف دمج الخطوط من أنواع مختلفة. يلزم وجود زوج من الخطوط لعملية الدمج. يُعتبر أحد الخطوط في هذا الزوج أساسيًا. وهذا يعني أن العديد من الخصائص المتعلقة بالخط المدمج النهائي، مثل المقاييس وبنية الترميز وغيرها، ستؤخذ من هذا الخط الأساسي. الخط الآخر في الزوج (الثانوي) يوفر فقط الرموز للخط المدمج النهائي.

```csharp
public abstract class FontCharactersMerger
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| abstract [PrimaryFont](../../aspose.font.common_fontmerger/fontcharactersmerger/primaryfont/) { get; } | يحصل على الخط الأساسي. |
| abstract [SecondaryFont](../../aspose.font.common_fontmerger/fontcharactersmerger/secondaryfont/) { get; } | يحصل على الخط الثانوي. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| abstract [MergeFonts](../../aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/#mergefonts)(GlyphId[], GlyphId[], string) | يدمج الخطوط بناءً على قوائم glyphs الممررة. يبحث عن رمز حرف لكل glyph ممرر ويضيف رمز الحرف المكتشف مع الرمز المقابل إلى الخط الناتج الجديد. |
| abstract [MergeFonts](../../aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/#mergefonts_1)(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) | تم تصميم نسخة هذه الطريقة للحالات التي ترغب فيها بتعيين رموز الأحرف للglyphs في الخط الناتج بشكل صريح. ليس من الضروري أن يكون الرمز للglyph الذي قدمته موجودًا في الخط الأصلي. معنى الرمز الممرر هو أنه سيُربط بمعرف glyph المقابل في الخط الناتج. لذلك، القاعدة لمعالجة كل زوج يُمرر عبر معلمة القاموس [code, glyph ideitifier] هي أن معرف glyph سيُؤخذ فقط من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون ذلك مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني. |
| abstract [MergeFonts](../../aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/#mergefonts_2)(uint[], uint[], string) | يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الرموز من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور على glyphs المرتبطة بالرموز الممررة تلقائيًا. على سبيل المثال، إذا كنت تريد تضمين في الخط الناتج glyphs المرتبطة بالحروف A و B من الخط الأول والglyphs المرتبطة بالحروف C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا: |

### انظر أيضاً

* namespace [Aspose.Font.Common_FontMerger](../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../)


