---
title: "System::Xml::XmlTextReader::ReadAttributeValue méthode"
linktitle: "LireValeurAttribut"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlTextReader::ReadAttributeValue méthode. Analyse la valeur de l'attribut en un ou plusieurs nœuds Text, EntityReference ou EndEntity en C++."
type: docs
weight: 4300
url: /fr/cpp/system.xml/xmltextreader/readattributevalue/
---
## XmlTextReader::ReadAttributeValue method


Analyse la valeur d'attribut en un ou plusieurs nœuds **[Text](../../../system.text/)**, **EntityReference**, ou **EndEntity**.

```cpp
bool System::Xml::XmlTextReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Voir aussi

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
