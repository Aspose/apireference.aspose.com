---
title: "System::Drawing::Region::Equals 메서드"
linktitle: "같음"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Region::Equals 메서드. 지정된 Region이 현재 객체가 나타내는 Region과 지정된 그리기 표면에서 동일한지 여부를 결정합니다 (C++)."
type: docs
weight: 600
url: /ko/cpp/system.drawing/region/equals/
---
## Region::Equals method


지정된 영역이 지정된 그리기 표면에서 현재 객체가 나타내는 영역과 동일한지 여부를 판단합니다.

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | 이 Region과 비교할 Region |
| g | const SharedPtr\<Graphics\>\& | 그리기 표면 |

### ReturnValue

변환 매개변수 **g**와 연관된 변환이 적용될 때 지정된 Region의 내부가 현재 객체가 나타내는 Region의 내부와 동일하면 true; 그렇지 않으면 false

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
