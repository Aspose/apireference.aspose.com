---
title: "طريقة System::Drawing::Point::Subtract"
linktitle: "طرح"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Drawing::Point::Subtract. تُطرح قيم العرض والارتفاع لكائن Size المحدد من قيم إحداثيات X و Y لكائن Point المحدد على التوالي في C++."
type: docs
weight: 1800
url: /ar/cpp/system.drawing/point/subtract/
---
## Point::Subtract method


تُطرح قيم العرض والارتفاع لكائن [Size](../../size/) المحدد من قيم إحداثيات X و Y لكائن [Point](../) المحدد على التوالي.

```cpp
static Point System::Drawing::Point::Subtract(const Point &point, const Size &size)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة | const Point\& | النقطة للترجمة |
| size | const Size\& | كائن [Size](../../size/) الذي يحدد القيم التي تُطرح من قيم إحداثيات **point** |

### ReturnValue

كائن [Point](../) جديد تكون قيمة إحداثي X فيه مساوية لنتيجة طرح قيمة العرض من **size** من قيمة إحداثي X لـ **point** وتكون قيمة إحداثي Y مساوية لنتيجة طرح قيمة الارتفاع من **size** من قيمة إحداثي Y لـ **point**

## انظر أيضًا

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
