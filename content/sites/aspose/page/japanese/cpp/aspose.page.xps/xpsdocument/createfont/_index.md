---
title: "Aspose::Page::XPS::XpsDocument::CreateFont method"
linktitle: "CreateFont"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateFont メソッド。C++ でストリームから新しい TrueType フォントリソースを作成します。"
type: docs
weight: 1300
url: /ja/cpp/aspose.page.xps/xpsdocument/createfont/
---
## XpsDocument::CreateFont(System::SharedPtr\<System::IO::Stream\>) method


ストリームから新しい **TrueType** フォントリソースを作成します。

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::SharedPtr<System::IO::Stream> stream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | System::SharedPtr\<System::IO::Stream\> | リソースとして使用する ICC プロファイルを含むストリームです。 |

### ReturnValue

新しい **TrueType** フォントリソースです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateFont(System::String, System::Drawing::FontStyle) method


**TrueType** フォントリソースを新規作成します。

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::String fontFamily, System::Drawing::FontStyle fontStyle)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fontFamily | System::String | フォントファミリーです。 |
| fontStyle | System::Drawing::FontStyle | フォントスタイルです。 |

### ReturnValue

新しい **TrueType** フォントリソースです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
