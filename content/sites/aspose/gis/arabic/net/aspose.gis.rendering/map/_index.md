---
title: Class Map
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Rendering.Map فصل. الخريطة عبارة عن مجموعة من الطبقات التي يمكن عرضها فوق بعضها البعض عبرRenderer .
type: docs
weight: 1720
url: /ar/net/aspose.gis.rendering/map/
---
## Map class

الخريطة عبارة عن مجموعة من الطبقات التي يمكن عرضها فوق بعضها البعض عبر[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | إنشاء مثيل جديد لملف`خريطة` فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | لون خلفية الخريطة. افتراضات إلىTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | يحصل على عدد الطبقات في الخريطة. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | يحدد حدود الخريطة للعرض . إذا تم التعيين على`null` ، يتم حساب المدى أثناء العرض لتضمين كل الأشكال الهندسية في كل الطبقات. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | الارتفاع المرئي للخريطة. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | يحصل على الطبقة في الفهرس المحدد. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | تحديد المساحة المتروكة لإضافتها إلى الحد . |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | الدقة المطلوب استخدامها لعرض هذه الخريطة والتحويل بينها[`Measurement`](../measurement/) . الافتراضي هو 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) من الخريطة. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | العرض المرئي للخريطة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | ينشئ ويضيف ملف[`VectorMapLayer`](../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | يضيف طبقة إلى الخريطة. يتم تقديم الطبقات بترتيب إضافي. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | ينشئ ويضيف ملف[`VectorMapLayer`](../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | ينشئ ملف[`VectorMapLayer`](../vectormaplayer/) مع رمز افتراضي وإضافته إلى الخريطة. يتم تقديم الطبقات بترتيب إضافي. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | ينشئ ويضيف ملف[`VectorMapLayer`](../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | ينشئ ملف[`RasterMapLayer`](../rastermaplayer/) مع الملون الافتراضي وإضافته إلى الخريطة. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | ينشئ ويضيف ملف[`VectorMapLayer`](../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | ينشئ ويضيف ملف[`VectorMapLayer`](../vectormaplayer/) على الخريطة. يتم تقديم الطبقات بترتيب إضافي. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | التخلص من الموارد. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | تُرجع عدادًا يتكرر عبر الطبقات في الخريطة. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | يتم عرض الخريطة في ملف. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | يتم عرض الخريطة في ملف. |

### أنظر أيضا

* class [MapLayer](../maplayer/)
* مساحة الاسم [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* المجسم [Aspose.GIS](../../)


