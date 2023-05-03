---
title: System.Drawing.Imaging
second_title: Aspose.Drawing for .NET API リファレンス
description: Imaging名前空間は高度な GDI イメージング機能を提供します 基本的なグラフィック機能はDrawing名前空間.
type: docs
weight: 40
url: /ja/net/system.drawing.imaging/
---
Imaging名前空間は、高度な GDI+ イメージング機能を提供します。 基本的なグラフィック機能は、Drawing名前空間.

## クラス

| クラス | 説明 |
| --- | --- |
| [BitmapData](./bitmapdata/) | ビットマップ イメージの属性を指定します。のBitmapDataクラスはthe によって使用されますLockBitsとUnlockBitsの メソッドBitmapクラス。継承できません。 |
| [ColorMap](./colormap/) | 色を変換するためのマップを定義します。のいくつかの方法ImageAttributesクラスadjust の配列であるカラーリマップテーブルを使用した画像の色ColorMap構造体. 継承不可. |
| [ColorMatrix](./colormatrix/) | RGBA 空間の座標を含む 5 x 5 マトリックスを定義します。ImageAttributesクラス カラー マトリックスを使用して画像の色を調整します。 このクラスは継承できません。 |
| [ColorPalette](./colorpalette/) | カラー パレットを構成する色の配列を定義します。 色は 32 ビット ARGB 色です。継承不可. |
| [Encoder](./encoder/) | アンEncoderオブジェクトは、 イメージ エンコーダー パラメーターのカテゴリを識別するグローバル一意識別子 (GUID) をカプセル化します. |
| [EncoderParameter](./encoderparameter/) | 値または値の配列をイメージ エンコーダーに渡すために使用されます。 |
| [EncoderParameters](./encoderparameters/) | の配列をカプセル化しますEncoderParameterオブジェクト. |
| [FrameDimension](./framedimension/) | 画像のフレーム寸法を取得するプロパティを提供します。継承不可. |
| [ImageAttributes](./imageattributes/) | レンダリング中にビットマップとメタファイルの色がどのように操作されるかについての情報が含まれています. |
| [ImageCodecInfo](./imagecodecinfo/) | ImageCodecInfoクラスは、インストールされているイメージ エンコーダーとデコーダー (コーデックと呼ばれる) に関するすべての関連情報を取得するために必要なストレージ メンバーとメソッドを提供します。継承不可. |
| [ImageFormat](./imageformat/) | 画像のファイル形式を指定します。継承不可. |
| [Metafile](./metafile/) | グラフィック メタファイルを定義します. メタファイルには、記録 (構築) および再生 (表示) できる グラフィック操作のシーケンスを記述するレコードが含まれます. このクラスは継承できません. |
| [MetafileHeader](./metafileheader/) | 関連するMetafile.継承不可. |
| [MetaHeader](./metaheader/) | Windows 形式 (WMF) メタファイルに関する情報が含まれています。 |
| [NamespaceDoc](./namespacedoc/) | Imaging名前空間は、高度な GDI+ イメージング機能を提供します。 基本的なグラフィック機能は、Drawing名前空間. |
| [PlayRecordCallback](./playrecordcallback/) | このデリゲートは使用されません。メタファイルのレコードを列挙する例については、次を参照してください。[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile/). |
| [PropertyItem](./propertyitem/) | 画像ファイルに含まれるメタデータ プロパティをカプセル化します。継承不可. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader/) | 配置可能なメタファイルを定義します。継承不可. |
## 列挙

| 列挙 | 説明 |
| --- | --- |
| [ColorAdjustType](./coloradjusttype/) | 色調整情報を使用する GDI+ オブジェクトを指定します。 |
| [ColorChannelFlag](./colorchannelflag/) | CMYK (シアン、マゼンタ、イエロー、ブラック) 色空間の個々のチャネルを指定します。 この列挙は、[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel/)メソッド. |
| [ColorMatrixFlag](./colormatrixflag/) | 色とグレースケールの調整 設定の影響を受ける画像と色の種類を指定します。ImageAttributes. |
| [EmfPlusRecordType](./emfplusrecordtype/) | グラフィック コマンドを読み書きするためにメタファイルで使用できるメソッドを指定します。 |
| [EmfType](./emftype/) | 拡張メタファイル (EMF) ファイルに配置されるレコードの性質を指定します。 この列挙は、Metafileclass. |
| [EncoderValue](./encodervalue/) | を使用するときに JPEG または TIFF 画像エンコーダーに渡されるパラメーター値を指定するために使用されます。EncoderParameters) またはEncoderParameters)メソッド. |
| [ImageFlags](./imageflags/) | に含まれるピクセル データの属性を指定します。[`Image`](../system.drawing/image/)物体。 Flags プロパティは、この列挙のメンバーを返します。 この列挙には、メンバー値のビットごとの組み合わせを可能にする FlagsAttribute 属性があります。 |
| [ImageLockMode](./imagelockmode/) | の flags パラメータに渡されるフラグを指定します。[`LockBits`](../system.drawing/bitmap/lockbits/) method. の[`LockBits`](../system.drawing/bitmap/lockbits/)メソッドは image の一部をロックして、ピクセル データを読み書きできるようにします。 |
| [MetafileFrameUnit](./metafileframeunit/) | メタファイルのサイズと配置に使用される四角形の測定単位を指定します。 これは、メタファイルの作成時に指定されます。Metafileobject. |
| [MetafileType](./metafiletype/) | メタファイルの種類を指定します。 |
| [PixelFormat](./pixelformat/) | 画像の各ピクセルのカラー データの形式を指定します。 |


