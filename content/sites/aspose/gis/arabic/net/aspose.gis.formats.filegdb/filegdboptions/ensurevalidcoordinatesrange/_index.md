---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Aspose.GIS لمرجع .NET API
description: FileGdbOptions ملكية. ما إذا كان يجب أن تكون الإحداثيات في نطاق صالح .
type: docs
weight: 30
url: /ar/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

ما إذا كان يجب أن تكون الإحداثيات في نطاق صالح .

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### ملاحظات

هذا خيار إنشاء ولا يؤثر على القراءة. إذا تم الضبط على`true` سيتم طرح استثناء عند محاولة كتابة تنسيق مع قيم خارج النطاق الصالح. إذا تم التعيين على`false` سيتم كتابة هذا التنسيق بصمت. يتم تحديد النطاق الصالح بواسطة[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) . تشير إلى[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) وثائق لقراءة حول كيفية تحديد النطاق الصالح من شبكة دقة الإحداثيات. الافتراضي هو`false` .

### أنظر أيضا

* class [FileGdbOptions](../)
* مساحة الاسم [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* المجسم [Aspose.GIS](../../../)


