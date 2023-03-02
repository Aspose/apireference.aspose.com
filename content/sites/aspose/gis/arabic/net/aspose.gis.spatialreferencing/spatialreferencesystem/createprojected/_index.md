---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS لمرجع .NET API
description: SpatialReferenceSystem طريقة. إنشاء SRS المتوقعة من المعلمات المخصصة .
type: docs
weight: 380
url: /ar/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

إنشاء SRS المتوقعة من المعلمات المخصصة .

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | معلمات للإنشاء منها. |
| identifier | Identifier | المعرف الذي سيتم إرفاقه بـ SRS. لن يؤدي إرفاق معرّف إلى تعديل معلمات SRS الأخرى. الأمر متروك لك لضمان اتساق المعرف ومعلمات SRS. |

### قيمة الإرجاع

SRS الجديد المتوقع.

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | SRS الأساسي في المعلمات هو`null` . طريقة الإسقاط في المعلمات هي`null` . |

### أنظر أيضا

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* المجسم [Aspose.GIS](../../../)


