---
title: "Метод System::Xml::XmlAttributeCollection::InsertBefore"
linktitle: "InsertBefore"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::XmlAttributeCollection::InsertBefore. Вставляет указанный атрибут непосредственно перед указанным ссылочным атрибутом в C++."
type: docs
weight: 500
url: /ru/cpp/system.xml/xmlattributecollection/insertbefore/
---
## XmlAttributeCollection::InsertBefore method


Вставляет указанный атрибут сразу перед указанным атрибутом‑ссылкой.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::InsertBefore(const SharedPtr<XmlAttribute> &newNode, const SharedPtr<XmlAttribute> &refNode)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| newNode | const SharedPtr\<XmlAttribute\>\& | Атрибут для вставки. |
| refNode | const SharedPtr\<XmlAttribute\>\& | Ссылочный атрибут. **newNode** размещается перед **refNode**. |

### ReturnValue

Элемент [XmlAttribute](../../xmlattribute/) для вставки в коллекцию.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
