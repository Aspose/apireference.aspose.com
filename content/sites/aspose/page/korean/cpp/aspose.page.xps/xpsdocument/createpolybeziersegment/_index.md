---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment 메서드"
linktitle: "CreatePolyBezierSegment"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment 메서드. C++에서 새로운 3차 베지어 곡선 집합을 생성합니다."
type: docs
weight: 2400
url: /ko/cpp/aspose.page.xps/xpsdocument/createpolybeziersegment/
---
## XpsDocument::CreatePolyBezierSegment method


새로운 3차 베지어 곡선 집합을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsPolyBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 점 | System::ArrayPtr\<System::Drawing::PointF\> | 여러 베지어 세그먼트에 대한 제어점. |
| isStroked | bool | 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정합니다. |

### ReturnValue

새 큐빅 베지어 곡선 세그먼트.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolybeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
