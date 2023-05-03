---
title: Class Metafile
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.Metafile クラス. グラフィック メタファイルを定義します. メタファイルには記録 構築 および再生 表示 できる グラフィック操作のシーケンスを記述するレコードが含まれます. このクラスは継承できません.
type: docs
weight: 800
url: /ja/net/system.drawing.imaging/metafile/
---
## Metafile class

グラフィック メタファイルを定義します. メタファイルには、記録 (構築) および再生 (表示) できる グラフィック操作のシーケンスを記述するレコードが含まれます. このクラスは継承できません.

```csharp
public sealed class Metafile : Image
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Metafile](metafile/#constructor_2)(Stream) | の新しいインスタンスを初期化します`Metafile`指定されたデータストリームからのクラス. |
| [Metafile](metafile/#constructor_6)(string) | の新しいインスタンスを初期化します`Metafile`指定したファイル名からのクラス. |
| [Metafile](metafile/#constructor)(IntPtr, bool) | の新しいインスタンスを初期化します`Metafile`指定されたハンドルのクラス. |
| [Metafile](metafile/#constructor_1)(IntPtr, EmfType) | の新しいインスタンスを初期化します`Metafile`指定されたハンドルからデバイス コンテキスト へのクラスとEmfTypeの形式を指定する列挙Metafile. |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | の新しいインスタンスを初期化します`Metafile`指定された データ ストリームからのクラスと、デバイス コンテキストへの Windows ハンドル。 /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | の新しいインスタンスを初期化します`Metafile`指定したファイル名からのクラス. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | の新しいインスタンスを初期化します`Metafile`指定された データ ストリームからのクラス、デバイス コンテキストへの Windows ハンドル、およびEmfTypeの形式を指定する enumeration Metafile. |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | の新しいインスタンスを初期化します`Metafile`指定された データ ストリームからのクラス、デバイス コンテキストへの Windows ハンドル、およびEmfTypeの形式を指定する enumeration Metafile. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | のビット単位の組み合わせを表す整数を取得します[`ImageFlags`](../imageflags/)この画像の. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist/) { get; } | このフレーム内のフレームの寸法を表す GUID の配列を取得しますImage. |
| override [Height](../../system.drawing.imaging/metafile/height/) { get; } | この高さをピクセル単位で取得しますMetafile. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | 水平方向の解像度 (インチあたりのピクセル数) を取得します。Image. |
| override [Palette](../../system.drawing.imaging/metafile/palette/) { get; set; } | これに使用されるカラー パレットを取得または設定しますImage. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | この画像の幅と高さを取得します. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat/) { get; } | このピクセル形式を取得しますImage. |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist/) { get; } | これに格納されているプロパティ アイテムの ID を取得しますImage. |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems/) { get; } | に格納されているすべてのプロパティ アイテム (メタデータの一部) を取得しますImage. |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat/) { get; } | このファイル形式を取得しますImage. |
| [Size](../../system.drawing/image/size/) { get; } | この画像の幅と高さをピクセル単位で取得します。 |
| [Tag](../../system.drawing/image/tag/) { get; set; } | 画像に関する追加データを提供するオブジェクトを取得または設定します。 |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | 垂直方向の解像度 (インチあたりのピクセル数) を取得します。Image. |
| override [Width](../../system.drawing.imaging/metafile/width/) { get; } | この幅をピクセル単位で取得しますMetafile. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | これの正確なコピーを作成しますImage. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | このイメージで使用されているすべてのリソースを解放します。 |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | 指定された単位でイメージの境界を取得します。 |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | 指定された次元のフレーム数を返します。 |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile/)() | Windows ハンドルを拡張Metafile. |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/)() | を返しますMetafileHeaderこれに関連するMetafile. |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem/)(int) | これから指定されたプロパティ項目を取得しますImage. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | このサムネイルを返しますImage. |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | 個々のメタファイル レコードを再生します。 |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem/)(int) | 指定されたプロパティ項目をこれから削除しますImage. |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | このメソッドは、Image. |
| [Save](../../system.drawing/image/save/)(string) | これを保存しますImage指定したファイルまたはストリームに. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | この画像を指定された形式で指定されたストリームに保存します。 |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | これを保存しますImage指定された形式で指定されたファイルに. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | 指定されたエンコーダーおよびイメージ エンコーダー パラメーターを使用して、指定されたストリームにこのイメージを保存します。 |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | これを保存しますImage指定されたエンコーダーおよびイメージ エンコーダー パラメーターを使用して、指定されたファイルにコピーします。 |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Image.Save(...) メソッドの 1 つに対する以前の呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Image.Save(...) メソッドのいずれかへの前回の呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | 次元とインデックスで指定されたフレームを選択します。 |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | プロパティ アイテム (メタデータの一部) をこの中に格納しますImage. |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | を返しますMetafileHeader指定されたMetafile. |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | を返しますMetafileHeader指定されたMetafile. |

### 関連項目

* class [Image](../../system.drawing/image/)
* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


