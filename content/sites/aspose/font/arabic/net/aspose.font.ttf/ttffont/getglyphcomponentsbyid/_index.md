---
title: "TtfFont.GetGlyphComponentsById"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة TtfFont. تحصل على حرف (glyph) باستخدام معرف الحرف الممرّر وتملأ القائمة الممرّرة من معرفات الحروف بمكونات هذا الحرف. معرف الحرف هو رقم فريد لحرف يعتمد على نوع الخط. يمكن أن يكون معرف حرف خط TTF مثالًا من الفئة GlyphStringId أو الفئة GlyphUInt32Id. يتم دعم عنونة الحروف باستخدام سلسلة الاسم للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لعناوين الحروف بالاسم."
type: docs
weight: 190
url: /ar/net/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## GetGlyphComponentsById(GlyphId, GlyphIdList) {#getglyphcomponentsbyid}

يحصل على حرف باستخدام معرف الحرف الممرّر ويملأ القائمة الممرّرة من معرفات الحروف بمكونات هذا الحرف. معرف الحرف هو رقم فريد لحرف يعتمد على نوع الخط. يمكن أن يكون معرف حرف خط TTF مثالًا من الفئة ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)). يتم دعم عنونة الحروف باستخدام السلسلة (string) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لعناوين الحروف بالاسم.

```csharp
public virtual void GetGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | GlyphId | معرف الحرف. |
| componentsToPopulate | GlyphIdList | قائمة معرفات الحروف لتعبئتها. |

## ملاحظات

يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة معرفات مكونات الحروف.

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphComponentsById(string, GlyphIdList) {#getglyphcomponentsbyid_1}

يحصل على شكل باستخدام اسم الشكل الممرّر ويملأ القائمة الممرّرة لمعرفات الأشكال بمكونات هذا الشكل.

```csharp
public void GetGlyphComponentsById(string glyphName, GlyphIdList componentsToPopulate)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | String | اسم الحرف. |
| componentsToPopulate | GlyphIdList | قائمة معرفات الحروف لتعبئتها. |

## ملاحظات

يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة معرفات مكونات الحروف.

### انظر أيضاً

* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphComponentsById(uint, GlyphIdList) {#getglyphcomponentsbyid_2}

يحصل على شكل باستخدام فهرس الشكل الممرّر ويملأ القائمة الممرّرة لمعرفات الأشكال بمكونات هذا الشكل.

```csharp
public void GetGlyphComponentsById(uint id, GlyphIdList componentsToPopulate)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | UInt32 | فهرس الحرف. |
| componentsToPopulate | GlyphIdList | قائمة معرفات الحروف لتعبئتها. |

## ملاحظات

يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة معرفات مكونات الحروف.

### انظر أيضاً

* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


