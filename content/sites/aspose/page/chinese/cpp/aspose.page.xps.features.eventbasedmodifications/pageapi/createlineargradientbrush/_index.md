---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush method"
linktitle: "CreateLinearGradientBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush 方法。 在 C++ 中创建一个新的线性渐变画刷。"
type: docs
weight: 1200
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createlineargradientbrush/
---
## PageAPI::CreateLinearGradientBrush(System::Drawing::PointF, System::Drawing::PointF) method


创建一个新的线性渐变画刷。

```cpp
System::SharedPtr<XpsModel::XpsLinearGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush(System::Drawing::PointF startPoint, System::Drawing::PointF endPoint)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | 线性渐变的起始点。 |
| 端点 | System::Drawing::PointF | 线性渐变的终点。 |

### ReturnValue

新的线性渐变画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsLinearGradientBrush](../../../aspose.page.xps.xpsmodel/xpslineargradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateLinearGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) method


创建一个新的线性渐变画刷。

```cpp
System::SharedPtr<XpsModel::XpsLinearGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF startPoint, System::Drawing::PointF endPoint)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | 渐变停止点的列表。 |
| startPoint | System::Drawing::PointF | 线性渐变的起始点。 |
| 端点 | System::Drawing::PointF | 线性渐变的终点。 |

### ReturnValue

新的线性渐变画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsLinearGradientBrush](../../../aspose.page.xps.xpsmodel/xpslineargradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
