---
title: Aspose::Page::XPS::XpsDocument::CreateFont method
linktitle: CreateFont
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::CreateFont method. Creates a new TrueType font resource out of stream in C++.'
type: docs
weight: 1300
url: /cpp/aspose.page.xps/xpsdocument/createfont/
---
## XpsDocument::CreateFont(System::SharedPtr\<System::IO::Stream\>) method


Creates a new **TrueType** font resource out of stream.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | Description |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | The stream containing the ICC profile to take as a resource. |

### ReturnValue

New **TrueType** font resource.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateFont(System::String, System::Drawing::FontStyle) method


Creates a new **TrueType** font resource.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::String fontFamily, System::Drawing::FontStyle fontStyle)
```


| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | System::String | The font family. |
| fontStyle | System::Drawing::FontStyle | The font style. |

### ReturnValue

New **TrueType** font resource.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
