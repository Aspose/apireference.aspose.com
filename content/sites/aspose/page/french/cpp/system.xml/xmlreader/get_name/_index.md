---
title: "System::Xml::XmlReader::get_Name méthode"
linktitle: "get_Name"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlReader::get_Name méthode. Lorsqu'elle est remplacée dans une classe dérivée, obtient le nom qualifié du nœud actuel en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


Lorsqu'il est remplacé dans une classe dérivée, obtient le nom qualifié du nœud actuel.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

Le nom qualifié du nœud actuel. Par exemple, **Name** est **bk:book** pour l'élément **<bk:book>**.
## Remarques



Le nom renvoyé dépend de la valeur [XmlReader::get_NodeType](../get_nodetype/) du nœud. Les types de nœuds suivants renvoient les valeurs indiquées. Tous les autres types de nœuds renvoient une chaîne vide. |||
|-|-|
| Type de nœud | Nom |
| Attribute | Le nom de l'attribut. |
| DocumentType | Le nom du type de document. |
| Element | Le nom de la balise. |
| EntityReference | Le nom de l'entité référencée. |
| ProcessingInstruction | La cible de l'instruction de traitement. |
| XmlDeclaration | La chaîne littérale xml. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
