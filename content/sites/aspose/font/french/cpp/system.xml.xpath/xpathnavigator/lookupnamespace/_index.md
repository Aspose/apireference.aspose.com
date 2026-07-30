---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace méthode"
linktitle: "LookupNamespace"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace méthode. Retourne l'URI d'espace de noms pour le préfixe spécifié en C++."
type: docs
weight: 4700
url: /fr/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


Renvoie l'URI de l'espace de noms pour le préfixe spécifié.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prefix | const String\& | Le préfixe dont vous souhaitez résoudre l'URI d'espace de noms. Pour correspondre à l'espace de noms par défaut, passez [String::Empty](../../../system/string/empty/). |

### ReturnValue

Une [String](../../../system/string/) qui contient l'URI d'espace de noms attribué au préfixe d'espace de noms spécifié ; **nullptr** si aucun URI d'espace de noms n'est attribué au préfixe spécifié. La [String](../../../system/string/) retournée est atomisée.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
