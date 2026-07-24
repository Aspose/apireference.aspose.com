---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement クラス"
linktitle: "XpsContentElement"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement クラス。C++ において XPS コンテンツ要素（Canvas、Path、Glyphs）の機能をカプセル化します。"
type: docs
weight: 700
url: /ja/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


[XPS](../../aspose.page.xps/) コンテンツ要素（Canvas、Path、Glyphs）の機能をカプセル化します。

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Clip](./get_clip/)() | 要素の描画領域を制限するパスジオメトリ インスタンスを取得/設定します。 |
| [get_Opacity](./get_opacity/)() const | 要素の均一な透明度を定義する値を取得/設定します。 |
| [get_OpacityMask](./get_opacitymask/)() | 要素に対して Opacity 属性と同様に適用されるアルファ値のマスクを指定するブラシを取得/設定しますが、要素の異なる領域に異なるアルファ値を設定できます。 |
| [get_RenderTransform](./get_rendertransform/)() | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を取得/設定します。 |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | 要素の描画領域を制限するパスジオメトリ インスタンスを取得/設定します。 |
| [set_Opacity](./set_opacity/)(float) | 要素の均一な透明度を定義する値を取得/設定します。 |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | 要素に対して Opacity 属性と同様に適用されるアルファ値のマスクを指定するブラシを取得/設定しますが、要素の異なる領域に異なるアルファ値を設定できます。 |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を取得/設定します。 |
## 参照

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
