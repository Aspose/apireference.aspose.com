---
title: "Метод System::Xml::XmlReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::XmlReader::GetAttribute. При переопределении в производном классе получает значение атрибута с указанным индексом в C++."
type: docs
weight: 2800
url: /ru/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


При переопределении в производном классе получает значение атрибута по указанному индексу.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| i | int32_t | Индекс атрибута. Индекс начинается с нуля. (Первый атрибут имеет индекс 0.) |

### ReturnValue

Значение указанного атрибута. Этот метод не перемещает читатель.

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


При переопределении в производном классе получает значение атрибута с указанным значением [XmlReader::get_Name](../get_name/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Полное имя атрибута. |

### ReturnValue

Значение указанного атрибута. Если атрибут не найден или значение равно [String::Empty](../../../system/string/empty/), возвращается **nullptr**.

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


При переопределении в производном классе получает значение атрибута с указанными значениями [XmlReader::get_LocalName](../get_localname/) и [XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Локальное имя атрибута. |
| namespaceURI | String | URI пространства имён атрибута. |

### ReturnValue

Значение указанного атрибута. Если атрибут не найден или значение равно [String::Empty](../../../system/string/empty/), возвращается **nullptr**. Этот метод не перемещает читатель.

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
