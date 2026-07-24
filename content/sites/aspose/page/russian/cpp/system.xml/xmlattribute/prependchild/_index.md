---
title: "System::Xml::XmlAttribute::PrependChild method"
linktitle: "PrependChild"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlAttribute::PrependChild method. Добавляет указанный узел в начало списка дочерних узлов этого узла в C++."
type: docs
weight: 1600
url: /ru/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Добавляет указанный узел в начало списка дочерних узлов этого узла.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | [XmlNode](../../xmlnode/) для добавления. Если это [XmlDocumentFragment](../../xmldocumentfragment/), всё содержимое фрагмента документа перемещается в список дочерних узлов этого узла. |

### ReturnValue

Добавленный узел [XmlNode](../../xmlnode/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
