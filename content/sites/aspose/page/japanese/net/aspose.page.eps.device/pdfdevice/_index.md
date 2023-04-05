---
title: Class PdfDevice
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.EPS.Device.PdfDevice クラス. このクラスはドキュメントの PDF へのレンダリングをカプセル化します
type: docs
weight: 60
url: /ja/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

このクラスは、ドキュメントの PDF へのレンダリングをカプセル化します。

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | の新しいインスタンスを初期化します`PdfDevice`出力ストリーム付き. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | の新しいインスタンスを初期化します`PdfDevice`出力ストリームと指定されたページのサイズ. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | ページの現在の背景を返すか指定します。 |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 現在の文字変換を返すか指定します。 |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 結果のデバイス出力の作成者を返すか指定します。 |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | 現在のページ番号. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | 現在のフォントを指定します。 |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | デバイスがダイレクト RGB モード、つまり RGB を使用するかどうかを示します。 |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | この Aspose.Page ライブラリのインスタンスがライセンスされているかどうかを示します. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | 現在の不透明度を返すか指定します。 |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | 現在の不透明度マスクを返すか指定します。 |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | 出力ストリームを指定または返します。 |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | 現在のペイントを返すか指定します。 |
| [Properties](../../aspose.page/device/properties/) { get; set; } | メタデータを含むデバイス プロパティ. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | レンダリング プロセスを管理するためのオプション。 |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | ページのサイズを返すか指定します。 |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | 現在のストロークを返すか指定します。 |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 現在のテキスト レンダリング モードを返すか指定します。 |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 現在のテキスト ストロークの幅を返すか指定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | ページがレンダリングされた後、デバイスの必要な準備を行います. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | このデバイスのコピーを作成します。 |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | グラフィック コンテキストを破棄します。作成時にrestoreOnDisposeがtrueの場合、 writeGraphicsRestore()が呼び出されます. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | パスを描画します。 |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 円弧を描きます。 |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | 変換と背景が割り当てられた画像を描画します。 |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 線分を描画します。 |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 楕円を描きます。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 多角形を描画します。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | ポリゴンを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | ポリラインを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | ポリラインを描画します。 |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 四角形を描画します。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 丸い四角形を描画します。 |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | 指定されたポイントに文字列を描画します。 |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | ドキュメントがレンダリングされた後、デバイスの必要な準備を行います. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | パスを塗りつぶします。 |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | 円弧を塗りつぶします。 |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | 楕円を塗りつぶします。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | 多角形を塗りつぶします。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | 多角形を塗りつぶします。 |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | 長方形を塗りつぶします。 |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | 丸い長方形を塗りつぶします。 |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | 文字列プロパティの値を取得します。 |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | color プロパティの値を取得します。 |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | double プロパティの値を取得します。 |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | 整数プロパティの値を取得します。 |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | marginプロパティの値を取得します. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | 長方形プロパティの値を取得します。 |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | size プロパティの値を取得します。 |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | 現在の変換を取得します。 |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | デバイスのクリップを初期化します。 |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | 出力するページ数を初期化します。 |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | boolean プロパティの値を取得します。 |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | ページ レンダリングの前にデバイスの必要な準備を行います。 |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | 各ページをレンダリングする前に、デバイスの必要な準備を行います. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | ドキュメント全体のデバイスを初期状態にリセットします。出力ストリームのリセットに使用. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | ページ デバイス パラメータが設定される場合、このメソッドは書き込みストリームをページの先頭に戻すことができます。 |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | 現在のトランスフォームを Z 軸上で回転させます。 writeTransform(Transform). を呼び出します。正の角度 theta で回転すると、正の x 軸 上の点が正の y 軸に向かって回転します。 |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | ポイントを中心に現在の変換行列を回転させます。 |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | 現在の変換行列をスケーリングします。 writeTransform(Transform). を呼び出します。 |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | デバイスのクリップを指定します。 |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | 現在の変換を指定します。ほとんどの出力形式はこの機能を実装していないため、 currentTransform の逆変換が計算され、 変換が乗算されて設定されます。その結果は、call によって writeTransform(Transform). に転送されます。 |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | 現在の変換行列をせん断します。 writeTransform(Transform). を呼び出します。 |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | ドキュメントのレンダリングを開始する前に、デバイスの必要な準備を行います。 |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | デバイス タイプの名前を返します。 |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | 現在の変換行列を変換します。 writeTransform(Transform) を呼び出します |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | 現在の変換行列を変換します。 writeTransform(Transform). を呼び出します。 |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | 他のマルチページ デバイスからページ パラメータを更新します。 |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | コメントを書き込みます。 |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | 「作成者」プロパティ値。 |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | 「背景」プロパティ キー。 |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | 「背景色」プロパティキー。 |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | 「圧縮」プロパティ キー。 |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | 「文書にフォントを埋め込む」プロパティキー。 |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | 「埋め込みに使用するフォントの種類」プロパティ キー。 |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | 「エラーを出す」プロパティ値。 |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | 「警告を発する」プロパティ値。 |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | 「コンテンツをページに合わせる」プロパティ キー。 |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | 「キーワード」プロパティ値。 |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | 「向き」プロパティキー。 |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | 「ページマージン」プロパティキー。 |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | 「ページサイズ」プロパティキー。 |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | 「サブジェクト」プロパティ値。 |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | 「タイトル」プロパティ値。 |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | 「透過」プロパティ キー。 |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | 「バージョン」プロパティ キー。 |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | 「Adobe Acrobat Reader のバージョン」プロパティ値。 |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | 「画像のフォーマット」プロパティキー。 |

### 関連項目

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* 名前空間 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 組み立て [Aspose.Page](../../)


