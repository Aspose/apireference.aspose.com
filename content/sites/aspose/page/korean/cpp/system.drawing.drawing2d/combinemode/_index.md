---
title: "System::Drawing::Drawing2D::CombineMode 열거형"
linktitle: "CombineMode"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::CombineMode 열거형. C++에서 클리핑 영역이 결합되는 방식을 지정합니다."
type: docs
weight: 1400
url: /ko/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


클리핑 영역이 결합되는 방식을 지정합니다.

```cpp
enum class CombineMode
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| 바꾸기 | 0 | 한 클리핑 영역이 다른 영역으로 교체됩니다. |
| 교차 | 1 | 두 클리핑 영역은 교차점을 취하여 결합됩니다. |
| Union | 2 | 두 클리핑 영역은 두 영역의 합집합을 취하여 결합됩니다. |
| Xor | 3 | 두 클리핑 영역은 하나 또는 다른 영역에만 포함된 영역을 취하지만, 두 영역 모두에 포함된 영역은 제외하고 결합됩니다. |
| 제외 | 4 | 두 클리핑 영역은 첫 번째 영역 중 두 번째와 교차하지 않는 영역을 취하여 결합됩니다. |
| 보완 | 5 | 두 클리핑 영역은 두 번째 영역 중 첫 번째와 교차하지 않는 영역을 취하여 결합됩니다. |

## 또 보기

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
