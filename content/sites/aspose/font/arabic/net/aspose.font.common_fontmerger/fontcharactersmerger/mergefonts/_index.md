---
title: "FontCharactersMerger.MergeFonts"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة FontCharactersMerger. تدمج الخطوط بناءً على قوائم glyphs الممررة. تبحث عن رمز حرف لكل glyph ممرر وتضيف رمز الحرف المكتشف مع الرمز المقابل إلى الخط الناتج الجديد."
type: docs
weight: 30
url: /ar/net/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## MergeFonts(GlyphId[], GlyphId[], string) {#mergefonts}

يدمج الخطوط بناءً على قوائم glyphs الممررة. يبحث عن رمز حرف لكل glyph ممرر ويضيف رمز الحرف المكتشف مع الرمز المقابل إلى الخط الناتج الجديد.

```csharp
public abstract Font MergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, 
    string newFontName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontGlyphs | GlyphId[] | قائمة glyphs لأخذها من الخط الأساسي |
| secondaryFontGlyphs | GlyphId[] | قائمة glyphs لأخذها من الخط الثانوي |
| newFontName | String | الاسم المطلوب للخط الناتج |

### قيمة الإرجاع

خط مدمج

### انظر أيضاً

* class [Font](../../../aspose.font/font/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [FontCharactersMerger](../)
* namespace [Aspose.Font.Common_FontMerger](../../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(uint[], uint[], string) {#mergefonts_2}

يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الرموز من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور على glyphs المرتبطة بالرموز الممررة تلقائيًا. على سبيل المثال، إذا كنت تريد تضمين في الخط الناتج glyphs المرتبطة بالحروف A و B من الخط الأول والglyphs المرتبطة بالحروف C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا:

```csharp
MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")
```

```csharp
public abstract Font MergeFonts(uint[] primaryFontCharCodes, uint[] secondaryFontCharCodes, 
    string newFontName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontCharCodes | UInt32[] | الأكواد لأخذها من الخط الأساسي |
| secondaryFontCharCodes | UInt32[] | الأكواد لأخذها من الخط الثانوي |
| newFontName | String | الاسم المطلوب للخط الناتج |

### قيمة الإرجاع

خط مدمج

### انظر أيضاً

* class [Font](../../../aspose.font/font/)
* class [FontCharactersMerger](../)
* namespace [Aspose.Font.Common_FontMerger](../../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) {#mergefonts_1}

تم تصميم نسخة هذه الطريقة للحالات التي ترغب فيها بتعيين رموز الأحرف للglyphs في الخط الناتج بشكل صريح. ليس من الضروري أن يكون الرمز للglyph الذي قدمته موجودًا في الخط الأصلي. معنى الرمز الممرر هو أنه سيُربط بمعرف glyph المقابل في الخط الناتج. لذلك، القاعدة لمعالجة كل زوج يُمرر عبر معلمة القاموس [code, glyph ideitifier] هي أن معرف glyph سيُؤخذ فقط من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون ذلك مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني.

```csharp
public abstract Font MergeFonts(IDictionary<uint, GlyphId> primaryFontDict, 
    IDictionary<uint, GlyphId> secondaryFontDict, string newFontName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontDict | IDictionary`2 | قاموس بأزواج [رمز الرمز، معرف الحرف] من الخط الأساسي |
| secondaryFontDict | IDictionary`2 | قاموس بأزواج [رمز الرمز، معرف الحرف] من الخط الثانوي |
| newFontName | String | الاسم المطلوب للخط الناتج |

### قيمة الإرجاع

خط مدمج

### انظر أيضاً

* class [Font](../../../aspose.font/font/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [FontCharactersMerger](../)
* namespace [Aspose.Font.Common_FontMerger](../../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../../)


