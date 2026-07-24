---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Bitmap クラス。GDI+ ビットマップ画像を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.drawing/bitmap/
---
## Bitmap class


GDI+ ビットマップ画像を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class Bitmap : public System::Drawing::Image
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | ピクセル処理モードを有効にします。 |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | 指定された既存の画像から新しい [Bitmap](./) オブジェクトを構築します。 |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | 指定されたストリームから新しい [Bitmap](./) オブジェクトを構築します。 |
| [Bitmap](./bitmap/)(const String\&) | 指定されたファイルから新しい [Bitmap](./) オブジェクトを構築します。 |
| [Bitmap](./bitmap/)(const String\&, bool) | 指定されたファイルから新しい [Bitmap](./) オブジェクトを構築します。 |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | 指定された幅、高さ、ピクセル形式、ピクセルデータを持つビットマップ画像を表す新しい [Bitmap](./) オブジェクトを構築します。 |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | 指定された既存の画像から、指定されたサイズにスケーリングされた新しい [Bitmap](./) オブジェクトを構築します。 |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | 指定された既存の画像から、幅と高さが指定された値にスケーリングされた新しい [Bitmap](./) オブジェクトを構築します。 |
| [Clone](./clone/)() override | 現在のオブジェクトのコピーを作成します。 |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | 現在のオブジェクトが表すビットマップ画像の領域のコピーを表す [Bitmap](./) オブジェクトを作成します。 |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | 現在のオブジェクトが表すビットマップ画像の領域のコピーを表す [Bitmap](./) オブジェクトを作成します。 |
| [ComputeHash](./computehash/)() | SHA1 ハッシュ値を計算します。 |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | 指定されたビットマップ画像のコピーを作成し、ピクセル形式を Format32bppArgb に変更します。 |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | ピクセル処理モードを無効にします。 |
| [get_Height](./get_height/)() const override | 画像の高さ（ピクセル単位）を返します。 |
| [get_Palette](./get_palette/)() const override | 現在のオブジェクトが表す画像で使用されているカラーパレットを返します。 |
| [get_PixelFormat](./get_pixelformat/)() const override | 現在のオブジェクトが表す画像のピクセル形式を返します。 |
| [get_RawFormat](./get_rawformat/)() const override | 現在のオブジェクトが表す画像のファイル形式を返します。 |
| [get_Width](./get_width/)() const override | 画像の幅（ピクセル単位）を返します。 |
| [GetHbitmap](./gethbitmap/)() | 現在のオブジェクトが表すビットマップから GDI ビットマップオブジェクトを作成します。 |
| [GetPixel](./getpixel/)(int, int) | 指定されたピクセルの色を返します。 |
| [GetSkBitmap](./getskbitmap/)() const override | 基になる SkBitmap オブジェクトへの生ポインタを返します。 |
| [IsMultiImage](./ismultiimage/)() const override | 元の形式がマルチイメージかどうかを返します。 |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | システムメモリに [Bitmap](./) をロックします。 |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | システムメモリに [Bitmap](./) をロックします。 |
| [MakeTransparent](./maketransparent/)(Color) | 指定された色のすべてのピクセルの色を透明に変更します。 |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | 現在のオブジェクトが表す画像のピクセルの色を事前乗算します。 |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | 画像を 90 度の倍数に回転させ、フリップします。 |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | 現在のオブジェクトが表す画像で使用されるカラーパレットを設定します。 |
| [SetPixel](./setpixel/)(int, int, Color) | 現在のオブジェクトが表すビットマップ画像の指定されたピクセルの色を設定します。 |
| [SetResolution](./setresolution/)(float, float) | 画像の解像度を設定します。 |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | システムメモリから指定されたビットマップのロックを解除します。 |
## 参照

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
