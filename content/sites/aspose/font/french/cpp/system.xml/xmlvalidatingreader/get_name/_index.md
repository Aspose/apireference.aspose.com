---
title: "System::Xml::XmlValidatingReader::get_Name méthode"
linktitle: "get_Name"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlValidatingReader::get_Name méthode. Renvoie le nom qualifié du nœud actuel en C++."
type: docs
weight: 1700
url: /fr/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Renvoie le nom qualifié du nœud actuel.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

Le nom qualifié du nœud actuel. Par exemple, **Name** est **bk:book** pour l'élément **<bk:book>**.
## Remarques



Le nom renvoyé dépend du XmlValidatingReader::NodeType du nœud. Les types de nœuds suivants renvoient les valeurs indiquées. Tous les autres types de nœuds renvoient une chaîne vide. |||
|-|-|
| Type de nœud | Nom |
| Attribut | Le nom de l'attribut. |
| Type de document | Le nom du type de document. |
| Élément | Le nom de la balise. |
| Référence d'entité | Le nom de l'entité référencée. |
| Instruction de traitement | La cible de l'instruction de traitement. |
| XmlDeclaration | La chaîne littérale xml. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
