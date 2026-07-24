---
title: "System::Drawing::Imaging::ImageFormat クラス"
linktitle: "ImageFormat"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::ImageFormat クラス。画像のファイル形式を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1100
url: /ja/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


画像のファイル形式を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class ImageFormat : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | 現在のオブジェクトと指定されたオブジェクトが表す画像形式が等しいかどうかを判定します。 |
| static [get_Bmp](./get_bmp/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトはビットマップ画像形式を表します。 |
| static [get_Emf](./get_emf/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは拡張メタファイル形式を表します。 |
| static [get_Exif](./get_exif/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは交換可能な [Image](../../system.drawing/image/) ファイル (Exif) 形式を表します。 |
| static [get_Gif](./get_gif/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは [Graphics](../../system.drawing/graphics/) インターチェンジ形式 (GIF) 画像形式を表します。 |
| [get_Guid](./get_guid/)() const | 現在のオブジェクトが表す画像形式に関連付けられた GUID を返します。 |
| static [get_Icon](./get_icon/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは [Windows](../../system.windows/) アイコン画像形式を表します。 |
| static [get_Jpeg](./get_jpeg/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは Joint Photographic Experts Group (JPEG) 画像形式を表します。 |
| static [get_MemoryBmp](./get_memorybmp/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトはメモリ内のビットマップ形式を表します。 |
| static [get_Png](./get_png/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは W3C ポータブルネットワーク [Graphics](../../system.drawing/graphics/) (PNG) 画像形式を表します。 |
| static [get_Tiff](./get_tiff/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは Tagged [Image](../../system.drawing/image/) ファイル形式 (TIFF) 画像形式を表します。 |
| static [get_Wmf](./get_wmf/)() | [ImageFormat](./) オブジェクトへの共有ポインタを返します。このオブジェクトは [Windows](../../system.windows/) メタファイル (WMF) 画像形式を表します。 |
| [ImageFormat](./imageformat/)(const System::Guid\&) | 指定された GUID に関連付けられた画像形式を表す [ImageFormat](./) クラスのインスタンスを構築します。 |
| virtual [ToString](./tostring/)() const | この [ImageFormat](./) オブジェクトを人間が読める文字列に変換します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
