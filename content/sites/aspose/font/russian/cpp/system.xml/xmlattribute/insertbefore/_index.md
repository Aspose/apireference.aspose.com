---
title: "System::Xml::XmlAttribute::InsertBefore метод"
linktitle: "InsertBefore"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlAttribute::InsertBefore метод. Вставляет указанный узел непосредственно перед указанным узлом‑ссылкой в C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml/xmlattribute/insertbefore/
---
## XmlAttribute::InsertBefore method


Вставляет указанный узел непосредственно перед указанным узлом‑ссылкой.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertBefore(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Узел [XmlNode](../../xmlnode/) для вставки. |
| refChild | SharedPtr\<XmlNode\> | Узел [XmlNode](../../xmlnode/), который является узлом‑ссылкой. **newChild** размещается перед этим узлом. |

### ReturnValue

Вставленный узел [XmlNode](../../xmlnode/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
