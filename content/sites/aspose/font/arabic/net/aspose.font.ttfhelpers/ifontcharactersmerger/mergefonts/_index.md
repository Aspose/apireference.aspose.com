---
title: "IFontCharactersMerger.MergeFonts"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IFontCharactersMerger. تدمج الخطوط بناءً على قوائم glyphs المرسلة. تبحث عن رمز حرف لكل glyph مرسل وتضيف رمز الحرف المكتشف مع glyph المقابل إلى الخط الجديد الناتج"
type: docs
weight: 10
url: /ar/net/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## MergeFonts(GlyphId[], GlyphId[], string) {#mergefonts}

يدمج الخطوط بناءً على قوائم glyphs المرسلة. يبحث عن رمز حرف لكل glyph مرسل ويضيف رمز الحرف المكتشف مع glyph المقابل إلى الخط الجديد الناتج.

```csharp
public TtfFont MergeFonts(GlyphId[] font1Glyphs, GlyphId[] font2Glyphs, string newFontName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| font1Glyphs | GlyphId[] | قائمة glyphs من الخط الأول |
| font2Glyphs | GlyphId[] | قائمة glyphs من الخط الثاني |
| newFontName | String | الاسم المطلوب للخط الناتج |

### قيمة الإرجاع

خط مدمج

### انظر أيضاً

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(uint[], uint[], string) {#mergefonts_2}

يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الرموز من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور على glyphs المرتبطة بالرموز الممررة تلقائيًا. على سبيل المثال، إذا كنت تريد تضمين في الخط الناتج glyphs المرتبطة بالحروف A و B من الخط الأول والglyphs المرتبطة بالحروف C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا:

```csharp
MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")
```

```csharp
public TtfFont MergeFonts(uint[] font1CharCodes, uint[] font2CharCodes, string newFontName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| font1CharCodes | UInt32[] | رموز لأخذها من الخط الأول |
| font2CharCodes | UInt32[] | الأكواد التي يجب أخذها من الخط الثاني |
| newFontName | String | الاسم المطلوب للخط الناتج |

### قيمة الإرجاع

خط مدمج

### انظر أيضاً

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) {#mergefonts_1}

تم تصميم نسخة هذه الطريقة للحالات التي ترغب فيها بتعيين رموز الأحرف للglyphs في الخط الناتج بشكل صريح. ليس من الضروري أن يكون الرمز للglyph الذي قدمته موجودًا في الخط الأصلي. معنى الرمز الممرر هو أنه سيُربط بمعرف glyph المقابل في الخط الناتج. لذلك، القاعدة لمعالجة كل زوج يُمرر عبر معلمة القاموس [code, glyph ideitifier] هي أن معرف glyph سيُؤخذ فقط من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون ذلك مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني.

```csharp
public TtfFont MergeFonts(IDictionary<uint, GlyphId> font1Dict, 
    IDictionary<uint, GlyphId> font2Dict, string newFontName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| font1Dict | IDictionary`2 | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الأول |
| font2Dict | IDictionary`2 | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الثاني |
| newFontName | String | الاسم المطلوب للخط الناتج |

### قيمة الإرجاع

خط مدمج

### انظر أيضاً

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)


