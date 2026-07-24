---
title: "Aspose::Page::XPS::XpsDocument::CreateFont method"
linktitle: "CreateFont"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsDocument::CreateFont method. Crée une nouvelle ressource de police TrueType à partir d'un flux en C++."
type: docs
weight: 1300
url: /fr/cpp/aspose.page.xps/xpsdocument/createfont/
---
## XpsDocument::CreateFont(System::SharedPtr\<System::IO::Stream\>) method


Crée une nouvelle ressource de police **TrueType** à partir d'un flux.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::SharedPtr<System::IO::Stream> stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | System::SharedPtr\<System::IO::Stream\> | Le flux contenant le profil ICC à prendre comme ressource. |

### ReturnValue

Nouvelle ressource de police **TrueType**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateFont(System::String, System::Drawing::FontStyle) method


Crée une nouvelle ressource de police **TrueType**.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::String fontFamily, System::Drawing::FontStyle fontStyle)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontFamily | System::String | La famille de police. |
| fontStyle | System::Drawing::FontStyle | Le style de police. |

### ReturnValue

Nouvelle ressource de police **TrueType**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
