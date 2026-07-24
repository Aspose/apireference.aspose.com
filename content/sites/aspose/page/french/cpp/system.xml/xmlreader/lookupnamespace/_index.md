---
title: "System::Xml::XmlReader::LookupNamespace méthode"
linktitle: "LookupNamespace"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlReader::LookupNamespace méthode. Lorsqu'elle est remplacée dans une classe dérivée, résout un préfixe d'espace de noms dans la portée de l'élément actuel en C++."
type: docs
weight: 3100
url: /fr/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


Lorsqu'il est remplacé dans une classe dérivée, résout un préfixe d'espace de noms dans la portée de l'élément actuel.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| préfixe | const String\& | Le préfixe dont vous souhaitez résoudre l'URI d'espace de noms. Pour correspondre à l'espace de noms par défaut, transmettez une chaîne vide. |

### ReturnValue

L'URI d'espace de noms auquel le préfixe correspond ou **nullptr** si aucun préfixe correspondant n'est trouvé.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
