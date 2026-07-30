---
title: "System::Xml::XmlComment::CloneNode méthode"
linktitle: "CloneNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlComment::CloneNode méthode. Crée un duplicata de ce nœud en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


Crée un duplicata de ce nœud.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| profond | bool | **true** pour cloner récursivement le sous-arbre sous le nœud spécifié ; **false** pour cloner uniquement le nœud lui‑-même. Comme les nœuds de commentaire n'ont pas d'enfants, le nœud cloné inclut toujours le contenu texte, quel que soit le paramètre. |

### ReturnValue

Le nœud cloné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
