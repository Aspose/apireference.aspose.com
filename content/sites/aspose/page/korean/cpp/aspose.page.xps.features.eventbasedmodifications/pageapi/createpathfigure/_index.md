---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure 메서드"
linktitle: "CreatePathFigure"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure 메서드. 새 경로 도형을 생성합니다 (C++)."
type: docs
weight: 1500
url: /ko/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


새로운 경로 도형을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | 경로 도형의 첫 번째 세그먼트에 대한 시작점입니다. |
| isClosed | bool | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 "닫힌" 형태로 그려지며, 즉 경로 도형의 마지막 세그먼트의 마지막 점이 StartPoint 속성에 지정된 점과 연결됩니다. 그렇지 않으면 스트로크가 "열린" 형태로 그려지고 마지막 점이 시작점과 연결되지 않습니다. 이는 스트로크를 지정하는 Path 요소에서 경로 도형이 사용될 때만 적용됩니다. |

### ReturnValue

새 경로 도형입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


새로운 경로 도형을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | 경로 도형의 첫 번째 세그먼트에 대한 시작점입니다. |
| 세그먼트 | System::SharedPtr\\<System::Collections::Generic::List\\<System::SharedPtr\\<XpsModel::XpsPathSegment\\>\\>\\> | 경로 세그먼트 목록입니다. |
| isClosed | bool | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 "닫힌" 형태로 그려지며, 즉 경로 도형의 마지막 세그먼트의 마지막 점이 StartPoint 속성에 지정된 점과 연결됩니다. 그렇지 않으면 스트로크가 "열린" 형태로 그려지고 마지막 점이 시작점과 연결되지 않습니다. 이는 스트로크를 지정하는 Path 요소에서 경로 도형이 사용될 때만 적용됩니다. |

### ReturnValue

새 경로 도형입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
