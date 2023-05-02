---
title: Class Image
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Image クラス. Bitmap および Metafile の下位クラスに機能を提供する抽象基本クラス
type: docs
weight: 580
url: /ja/net/system.drawing/image/
---
## Image class

Bitmap および Metafile の下位クラスに機能を提供する抽象基本クラス。

```csharp
public abstract class Image : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Image](image/)() | の新しいインスタンスを初期化します`Image`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | のビット単位の組み合わせを表す整数を取得します[`ImageFlags`](../../system.drawing.imaging/imageflags/)この画像の. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist/) { get; } | このフレーム内のフレームの寸法を表す GUID の配列を取得しますImage. |
| abstract [Height](../../system.drawing/image/height/) { get; } | この高さをピクセル単位で取得しますImage. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | 水平方向の解像度 (インチあたりのピクセル数) を取得します。Image. |
| abstract [Palette](../../system.drawing/image/palette/) { get; set; } | これに使用されるカラー パレットを取得または設定しますImage. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | この画像の幅と高さを取得します. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat/) { get; } | このピクセル形式を取得しますImage. |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist/) { get; } | これに格納されているプロパティ アイテムの ID を取得しますImage. |
| abstract [PropertyItems](../../system.drawing/image/propertyitems/) { get; } | に格納されているすべてのプロパティ アイテム (メタデータの一部) を取得しますImage. |
| abstract [RawFormat](../../system.drawing/image/rawformat/) { get; } | このファイル形式を取得しますImage. |
| [Size](../../system.drawing/image/size/) { get; } | この画像の幅と高さをピクセル単位で取得します。 |
| [Tag](../../system.drawing/image/tag/) { get; set; } | 画像に関する追加データを提供するオブジェクトを取得または設定します。 |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | 垂直方向の解像度 (インチあたりのピクセル数) を取得します。Image. |
| abstract [Width](../../system.drawing/image/width/) { get; } | この幅をピクセル単位で取得しますImage. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile/)(string) | を作成しますImage指定されたファイルから. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream)(Stream) | を作成しますImage指定されたデータ ストリームから. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream_1)(Stream, bool) | を作成しますImage指定されたデータ ストリームから、必要に応じてそのストリーム内の embedded カラー管理情報を使用します。 |
| [Clone](../../system.drawing/image/clone/)() | これの正確なコピーを作成しますImage. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | このイメージで使用されているすべてのリソースを解放します。 |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | 指定された単位でイメージの境界を取得します。 |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | 指定された次元のフレーム数を返します。 |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem/)(int) | これから指定されたプロパティ項目を取得しますImage. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | このサムネイルを返しますImage. |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem/)(int) | 指定されたプロパティ項目をこれから削除しますImage. |
| abstract [RotateFlip](../../system.drawing/image/rotateflip/)(RotateFlipType) | このメソッドは、Image. |
| [Save](../../system.drawing/image/save/#save_2)(string) | これを保存しますImage指定したファイルまたはストリームに. |
| [Save](../../system.drawing/image/save/#save_1)(Stream, ImageFormat) | この画像を指定された形式で指定されたストリームに保存します。 |
| [Save](../../system.drawing/image/save/#save_4)(string, ImageFormat) | これを保存しますImage指定された形式で指定されたファイルに. |
| [Save](../../system.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | 指定されたエンコーダーおよびイメージ エンコーダー パラメーターを使用して、指定されたストリームにこのイメージを保存します。 |
| [Save](../../system.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | これを保存しますImage指定されたエンコーダーおよびイメージ エンコーダー パラメーターを使用して、指定されたファイルにコピーします。 |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | Image.Save(...) メソッドの 1 つに対する以前の呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | Image.Save(...) メソッドのいずれかへの前回の呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | 次元とインデックスで指定されたフレームを選択します。 |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem/)(PropertyItem) | プロパティ アイテム (メタデータの一部) をこの中に格納しますImage. |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap/)(IntPtr) | を作成しますBitmapハンドルから GDI ビットマップへ. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize/)(PixelFormat) | 指定されたピクセル形式の色深度をピクセルあたりのビット数で返します. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat/)(PixelFormat) | このピクセル形式が正しいかどうかを示す値を返します。Imageアルファ情報が含まれています. |

## その他のメンバー

| 名前 | 説明 |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort/) | を決定するためのコールバック メソッドを提供します。[`GetThumbnailImage`](./getthumbnailimage/)メソッドは実行を途中でキャンセルする必要があります. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


