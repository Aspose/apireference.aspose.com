---
title: "System::Drawing::Point::Subtract 메서드"
linktitle: "빼기"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Point::Subtract 메서드. 지정된 Size 객체의 너비와 높이 값을 지정된 Point 객체의 X 및 Y 좌표 값에서 각각 C++에서 빼줍니다."
type: docs
weight: 1800
url: /ko/cpp/system.drawing/point/subtract/
---
## Point::Subtract method


지정된 [Size](../../size/) 객체의 너비와 높이 값을 지정된 [Point](../) 객체의 X 및 Y 좌표 값에서 각각 빼줍니다.

```cpp
static Point System::Drawing::Point::Subtract(const Point &point, const Size &size)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 점 | const Point\& | 변환할 점 |
| size | const Size\& | 좌표 값에서 빼야 할 값을 지정하는 [Size](../../size/) 객체 **point** |

### ReturnValue

새로운 [Point](../) 객체로, X 좌표 값은 **point**의 X 좌표 값에서 **size**의 너비 값을 뺀 결과와 같으며, Y 좌표 값은 **point**의 Y 좌표 값에서 **size**의 높이 값을 뺀 결과와 같습니다.

## 또 보기

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
