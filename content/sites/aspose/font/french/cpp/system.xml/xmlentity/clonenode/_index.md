---
title: "System::Xml::XmlEntity::CloneNode méthode"
linktitle: "CloneNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlEntity::CloneNode méthode. Crée un duplicata de ce nœud. Les nœuds d'entité ne peuvent pas être clonés. Appeler cette méthode sur un objet XmlEntity lève une exception en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Crée un duplicata de ce nœud. Les nœuds d'entité ne peuvent pas être clonés. Appeler cette méthode sur un objet [XmlEntity](../) lève une exception.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| profond | bool | **true** pour cloner récursivement le sous-arbre sous le nœud spécifié ; **false** pour cloner uniquement le nœud lui‑même. |

### ReturnValue

Une copie du [XmlNode](../../xmlnode/) depuis lequel la méthode est appelée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
