---
title: "System::Xml::XmlEntityReference::CloneNode méthode"
linktitle: "CloneNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlEntityReference::CloneNode méthode. Crée un duplicata de ce nœud en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


Crée un duplicata de ce nœud.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| deep | bool | **true** pour cloner récursivement le sous‑arbre sous le nœud spécifié ; **false** pour cloner uniquement le nœud lui‑-même. Pour les nœuds [XmlEntityReference](../), cette méthode renvoie toujours un nœud de référence d'entité sans enfants. Le texte de remplacement est défini lorsque le nœud est inséré dans un parent. |

### ReturnValue

Le nœud cloné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
