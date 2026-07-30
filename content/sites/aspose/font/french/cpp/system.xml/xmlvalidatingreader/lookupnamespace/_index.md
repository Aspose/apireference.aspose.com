---
title: "System::Xml::XmlValidatingReader::LookupNamespace méthode"
linktitle: "LookupNamespace"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlValidatingReader::LookupNamespace méthode. Résout un préfixe d'espace de noms dans la portée de l'élément actuel en C++."
type: docs
weight: 3400
url: /fr/cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


Résout un préfixe d'espace de noms dans la portée de l'élément actuel.

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| préfixe | const String\& | Le préfixe dont vous souhaitez résoudre l'identificateur uniforme de ressource (URI) de l'espace de noms. Pour correspondre à l'espace de noms par défaut, transmettez une chaîne vide. |

### ReturnValue

L'URI d'espace de noms vers lequel le préfixe se mappe ou **nullptr** si aucun préfixe correspondant n'est trouvé.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
