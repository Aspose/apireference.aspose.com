---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure 方法"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure 方法。创建一个新的路径图形，使用 C++。"
type: docs
weight: 1500
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


创建一个新的路径图形。

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | 路径图形第一个段的起始点。 |
| isClosed | bool | 指定路径是否闭合。如果设置为 true，则笔画以 \"closed\" 方式绘制，即路径图形最后一个段的最后一点会连接到 StartPoint 属性指定的点；否则笔画以 \"open\" 方式绘制，最后一点不会连接到起始点。仅在路径图形用于指定笔画的 Path 元素时适用。 |

### ReturnValue

新的路径图形。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


创建一个新的路径图形。

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | 路径图形第一个段的起始点。 |
| segments | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | 路径段的列表。 |
| isClosed | bool | 指定路径是否闭合。如果设置为 true，则笔画以 \"closed\" 方式绘制，即路径图形最后一个段的最后一点会连接到 StartPoint 属性指定的点；否则笔画以 \"open\" 方式绘制，最后一点不会连接到起始点。仅在路径图形用于指定笔画的 Path 元素时适用。 |

### ReturnValue

新的路径图形。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
