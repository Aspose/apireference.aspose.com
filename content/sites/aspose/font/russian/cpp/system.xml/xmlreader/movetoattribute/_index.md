---
title: "Метод System::Xml::XmlReader::MoveToAttribute"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlReader::MoveToAttribute. При переопределении в производном классе перемещается к атрибуту с указанным индексом в C++."
type: docs
weight: 3200
url: /ru/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


При переопределении в производном классе переходит к атрибуту с указанным индексом.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| i | int32_t | Индекс атрибута. |

## См. также

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String) method


При переопределении в производном классе перемещается к атрибуту со значением, полученным через [XmlReader::get_Name](../get_name/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | String | Полное имя атрибута. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


При переопределении в производном классе перемещается к атрибуту с указанными значениями [XmlReader::get_LocalName](../get_localname/) и [XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | String | Локальное имя атрибута. |
| ns | String | URI пространства имён атрибута. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
