---
title: SpatialReferenceSystem.Validate
second_title: Aspose.GIS لمرجع .NET API
description: SpatialReferenceSystem طريقة. تحديد ما إذا كان SRS هذا صالحًا.
type: docs
weight: 240
url: /ar/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

تحديد ما إذا كان SRS هذا صالحًا.

```csharp
public abstract bool Validate(out string errorMessage)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| errorMessage | String& | إذا طريقة العودة`false`، إذن هذا وصف للبطلان. |

### قيمة الإرجاع

`true` إذا كانت SRS صالحة ،`false` خلاف ذلك.

### ملاحظات

يجب أن يكون SRS صالحًا بيضاويًا صالحًا . - يجب أن يكون لـ SRS الجغرافي محور شرق / غرب واحد بالضبط ، ومحور شمال / جنوب واحد تمامًا ، ومحور اختياري أعلى / أسفل (يوجد المحور الاختياري عندما يكون SRS الجغرافي مركبًا من SRS الجغرافي ثنائي الأبعاد و SRS العمودي) . - يجب أن يحتوي SRS المسقط على محور شرق / غرب واحد بالضبط ، ومحور شمال / جنوب واحد ، ومحور اختياري أعلى / أسفل (يوجد محور اختياري عندما يكون SRS الإسقاط مركبًا من SRS جغرافيًا ثنائي الأبعاد و SRS عموديًا). - يجب أن يحتوي نظام SRS لمركز الأرض على محور شرق / غرب واحد تمامًا ، ومحور شمال / جنوب واحد تمامًا ومحور آخر تمامًا. - يجب أن يحتوي SRS العمودي على محور واحد لأعلى / لأسفل. - يجب أن يكون لمحور SRS المحلي محور واحد على الأقل. اتجاهات المحاور لا يتم قياسها . - يجب أن يكون SRS المركب مزيجًا من جغرافي / متوقع صالح و SRS عمودي صالح.

### أنظر أيضا

* class [SpatialReferenceSystem](../)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* المجسم [Aspose.GIS](../../../)


