---
title: "System::Xml::XmlNode::SelectSingleNode méthode"
linktitle: "SélectionnerNœudUnique"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNode::SelectSingleNode méthode. Sélectionne le premier XmlNode qui correspond à l’expression XPath en C++."
type: docs
weight: 3900
url: /fr/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


Sélectionne le premier [XmlNode](../) qui correspond à l’expression [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | const String\& | L’expression [XPath](../../../system.xml.xpath/). |

### ReturnValue

Le premier [XmlNode](../) qui correspond à la requête [XPath](../../../system.xml.xpath/) ou **nullptr** si aucun nœud correspondant n’est trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Sélectionne le premier [XmlNode](../) qui correspond à l’expression [XPath](../../../system.xml.xpath/). Tous les préfixes trouvés dans l’expression [XPath](../../../system.xml.xpath/) sont résolus à l’aide du [XmlNamespaceManager](../../xmlnamespacemanager/) fourni.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | const String\& | L’expression [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Un [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour résoudre les espaces de noms des préfixes dans l’expression [XPath](../../../system.xml.xpath/). |

### ReturnValue

Le premier [XmlNode](../) qui correspond à la requête [XPath](../../../system.xml.xpath/) ou **nullptr** si aucun nœud correspondant n’est trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
