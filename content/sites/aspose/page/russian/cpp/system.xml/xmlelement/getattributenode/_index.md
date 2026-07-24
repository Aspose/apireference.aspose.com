---
title: "метод System::Xml::XmlElement::GetAttributeNode"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::XmlElement::GetAttributeNode. Возвращает XmlAttribute с указанным локальным именем и URI пространства имён в C++."
type: docs
weight: 1400
url: /ru/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Возвращает [XmlAttribute](../../xmlattribute/) с указанным локальным именем и URI пространства имён.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| localName | String | Локальное имя атрибута. |
| namespaceURI | String | URI пространства имён атрибута. |

### ReturnValue

Указанный [XmlAttribute](../../xmlattribute/) или **nullptr**, если соответствующий атрибут не найден.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Возвращает [XmlAttribute](../../xmlattribute/) с указанным именем.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Имя атрибута, который нужно получить. Это квалифицированное имя. Оно сравнивается со значением **get_Name** соответствующего узла. |

### ReturnValue

Указанный [XmlAttribute](../../xmlattribute/) или **nullptr**, если соответствующий атрибут не найден.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
