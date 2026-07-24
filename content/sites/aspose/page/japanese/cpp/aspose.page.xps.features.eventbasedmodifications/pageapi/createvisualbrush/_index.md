---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method"
linktitle: "CreateVisualBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method. C++ で新しいビジュアルブラシを作成します。"
type: docs
weight: 2200
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


新しいビジュアルブラシを作成します。

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | Visual プロパティのビジュアルブラシ用の [XPS](../../../aspose.page.xps/) 要素 (Canvas, Path または Glyphs)。 |
| viewbox | System::Drawing::RectangleF | ブラシのソースコンテンツの位置と寸法です。 |
| ビューポート | System::Drawing::RectangleF | プライムブラシタイルが（必要に応じて繰り返し）適用され、ブラシが適用される領域を埋めるために使用される、包含座標空間内の領域です。 |

### ReturnValue

新しいビジュアルブラシです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
