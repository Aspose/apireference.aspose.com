---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush メソッド。C++ で新しい画像ブラシを作成します。"
type: docs
weight: 1800
url: /ja/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


新しい画像ブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


新しい画像ブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
