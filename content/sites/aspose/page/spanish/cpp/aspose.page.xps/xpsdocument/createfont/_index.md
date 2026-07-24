---
title: "Aspose::Page::XPS::XpsDocument::CreateFont method"
linktitle: "CreateFont"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument::CreateFont method. Crea un nuevo recurso de fuente TrueType a partir de un flujo en C++."
type: docs
weight: 1300
url: /es/cpp/aspose.page.xps/xpsdocument/createfont/
---
## XpsDocument::CreateFont(System::SharedPtr\<System::IO::Stream\>) method


Crea un nuevo recurso de fuente **TrueType** a partir de un flujo.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::SharedPtr<System::IO::Stream> stream)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | System::SharedPtr\<System::IO::Stream\> | El flujo que contiene el perfil ICC para usar como recurso. |

### ReturnValue

Nuevo recurso de fuente **TrueType**.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateFont(System::String, System::Drawing::FontStyle) method


Crea un nuevo recurso de fuente **TrueType**.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::String fontFamily, System::Drawing::FontStyle fontStyle)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | System::String | La familia de fuentes. |
| fontStyle | System::Drawing::FontStyle | El estilo de fuente. |

### ReturnValue

Nuevo recurso de fuente **TrueType**.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
