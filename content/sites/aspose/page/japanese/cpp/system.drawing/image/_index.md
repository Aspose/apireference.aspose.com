---
title: "System::Drawing::Image クラス"
linktitle: "画像"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Image クラス。System::Drawing::Bitmap と System::Drawing::Metafile クラスの基本機能を提供する基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 1200
url: /ja/cpp/system.drawing/image/
---
## Image class


基本機能を提供する [System::Drawing::Bitmap](../bitmap/) と System::Drawing::Metafile クラスの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class Image : public virtual System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Clone](./clone/)() | 現在のオブジェクトのコピーを作成します。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが取得したすべてのリソースを解放します。 |
| static [FromFile](./fromfile/)(const String\&, bool) | 指定されたファイルから [Image](./) オブジェクトを作成します。 |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | 指定された GDI ビットマップから [Bitmap](../bitmap/) オブジェクトを構築します。 |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | 指定されたストリームから [Image](./) オブジェクトを作成します。 |
| virtual [get_Flags](./get_flags/)() const | 画像の属性を表す ImageFlags 列挙体値のビット単位の組み合わせを返します。 |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | 現在のオブジェクトが表す画像内のフレームの次元を表す GUID の配列を返します。 |
| virtual [get_Height](./get_height/)() const | 画像の高さ（ピクセル単位）を返します。 |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | 現在のオブジェクトが表す画像の水平解像度（インチあたりピクセル）を返します。 |
| virtual [get_Palette](./get_palette/)() const | 現在のオブジェクトが表す画像で使用されているカラーパレットを返します。 |
| virtual [get_PixelFormat](./get_pixelformat/)() const | 現在のオブジェクトが表す画像のピクセル形式を返します。 |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | この画像に保存されているプロパティ項目の ID を取得します。 |
| virtual [get_PropertyItems](./get_propertyitems/)() const | この画像に保存されているすべてのプロパティ項目（メタデータの一部）を取得します。 |
| virtual [get_RawFormat](./get_rawformat/)() const | 現在のオブジェクトが表す画像のファイル形式を返します。 |
| [get_Size](./get_size/)() const | 画像の幅と高さ（ピクセル単位）を表す [Size](../size/) オブジェクトを返します。 |
| virtual [get_Tag](./get_tag/)() const | 画像に関する追加データを提供するオブジェクトを取得します。 |
| [get_VerticalResolution](./get_verticalresolution/)() const | 現在のオブジェクトが表す画像の垂直解像度（インチあたりピクセル）を返します。 |
| virtual [get_Width](./get_width/)() const | 画像の幅（ピクセル単位）を返します。 |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | 指定された測定単位で画像の境界を返します。 |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | 指定されたフレーム次元のフレーム数を返します。 |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | 指定されたピクセル形式で色深度を表すのに使用されるビット数を返します。 |
| virtual [GetSkBitmap](./getskbitmap/)() const | 基礎となる SkBitmap オブジェクトを返します。 |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | この [System::Drawing::Image](./) オブジェクトのサムネイルを取得します。 |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | 指定されたピクセル形式がアルファ情報を含むかどうかを判定します。 |
| virtual [IsMultiImage](./ismultiimage/)() const | 元の形式がマルチイメージかどうかを返します。 |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | 画像を 90 度の倍数に回転させ、反転させます。 |
| [Save](./save/)(const String\&) | 現在のオブジェクトが表す画像を PNG 形式で指定されたファイルに保存します。 |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | 現在のオブジェクトが表す画像を指定された形式で指定されたファイルに保存します。 |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | 現在のオブジェクトが表す画像を、指定された形式で指定されたストリームに保存します。 |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | 現在のオブジェクトが表す画像を、指定されたエンコーダーとエンコーダーパラメータを使用して、指定されたファイルに保存します。 |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | 現在のオブジェクトが表す画像を、指定されたエンコーダーとエンコーダーパラメータを使用して、指定されたストリームに保存します。 |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | 前回の [Save()](./save/) メソッド呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | 前回の [Save()](./save/) メソッド呼び出しで指定されたファイルまたはストリームにフレームを追加します。 |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | 指定されたフレームを選択します。 |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | 現在のオブジェクトが表す画像で使用されるカラーパレットを設定します。 |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | 画像に関する追加データを提供するオブジェクトを設定します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | GetThumbnailImage の実行をキャンセルするコールバックです。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
