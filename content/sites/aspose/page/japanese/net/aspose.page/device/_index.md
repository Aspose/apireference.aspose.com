---
title: Class Device
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.Device クラス. このクラスはドキュメントのレンダリングを抽象デバイスにカプセル化します ドキュメントのレンダリングはページごとに実行されます
type: docs
weight: 20
url: /ja/net/aspose.page/device/
---
## Device class

このクラスは、ドキュメントのレンダリングを抽象デバイスにカプセル化します。 ドキュメントのレンダリングはページごとに実行されます。

```csharp
public abstract class Device
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Device](device/)(Size) | 初期化`Device`ページのサイズ. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | ページの現在の背景を返すか指定します。 |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 現在の文字変換を返すか指定します。 |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 結果のデバイス出力の作成者を返すか指定します。 |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | 現在のフォントを返すか指定します. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | デバイスがダイレクト RGB モード、つまり RGB を使用するかどうかを示します。 |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | この Aspose.Page ライブラリのインスタンスがライセンスされているかどうかを示します. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | 現在の不透明度を返すか指定します。 |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | 現在の不透明度マスクを返すか指定します。 |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | 現在のペイントを返すか指定します。 |
| [Properties](../../aspose.page/device/properties/) { get; set; } | メタデータを含むデバイス プロパティ. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | レンダリング プロセスを管理するためのオプション。 |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | ページのサイズを返すか指定します。 |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | 現在のストロークを返すか指定します。 |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 現在のテキスト レンダリング モードを返すか指定します。 |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 現在のテキスト ストロークの幅を返すか指定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | このデバイスのコピーを作成します。 |
| virtual [Dispose](../../aspose.page/device/dispose/)() | デバイスを破棄します。 |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | パスを描画します。 |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 円弧を描きます。 |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | 変換と背景が割り当てられた画像を描画します。 |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 線分を描画します。 |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 楕円を描きます。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | 多角形を描画します。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | ポリゴンを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | ポリラインを描画します。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | ポリラインを描画します。 |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 四角形を描画します。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 丸い四角形を描画します。 |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | 指定されたポイントに文字列を描画します。 |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | ドキュメントがレンダリングされた後、デバイスの必要な準備を行います. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | パスを塗りつぶします。 |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | 円弧を塗りつぶします。 |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | 楕円を塗りつぶします。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | 多角形を塗りつぶします。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | 多角形を塗りつぶします。 |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | 長方形を塗りつぶします。 |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | 丸い長方形を塗りつぶします。 |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | 文字列プロパティの値を取得します。 |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | color プロパティの値を取得します。 |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | double プロパティの値を取得します。 |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | 整数プロパティの値を取得します。 |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | marginプロパティの値を取得します. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | 長方形プロパティの値を取得します。 |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | size プロパティの値を取得します。 |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | 現在の変換を取得します。 |
| virtual [InitClip](../../aspose.page/device/initclip/)() | デバイスのクリップを初期化します。 |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | boolean プロパティの値を取得します。 |
| virtual [ReNew](../../aspose.page/device/renew/)() | ドキュメント全体のデバイスを初期状態にリセットします。出力ストリームのリセットに使用. |
| virtual [Reset](../../aspose.page/device/reset/)() | デバイスをページの初期状態にリセットします。 |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | 現在の変換行列を回転します。 writeTransform(Transform). を呼び出します。正の角度 theta で回転すると、正の x 軸 上の点が正の y 軸に向かって回転します。 |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | ポイントを中心に現在の変換行列を回転させます。 |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | 現在の変換行列をスケーリングします。 writeTransform(Transform). を呼び出します。 |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | デバイスのクリップを指定します。 |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | 現在の変換を指定します。 |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | 現在の変換行列をせん断します。 writeTransform(Transform). を呼び出します。 |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | ドキュメントのレンダリングを開始する前に、デバイスの必要な準備を行います。 |
| override [ToString](../../aspose.page/device/tostring/)() | デバイス タイプの名前を返します。 |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | 現在の変換行列を変換します。 writeTransform(Transform) を呼び出します |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | 現在の変換行列を変換します。 writeTransform(Transform). を呼び出します。 |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | コメントを書き込みます。 |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | 現在のデバイスのバージョン。 |

### 関連項目

* 名前空間 [Aspose.Page](../../aspose.page/)
* 組み立て [Aspose.Page](../../)


