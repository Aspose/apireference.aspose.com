---
title: "System::Xml::XmlNotation::CloneNode méthode"
linktitle: "CloneNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNotation::CloneNode méthode. Crée un duplicata de ce nœud. Les nœuds Notation ne peuvent pas être clonés. Appeler cette méthode sur un objet XmlNotation lève une exception en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


Crée un duplicata de ce nœud. Les nœuds Notation ne peuvent pas être clonés. Appeler cette méthode sur un objet [XmlNotation](../) lève une exception.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| profond | bool | **true** pour cloner récursivement le sous-arbre sous le nœud spécifié ; **false** pour cloner uniquement le nœud lui‑même. |

### ReturnValue

Une copie [XmlNode](../../xmlnode/) du nœud à partir duquel la méthode est appelée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
