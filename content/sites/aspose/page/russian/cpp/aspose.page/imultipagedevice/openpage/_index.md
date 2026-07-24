---
title: "Aspose::Page::IMultiPageDevice::OpenPage метод"
linktitle: "OpenPage"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage метод. Выполняет необходимую подготовку устройства перед рендерингом каждой страницы в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Выполняет необходимую подготовку устройства перед рендерингом каждой страницы.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | Ширина страницы. |
| высота | float | Высота страницы. |

### ReturnValue

Возвращает true, если открытая страница имеет номер, попадающий в диапазон выбранных номеров страниц, и false в противном случае.

## См. также

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Выполняет необходимую подготовку устройства перед рендерингом страницы.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| title | System::String | Заголовок страницы. |

### ReturnValue

True, если страница находится в запрошенном диапазоне, иначе false. Используется в устройствах, которые могут рендерить указанный массив номеров страниц.

## См. также

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
