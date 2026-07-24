---
title: "Aspose::Page::XPS::XpsDocument::CreateFont method"
linktitle: "CreateFont"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreateFont 方法。在 C++ 中从流创建新的 TrueType 字体资源。"
type: docs
weight: 1300
url: /zh/cpp/aspose.page.xps/xpsdocument/createfont/
---
## XpsDocument::CreateFont(System::SharedPtr\<System::IO::Stream\>) method


从流创建一个新的 **TrueType** 字体资源。

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | System::SharedPtr\<System::IO::Stream\> | 包含 ICC 配置文件以用作资源的流。 |

### ReturnValue

新的 **TrueType** 字体资源。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateFont(System::String, System::Drawing::FontStyle) method


创建一个新的 **TrueType** 字体资源。

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::String fontFamily, System::Drawing::FontStyle fontStyle)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| fontFamily | System::String | 字体族。 |
| fontStyle | System::Drawing::FontStyle | 字体样式。 |

### ReturnValue

新的 **TrueType** 字体资源。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
