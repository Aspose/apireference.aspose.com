---
title: "Méthode System::Xml::XmlReader::ReadAttributeValue"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlReader::ReadAttributeValue. Lorsqu'elle est remplacée dans une classe dérivée, analyse la valeur d'attribut en un ou plusieurs nœuds Text, EntityReference ou EndEntity en C++."
type: docs
weight: 3800
url: /fr/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


Lorsqu'elle est remplacée dans une classe dérivée, analyse la valeur d'attribut en un ou plusieurs nœuds **[Text](../../../system.text/)**, **EntityReference**, ou **EndEntity**.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Voir aussi

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
