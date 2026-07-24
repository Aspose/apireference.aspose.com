---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI クラス"
linktitle: "PageAPI"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI クラス。C++ における Page 要素の変更 API。"
type: docs
weight: 500
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


この **[Page](../../aspose.page/)** 要素の変更 API。

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(T) | コンテンツ要素（Canvas、Path、または Glyphs）を追加します。 |
| [AddCanvas](./addcanvas/)() | ページに新しいキャンバスを追加します。 |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | ページに新しいグリフを追加します。 |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | ページに新しいグリフを追加します。 |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | ドキュメントにアウトラインエントリを追加します。 |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | ページに新しいパスを追加します。 |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | 新しい楕円弧セグメントを作成します。 |
| [CreateCanvas](./createcanvas/)() | 新しいキャンバスを作成します。 |
| [CreateColor](./createcolor/)(System::Drawing::Color) | 新しい色を作成します。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(float, float, float) | scRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC ベースのカラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC ベースのカラースペースで新しい色を作成します。 |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 新しいグリフを作成します。 |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 新しいグリフを作成します。 |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | 新しいグラデーション ストップを作成します。 |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | 新しいグラデーション ストップを作成します。 |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 新しい画像ブラシを作成します。 |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | 新しい画像ブラシを作成します。 |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | 新しい線形グラデーションブラシを作成します。 |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | 新しい線形グラデーションブラシを作成します。 |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | 新しいアフィン変換行列を作成します。 |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 新しいパスを作成します。 |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | 新しいパス図形を作成します。 |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | 新しいパス図形を作成します。 |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | 省略形で指定された新しいパスジオメトリを作成します。 |
| [CreatePathGeometry](./createpathgeometry/)() | 新しいパスジオメトリを作成します。 |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | 指定されたパス図形のリストで新しいパスジオメトリを作成します。 |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 新しい3次ベジェ曲線のセットを作成します。 |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 任意の数の個別頂点を含む新しい多角形描画を作成します。 |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | パス図形の前の点から頂点のセットを通り、指定された制御点を使用して新しい2次ベジェ曲線のセットを作成します。 |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | 新しい放射状グラデーションブラシを作成します。 |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | 新しい放射状グラデーションブラシを作成します。 |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | 新しい単色ブラシを作成します。 |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | 新しい単色ブラシを作成します。 |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 新しいビジュアルブラシを作成します。 |
| [get_Height](./get_height/)() | ページの高さを取得/設定します。実効座標空間の単位で実数として表されます。 |
| [get_PageCount](./get_pagecount/)() | アクティブなドキュメントのページ数を返します。 |
| [get_TotalPageCount](./get_totalpagecount/)() | [XPS](../../aspose.page.xps/) ドキュメント内のすべてのドキュメントの総ページ数を返します。 |
| [get_Utils](./get_utils/)() | [XPS](../../aspose.page.xps/) 操作 API 以外のユーティリティを提供するオブジェクトを取得します。 |
| [get_Width](./get_width/)() | ページの幅を取得/設定します。実効座標空間の単位で実数として表されます。 |
| [Insert](./insert/)(int32_t, T) | *index* 位置に要素（Canvas、Path、または Glyphs）をページに挿入します。 |
| [InsertCanvas](./insertcanvas/)(int32_t) | *index* 位置に新しい Canvas をページに挿入します。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | *index* 位置に新しい Glyphs をページに挿入します。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | *index* 位置に新しい Glyphs をページに挿入します。 |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | *index* 位置に新しいパスをページに挿入します。 |
| [Remove](./remove/)(T) | ページから要素を削除します。 |
| [RemoveAt](./removeat/)(int32_t) | ページから *index* の位置にある要素を削除します。 |
| [set_Height](./set_height/)(float) | ページの高さを取得/設定します。実効座標空間の単位で実数として表されます。 |
| [set_Width](./set_width/)(float) | ページの幅を取得/設定します。実効座標空間の単位で実数として表されます。 |
## 参照

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
