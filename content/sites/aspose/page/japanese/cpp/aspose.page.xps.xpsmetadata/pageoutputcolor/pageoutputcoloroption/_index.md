---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption クラス"
linktitle: "PageOutputColorOption"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption クラス。C++ で PageOutputColor 機能オプションを説明します。"
type: docs
weight: 400
url: /ja/cpp/aspose.page.xps.xpsmetadata/pageoutputcolor/pageoutputcoloroption/
---
## PageOutputColorOption class


[PageOutputColor](../) 機能オプションを説明します。

```cpp
class PageOutputColorOption : public Aspose::Page::XPS::XpsMetadata::Option,
                              public Aspose::Page::XPS::XpsMetadata::PageOutputColor::IPageOutputColorItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | オプションに [IPageOutputColorOptionItem](../ipageoutputcoloroptionitem/) インスタンスの配列を追加します。 |
| static [Color](./color/)(int32_t, int32_t) | 出力はカラーであることを指定します。 |
| static [Grayscale](./grayscale/)(int32_t, int32_t) | 出力はグレースケールであることを指定します。 |
| static [Monochrome](./monochrome/)(int32_t, int32_t) | 出力はモノクローム（Black）であることを指定します。 |
| [PageOutputColorOption](./pageoutputcoloroption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Option](../../option/)
* Class [IPageOutputColorItem](../ipageoutputcoloritem/)
* Class [PageOutputColor](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
