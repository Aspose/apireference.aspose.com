---
title: "Méthode System::Xml::XmlTextReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlTextReader::get_Name. Retourne le nom qualifié du nœud actuel en C++."
type: docs
weight: 1900
url: /fr/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Renvoie le nom qualifié du nœud actuel.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

Le nom qualifié du nœud actuel. Par exemple, **Name** est **bk:book** pour l'élément **<bk:book>**.
## Remarques



Le nom retourné dépend de la valeur [XmlTextReader::get_NodeType](../get_nodetype/) du nœud. Les types de nœuds suivants retournent les valeurs indiquées. Tous les autres types de nœuds retournent une chaîne vide. |||
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
