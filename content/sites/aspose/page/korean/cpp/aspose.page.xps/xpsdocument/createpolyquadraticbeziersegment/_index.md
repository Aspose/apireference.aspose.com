---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment 메서드"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment 메서드. C++에서 지정된 제어점을 사용하여 경로 도형의 이전 점에서 여러 정점들을 거쳐 새로운 2차 베지어 곡선 집합을 생성합니다."
type: docs
weight: 2600
url: /ko/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


경로 도형의 이전 점에서 정점 집합을 통해 지정된 제어점을 사용하여 새로운 2차 베지어 곡선 집합을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 점 | System::ArrayPtr\<System::Drawing::PointF\> | 다중 2차 베지어 세그먼트에 대한 제어점. |
| isStroked | bool | 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정합니다. |

### ReturnValue

새로운 2차 베지어 곡선 세그먼트.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
