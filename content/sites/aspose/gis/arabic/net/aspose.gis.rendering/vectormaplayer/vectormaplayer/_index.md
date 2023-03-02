---
title: VectorMapLayer.VectorMapLayer
second_title: Aspose.GIS لمرجع .NET API
description: VectorMapLayer البناء. إنشاء مثيل جديد برمز افتراضي.
type: docs
weight: 10
url: /ar/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

إنشاء مثيل جديد برمز افتراضي.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | تسلسل الميزات. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |

### أنظر أيضا

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

إنشاء مثيل جديد برمز افتراضي.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | تسلسل الميزات. |
| symbolizer | VectorSymbolizer | Symbolizer لاستخدامه في عرض الطبقة. لو`null`، سيتم استخدام الرمز الافتراضي. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |

### أنظر أيضا

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

إنشاء مثيل جديد برمز افتراضي.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | تسلسل الميزات. |
| symbolizer | VectorSymbolizer | Symbolizer لاستخدامه في عرض الطبقة. لو`null`، سيتم استخدام الرمز الافتراضي. |
| labeling | Labeling | وضع العلامات لاستخدامه في تسمية المعالم في الطبقة. لو`null` ، تقصير[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) سوف تستخدم. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |

### أنظر أيضا

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

إنشاء مثيل جديد برمز افتراضي.

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| layer | VectorLayer | طبقة المتجهات. |
| keepOpen | Boolean | `true` لترك الطبقة مفتوحة بعد[`VectorMapLayer`](../) يتم التخلص من الكائن خلاف ذلك،`false` . |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطبقة`null`. |

### أنظر أيضا

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

إنشاء مثيل جديد .

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| layer | VectorLayer | طبقة المتجهات. |
| symbolizer | VectorSymbolizer | Symbolizer لاستخدامه في عرض الطبقة. لو`null`، سيتم استخدام الرمز الافتراضي. |
| keepOpen | Boolean | `true` لترك الطبقة مفتوحة بعد[`VectorMapLayer`](../) يتم التخلص من الكائن خلاف ذلك،`false` . |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطبقة`null`. |

### أنظر أيضا

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

إنشاء مثيل جديد .

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| layer | VectorLayer | طبقة المتجهات. |
| symbolizer | VectorSymbolizer | Symbolizer لاستخدامه في عرض الطبقة. لو`null`، سيتم استخدام الرمز الافتراضي. |
| labeling | Labeling | وضع العلامات لاستخدامه في تسمية المعالم في الطبقة. لو`null` ، تقصير[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) سوف تستخدم. |
| keepOpen | Boolean | `true` لترك الطبقة مفتوحة بعد[`VectorMapLayer`](../) يتم التخلص من الكائن خلاف ذلك،`false` . |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطبقة`null`. |

### أنظر أيضا

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)


