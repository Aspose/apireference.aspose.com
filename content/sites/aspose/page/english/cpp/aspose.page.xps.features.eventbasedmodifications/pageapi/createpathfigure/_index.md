---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure method
linktitle: CreatePathFigure
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure method. Creates a new path figure in C++.'
type: docs
weight: 1500
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Creates a new path figure.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | The starting point for the first segment of the path figure. |
| isClosed | bool | Specifies whether the path is closed. If set to true, the stroke is drawn "closed", that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and the last point is not connected to the start point. Only applicable if the path figure is used in a Path element that specifies a stroke. |

### ReturnValue

New path figure.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Creates a new path figure.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | The starting point for the first segment of the path figure. |
| segments | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | List of path segments. |
| isClosed | bool | Specifies whether the path is closed. If set to true, the stroke is drawn "closed", that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and the last point is not connected to the start point. Only applicable if the path figure is used in a Path element that specifies a stroke. |

### ReturnValue

New path figure.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
