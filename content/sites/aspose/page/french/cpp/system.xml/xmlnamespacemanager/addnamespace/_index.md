---
title: "Méthode System::Xml::XmlNamespaceManager::AddNamespace"
linktitle: "AddNamespace"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlNamespaceManager::AddNamespace. Ajoute l'espace de noms fourni à la collection en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Ajoute l'espace de noms donné à la collection.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prefix | String | Le préfixe à associer à l'espace de noms ajouté. Utilisez [String::Empty](../../../system/string/empty/) pour ajouter un espace de noms par défaut. Si le [XmlNamespaceManager](../) doit être utilisé pour résoudre les espaces de noms dans une expression de langage de chemin XML ([XPath](../../../system.xml.xpath/)), un préfixe doit être spécifié. Si une expression [XPath](../../../system.xml.xpath/) n'inclut pas de préfixe, on suppose que l'Uniform Resource Identifier (URI) de l'espace de noms est l'espace de noms vide. Pour plus d'informations sur les expressions [XPath](../../../system.xml.xpath/) et le [XmlNamespaceManager](../), consultez les méthodes XmlNode::SelectNodes(String) et XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) methods. |
| uri | String | L'espace de noms à ajouter. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
