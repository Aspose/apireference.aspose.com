---
title: "System::Xml::XmlNodeReader::LookupNamespace méthode"
linktitle: "LookupNamespace"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNodeReader::LookupNamespace méthode. Résout un préfixe d'espace de noms dans la portée de l'élément actuel en C++."
type: docs
weight: 2500
url: /fr/cpp/system.xml/xmlnodereader/lookupnamespace/
---
## XmlNodeReader::LookupNamespace method


Résout un préfixe d'espace de noms dans la portée de l'élément actuel.

```cpp
String System::Xml::XmlNodeReader::LookupNamespace(const String &prefix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| préfixe | const String\& | Le préfixe dont vous souhaitez résoudre l'URI d'espace de noms. Pour correspondre à l'espace de noms par défaut, passez une chaîne vide. Cette chaîne n'a pas besoin d'être atomisée. |

### ReturnValue

L'URI d'espace de noms vers lequel le préfixe se mappe ou **nullptr** si aucun préfixe correspondant n'est trouvé.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
