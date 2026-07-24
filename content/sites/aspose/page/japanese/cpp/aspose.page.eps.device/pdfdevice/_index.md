---
title: "Aspose::Page::EPS::Device::PdfDevice クラス"
linktitle: "PdfDevice"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::Device::PdfDevice クラス。このクラスは C++ でドキュメントを PDF にレンダリングする機能をカプセル化します。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


このクラスは、ドキュメントを PDF にレンダリングする機能をカプセル化します。

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" プロパティの値。 |
| static [BACKGROUND](./background/)() | "Background" プロパティキー。 |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" プロパティキー。 |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 指定されたシェイプでクリップします。writeClip(Rectangle)、writeClip(RectangleF)、または writeClip(Shape) にディスパッチされます。 |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | 矩形でクリップします。clip(Rectangle2D) を呼び出します。 |
| [ClosePage](./closepage/)() override | ページがレンダリングされた後、デバイスの必要な準備を行います。 |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" プロパティキー。 |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | このデバイスのコピーを作成します。 |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | グラフィックコンテキストを破棄します。作成時に restoreOnDispose が true だった場合、writeGraphicsRestore() が呼び出されます。 |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | パスを描画します。 |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | 割り当てられた変換と背景で画像を描画します。 |
| [DrawString](./drawstring/)(System::String, double, double) override | 指定されたポイントに文字列を描画します。 |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" プロパティキー。 |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" プロパティキー。 |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" プロパティの値。 |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" プロパティの値。 |
| [EndDocument](./enddocument/)() override | ドキュメントがレンダリングされた後、デバイスの必要な準備を行います。 |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | パスを塗りつぶします。 |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" プロパティキー。 |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | 現在のページ番号。 |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | 文字列の周囲にフレームとバナーを描画します。このメソッドは、文字列を描画する前にテキストカーソルを設定すべきポイントを計算して返します。 |
| [get_OutputStream](./get_outputstream/)() override | 出力ストリームを指定または返します。 |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | 現在の変換を取得します。 |
| [InitClip](./initclip/)() override | デバイスのクリップを初期化します。 |
| [InitPageNumbers](./initpagenumbers/)() override | 出力するページ数を初期化します。 |
| static [KEYWORDS](./keywords/)() | \"Keywords\" プロパティの値。 |
| [OpenPage](./openpage/)(System::String) override | ページのレンダリング前にデバイスの必要な準備を行います。 |
| [OpenPage](./openpage/)(float, float) override | 各ページのレンダリング前にデバイスの必要な準備を行います。 |
| static [ORIENTATION](./orientation/)() | \"Orientation\" プロパティキー。 |
| static [PAGE_MARGINS](./page_margins/)() | \"Page margins\" プロパティキー。 |
| static [PAGE_SIZE_](./page_size_/)() | \"Page size\" プロパティキー。 |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | 出力ストリームで [PdfDevice](./) の新しいインスタンスを初期化します。 |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | 出力ストリームと指定されたページサイズで [PdfDevice](./) の新しいインスタンスを初期化します。 |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | クローンコンストラクタ。既存のデバイスで [PdfDevice](./) の新しいインスタンスを初期化します。 |
| [ReNew](./renew/)() override | ドキュメント全体のデバイスを初期状態にリセットします。出力ストリームのリセットに使用されます。 |
| [ReNewForMerge](./renewformerge/)(bool) override | 複数のドキュメントをマージする際に、ドキュメント全体のデバイスを初期状態にリセットします。出力ストリームのリセットに使用されます。 |
| [Reset](./reset/)() override | ページデバイスパラメータが設定される場合、このメソッドは書き込みストリームをページの先頭に戻すことを可能にします。 |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | 現在の変換を Z 軸周りに回転させます。writeTransform(Transform) を呼び出します。正の角度 θ で回転すると、正の x 軸上の点が正の y 軸方向へ回転します。 |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | 現在の変換行列をスケーリングします。writeTransform(Transform) を呼び出します。 |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | 現在のフォントを指定します。 |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | 出力ストリームを指定または返します。 |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | 現在のペイントを返すか、指定します。 |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | 現在のストロークを返すか、指定します。 |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | デバイスのクリップを指定します。 |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | 現在の変換を指定します。ほとんどの出力フォーマットがこの機能を実装していないため、currentTransform の逆変換を計算し、設定する変換と掛け合わせます。その結果は writeTransform(Transform) の呼び出しで転送されます。 |
| [Shear](./shear/)(double, double) override | 現在の変換行列をシアー変換します。writeTransform(Transform) を呼び出します。 |
| [StartDocument](./startdocument/)() override | ドキュメントのレンダリング開始前にデバイスの必要な準備を行います。 |
| static [SUBJECT](./subject/)() | \"Subject\" プロパティの値。 |
| static [TITLE](./title/)() | \"Title\" プロパティの値。 |
| [ToString](./tostring/)() const override | デバイスタイプの名前を返します。 |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | 現在の変換行列を変換します。writeTransform(Transform) を呼び出します |
| [Translate](./translate/)(double, double) override | 現在の変換行列を平行移動します。writeTransform(Transform) を呼び出します。 |
| static [TRANSPARENT](./transparent/)() | \"Transparent\" プロパティキー。 |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | 他のマルチページデバイスからページパラメータを更新します。 |
| static [WRITE_IMAGES_AS](./write_images_as/)() | \"Format of images\" プロパティキー。 |
| [WriteBackground](./writebackground/)() override | 現在の背景を書き出します。 |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | ストロークのキャップを書き出します。 |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | コメントを書き出します。 |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | ストロークのダッシュを書き出します。 |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | カタログ、docinfo、preferences、そして（単一ページ出力のみを使用するためページツリー）を書き出します。 |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | ストロークのジョインを書き出します。 |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | 最後に書き込まれたペイントを書き出します。ペイントを書き込んだ後にグラフィックの復元（\"Q\"）が実行された場合に便利です。 |
| [WriteMiterLimit](./writemiterlimit/)(float) override | ストロークのミタリミットを書き出します。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | 指定された色としてペイントを書き出します。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | 指定されたグラデーションとしてペイントを書き出します。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | 指定されたテクスチャとしてペイントを書き出します。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | ペイントを書き出します。 |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | 指定されたフォントで文字列を書き出します。 |
| [WriteTrailer](./writetrailer/)() | PDF ドキュメントのトレーラを書き出します。 |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 指定された変換行列をファイルに書き込みます。 |
| [WriteWarning](./writewarning/)(System::String) override | 警告を書き出します。デフォルトでは System.err に出力されます。 |
| [WriteWidth](./writewidth/)(float) override | ストロークの幅を書き出します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [VERSION](./version/) | \"Version\" プロパティキー。 |
| static [VERSION5](./version5/) | \"Version of Adobe Acrobat Reader\" プロパティ値。 |

## Deprecated
PdfDevice クラスは 24.3 以降非推奨です。代わりに PsDocument クラスの SaveAsPdf メソッドを使用してください。24.6 ではこのクラスは完全に非表示になります。

## 参照

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
