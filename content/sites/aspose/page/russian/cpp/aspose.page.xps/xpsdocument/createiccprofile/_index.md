---
title: "Метод Aspose::Page::XPS::XpsDocument::CreateIccProfile"
linktitle: "CreateIccProfile"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::CreateIccProfile метод. Создает новый ресурс ICC‑профиля из потока в C++."
type: docs
weight: 1600
url: /ru/cpp/aspose.page.xps/xpsdocument/createiccprofile/
---
## XpsDocument::CreateIccProfile(System::SharedPtr\<System::IO::Stream\>) method


Создаёт новый ресурс ICC‑профиля из *stream* .

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::SharedPtr<System::IO::Stream> stream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | System::SharedPtr\<System::IO::Stream\> | Поток, содержащий ICC‑профиль, который будет использоваться как ресурс. |

### ReturnValue

Новый ресурс ICC‑профиля.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateIccProfile(System::String) method


Создаёт новый ресурс ICC‑профиля из файла ICC‑профиля, расположенного по пути *iccProfilePath* .

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::String iccProfilePath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| iccProfilePath | System::String | Путь к ICC‑профилю, который будет использоваться как ресурс. |

### ReturnValue

Новый ресурс ICC‑профиля.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
