---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush メソッド。C++ で新しい画像ブラシを作成します。"
type: docs
weight: 1100
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


新しい画像ブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 画像 | System::SharedPtr\<XpsModel::XpsImage\> | 画像リソースです。 |
| viewbox | System::Drawing::RectangleF | ブラシのソースコンテンツの位置と寸法です。 |
| ビューポート | System::Drawing::RectangleF | プライムブラシタイルが（必要に応じて繰り返し）適用され、ブラシが適用される領域を埋めるために使用される、包含座標空間内の領域です。 |

### ReturnValue

新しい画像ブラシです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


新しい画像ブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| imagePath | System::String | ブラシタイルとして使用する画像へのパスです。 |
| viewbox | System::Drawing::RectangleF | ブラシのソースコンテンツの位置と寸法です。 |
| ビューポート | System::Drawing::RectangleF | プライムブラシタイルが（必要に応じて繰り返し）適用され、ブラシが適用される領域を埋めるために使用される、包含座標空間内の領域です。 |

### ReturnValue

新しい画像ブラシです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
