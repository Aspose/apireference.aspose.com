---
title: "Méthode System::Xml::XPath::XPathNavigator::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XPath::XPathNavigator::GetAttribute. Retourne la valeur de l'attribut dont le nom local et l'URI d'espace de noms sont spécifiés en C++."
type: docs
weight: 3800
url: /fr/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


Renvoie la valeur de l'attribut avec le nom local et l'URI d'espace de noms spécifiés.

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'attribut. **localName** est sensible à la casse. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

Une [String](../../../system/string/) qui contient la valeur de l'attribut spécifié ; [String::Empty](../../../system/string/empty/) si aucun attribut correspondant n'est trouvé, ou si le [XPathNavigator](../) n'est pas positionné sur un nœud élément.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
