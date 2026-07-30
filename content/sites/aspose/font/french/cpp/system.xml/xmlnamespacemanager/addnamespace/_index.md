---
title: "System::Xml::XmlNamespaceManager::AddNamespace méthode"
linktitle: "AjouterEspaceDeNoms"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace méthode. Ajoute le namespace fourni à la collection en C++."
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
| prefix | String | Le préfixe à associer au namespace ajouté. Utilisez [String::Empty](../../../system/string/empty/) pour ajouter un namespace par défaut. Si le [XmlNamespaceManager](../) doit être utilisé pour résoudre les namespaces dans une expression de langage de chemin XML ([XPath](../../../system.xml.xpath/)), un préfixe doit être spécifié. Si une expression [XPath](../../../system.xml.xpath/) n’inclut pas de préfixe, il est supposé que l’identifiant de ressource uniforme (URI) du namespace est le namespace vide. Pour plus d’informations sur les expressions [XPath](../../../system.xml.xpath/) et le [XmlNamespaceManager](../), reportez‑vous aux méthodes XmlNode::SelectNodes(String) et XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>). |
| uri | String | Le namespace à ajouter. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
