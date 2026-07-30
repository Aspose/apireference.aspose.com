---
title: "System::Xml::XmlTextReader::GetNamespacesInScope méthode"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope méthode. Retourne une collection qui contient tous les espaces de noms actuellement en portée en C++."
type: docs
weight: 3400
url: /fr/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


Renvoie une collection qui contient tous les espaces de noms actuellement en portée.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| scope | XmlNamespaceScope | Une valeur [XmlNamespaceScope](../../xmlnamespacescope/) qui spécifie le type de nœuds d'espace de noms à retourner. |

### ReturnValue

Un objet IDictionary qui contient tous les espaces de noms actuellement en portée. Si le lecteur n'est pas positionné sur un élément, un dictionnaire vide (aucun espace de noms) est renvoyé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
