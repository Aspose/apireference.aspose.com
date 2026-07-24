---
title: "System::Xml::XmlReader::MoveToAttribute метод"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlReader::MoveToAttribute метод. При переопределении в производном классе перемещается к атрибуту с указанным индексом в C++."
type: docs
weight: 3200
url: /ru/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


При переопределении в производном классе переходит к атрибуту по указанному индексу.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| i | int32_t | Индекс атрибута. |

## См. также

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


При переопределении в производном классе перемещается к атрибуту с указанным значением [XmlReader::get_Name](../get_name/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Полное имя атрибута. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


При переопределении в производном классе перемещается к атрибуту с указанными значениями [XmlReader::get_LocalName](../get_localname/) и [XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Локальное имя атрибута. |
| ns | String | URI пространства имён атрибута. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
