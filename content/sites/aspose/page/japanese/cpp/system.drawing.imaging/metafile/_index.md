---
title: "System::Drawing::Imaging::Metafile クラス"
linktitle: "Metafile"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::Metafile クラス。グラフィックメタファイルを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1200
url: /ja/cpp/system.drawing.imaging/metafile/
---
## Metafile class


グラフィックメタファイルを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Metafile : public System::Drawing::Image
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 現在のオブジェクトのコピーを返します。 |
| [get_Height](./get_height/)() const override | 画像の高さをピクセル単位で返します。 |
| [get_PixelFormat](./get_pixelformat/)() const override | ピクセル形式を示す値を返します。 |
| [get_RawFormat](./get_rawformat/)() const override | 画像形式を示す値を返します。 |
| [get_Width](./get_width/)() const override | 画像の幅（ピクセル単位）を返します。 |
| [GetHenhmetafile](./gethenhmetafile/)() | 未実装です。 |
| [GetMetafileHeader](./getmetafileheader/)() | 現在のオブジェクトに関連付けられたヘッダーを返します。 |
| [Metafile](./metafile/)(const System::String\&) | 未実装です。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | 未実装です。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | 未実装です。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | 未実装です。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | 未実装です。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | 未実装です。 |
| [Metafile](./metafile/)(IntPtr, EmfType) | 未実装です。 |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | 未実装です。 |
| virtual [~Metafile](./~metafile/)() | デストラクタ。 |
## 参照

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
