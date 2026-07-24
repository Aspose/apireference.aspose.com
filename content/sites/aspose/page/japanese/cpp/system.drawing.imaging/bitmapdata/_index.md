---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::BitmapData class. ビットマップ画像の属性セットを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


ビットマップ画像の属性セットを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class BitmapData : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Height](./get_height/)() const | 画像の高さ（ピクセル単位）を返します。 |
| [get_PixelFormat](./get_pixelformat/)() const | ビットマップ画像のピクセル形式を返します。 |
| [get_Scan0](./get_scan0/)() const | ビットマップ内の最初のピクセルデータのアドレスを返します。 |
| [get_Stride](./get_stride/)() const | 画像のストライド幅（バイト単位）を返します。 |
| [get_Width](./get_width/)() const | 画像の幅（ピクセル単位）を返します。 |
| [set_Height](./set_height/)(int) | 画像の高さ（ピクセル単位）を設定します。 |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | ビットマップ画像のピクセル形式を設定します。 |
| [set_Scan0](./set_scan0/)(IntPtr) | ビットマップ内の最初のピクセルデータのアドレスを設定します。 |
| [set_Stride](./set_stride/)(int) | 画像のストライド幅（バイト単位）を設定します。 |
| [set_Width](./set_width/)(int) | 画像の幅（ピクセル単位）を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
