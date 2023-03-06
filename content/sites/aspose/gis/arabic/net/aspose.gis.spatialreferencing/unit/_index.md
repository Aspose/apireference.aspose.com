---
title: Class Unit
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.SpatialReferencing.Unit فصل. تمثل وحدة القياس .
type: docs
weight: 2290
url: /ar/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

تمثل وحدة القياس .

```csharp
public class Unit : IdentifiableObject
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | احصل على الوحدة التي تمثل الدرجات. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | احصل على وحدة تمثل الأمتار. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | احصل على الوحدة التي تمثل الراديان. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | عامل إلى متر ، إذا كانت هذه وحدة طول ، عامل راديان ، إذا كانت هذه وحدة زاوية . |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | معرّف هذا الكائن القابل للتحديد . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | اسم هذا الكائن . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | يحول الوسيطة إلى وحدة ، كما هو موضح في هذا المثال. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | يحول الوسيطة من الوحدة ، الموصوفة في هذا المثال ، إلى راديان أو متر. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |

### أنظر أيضا

* class [IdentifiableObject](../identifiableobject/)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* المجسم [Aspose.GIS](../../)


