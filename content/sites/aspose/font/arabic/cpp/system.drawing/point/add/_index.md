---
title: "System::Drawing::Point::Add method"
linktitle: "Add"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Point::Add method. يضيف قيم العرض والارتفاع لكائن Size المحدد إلى قيم إحداثيات X و Y لكائن Point المحدد بشكل متطابق في C++."
type: docs
weight: 1500
url: /ar/cpp/system.drawing/point/add/
---
## Point::Add method


يضيف قيم العرض والارتفاع لكائن [Size](../../size/) المحدد إلى قيم إحداثيات X و Y لكائن [Point](../) المحدد بشكل متطابق.

```cpp
static Point System::Drawing::Point::Add(const Point &point, const Size &size)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة | const Point\& | النقطة للترجمة |
| size | const Size\& | كائن [Size](../../size/) الذي يحدد القيم لإضافتها إلى قيم إحداثيات **point** |

### ReturnValue

كائن [Point](../) جديد تكون قيمة إحداثي X فيه مساوية لمجموع قيمة إحداثي X لـ **point** وقيمة العرض لـ **size**، وتكون قيمة إحداثي Y مساوية لمجموع قيمة إحداثي Y لـ **point** وقيمة الارتفاع لـ **size**

## انظر أيضًا

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
