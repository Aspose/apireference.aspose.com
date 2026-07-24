---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class"
linktitle: "ImageSaveOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class. C++ における XPS を画像として保存するオプションの基本クラスです。"
type: docs
weight: 200
url: /ja/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


XPS-as-image 保存オプションの基本クラス。

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | ノード間で渡すページの一部のサイズを指定します。 |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | 保存直前に [XPS](../../aspose.page.xps/) ページに対して変更を行うイベントハンドラのコレクションです。 |
| [get_ImageSize](./get_imagesize/)() const | 出力画像のサイズ（ピクセル）を取得/設定します。 |
| [get_InterpolationMode](./get_interpolationmode/)() const | 補間モードを取得/設定します。 |
| [get_PageNumbers](./get_pagenumbers/)() override | 変換するページ番号の配列を取得/設定します。 |
| [get_Resolution](./get_resolution/)() const | 画像解像度を取得/設定します。 |
| [get_SmoothingMode](./get_smoothingmode/)() const | スムージングモードを取得/設定します。 |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | テキストレンダリングヒントを取得/設定します。 |
| [ImageSaveOptions](./imagesaveoptions/)() | オプションの新しいインスタンスを作成します。 |
| [set_BatchSize](./set_batchsize/)(int32_t) override | ノード間で渡すページの一部のサイズを指定します。 |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | 出力画像のサイズ（ピクセル）を取得/設定します。 |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | 補間モードを取得/設定します。 |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | 変換するページ番号の配列を取得/設定します。 |
| [set_Resolution](./set_resolution/)(float) | 画像解像度を取得/設定します。 |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | スムージングモードを取得/設定します。 |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | テキストレンダリングヒントを取得/設定します。 |
## 参照

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
