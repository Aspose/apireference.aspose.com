---
title: "Aspose::Page::EPS::PsDocument クラス"
linktitle: "PsDocument"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument クラス。このクラスは C++ で PS/EPS ドキュメントをカプセル化します。"
type: docs
weight: 700
url: /ja/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


このクラスは PS/EPS ドキュメントをカプセル化します。

```cpp
class PsDocument : public Aspose::Page::Document
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 現在のグラフィックス状態にクリップを追加します。 |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 現在のグラフィックス状態にクリップを追加し、続いて \"newpath\" 演算子を書き込みます。この操作は、クリッピングパスとその後のパス（例: \"charpath\" 演算子で輪郭化されたグリフ）との合流を回避するために必要です。 |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | 現在のグラフィックス状態にクリッピング矩形を追加します。 |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | 指定されたフォントの指定テキストのアウトラインからクリップを追加します。 |
| [ClosePage](./closepage/)() | 現在のページを完了します。 |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Type 1 フォントを **TrueType** に変換します。変換された TTF フォントの名前は、入力の Type 1 フォントと同じで、拡張子は \".ttf\" になります。TTF ファイルは割り当てられた出力ディレクトリに保存されます。 |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Type 3 フォントを **TrueType** に変換します。変換された TTF フォントの名前は、入力の Type 3 フォントファイルと同じで、拡張子は \".ttf\" になります。TTF ファイルは割り当てられた出力ディレクトリに保存されます。 |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Type 3 フォントを **TrueType** ストリームに変換します。 |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | 指定された [PsDocument](./) を [EPS](../) ファイルとしてトリミングします。既存の %BoundingBox が更新された初期の [EPS](../) ファイルを保存するか、または新しいファイルが作成されます。 |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | 指定された [PsDocument](./) を [EPS](../) ファイルとしてトリミングします。既存の %BoundingBox が更新された初期の [EPS](../) ファイルを保存するか、または新しいファイルが作成されます。 |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 任意のパスを描画します。 |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | 円弧を描画します。 |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | マスクされた画像を描画します。 |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | 画像を描画します。 |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | 背景付きで変換された画像を描画します。 |
| [DrawLine](./drawline/)(double, double, double, double) | 線分を描画します。 |
| [DrawOval](./drawoval/)(double, double, double, double) | 楕円を描画します。 |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | 多角形を描画します。 |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | ポリゴンを描画します。 |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | ポリラインを描画します。 |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | ポリラインを描画します。 |
| [DrawRect](./drawrect/)(double, double, double, double) | 矩形を描画します。 |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | 角丸矩形を描画します。 |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | 変換された透過画像を描画します。画像にアルファチャンネルがない場合は不透明画像として描画されます。 |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | [EPS](../) ファイルを読み取り、%BoundingBox コメントから [EPS](../) 画像のバウンディングボックスを抽出します。存在しない場合はデフォルトページサイズ (0, 0, 595, 842) の境界を使用します。 |
| [ExtractEpsSize](./extractepssize/)() | [EPS](../) ファイルを読み取り、%BoundingBox コメントから [EPS](../) 画像のサイズを抽出します。存在しない場合はデフォルトページサイズ (595, 842) を使用します。 |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | PS ファイルからテキストを抽出します。テキストは Type 42 (**TrueType**) フォント、またはベクターマップ内に Type 42 フォントを含む Type 0 フォントで記述されている場合にのみ抽出できます。 |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 任意のパスを塗りつぶします。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | 円弧を塗りつぶします。 |
| [FillOval](./filloval/)(double, double, double, double) | 楕円を塗りつぶします。 |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | ポリゴンを塗りつぶします。 |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | ポリゴンを塗りつぶします。 |
| [FillRect](./fillrect/)(double, double, double, double) | 矩形を塗りつぶします。 |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | 角丸矩形を塗りつぶします。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [get_InputStream](./get_inputstream/)() | [PsDocument](./) をストリームとロードオプションで初期化します。 |
| [get_NumberOfPages](./get_numberofpages/)() const | 結果の PDF ドキュメントのページ数を返します。 |
| [GetPaint](./getpaint/)() | 現在のグラフィックス状態のペイントを取得します。 |
| [GetStroke](./getstroke/)() | 現在のグラフィックス状態にストロークを設定します。 |
| [GetXmpMetadata](./getxmpmetadata/)() | PS/EPS ファイルを読み取り、XmpMetdata が既に存在すれば抽出し、存在しなければ新規に追加します。 |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS ファイルをデバイスにマージします。 |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS ファイルをデバイスにマージします。 |
| [OpenPage](./openpage/)(float, float) | 新しいページを作成し、現在のページにします。 |
| [OpenPage](./openpage/)(System::String) | ドキュメントのサイズで新しいページを作成し、現在のページにします。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [PsDocument](./psdocument/)() | 空の [PsDocument](./) を初期化します。このコンストラクタは、PostScript ファイルに関係しない追加操作（例：フォントの変換）のみで使用されます。 |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | 初期化されたページを持つ空の [PsDocument](./) を初期化します。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | 初期化されたページを持つ空の [PsDocument](./) を初期化します。 |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | 空の [PsDocument](./) を初期化します。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | 空の [PsDocument](./) を初期化します。 |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | ドキュメントページ数が事前に分かっている場合に、空の [PsDocument](./) を初期化します（[Postscript](../../aspose.page.eps.postscript/) ドキュメントページ数）。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | ドキュメントページ数が事前に分かっている場合に、空の [PsDocument](./) を初期化します（[Postscript](../../aspose.page.eps.postscript/) ドキュメントページ数）。 |
| [PsDocument](./psdocument/)(System::String) | 入力 PS/EPS ファイルで [PsDocument](./) を初期化します。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | PS/EPS ファイルのストリームで [PsDocument](./) を初期化します。 |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | 指定された [PsDocument](./) を [EPS](../) ファイルとしてサイズ変更します。このメソッドは、[EPS](../) のサイズを取得した後にのみ使用されます。初期の [EPS](../) ファイルを D:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.h に保存し、更新された既存の %BoundingBox または新しい %BoundingBox を作成します。画像ファイルが保存される出力ディレクトリも設定されます。[Page](../../aspose.page/) の変換行列も設定されます。 |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | 指定された [PsDocument](./) を [EPS](../) ファイルとしてサイズ変更します。このメソッドは、[EPS](../) のサイズを取得した後にのみ使用されます。初期の [EPS](../) ファイルを更新された既存の %BoundingBox または新しい %BoundingBox で保存します。[Page](../../aspose.page/) の変換行列も設定されます。 |
| [Rotate](./rotate/)(float) | 原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します（現在の行列を回転）。 |
| [Rotate](./rotate/)(int32_t) | 原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します（現在の行列を回転）。 |
| [Save](./save/)(System::String) | 指定された [PsDocument](./) を [EPS](../) ファイルとして保存します。このメソッドは、[XMP](../../aspose.page.eps.xmp/) メタデータを更新した後にのみ使用されます。初期の [EPS](../) ファイルを更新された既存のメタデータ、または GetMetadata メソッド呼び出し時に作成された新しいメタデータで保存します。後者の場合、必要なすべての PostScript コードと [EPS](../) コメントが追加されます。 |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | 指定された [PsDocument](./) をストリームに保存します。このメソッドは、[XMP](../../aspose.page.eps.xmp/) メタデータを更新した後にのみ使用されます。初期の [EPS](../) ファイルを更新された既存のメタデータ、または GetMetadata メソッド呼び出し時に作成された新しいメタデータで保存します。後者の場合、必要なすべての PostScript コードと [EPS](../) コメントが追加されます。 |
| [Save](./save/)() | 指定された [PsDocument](./) を PS または [EPS](../) ファイルとして保存します。このメソッドは、[PsDocument](./) が最初から作成された場合にのみ使用されます。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS ファイルを画像ファイルとして保存します。出力ディレクトリとファイル名は入力の PS ファイルと同じになります。ファイル拡張子は \"options\" パラメータの画像形式に対応します。ドキュメントが FileStream 以外のストリームで初期化された場合、画像ファイルはデフォルトのファイル名テンプレートで現在のフォルダーに保存されます。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | PS/EPS ファイルを指定されたディレクトリに、指定されたファイル名で画像ファイルとして保存します。ファイル拡張子は \"options\" パラメータの画像形式に対応します。 |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS ファイルを画像のバイト配列として保存します。 |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS ファイルを PDF ファイルとして保存します。 |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS ファイルを PDF ストリームとして保存します。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | 入力ストリームから PNG/JPEG/TIFF/BMP/GIF/EMF 画像を [EPS](../) 出力ストリームに保存します。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | ファイルから PNG/JPEG/TIFF/BMP/GIF/EMF 画像を [EPS](../) ファイルに保存します。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap オブジェクトを [EPS](../) ファイルに保存します。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap オブジェクトを [EPS](../) 出力ストリームに保存します。 |
| [Scale](./scale/)(float, float) | 現在のグラフィックス状態にスケールを追加します（現在の行列をスケール）。 |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | [PsDocument](./) をストリームとロードオプションで初期化します。 |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | ページデバイスパラメータを設定します（演算子 \"setpagedevice\" の PostScript 仕様を参照）。これにはページサイズやカラーなどが含まれます。 |
| [SetPageSize](./setpagesize/)(float, float) | ページサイズを設定します。1 つのドキュメント内で異なるサイズのページを作成するには、このメソッドの直後に [SetPageDevice](./setpagedevice/) メソッドを使用します。 |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | 現在のグラフィックス状態にペイントを設定します。 |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | 現在のグラフィックス状態にストロークを設定します。 |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 現在の変換をこれに設定します。 |
| [Shear](./shear/)(float, float) | 現在のグラフィックス状態を点の周りで反時計回りに回転させます。 |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 現在のグラフィックス状態に変換を追加します（この行列を現在の行列に連結します）。 |
| [Translate](./translate/)(float, float) | 現在のグラフィックス状態に平行移動を追加します（現在の行列を平行移動させます）。 |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | 現在のグラフィックス状態の復元を書き込みます（演算子 "grestore" に関する PostScript 仕様を参照）。 |
| [WriteGraphicsSave](./writegraphicssave/)() | 現在のグラフィックス状態の保存を書き込みます（演算子 "gsave" に関する PostScript 仕様を参照）。 |
## 参照

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
