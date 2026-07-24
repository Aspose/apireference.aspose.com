---
title: "Aspose::Page::XPS::XpsDocument::CreateFont methode"
linktitle: "CreateFont"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsDocument::CreateFont methode. Maakt een nieuwe **TrueType**‑lettertypebron aan vanuit een stream in C++."
type: docs
weight: 1300
url: /nl/cpp/aspose.page.xps/xpsdocument/createfont/
---
## XpsDocument::CreateFont(System::SharedPtr\<System::IO::Stream\>) method


Maakt een nieuw **TrueType** lettertype-resource aan vanuit een stream.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | De stream die het ICC-profiel bevat dat als resource moet worden genomen. |

### ReturnValue

Nieuwe **TrueType**‑lettertypebron.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateFont(System::String, System::Drawing::FontStyle) method


Maakt een nieuw **TrueType** lettertype-resource aan.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::String fontFamily, System::Drawing::FontStyle fontStyle)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontFamily | System::String | De lettertypefamilie. |
| fontStyle | System::Drawing::FontStyle | De lettertype‑stijl. |

### ReturnValue

Nieuwe **TrueType**‑lettertypebron.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
