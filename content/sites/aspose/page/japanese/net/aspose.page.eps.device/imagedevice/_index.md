---
title: Class ImageDevice
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.EPS.Device.ImageDevice クラス. このクラスはドキュメントからイメージへのレンダリングをカプセル化します
type: docs
weight: 40
url: /ja/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

このクラスは、ドキュメントからイメージへのレンダリングをカプセル化します。

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | の新しいインスタンスを初期化します`ImageDevice`. |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | の新しいインスタンスを初期化します`ImageDevice`指定された画像形式で. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | の新しいインスタンスを初期化します`ImageDevice`指定されたページのサイズ. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | の新しいインスタンスを初期化します`ImageDevice`指定されたサイズのページと画像形式. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | デバイスがダイレクト RGB モード、つまり RGB を使用するかどうかを示します。 |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | 現在の文字変換を返すか指定します。 |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | 結果のデバイス出力の作成者を返すか指定します。 |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | 現在のページ番号. |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | 現在のフォントを返すか指定します. |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | 画像フォーマット. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | 結果の画像をバイト単位で返します。1 ページに対して 1 バイト配列です。 |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | デバイスがダイレクト RGB モード、つまり RGB を使用するかどうかを示します。 |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | この Aspose.Page ライブラリのインスタンスがライセンスされているかどうかを示します. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | ページの現在の背景を返すか指定します。 |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | 現在の不透明度マスクを返すか指定します。 |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | 現在のペイントを返すか指定します。 |
| [Properties](../../aspose.page/device/properties/) { get; set; } | メタデータを含むデバイス プロパティ. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | レンダリング プロセスを管理するためのオプション。 |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | ページのサイズを返すか指定します。 |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | 現在のストロークを返すか指定します。 |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | 現在のテキスト レンダリング モードを返すか指定します。 |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | 現在のテキスト ストロークの幅を返すか指定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | ページがレンダリングされた後、デバイスの必要な準備を行います. |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | このデバイスのコピーを作成します。 |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | デバイスを破棄します。 |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | パスを描画します。 |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 円弧を描きます。 |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | 変換と背景が割り当てられた画像を描画します。 |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 線分を描画します。 |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 楕円を描きます。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 多角形を描画します。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | ポリゴンを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | ポリラインを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | ポリラインを描画します。 |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 四角形を描画します。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 丸い四角形を描画します。 |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | 指定されたポイントに文字列を描画します。 |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | ドキュメントがレンダリングされた後、デバイスの必要な準備を行います. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | パスを塗りつぶします。 |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | 円弧を塗りつぶします。 |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | 楕円を塗りつぶします。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | 多角形を塗りつぶします。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | 多角形を塗りつぶします。 |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | 長方形を塗りつぶします。 |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | 丸い長方形を塗りつぶします。 |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | 文字列プロパティの値を取得します。 (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | color プロパティの値を取得します。 (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | double プロパティの値を取得します。 (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | 整数プロパティの値を取得します。 (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | margins プロパティの値を取得します。 (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | 長方形プロパティの値を取得します。 (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | size プロパティの値を取得します。 (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | 現在の変換を取得します。 |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | デバイスのクリップを初期化します。 |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | 出力するページ数を初期化します。 |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | boolean プロパティの値を取得します。 (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | ページ レンダリングの前にデバイスの必要な準備を行います。 |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | 各ページをレンダリングする前に、デバイスの必要な準備を行います. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | ドキュメント全体のデバイスを初期状態にリセットします。 |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | デバイスをページの初期状態にリセットします。 |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | 現在の変換行列を Z 軸上で回転させます。 writeTransform(Transform). を呼び出します。正の角度 theta で回転すると、正の x 軸 上の点が正の y 軸に向かって回転します。 |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | ポイントを中心に現在の変換行列を回転させます。 |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | 現在の変換行列をスケーリングします。 writeTransform(Transform). を呼び出します。 |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | 形状をクリップします。 |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | 現在の変換を指定します。 |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | 現在の変換行列をせん断します。 writeTransform(Transform). を呼び出します。 |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | ドキュメントのレンダリングを開始する前に、デバイスの必要な準備を行います。 |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | デバイス タイプの名前を返します。 |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | 現在の変換行列を変換します。 writeTransform(Transform). を呼び出します。 |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | 現在の変換行列を変換します。 writeTransform(Transform). を呼び出します。 |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | 他のマルチページ デバイスからページ パラメータを更新します。 |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | コメントを書き込みます。 |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | 「背景」プロパティ キー。 |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | 「背景色」プロパティキー。 |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | 「文書にフォントを埋め込む」プロパティキー。 |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | 「エラーを出す」プロパティ値。 |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | 「警告を発する」プロパティ値。 |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | 「コンテンツをページに合わせる」プロパティ キー。 |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | 「向き」プロパティキー。 |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | 「ページマージン」プロパティキー。 |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | 「ページサイズ」プロパティキー。 |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | 「プロデューサー」プロパティ値。 |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | 「透過」プロパティ キー。 |

### 関連項目

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* 名前空間 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 組み立て [Aspose.Page](../../)


