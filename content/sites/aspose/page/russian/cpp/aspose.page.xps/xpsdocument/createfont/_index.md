---
title: "Aspose::Page::XPS::XpsDocument::CreateFont method"
linktitle: "CreateFont"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::CreateFont method. Создаёт новый ресурс шрифта TrueType из потока в C++."
type: docs
weight: 1300
url: /ru/cpp/aspose.page.xps/xpsdocument/createfont/
---
## XpsDocument::CreateFont(System::SharedPtr\<System::IO::Stream\>) method


Создаёт новый ресурс шрифта **TrueType** из потока.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::SharedPtr<System::IO::Stream> stream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | System::SharedPtr\<System::IO::Stream\> | Поток, содержащий ICC‑профиль, который будет использоваться как ресурс. |

### ReturnValue

Новый ресурс шрифта **TrueType**.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateFont(System::String, System::Drawing::FontStyle) method


Создаёт новый ресурс шрифта **TrueType**.

```cpp
System::SharedPtr<XpsModel::XpsFont> Aspose::Page::XPS::XpsDocument::CreateFont(System::String fontFamily, System::Drawing::FontStyle fontStyle)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | System::String | Семейство шрифта. |
| fontStyle | System::Drawing::FontStyle | Стиль шрифта. |

### ReturnValue

Новый ресурс шрифта **TrueType**.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
