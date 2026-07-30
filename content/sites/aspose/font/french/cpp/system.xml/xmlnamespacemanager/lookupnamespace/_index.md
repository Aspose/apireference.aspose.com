---
title: "System::Xml::XmlNamespaceManager::LookupNamespace méthode"
linktitle: "LookupNamespace"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlNamespaceManager::LookupNamespace. Retourne l'URI d'espace de noms pour le préfixe spécifié en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Renvoie l'URI de l'espace de noms pour le préfixe spécifié.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prefix | const String\& | Le préfixe dont vous souhaitez résoudre l'URI d'espace de noms. Pour correspondre à l'espace de noms par défaut, passez [String::Empty](../../../system/string/empty/). |

### ReturnValue

L'URI d'espace de noms pour **prefix** ou **nullptr** s'il n'existe aucun espace de noms mappé. La chaîne retournée est atomisée. Pour plus d'informations sur les chaînes atomisées, consultez la classe [XmlNameTable](../../xmlnametable/).

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
