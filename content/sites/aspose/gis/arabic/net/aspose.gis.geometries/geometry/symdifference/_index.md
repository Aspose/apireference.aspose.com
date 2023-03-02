---
title: Geometry.SymDifference
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. يُنشئ فرقًا متماثلًا بين هذه الهندسة والهندسة المحددة .
type: docs
weight: 380
url: /ar/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

يُنشئ فرقًا متماثلًا بين هذه الهندسة والهندسة المحددة .

```csharp
public IGeometry SymDifference(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة لحساب الاختلاف المتماثل معها. |

### قيمة الإرجاع

شكل هندسي يمثل اختلافًا متماثلًا في هذه الهندسة ووسيطة. تحتوي هندسة النتيجة على مجموعة النقاط الموجودة في إحدى الأشكال الهندسية ولكنها غير موجودة في كل منهما.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | *other* يكون`null`. |
| ArgumentException | إحدى الأشكال الهندسية غير صالحة بحيث لا يمكن إنهاء العملية . |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


