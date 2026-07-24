---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlDeclaration::CloneNode méthode. Crée un duplicata de ce nœud en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Crée un duplicata de ce nœud.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| deep | bool | **true** pour cloner récursivement le sous‑arbre sous le nœud spécifié ; **false** pour cloner uniquement le nœud lui‑même. Parce que les nœuds [XmlDeclaration](../) n’ont pas d’enfants, le nœud cloné inclut toujours la valeur des données, quel que soit le paramètre. |

### ReturnValue

Le nœud cloné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
