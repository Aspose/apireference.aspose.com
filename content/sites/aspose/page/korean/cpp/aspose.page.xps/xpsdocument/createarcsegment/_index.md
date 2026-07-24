---
title: "Aspose::Page::XPS::XpsDocument::CreateArcSegment 메서드"
linktitle: "CreateArcSegment"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateArcSegment 메서드. C++에서 새로운 타원형 호 세그먼트를 생성합니다."
type: docs
weight: 1000
url: /ko/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


새 타원 호 세그먼트를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 점 | System::Drawing::PointF | 타원형 호의 끝점. |
| size | System::Drawing::SizeF | 타원형 호의 x 및 y 반경을 x,y 쌍으로 나타냅니다. |
| rotationAngle | float | 현재 좌표계에 대해 타원이 어떻게 회전되는지 나타냅니다. |
| isLargeArc | bool | 호가 180도 이상을 sweep 하는지 여부를 결정합니다. |
| sweepDirection | XpsModel::XpsSweepDirection | 호가 그려지는 방향. |
| isStroked | bool | 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정합니다. |

### ReturnValue

새로운 타원형 호 세그먼트.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
