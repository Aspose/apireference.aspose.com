---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope méthode"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope méthode. Retourne une collection de noms de namespace indexés par préfixe qui peut être utilisée pour énumérer les namespaces actuellement en portée en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


Renvoie une collection de noms d'espaces de noms indexés par préfixe qui peut être utilisée pour énumérer les espaces de noms actuellement en portée.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| portée | XmlNamespaceScope | Une valeur d’énumération qui spécifie le type de nœuds de namespace à retourner. |

### ReturnValue

Une collection de paires namespace et préfixe actuellement en portée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
