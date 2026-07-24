---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method. C++で新しい放射状グラデーションブラシを作成します。"
type: docs
weight: 2000
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


新しい放射状グラデーションブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| center | System::Drawing::PointF | 放射状グラデーションの中心点（すなわち楕円の中心）です。 |
| gradientOrigin | System::Drawing::PointF | 放射状グラデーションの起点です。 |
| radiusX | 単精度浮動小数点数 | 放射状グラデーションを定義する楕円の x 軸方向の半径です。 |
| radiusY | 単精度浮動小数点数 | 放射状グラデーションを定義する楕円の y 軸方向の半径です。 |

### ReturnValue

新しい放射状グラデーションブラシです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


新しい放射状グラデーションブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| gradientStops | System::SharedPtr\\<System::Collections::Generic::List\\<System::SharedPtr\\<XpsModel::XpsGradientStop\\>\\>\\> | グラデーションストップのリスト。 |
| center | System::Drawing::PointF | 放射状グラデーションの中心点（すなわち楕円の中心）です。 |
| gradientOrigin | System::Drawing::PointF | 放射状グラデーションの起点です。 |
| radiusX | 単精度浮動小数点数 | 放射状グラデーションを定義する楕円の x 軸方向の半径です。 |
| radiusY | 単精度浮動小数点数 | 放射状グラデーションを定義する楕円の y 軸方向の半径です。 |

### ReturnValue

新しい放射状グラデーションブラシです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
