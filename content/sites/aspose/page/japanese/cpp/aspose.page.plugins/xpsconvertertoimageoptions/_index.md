---
title: "Aspose::Page::Plugins::XpsConverterToImageOptions class"
linktitle: "XpsConverterToImageOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Plugins::XpsConverterToImageOptions クラス。C++ の XpsConverter プラグイン用の XPS から画像へのコンバータオプションを表します。"
type: docs
weight: 2100
url: /ja/cpp/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class


[XpsConverter](../xpsconverter/) プラグイン用の [XPS](../../aspose.page.xps/) から画像へのコンバータオプションを表します。

```cpp
class XpsConverterToImageOptions : public Aspose::Page::Plugins::XpsConverterOptions
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | 画像タイプを取得/設定します。 |
| [get_OperationName](./get_operationname/)() override | 操作名を返します。 |
| [get_PageNumbers](./get_pagenumbers/)() const | [XPS](../../aspose.page.xps/) ドキュメントで変換するページ番号の配列を取得/設定します。設定しない場合はすべてのページが変換されます。 |
| [get_Resolution](./get_resolution/)() const | 画像解像度を取得/設定します。 |
| [get_Size](./get_size/)() const | 結果画像のサイズを取得/設定します。 |
| [get_SmoothingMode](./get_smoothingmode/)() const | 画像レンダリングのスムージング モードを取得/設定します。 |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 画像タイプを取得/設定します。 |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) | [XPS](../../aspose.page.xps/) ドキュメントで変換するページ番号の配列を取得/設定します。設定しない場合はすべてのページが変換されます。 |
| [set_Resolution](./set_resolution/)(float) | 画像解像度を取得/設定します。 |
| [set_Size](./set_size/)(System::Drawing::Size) | 結果画像のサイズを取得/設定します。 |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<System::Drawing::Drawing2D::SmoothingMode\>) | 画像レンダリングのスムージング モードを取得/設定します。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)() | デフォルトオプションで [XpsConverterToImageOptions](./) オブジェクトの新しいインスタンスを初期化します。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 画像形式を指定して [XpsConverterToImageOptions](./) オブジェクトの新しいインスタンスを初期化します。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(System::Drawing::Size) | 結果画像のサイズを指定して [XpsConverterToImageOptions](./) オブジェクトの新しいインスタンスを初期化します。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, System::Drawing::Size) | 画像形式と結果画像のサイズを指定して [XpsConverterToImageOptions](./) オブジェクトの新しいインスタンスを初期化します。 |
## 参照

* Class [XpsConverterOptions](../xpsconverteroptions/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
