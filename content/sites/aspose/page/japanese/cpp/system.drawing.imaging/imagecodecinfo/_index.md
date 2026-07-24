---
title: "System::Drawing::Imaging::ImageCodecInfo クラス"
linktitle: "ImageCodecInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::ImageCodecInfo クラス。画像コーデックに関する情報を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 1000
url: /ja/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


画像コーデックに関する情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class ImageCodecInfo : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | 現在のオブジェクトが表すコーデックのフォーマットに関連付けられた GUID を返します。 |
| [get_MimeType](./get_mimetype/)() | 現在のオブジェクトが表すコーデックのマルチパーパスインターネットメール拡張 (MIME) タイプを返します。 |
| static [GetImageDecoders](./getimagedecoders/)() | サポートされている画像デコーダーを表す [ImageCodecInfo](./) オブジェクトの配列を返します。 |
| static [GetImageEncoders](./getimageencoders/)() | サポートされている画像エンコーダーを表す [ImageCodecInfo](./) オブジェクトの配列を返します。 |
| [set_FormatID](./set_formatid/)(const Guid\&) | 現在のオブジェクトが表すコーデックのフォーマットに関連付けられた GUID を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
