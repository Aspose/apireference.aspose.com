---
title: "Метод Aspose::Page::XPS::XpsDocument::InsertPage"
linktitle: "InsertPage"
second_title: "Aspose.Page для C++"
description: "Метод Aspose::Page::XPS::XpsDocument::InsertPage. Вставляет пустую страницу в документ с размером страницы по умолчанию в позиции индекса в C++."
type: docs
weight: 4500
url: /ru/cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


Вставляет пустую страницу в документ с размером страницы по умолчанию в позицию *index* .

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int32_t | Позиция, в которой должна быть вставлена страница. |
| активировать | bool | Флаг, указывающий, следует ли выбрать вставленную страницу как активную. |

### ReturnValue

Вставленная страница.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


Вставляет пустую страницу в документ с указанными *width* и *height* в позицию *index* .

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int32_t | Позиция, в которой должна быть вставлена страница. |
| ширина | float | Ширина новой страницы. |
| высота | float | Высота новой страницы. |
| активировать | bool | Флаг, указывающий, следует ли выбрать вставленную страницу как активную. |

### ReturnValue

Вставленная страница.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


Вставляет страницу в документ в позицию *index* .

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int32_t | Позиция, в которой должна быть добавлена страница. |
| page | System::SharedPtr\<XpsModel::XpsPage\> | [Page](../../../aspose.page/) для вставки. |
| активировать | bool | Флаг, указывающий, следует ли выбрать вставленную страницу как активную. |

### ReturnValue

Вставленная страница.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
