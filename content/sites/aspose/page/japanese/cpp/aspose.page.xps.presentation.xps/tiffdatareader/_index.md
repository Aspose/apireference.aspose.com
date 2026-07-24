---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader クラス"
linktitle: "TiffDataReader"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader クラス。クラスは TIFF 画像ファイルディレクトリ（IFD）からデータを読み取るために使用されます。TIFF の解像度を読み取り、C++ で TIFF の適合性をチェックするのに役立ちます。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


このクラスは TIFF 画像ファイルディレクトリ (IFD) からデータを読み取るために使用されます。TIFF の解像度を読み取ったり、TIFF の適合性をチェックするのに役立ちます。

```cpp
class TiffDataReader : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Tiff 画像の高さを返します。高さが 0 の場合、デフォルト値（100）を返します。 |
| [get_ImageWidth](./get_imagewidth/)() | Tiff 画像の幅を返します。幅が 0 の場合、デフォルト値（100）を返します。 |
| [get_ImageXResolution](./get_imagexresolution/)() const | Tiff 画像の X 解像度を返します。 |
| [get_ImageYResolution](./get_imageyresolution/)() const | Tiff 画像の Y 解像度を返します。 |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | TIFF 画像が [XPS](../../aspose.page.xps/) 仕様に準拠している場合は true を返し、そのまま [XPS](../../aspose.page.xps/) ドキュメントに挿入できます。 |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | フォーマットのドキュメントは Aspose.Words\\Doc にあります。 |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | 新しい [TiffDataReader](./) クラスのインスタンスを初期化します。 |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | 新しい [TiffDataReader](./) クラスのインスタンスを初期化します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
