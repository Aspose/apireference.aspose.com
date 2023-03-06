---
title: Geometry.GetBuffer
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. حساب منطقة عازلة حول هذه الهندسة .
type: docs
weight: 210
url: /ar/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

حساب منطقة عازلة حول هذه الهندسة .

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| distance | Double | عرض منطقة المخزن المؤقت. |
| quadrantSegments | Int32 | عدد المقاطع المستخدمة لتقريب 90 درجة من الانحناء . كلما زاد هذا الرقم ، يتم إنتاج تقريب أفضل للمنحنيات. الافتراضي هو 30. |

### قيمة الإرجاع

شكل هندسي يمثل جميع النقاط الواقعة ضمن مسافة محددة من هذه الهندسة . نوع النتيجة إما[`Null`](../null/) و[`IPolygon`](../../ipolygon/) أو[`IMultiPolygon`](../../imultipolygon/) .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة بحيث لا يمكن إتمام العملية. |
| ArgumentOutOfRangeException | المقاطع الرباعية أقل أو تساوي 0. |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


