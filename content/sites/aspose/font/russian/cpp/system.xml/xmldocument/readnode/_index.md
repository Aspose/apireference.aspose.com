---
title: "System::Xml::XmlDocument::ReadNode метод"
linktitle: "ReadNode"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlDocument::ReadNode метод. Создаёт объект XmlNode на основе информации из XmlReader. Читатель должен быть позиционирован на узле или атрибуте в C++."
type: docs
weight: 3600
url: /ru/cpp/system.xml/xmldocument/readnode/
---
## XmlDocument::ReadNode method


Создаёт объект [XmlNode](../../xmlnode/) на основе информации из [XmlReader](../../xmlreader/). Читатель должен быть позиционирован на узле или атрибуте.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::ReadNode(SharedPtr<XmlReader> reader)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| читалка | SharedPtr\<XmlReader\> | Источник XML. |

### ReturnValue

Новый [XmlNode](../../xmlnode/) или **nullptr**, если больше узлов не существует.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
