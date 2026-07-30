---
title: "TtfFont.GetGlyphById"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة TtfFont. تُرجع glyph حسب معرف glyph. معرف glyph هو رقم فريد لحرف يعتمد على نوع الخط. يمكن أن يكون معرف glyph لخط TTF مثالًا على الفئة GlyphStringId أو الفئة GlyphUInt32Id. يتم دعم عنونة glyph باستخدام اسم السلسلة للخطوط TTF عبر تخطيط جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لعنونة الحروف بالاسم."
type: docs
weight: 180
url: /ar/net/aspose.font.ttf/ttffont/getglyphbyid/
---
## GetGlyphById(GlyphId) {#getglyphbyid}

يُرجع glyph حسب معرف glyph. معرف glyph هو رقم فريد لحرف يعتمد على نوع الخط. يمكن أن يكون معرف glyph لخط TTF مثالًا على الفئة ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)). يتم دعم عنونة glyph باستخدام اسم (string) للخطوط TTF عبر تخطيط جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لعنونة الحروف بالاسم.

```csharp
public override Glyph GetGlyphById(GlyphId id)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | GlyphId | معرف الحرف. |

### قيمة الإرجاع

Glyph.

### انظر أيضاً

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphById(string) {#getglyphbyid_1}

يرجع الرمز حسب اسمه. دعم عنونة الرموز بالاسم (سلسلة) متاح لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF، تُستخدم هياكل CFF لتوجيه الرموز بالاسم.

```csharp
public Glyph GetGlyphById(string glyphName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | String | معرف سلسلة Glyph. |

### قيمة الإرجاع

Glyph.

### انظر أيضاً

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphById(uint) {#getglyphbyid_2}

يرجع الرمز حسب معرفه.

```csharp
public Glyph GetGlyphById(uint id)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | UInt32 | فهرس الحرف. |

### قيمة الإرجاع

Glyph.

### انظر أيضاً

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


