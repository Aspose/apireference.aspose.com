---
title: "System::Drawing::Point::Subtract طريقة"
linktitle: "طرح"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Point::Subtract طريقة. تُطرح قيم العرض والارتفاع لكائن Size المحدد من قيم إحداثيات X و Y لكائن Point المحدد على التوالي في C++."
type: docs
weight: 1800
url: /ar/cpp/system.drawing/point/subtract/
---
## Point::Subtract method


تُطرح قيم العرض والارتفاع لكائن [Size](../../size/) المحدد من قيم إحداثيات X و Y لكائن [Point](../) المحدد على التوالي.

```cpp
static Point System::Drawing::Point::Subtract(const Point &point, const Size &size)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| نقطة | const Point\& | النقطة المراد ترجمتها |
| size | const Size\& | كائن [Size](../../size/) الذي يحدد القيم التي تُطرح من قيم إحداثيات **point** |

### ReturnValue

كائن [Point](../) جديد تكون قيمة إحداثي X فيه مساوية لنتيجة طرح قيمة العرض من **size** من قيمة إحداثي X في **point** وتكون قيمة إحداثي Y مساوية لنتيجة طرح قيمة الارتفاع من **size** من قيمة إحداثي Y في **point**

## انظر أيضًا

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
