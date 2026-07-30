---
title: "Méthode System::Xml::XmlNode::SelectNodes"
linktitle: "SelectNodes"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlNode::SelectNodes. Sélectionne une liste de nœuds correspondant à l'expression XPath en C++."
type: docs
weight: 3800
url: /fr/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


Sélectionne une liste de nœuds correspondant à l'expression [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | const String\& | L’expression [XPath](../../../system.xml.xpath/). |

### ReturnValue

Une [XmlNodeList](../../xmlnodelist/) contenant une collection de nœuds correspondant à la requête [XPath](../../../system.xml.xpath/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Sélectionne une liste de nœuds correspondant à l'expression [XPath](../../../system.xml.xpath/). Tous les préfixes trouvés dans l'expression [XPath](../../../system.xml.xpath/) sont résolus à l'aide du [XmlNamespaceManager](../../xmlnamespacemanager/) fourni.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | const String\& | L’expression [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Un [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour résoudre les espaces de noms des préfixes dans l’expression [XPath](../../../system.xml.xpath/). |

### ReturnValue

Une [XmlNodeList](../../xmlnodelist/) contenant une collection de nœuds correspondant à la requête [XPath](../../../system.xml.xpath/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
