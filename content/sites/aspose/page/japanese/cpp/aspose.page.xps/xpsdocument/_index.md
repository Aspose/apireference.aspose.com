---
title: "Aspose::Page::XPS::XpsDocument クラス"
linktitle: "XpsDocument"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument クラス。XPS ドキュメントの主要エンティティをカプセル化し、C++ で任意の XPS 要素を操作するメソッドを提供するクラス。"
type: docs
weight: 400
url: /ja/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


[XPS](../) ドキュメントの主要エンティティをカプセル化し、任意の [XPS](../) 要素を操作するメソッドを提供するクラス。

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(T) | コンテンツ要素（Canvas、Path、または Glyphs）を追加します。 |
| [AddCanvas](./addcanvas/)() | アクティブなページに新しいキャンバスを追加します。 |
| [AddDocument](./adddocument/)(bool) | デフォルトのページサイズで空のドキュメントを追加します。 |
| [AddDocument](./adddocument/)(float, float, bool) | 最初のページの寸法 *width* と *height* を持つ空のドキュメントを追加します。 |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | アクティブなページに新しいグリフを追加します。 |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | アクティブなページに新しいグリフを追加します。 |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | ドキュメントにアウトラインエントリを追加します。 |
| [AddPage](./addpage/)(bool) | デフォルトのページサイズでドキュメントに空のページを追加します。 |
| [AddPage](./addpage/)(float, float, bool) | 指定された *width* と *height* を持つ空のページをドキュメントに追加します。 |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | ドキュメントにページを追加します。 |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | アクティブなページに新しいパスを追加します。 |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | 新しい楕円弧セグメントを作成します。 |
| [CreateCanvas](./createcanvas/)() | 新しいキャンバスを作成します。 |
| [CreateColor](./createcolor/)(System::Drawing::Color) | 新しい色を作成します。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(float, float, float) | scRGB カラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC ベースのカラースペースで新しい色を作成します。 |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC ベースのカラースペースで新しい色を作成します。 |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | **TrueType** フォントリソースを新規作成します。 |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | ストリームから新しい **TrueType** フォントリソースを作成します。 |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 新しいグリフを作成します。 |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 新しいグリフを作成します。 |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | 新しいグラデーション ストップを作成します。 |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | 新しいグラデーション ストップを作成します。 |
| [CreateIccProfile](./createiccprofile/)(System::String) | *iccProfilePath* にある ICC プロファイルファイルから新しい ICC プロファイルリソースを作成します。 |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | *stream* から新しい ICC プロファイルリソースを作成します。 |
| [CreateImage](./createimage/)(System::String) | *imagePath* にある画像ファイルから新しい画像リソースを作成します。 |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | *stream* から新しい画像リソースを作成します。 |
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
| [Dispose](./dispose/)() override | インスタンスを破棄します。 |
| [get_ActiveDocument](./get_activedocument/)() | アクティブなドキュメント番号を取得します。 |
| [get_ActivePage](./get_activepage/)() | アクティブなドキュメント内のアクティブページ番号を取得します。 |
| [get_DocumentCount](./get_documentcount/)() | [XPS](../) パッケージ内のドキュメント数を返します。 |
| [get_JobPrintTicket](./get_jobprintticket/)() | ドキュメントのジョブ印刷チケットを取得/設定します。 |
| [get_Page](./get_page/)() | アクティブページ用の [XpsPage](../) インスタンスを返します。 |
| [get_PageCount](./get_pagecount/)() | アクティブなドキュメントのページ数を返します。 |
| [get_TotalPageCount](./get_totalpagecount/)() | [XPS](../) ドキュメント内のすべてのドキュメントに含まれるページ総数を返します。 |
| [get_Utils](./get_utils/)() const | 正式な [XPS](../) 操作 API を超えるユーティリティを提供するオブジェクトを取得します。 |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | *documentIndex* でインデックスされたドキュメントの印刷チケットを返します。 |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | *documentIndex* でインデックスされたドキュメント内の、*pageIndex* でインデックスされたページの印刷チケットを返します。 |
| [Insert](./insert/)(int32_t, T) | *index* 番目の位置に、アクティブページへ要素（Canvas、Path、または Glyphs）を挿入します。 |
| [InsertCanvas](./insertcanvas/)(int32_t) | *index* 番目の位置に、アクティブページへ新しいキャンバスを挿入します。 |
| [InsertDocument](./insertdocument/)(int32_t, bool) | *index* 番目の位置に、デフォルトページサイズの空のドキュメントを挿入します。 |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | *index* 番目の位置に、最初のページのサイズが *width* × *height* の空のドキュメントを挿入します。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | *index* 番目の位置に、アクティブページへ新しいグリフを挿入します。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | *index* 番目の位置に、アクティブページへ新しいグリフを挿入します。 |
| [InsertPage](./insertpage/)(int32_t, bool) | *index* 番目の位置に、デフォルトページサイズの空のページをドキュメントに挿入します。 |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | *index* 番目の位置に、指定された *width* と *height* のサイズの空のページをドキュメントに挿入します。 |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | *index* 番目の位置に、ページをドキュメントに挿入します。 |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | *index* 番目の位置に、アクティブページへ新しいパスを挿入します。 |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | 複数の [XPS](../) ファイルを 1 つの [XPS](../) ドキュメントに結合します。 |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | 複数の [XPS](../) ファイルを 1 つの [XPS](../) ドキュメントに結合します。 |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) インスタンスを使用して、[XPS](../) ドキュメントを PDF に結合します。 |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) インスタンスを使用して、[XPS](../) ドキュメントを PDF に結合します。 |
| [Remove](./remove/)(T) | アクティブページから要素を削除します。 |
| [RemoveAt](./removeat/)(int32_t) | アクティブページの *index* 番目の位置にある要素を削除します。 |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | *index* 番目の位置にあるドキュメントを削除します。 |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | ドキュメントからページを削除します。 |
| [RemovePageAt](./removepageat/)(int32_t) | ドキュメントの *index* 番目の位置にあるページを削除します。 |
| [Save](./save/)(System::String) | *path* にある [XPS](../) ファイルに [XPS](../) ドキュメントを保存します。 |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | [XPS](../) ドキュメントをストリームに保存します。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | ドキュメントを画像ファイルに保存します。出力ディレクトリとファイル名は、入力の [XPS](../) ファイルと同じになります。ファイル拡張子は \"options\" パラメータの画像形式に対応します。ドキュメントが FileStream 以外のストリームで初期化された場合、画像ファイルはデフォルトのファイル名テンプレートで現在のフォルダーに保存されます。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | ドキュメントを指定されたディレクトリに、指定されたファイル名で画像ファイルとして保存します。ファイル拡張子は \"options\" パラメータの画像形式に対応します。 |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | ドキュメントをビットマップ画像形式でバイト配列として保存します。 |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | ドキュメントを PDF 形式で保存します。 |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | ドキュメントを PDF 形式で保存します。 |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | ドキュメントを PS 形式で保存します。 |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | ドキュメントを PS 形式で保存します。 |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | 編集中のアクティブなドキュメントを選択します。 |
| [SelectActivePage](./selectactivepage/)(int32_t) | 編集中のアクティブなドキュメントページを選択します。 |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | ドキュメントのジョブ印刷チケットを取得/設定します。 |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | *printTicket* を *documentIndex* でインデックス付けされたドキュメントにリンクします。 |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | *printTicket* を *documentIndex* でインデックス付けされたドキュメント内の *pageIndex* でインデックス付けされたページにリンクします。 |
| [XpsDocument](./xpsdocument/)() | デフォルトのページサイズで空の [XPS](../) ドキュメントを作成します。 |
| [XpsDocument](./xpsdocument/)(System::String) | *path* にある既存の [XPS](../) ドキュメントを開きます。 |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | *path* にある既存のドキュメントを [XPS](../) ドキュメントとして開きます。 |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | *stream* に保存されている既存のドキュメントを [XPS](../) ドキュメントとしてロードします。 |
## 参照

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
