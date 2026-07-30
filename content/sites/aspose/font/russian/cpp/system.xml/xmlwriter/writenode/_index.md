---
title: "метод System::Xml::XmlWriter::WriteNode"
linktitle: "WriteNode"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlWriter::WriteNode. При переопределении в производном классе копирует всё из читателя в писатель и перемещает читатель к началу следующего соседнего узла в C++."
type: docs
weight: 2600
url: /ru/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


При переопределении в производном классе, копирует всё из читателя в писатель и перемещает читателя к началу следующего соседа.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | Экземпляр [XmlReader](../../xmlreader/) для чтения. |
| defattr | bool | **true** — копировать атрибуты по умолчанию из [XmlReader](../../xmlreader/); иначе **false**. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


Копирует всё из объекта XPathNavigator в писатель. Позиция XPathNavigator остаётся неизменной.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| navigator | SharedPtr\<XPath::XPathNavigator\> | XPathNavigator для копирования. |
| defattr | bool | **true** чтобы скопировать атрибуты по умолчанию; иначе, **false**. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
