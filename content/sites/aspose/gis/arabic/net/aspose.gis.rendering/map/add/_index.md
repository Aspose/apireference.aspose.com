---
title: Map.Add
second_title: Aspose.GIS لمرجع .NET API
description: Map طريقة. ينشئ ملفVectorMapLayer مع رمز افتراضي وإضافته إلى الخريطة. يتم تقديم الطبقات بترتيب إضافي.
type: docs
weight: 110
url: /ar/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

ينشئ ملف[`VectorMapLayer`](../../vectormaplayer/) مع رمز افتراضي وإضافته إلى الخريطة. يتم تقديم الطبقات بترتيب إضافي.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| layer | VectorLayer | طبقة متجهة يتم تمثيلها بواسطة[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` لترك طبقة المتجه مفتوحة بعد[`Map`](../) يتم التخلص من الكائن ؛ `false` للتخلص من الطبقة. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطبقة`null`. |

### أنظر أيضا

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

ينشئ ويضيف ملف[`VectorMapLayer`](../../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| layer | VectorLayer | طبقة متجهة يتم تمثيلها بواسطة[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | رمز لاستخدامه في التقديم. لو`null`، يتم استخدام الرمز الافتراضي. |
| keepOpen | Boolean | `true` لترك طبقة المتجه مفتوحة بعد[`Map`](../) يتم التخلص من الكائن ؛ `false` للتخلص من الطبقة. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطبقة`null`. |

### أنظر أيضا

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

ينشئ ويضيف ملف[`VectorMapLayer`](../../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| layer | VectorLayer | طبقة متجهة يتم تمثيلها بواسطة[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | رمز لاستخدامه في التقديم. لو`null`، يتم استخدام الرمز الافتراضي. |
| labeling | Labeling | وضع العلامات لاستخدامه في تسمية المعالم في الطبقة. لو`null` ، تقصير[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) سوف تستخدم. |
| keepOpen | Boolean | `true` لترك الطبقة مفتوحة بعد[`Map`](../) يتم التخلص من الكائن خلاف ذلك،`false` . |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطبقة`null`. |

### أنظر أيضا

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

ينشئ ويضيف ملف[`VectorMapLayer`](../../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | تسلسل ميزات للتمثيل بواسطة[`VectorMapLayer`](../../vectormaplayer/). |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | تسلسل الميزات هو`null`. |

### أنظر أيضا

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

ينشئ ويضيف ملف[`VectorMapLayer`](../../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | تسلسل ميزات للتمثيل بواسطة[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | رمز لاستخدامه في التقديم. لو`null`، يتم استخدام الرمز الافتراضي. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | تسلسل الميزات هو`null`. |

### أنظر أيضا

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

ينشئ ويضيف ملف[`VectorMapLayer`](../../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | تسلسل ميزات للتمثيل بواسطة[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | رمز لاستخدامه في التقديم. |
| labeling | Labeling | وضع العلامات لاستخدامه في تسمية المعالم في الطبقة. لو`null` و[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) سوف تستخدم. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | تسلسل الميزات هو`null`. |

### أنظر أيضا

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

يضيف طبقة إلى الخريطة. يتم تقديم الطبقات بترتيب إضافي.

```csharp
public void Add(MapLayer mapLayer)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| mapLayer | MapLayer | الطبقة المراد إضافتها. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |

### أنظر أيضا

* class [MapLayer](../../maplayer/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

ينشئ ملف[`RasterMapLayer`](../../rastermaplayer/) مع الملون الافتراضي وإضافته إلى الخريطة.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| layer | RasterLayer | طبقة متجهة يتم تمثيلها بواسطة[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | أداة تلوين لاستخدامها في التقديم. لو`null`، يتم استخدام الملون الافتراضي. |
| keepOpen | Boolean | `true` لترك الطبقة النقطية مفتوحة بعد[`Map`](../) يتم التخلص من الكائن ؛ `false` للتخلص من الطبقة. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطبقة`null`. |

### أنظر أيضا

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../map/)
* المجسم [Aspose.GIS](../../../)


