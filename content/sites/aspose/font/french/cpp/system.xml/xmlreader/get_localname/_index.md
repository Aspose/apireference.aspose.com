---
title: "Méthode System::Xml::XmlReader::get_LocalName"
linktitle: "get_LocalName"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::get_LocalName. Lorsqu'elle est remplacée dans une classe dérivée, récupère le nom local du nœud actuel en C++."
type: docs
weight: 1400
url: /fr/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


Lorsqu'il est remplacé dans une classe dérivée, obtient le nom local du nœud actuel.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

Le nom du nœud actuel sans le préfixe. Par exemple, **LocalName** est **book** pour l'élément **<bk:book>**. Pour les types de nœuds qui n'ont pas de nom (comme **[Text](../../../system.text/)**, **Comment**, etc.), cette méthode renvoie [String::Empty](../../../system/string/empty/).

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
