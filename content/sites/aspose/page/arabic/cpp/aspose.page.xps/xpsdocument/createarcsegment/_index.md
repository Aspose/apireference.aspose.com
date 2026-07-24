---
title: "طريقة Aspose::Page::XPS::XpsDocument::CreateArcSegment"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::XPS::XpsDocument::CreateArcSegment. ينشئ مقطع قوس بيضاوي جديد في C++."
type: docs
weight: 1000
url: /ar/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


ينشئ مقطع قوس بيضاوي جديد.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| نقطة | System::Drawing::PointF | نقطة النهاية للقوس البيضاوي. |
| size | System::Drawing::SizeF | نصفا القطر x و y للقوس البيضاوي كزوج x,y. |
| rotationAngle | عدد عائم | يشير إلى كيفية تدوير الشكل البيضاوي بالنسبة لنظام الإحداثيات الحالي. |
| isLargeArc | bool | يحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر. |
| sweepDirection | XpsModel::XpsSweepDirection | الاتجاه الذي يُرسم فيه القوس. |
| isStroked | bool | يحدد ما إذا كان الخط لهذا الجزء من المسار مرسومًا. |

### ReturnValue

مقطع قوس بيضاوي جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
