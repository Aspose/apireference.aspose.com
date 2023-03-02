---
title: SpatialReferenceSystem.CreateCompound
second_title: Aspose.GIS لمرجع .NET API
description: SpatialReferenceSystem طريقة. إنشاء SRS مركب .
type: docs
weight: 340
url: /ar/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

إنشاء SRS مركب .

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| name | String | اسم SRS الجديد. |
| head | SpatialReferenceSystem | رئيس SRS الجديد. |
| tail | SpatialReferenceSystem | ذيل SRS من SRS الجديد. |
| identifier | Identifier | المعرف الذي سيتم إرفاقه بـ SRS. لن يؤدي إرفاق معرّف إلى تعديل معلمات SRS الأخرى. الأمر متروك لك لضمان اتساق المعرف ومعلمات SRS. |

### قيمة الإرجاع

مجمع جديد SRS.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | أي حجة ما عدا*identifier* يكون`null` . |
| InvalidOperationException | *head* أو*tail* هم مركب SRS أنفسهم. |

### أنظر أيضا

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* المجسم [Aspose.GIS](../../../)


