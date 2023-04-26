---
title: Class XpsDocument
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsDocument クラス. XPS ドキュメントのメイン エンティティをカプセル化するクラスで任意の XPS 要素の操作 メソッドを提供します
type: docs
weight: 480
url: /ja/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

XPS ドキュメントのメイン エンティティをカプセル化するクラスで、任意の XPS 要素の操作 メソッドを提供します。

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | 既定のページ サイズで空の XPS ドキュメントを作成します。 |
| [XpsDocument](xpsdocument/#constructor_2)(string) | にある既存の XPS ドキュメントを開きます。*path*. |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | に保存されている既存のドキュメントを読み込みます*stream*XPSドキュメントとして. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | にある既存のドキュメントを開きます*path*XPSドキュメントとして. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | アクティブなドキュメント番号を取得します。 |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | アクティブなドキュメント内のアクティブなページ番号を取得します. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | XPS パッケージ内のドキュメントの数を返します。 |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | ドキュメントのジョブ印刷チケットを返す/設定します |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | を返します[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/)アクティブなページのインスタンス. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | アクティブ ドキュメントのページ数を返します。 |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | XPS ドキュメント内のすべてのドキュメントの合計ページ数を返します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | コンテンツ要素 (キャンバス、パス、またはグリフ) を追加します |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | アクティブなページに新しいキャンバスを追加します. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | デフォルトのページ サイズで空のドキュメントを追加します。 |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | 最初のページのサイズが の空のドキュメントを追加します*width*と*height*. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | アクティブなページに新しいグリフを追加します。 |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | アクティブなページに新しいグリフを追加します。 |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | ドキュメントにアウトライン エントリを追加します。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | デフォルトのページ サイズで空のページをドキュメントに追加します。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | ドキュメントにページを追加します。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | 指定された を持つドキュメントに空のページを追加します*width*と*height*. |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | アクティブなページに新しいパスを追加します。 |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | 新しい楕円弧セグメントを作成します。 |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | 新しいキャンバスを作成します。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | 新しい色を作成します。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | ICC ベースの色空間で新しい色を作成します。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | ICC ベースの色空間で新しい色を作成します。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | scRGB 色空間で新しい色を作成します。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | sRGB 色空間で新しい色を作成します。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | scRGB 色空間で新しい色を作成します。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | sRGB 色空間で新しい色を作成します。 |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | ストリームから新しい TrueType フォント リソースを作成します。 |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | 新しい TrueType フォント リソースを作成します。 |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | 新しいグリフを作成します。 |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | 新しいグリフを作成します。 |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | 新しいグラデーション ストップを作成します。 |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | 新しいグラデーション ストップを作成します。 |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | から新しい ICC プロファイル リソースを作成します*stream*. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | にある ICC プロファイル ファイルから新しい ICC プロファイル リソースを作成します。*iccProfilePath*. |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | から新しい画像リソースを作成します*stream*. |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | にある画像ファイルから新しい画像リソースを作成します*imagePath*. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | 新しいイメージ ブラシを作成します。 |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | 新しいイメージ ブラシを作成します。 |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | 新しい線形グラデーション ブラシを作成します。 |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | 新しい線形グラデーション ブラシを作成します。 |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | 新しいアフィン変換行列を作成します。 |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | 新しいパスを作成します。 |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | 新しいパス図形を作成します。 |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | 新しいパス図形を作成します。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | 新しいパス ジオメトリを作成します。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | 指定されたパス図形のリストを使用して、新しいパス ジオメトリを作成します。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | 省略形で指定された新しいパス ジオメトリを作成します。 |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | 3 次ベジエ曲線の新しいセットを作成します。 |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | 任意の数の個々の頂点を含む新しいポリゴン ドローイングを作成します。 |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | 指定された制御点を使用して、頂点の set を通るパス図の前の点から二次ベジエ曲線の新しいセットを作成します。 |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | 新しい放射状グラデーション ブラシを作成します。 |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | 新しい放射状グラデーション ブラシを作成します。 |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | 新しい単色ブラシを作成します。 |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | 新しい単色ブラシを作成します。 |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | 新しいビジュアル ブラシを作成します。 |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | インスタンスを破棄します。 |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | によってインデックス付けされたドキュメントの印刷チケットを返します*documentIndex*. |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | によって索引付けされたページの印刷チケットを返します*pageIndex* によって索引付けされたドキュメント内*documentIndex*. |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | 要素 (キャンバス、パス、またはグリフ) をアクティブな page に挿入します*index*位置. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | でアクティブなページに新しいキャンバスを挿入します*index*位置. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | デフォルトのページサイズ で空のドキュメントを挿入します*index*位置. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | 最初のページのサイズが の空のドキュメントを挿入します*width*と*height*で*index*位置. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | のアクティブなページに新しいグリフを挿入します*index*位置. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | のアクティブなページに新しいグリフを挿入します*index*位置. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | デフォルトのページ サイズ でドキュメントに空のページを挿入します*index*位置. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | ドキュメントにページを挿入します*index*位置. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | 指定された を持つドキュメントに空のページを挿入します*width*と*height*で*index*位置. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | アクティブなページへの新しいパスを挿入します*index*位置. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | 複数の XPS ファイルを 1 つの XPS ドキュメントにマージしています。 |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | を使用した XPS ドキュメントの PDF への結合[`Device`](../../aspose.page/device/)インスタンス. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | アクティブなページから要素を削除します. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | で要素を削除します*index*アクティブなページからの位置. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | でドキュメントを削除します*index*位置. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | ドキュメントからページを削除します。 |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | でドキュメントからページを削除します*index*位置. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | XPS ドキュメントをストリームに保存します。 |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | XPS ドキュメントを次の場所にある XPS ファイルに保存します。*path*. |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | を使用してドキュメントを保存します[`Device`](../../aspose.page/device/)インスタンス. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | 編集するアクティブなドキュメントを選択します。 |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | 編集するアクティブなドキュメント ページを選択します。 |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | リンク*printTicket*によって索引付けされたドキュメントへ*documentIndex*. |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | リンク*printTicket*によって索引付けされたページへ*pageIndex* によって索引付けされたドキュメント内*documentIndex*. |

### 関連項目

* class [Document](../../aspose.page/document/)
* 名前空間 [Aspose.Page.XPS](../../aspose.page.xps/)
* 組み立て [Aspose.Page](../../)


