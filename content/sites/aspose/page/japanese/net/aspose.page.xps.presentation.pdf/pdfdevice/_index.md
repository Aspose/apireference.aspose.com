---
title: Class PdfDevice
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice クラス. クラス内包画像合成装置.
type: docs
weight: 410
url: /ja/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

クラス内包画像合成装置.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | 新しいインスタンスを作成します。 |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | 指定されたメディア サイズで新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background/) { get; set; } | 背景色を取得/設定します。 |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 現在の文字変換を返すか指定します。 |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 結果のデバイス出力の作成者を返すか指定します。 |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | ドキュメント内の現在のページの絶対番号を返します. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | 現在のパーティション内の現在のページの番号を返します. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font/) { get; set; } | 現在のフォントを取得/設定します。 |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | デバイスがダイレクト RGB モード、つまり RGB を使用するかどうかを示します。 |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | この Aspose.Page ライブラリのインスタンスがライセンスされているかどうかを示します. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity/) { get; set; } | 不透明度を取得/設定します。 |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask/) { get; set; } | 不透明マスクのブラシを取得/設定します。マスクはペイントまたはストライクに適用されます. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint/) { get; set; } | パスを塗りつぶすためのブラシを取得/設定します。 |
| [Properties](../../aspose.page/device/properties/) { get; set; } | メタデータを含むデバイス プロパティ. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions/) { set; } | 保存オプションを初期化します。 |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size/) { get; set; } | デバイスのメディア サイズを取得/設定します。 |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke/) { get; set; } | 描画パスのストロークを取得/設定します。 |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 現在のテキスト レンダリング モードを返すか指定します。 |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 現在のテキスト ストロークの幅を返すか指定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | 最後のオブジェクトをターゲットとしてアウトライン アイテムを追加します。 |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | 原点をターゲットとするアウトラインアイテムを追加します。 |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | ページを完了します。 |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | ドキュメントの分割を完了しました。 |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create/)() | このデバイス インスタンスに基づいて、デバイスの新しいインスタンスを作成します。 このデバイスのグラフィックス状態を書き込みます。ApsCanvas instance(s) と対応する RenderTransform および Clip プロパティ. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose/)() | このデバイス インスタンスを破棄します。このデバイスインスタンスのグラフィック状態を確定します つまり、APS 構成コンテキストをApsCanvasthis デバイスのグラフィックス状態よりも高いレベルのApsCanvas. |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw/)(GraphicsPath) | 指定したパスを描画します。 |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 円弧を描きます。 |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | 変換と背景が割り当てられた画像を描画します。 |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 線分を描画します。 |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 楕円を描きます。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 多角形を描画します。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | ポリゴンを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | ポリラインを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | ポリラインを描画します。 |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 四角形を描画します。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 丸い四角形を描画します。 |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring/)(string, double, double) | 指定した位置に文字列を描画します。 |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument/)() | ドキュメントを完了します。 |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill/)(GraphicsPath) | 指定したパスを埋めます。 |
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
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform/)() | 現在の変換行列を返します。 |
| virtual [InitClip](../../aspose.page/device/initclip/)() | デバイスのクリップを初期化します。 |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | 出力するページ数を初期化します。 |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | boolean プロパティの値を取得します。 |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | 指定したタイトルで新しいページを開始します。 |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | 指定された幅と高さで新しいページを開始します。 |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | 新しいドキュメント パーティションを開始します。 |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew/)() | デバイスを初期状態に設定します。 |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset/)() | デバイスをリセットします。 |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate/#rotate)(double) | 原点を中心に時計回りの回転を現在の変換行列に適用します。 |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | ポイントを中心に現在の変換行列を回転させます。 |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale/)(double, double) | 指定されたスケール ベクトルを現在の変換行列に適用します。 |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip/)(GraphicsPath) | 指定したパスを現在のクリップ パスに追加します。 |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | ページ番号をターゲットとしてハイパーリンクを設定します. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | 外部 URI をターゲットとしてハイパーリンクを設定します。 |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform/)(Matrix) | 現在の変換行列を設定します。 |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear/)(double, double) | 指定されたせん断ベクトルを現在の変換行列に適用します。 |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument/)() | ドキュメントを開始します。 |
| override [ToString](../../aspose.page/device/tostring/)() | デバイス タイプの名前を返します。 |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform/)(Matrix) | 現在の変換行列を指定された値で乗算しますMatrix. |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate/)(double, double) | 指定された平行移動ベクトルを現在の変換行列に適用します。 |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | 現在のページ パラメータを更新します。 |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | コメントを書き込みます。 |

### 関連項目

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* 名前空間 [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* 組み立て [Aspose.Page](../../)


