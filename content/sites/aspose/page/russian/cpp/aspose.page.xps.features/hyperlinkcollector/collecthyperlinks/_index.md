---
title: "Метод Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks"
linktitle: "CollectHyperlinks"
second_title: "Aspose.Page для C++"
description: "Метод Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks. Собирает элементы XPS с гиперссылками всех типов в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page.xps.features/hyperlinkcollector/collecthyperlinks/
---
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


Собирает элементы [XPS](../../../aspose.page.xps/) с гиперссылками всех типов.

```cpp
static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | Документ [XPS](../../../aspose.page.xps/). |

### ReturnValue

Коллекция, содержащая гиперссылочные элементы [XPS](../../../aspose.page.xps/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


Собирает элементы [XPS](../../../aspose.page.xps/) с гиперссылками определённого типа.

```cpp
template<typename T> static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| Параметр | Описание |
| --- | --- |
| T | Тип целевого объекта гиперссылки. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | Документ [XPS](../../../aspose.page.xps/). |

### ReturnValue

Коллекция, содержащая гиперссылочные элементы [XPS](../../../aspose.page.xps/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
