---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes メソッド"
linktitle: "SaveAsImageBytes"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes メソッド。C++ でドキュメントをビットマップ画像形式のバイト配列として保存します。"
type: docs
weight: 5600
url: /ja/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


ドキュメントをビットマップ画像形式でバイト配列として保存します。

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | ビットマップ画像形式でドキュメントを保存するためのオプションです。 |

### ReturnValue

結果として得られる画像のバイト配列です。最初の次元は内部ドキュメント用、2番目の次元は内部ドキュメント内のページ用です。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
