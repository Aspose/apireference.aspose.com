---
title: "System::Xml::XmlNodeType énum"
linktitle: "XmlNodeType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNodeType enum. Spécifie le type de nœud en C++."
type: docs
weight: 6200
url: /fr/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Spécifie le type de nœud.

```cpp
enum class XmlNodeType
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| None | 0 | Ceci est renvoyé par le [XmlReader](../xmlreader/) si la méthode **Read** n'a pas été appelée. |
| Élément | 1 | Un élément (par exemple, **<item>**). |
| Attribut | 2 | Un attribut (par exemple, **id='123'**). |
| Text | 3 | Le contenu texte d'un nœud. Un nœud [XmlNodeType::Text](./) ne peut pas avoir de nœuds enfants. Il peut apparaître comme nœud enfant des nœuds [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./) et [XmlNodeType::EntityReference](./) nodes. |
| CDATA | 4 | Une section CDATA (par exemple, **my escaped text**). |
| Référence d'entité | 5 | Une référence à une entité (par exemple, **&num;**). |
| Entité | 6 | Une déclaration d'entité (par exemple, **<!ENTITY...>**). |
| Instruction de traitement | 7 | Une instruction de traitement (par exemple, **<?pi test?>**). |
| Commentaire | 8 | Un commentaire (par exemple, ****). |
| Document | 9 | Un objet document qui, en tant que racine de l'arbre du document, donne accès à l'ensemble du document XML. |
| Type de document | 10 | La déclaration de type de document, indiquée par la balise suivante (par exemple, **<!DOCTYPE...>**). |
| Fragment de document | 11 | Un fragment de document. |
| Notation | 12 | Une notation dans la déclaration de type de document (par exemple, **<!NOTATION...>**). |
| Espacement | 13 | Espace blanc entre les balises. |
| Espacement significatif | 14 | Espace blanc entre les balises dans un modèle de contenu mixte ou espace blanc à l'intérieur de la portée **xml:space=\"preserve\"**. |
| Fin d'élément | 15 | Une balise de fin d'élément (par exemple, ****). |
| EndEntity | 16 | Renvoyé lorsque [XmlReader](../xmlreader/) atteint la fin du remplacement d'entité à la suite d'un appel à [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | La déclaration XML (par exemple, **<?xml version='1.0'?>**). Le nœud [XmlNodeType::XmlDeclaration](./) doit être le premier nœud du document. Il ne peut pas avoir d'enfants. C'est un enfant du nœud [XmlNodeType::Document](./). Il peut avoir des attributs qui fournissent les informations de version et d'encodage. |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
