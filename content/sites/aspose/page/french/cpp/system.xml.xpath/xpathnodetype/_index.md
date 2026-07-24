---
title: "enum System::Xml::XPath::XPathNodeType"
linktitle: "XPathNodeType"
second_title: "Aspose.Page pour C++"
description: "enum System::Xml::XPath::XPathNodeType. Définit les types de nœuds XPath qui peuvent être retournés par la classe XPathNavigator en C++."
type: docs
weight: 1100
url: /fr/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Définit les types de nœuds [XPath](../) qui peuvent être retournés par la classe [XPathNavigator](../xpathnavigator/).

```cpp
enum class XPathNodeType
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Racine | 0 | Le nœud racine du document XML ou de l'arbre de nœuds. |
| Element | 1 | Un élément, tel que **<element>**. |
| Attribute | 2 | Un attribut, tel que **id='123'**. |
| Espace de noms | 3 | Un espace de noms, tel que **xmlns=\"namespace\"**. |
| Text | 4 | Le contenu texte d'un nœud. Équivalent au modèle d'objet Document [Object](../../system/object/) (DOM) [Text](../../system.text/) et aux types de nœuds CDATA. Contient au moins un caractère. |
| SignificantWhitespace | 5 | Un nœud contenant des caractères d'espace blanc et **xml:space** défini sur **preserve**. |
| Espace blanc | 6 | Un nœud contenant uniquement des caractères d'espace blanc et aucun espace blanc significatif. Les caractères d'espace blanc sont **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Une instruction de traitement, telle que **<?pi test?>**. Cela n'inclut pas les déclarations XML, qui ne sont pas visibles par la classe [XPathNavigator](../xpathnavigator/). |
| Comment | 8 | Un commentaire, tel que ****. |
| All | 9 | N'importe lequel des types de nœud [XPathNodeType](./). |

## Voir aussi

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
