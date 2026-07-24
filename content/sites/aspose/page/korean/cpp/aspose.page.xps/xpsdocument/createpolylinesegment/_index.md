---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment method. C++에서 임의 개수의 개별 정점을 포함하는 새로운 다각형 그리기를 생성합니다."
type: docs
weight: 2500
url: /ko/cpp/aspose.page.xps/xpsdocument/createpolylinesegment/
---
## XpsDocument::CreatePolyLineSegment method


임의 개수의 개별 정점을 포함하는 새로운 다각형 드로잉을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 점 | System::ArrayPtr\<System::Drawing::PointF\> | 폴리 라인 세그먼트를 정의하는 여러 세그먼트에 대한 좌표 집합입니다. |
| isStroked | bool | 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정합니다. |

### ReturnValue

새 폴리곤 그리기 세그먼트.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
