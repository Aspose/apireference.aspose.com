---
title: "Aspose::Page::XPS::XpsDocument::CreateLinearGradientBrush メソッド"
linktitle: "CreateLinearGradientBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateLinearGradientBrush メソッド。C++ で新しい線形グラデーションブラシを作成します。"
type: docs
weight: 1900
url: /ja/cpp/aspose.page.xps/xpsdocument/createlineargradientbrush/
---
## XpsDocument::CreateLinearGradientBrush(System::Drawing::PointF, System::Drawing::PointF) method


新しい線形グラデーションブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsLinearGradientBrush> Aspose::Page::XPS::XpsDocument::CreateLinearGradientBrush(System::Drawing::PointF startPoint, System::Drawing::PointF endPoint)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | 線形グラデーションの開始点。 |
| endPoint | System::Drawing::PointF | 線形グラデーションの終了点。 |

### ReturnValue

新しい線形グラデーションブラシ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsLinearGradientBrush](../../../aspose.page.xps.xpsmodel/xpslineargradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateLinearGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) method


新しい線形グラデーションブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsLinearGradientBrush> Aspose::Page::XPS::XpsDocument::CreateLinearGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF startPoint, System::Drawing::PointF endPoint)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| gradientStops | System::SharedPtr\\<System::Collections::Generic::List\\<System::SharedPtr\\<XpsModel::XpsGradientStop\\>\\>\\> | グラデーションストップのリスト。 |
| startPoint | System::Drawing::PointF | 線形グラデーションの開始点。 |
| endPoint | System::Drawing::PointF | 線形グラデーションの終了点。 |

### ReturnValue

新しい線形グラデーションブラシ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsLinearGradientBrush](../../../aspose.page.xps.xpsmodel/xpslineargradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
