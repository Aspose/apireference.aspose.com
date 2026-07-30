---
title: "System::Xml::XmlNodeReader::ReadString méthode"
linktitle: "LireChaîne"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNodeReader::ReadString méthode. Lit le contenu d'un élément ou d'un nœud texte sous forme de chaîne en C++."
type: docs
weight: 3600
url: /fr/cpp/system.xml/xmlnodereader/readstring/
---
## XmlNodeReader::ReadString method


Lit le contenu d'un élément ou d'un nœud texte sous forme de chaîne.

```cpp
String System::Xml::XmlNodeReader::ReadString() override
```


### ReturnValue

Le contenu de l'élément ou du nœud de type texte (cela peut inclure CDATA, [Text](../../../system.text/) nœuds, etc.). Cela peut être une chaîne vide si le lecteur est positionné sur autre chose qu'un élément ou un nœud texte, ou s'il n'y a plus de contenu texte à retourner dans le contexte actuel. Remarque : le nœud texte peut être soit un élément, soit un nœud texte d'attribut.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
