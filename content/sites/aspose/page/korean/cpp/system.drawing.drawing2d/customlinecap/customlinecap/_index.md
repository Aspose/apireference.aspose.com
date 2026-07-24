---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap 생성자"
linktitle: "CustomLineCap"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap 생성자. 지정된 속성을 가진 사용자 정의 라인 캡을 나타내는 CustomLineCap 클래스의 새 인스턴스를 C++에서 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


지정된 속성을 가진 사용자 정의 라인 캡을 나타내는 [CustomLineCap](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | 사용자 정의 캡에 대한 채우기를 지정합니다. |
| strokePath | const SharedPtr\<GraphicsPath\>\& | 사용자 정의 캡의 외곽선을 지정합니다. |
| baseCap | LineCap | 사용자 정의 캡이 생성되는 기본 라인 캡 |
| baseInset | float | 선과 캡 사이의 거리를 지정합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
