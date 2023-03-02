---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Aspose.GIS لمرجع .NET API
description: FileGdbCoordinatePrecisionGrid طريقة. إنشاء جديدFileGdbCoordinatePrecisionGrid بحيث تكون جميع القيم داخل المستطيل قابلة للتمثيل.
type: docs
weight: 20
url: /ar/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

إنشاء جديد`FileGdbCoordinatePrecisionGrid` بحيث تكون جميع القيم داخل المستطيل قابلة للتمثيل.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| p1 | IPoint | أحد أركان المستطيل. |
| p2 | IPoint | الزاوية المقابلة للمستطيل. يجب أن يكون لها نفس أبعاد*p1*. |

### قيمة الإرجاع

ملف`FileGdbCoordinatePrecisionGrid`بحيث تكون جميع القيم داخل المستطيل قابلة للتمثيل. القيم خارج المستطيل غير قابلة للتمثيل ، لذلك يجب أن تكون جميع الإحداثيات التي ستتم كتابتها إلى FileGDB layer داخل المستطيل.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null` . |
| ArgumentException | *p1* و*p2* لا تشكل مستطيلاً صالحاً غير فارغ: *p1* أو*p2* فارغ. أعلام HasZ*p1* لا يساوي علم "HasZ" لـ*p2* أعلام HasM*p1* لا يساوي علم "HasM" لـ*p2* X 'تنسيق*p1* يساوي إحداثي "X"*p2* تنسيق Y لـ*p1* يساوي إحداثي "ص"*p2* تنسيق Z لـ*p1* يساوي إحداثي "Z"*p2* تنسيق م*p1* يساوي إحداثي "M" من*p2* أي تنسيقNaN أو ما لا نهاية. |

### أنظر أيضا

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* مساحة الاسم [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* المجسم [Aspose.GIS](../../../)


