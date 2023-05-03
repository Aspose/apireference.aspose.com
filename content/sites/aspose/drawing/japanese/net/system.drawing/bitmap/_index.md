---
title: Class Bitmap
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Bitmap クラス. グラフィック イメージのピクセル データとその属性で構成されるビットマップをカプセル化します ABitmapピクセル データで定義された画像を操作するために使用されるオブジェクトです
type: docs
weight: 40
url: /ja/net/system.drawing/bitmap/
---
## Bitmap class

グラフィック イメージのピクセル データとその属性で構成されるビットマップをカプセル化します。 A`Bitmap`ピクセル データで定義された画像を操作するために使用されるオブジェクトです。

```csharp
public class Bitmap : Image
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Bitmap](bitmap/#constructor_3)(Image) | の新しいインスタンスを初期化します`Bitmap`指定された既存のイメージからのクラス. |
| [Bitmap](bitmap/#constructor_6)(Stream) | の新しいインスタンスを初期化します`Bitmap`指定されたデータストリームからのクラス. |
| [Bitmap](bitmap/#constructor_8)(string) | の新しいインスタンスを初期化します`Bitmap`指定されたファイルのクラス. |
| [Bitmap](bitmap/#constructor_5)(Image, Size) | の新しいインスタンスを初期化します`Bitmap`指定された既存のイメージのクラス。指定されたサイズにスケーリングされます。 |
| [Bitmap](bitmap/#constructor)(int, int) | の新しいインスタンスを初期化します`Bitmap`指定されたサイズのクラス. |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) | の新しいインスタンスを初期化します`Bitmap`指定されたデータストリームからのクラス. |
| [Bitmap](bitmap/#constructor_9)(string, bool) | の新しいインスタンスを初期化します`Bitmap`指定されたファイルのクラス. |
| [Bitmap](bitmap/#constructor_4)(Image, int, int) | の新しいインスタンスを初期化します`Bitmap`指定された既存のイメージのクラス、 が指定されたサイズにスケーリングされます。 |
| [Bitmap](bitmap/#constructor_2)(int, int, PixelFormat) | の新しいインスタンスを初期化します`Bitmap`指定されたサイズとフォーマットのクラス. |
| [Bitmap](bitmap/#constructor_1)(int, int, int, PixelFormat, int[]) | の新しいインスタンスを初期化します`Bitmap`指定されたサイズとピクセル データを持つクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | のビット単位の組み合わせを表す整数を取得します[`ImageFlags`](../../system.drawing.imaging/imageflags/)この画像の. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist/) { get; } | このフレーム内のフレームの寸法を表す GUID の配列を取得しますImage. |
| override [Height](../../system.drawing/bitmap/height/) { get; } | この Bitmap の高さ (ピクセル単位) を取得します。 |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | 水平方向の解像度 (インチあたりのピクセル数) を取得します。Image. |
| override [Palette](../../system.drawing/bitmap/palette/) { get; set; } | これに使用されるカラー パレットを取得または設定しますImage. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | この画像の幅と高さを取得します. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat/) { get; } | このピクセル形式を取得しますImage. |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist/) { get; } | これに格納されているプロパティ アイテムの ID を取得しますImage. |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems/) { get; } | に格納されているすべてのプロパティ アイテム (メタデータの一部) を取得しますImage. |
| override [RawFormat](../../system.drawing/bitmap/rawformat/) { get; } | このファイル形式を取得しますImage. |
| [Size](../../system.drawing/image/size/) { get; } | この画像の幅と高さをピクセル単位で取得します。 |
| [Tag](../../system.drawing/image/tag/) { get; set; } | 画像に関する追加データを提供するオブジェクトを取得または設定します。 |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | 垂直方向の解像度 (インチあたりのピクセル数) を取得します。Image. |
| override [Width](../../system.drawing/bitmap/width/) { get; } | この Bitmap の幅をピクセル単位で取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | これの正確なコピーを作成しますImage. |
| [Clone](../../system.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) | このセクションのコピーを作成しますBitmapによって定義されますRectanglestructure および指定されたPixelFormat列挙. |
| [Clone](../../system.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) | このセクションのコピーを作成しますBitmap指定されたPixelFormat列挙. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | このイメージで使用されているすべてのリソースを解放します。 |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | 指定された単位でイメージの境界を取得します。 |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | 指定された次元のフレーム数を返します。 |
| [GetPixel](../../system.drawing/bitmap/getpixel/)(int, int) | この中の指定されたピクセルの色を取得しますBitmap. |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem/)(int) | これから指定されたプロパティ項目を取得しますImage. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | このサムネイルを返しますImage. |
| [LockBits](../../system.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) | ロックBitmapシステムメモリに. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent)() | 指定した色を透明にしますBitmap. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | 指定した色を透明にしますBitmap. |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels/)(int[]) | ARGB32 形式のビットマップ ピクセルを指定の配列に読み取ります。 |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem/)(int) | 指定されたプロパティ項目をこれから削除しますImage. |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip/)(RotateFlipType) | このメソッドは、Image. |
| [Save](../../system.drawing/image/save/)(string) | これを保存しますImage指定したファイルまたはストリームに. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | この画像を指定された形式で指定されたストリームに保存します。 |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | これを保存しますImage指定された形式で指定されたファイルに. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | 指定されたエンコーダーおよびイメージ エンコーダー パラメーターを使用して、指定されたストリームにこのイメージを保存します。 |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | これを保存しますImage指定されたエンコーダーおよびイメージ エンコーダー パラメーターを使用して、指定されたファイルにコピーします。 |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Image.Save(...) メソッドの 1 つに対する以前の呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Image.Save(...) メソッドのいずれかへの前回の呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | 次元とインデックスで指定されたフレームを選択します。 |
| [SetPixel](../../system.drawing/bitmap/setpixel/)(int, int, Color) | この中で指定されたピクセルの色を設定しますBitmap. |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem/)(PropertyItem) | プロパティ アイテム (メタデータの一部) をこの中に格納しますImage. |
| [SetResolution](../../system.drawing/bitmap/setresolution/)(float, float) | この解像度を設定しますBitmap. |
| [UnlockBits](../../system.drawing/bitmap/unlockbits/)(BitmapData) | これのロックを解除しますBitmapシステムメモリから. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels/)(int[]) | ピクセルをビットマップに書き込みます。 |

### 関連項目

* class [Image](../image/)
* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


