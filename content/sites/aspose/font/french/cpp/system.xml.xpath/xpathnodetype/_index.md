---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNodeType enum. Définit les types de nœuds XPath qui peuvent être renvoyés par la classe XPathNavigator en C++."
type: docs
weight: 1100
url: /fr/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Définit les types de nœuds [XPath](../) qui peuvent être renvoyés par la classe [XPathNavigator](../xpathnavigator/).

```cpp
enum class XPathNodeType
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Racine | 0 | Le nœud racine du document XML ou de l'arbre de nœuds. |
| Élément | 1 | Un élément, tel que **<element>**. |
| Attribut | 2 | Un attribut, tel que **id='123'**. |
| Espace de noms | 3 | Un espace de noms, tel que **xmlns=\"namespace\"**. |
| Text | 4 | Le contenu texte d'un nœud. Équivalent au modèle Document [Object](../../system/object/) (DOM) [Text](../../system.text/) et aux types de nœuds CDATA. Contient au moins un caractère. |
| Espacement significatif | 5 | Un nœud contenant des caractères d'espace blanc et **xml:space** défini sur **preserve**. |
| Espacement | 6 | Un nœud ne contenant que des caractères d'espace blanc et aucun espace blanc significatif. Les caractères d'espace blanc sont **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Une instruction de traitement, telle que **<?pi test?>**. Cela n'inclut pas les déclarations XML, qui ne sont pas visibles pour la classe [XPathNavigator](../xpathnavigator/). |
| Commentaire | 8 | Un commentaire, tel que ****. |
| All | 9 | L'un des types de nœud [XPathNodeType](./). |

## Voir aussi

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
