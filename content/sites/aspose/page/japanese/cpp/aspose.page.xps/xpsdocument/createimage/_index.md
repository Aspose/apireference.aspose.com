---
title: "Aspose::Page::XPS::XpsDocument::CreateImage method"
linktitle: "CreateImage"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateImage メソッド。C++ でストリームから新しい画像リソースを作成します。"
type: docs
weight: 1700
url: /ja/cpp/aspose.page.xps/xpsdocument/createimage/
---
## XpsDocument::CreateImage(System::SharedPtr\<System::IO::Stream\>) method


*stream* から新しい画像リソースを作成します。

```cpp
System::SharedPtr<XpsModel::XpsImage> Aspose::Page::XPS::XpsDocument::CreateImage(System::SharedPtr<System::IO::Stream> stream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | System::SharedPtr\<System::IO::Stream\> | リソースとして使用する画像を含むストリームです。 |

### ReturnValue

新しい画像リソースです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImage(System::String) method


*imagePath* にある画像ファイルから新しい画像リソースを作成します。

```cpp
System::SharedPtr<XpsModel::XpsImage> Aspose::Page::XPS::XpsDocument::CreateImage(System::String imagePath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| imagePath | System::String | リソースとして使用する画像へのパスです。 |

### ReturnValue

新しい画像リソースです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
