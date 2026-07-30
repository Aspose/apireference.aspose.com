---
title: "System::Xml::XmlElement::GetAttribute метод"
linktitle: "GetAttribute"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlElement::GetAttribute метод. Возвращает значение атрибута с указанным локальным именем и URI пространства имён в C++."
type: docs
weight: 1300
url: /ru/cpp/system.xml/xmlelement/getattribute/
---
## XmlElement::GetAttribute(String, String) method


Возвращает значение атрибута с указанным локальным именем и URI пространства имён.

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String localName, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| localName | String | Локальное имя атрибута для получения. |
| namespaceURI | String | URI пространства имён атрибута для получения. |

### ReturnValue

Значение указанного атрибута. Пустая строка возвращается, если соответствующий атрибут не найден или если у атрибута нет указанного или значения по умолчанию.

## См. также

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttribute(String) method


Возвращает значение атрибута с указанным именем.

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | String | Имя атрибута для получения. Это квалифицированное имя. Оно сравнивается со значением **get_Name** соответствующего узла. |

### ReturnValue

Значение указанного атрибута. Пустая строка возвращается, если соответствующий атрибут не найден или если у атрибута нет указанного или значения по умолчанию.

## См. также

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
