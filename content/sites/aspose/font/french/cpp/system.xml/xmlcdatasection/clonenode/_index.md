---
title: "System::Xml::XmlCDataSection::CloneNode méthode"
linktitle: "CloneNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlCDataSection::CloneNode method. Crée un duplicata de ce nœud en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


Crée un duplicata de ce nœud.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| profond | bool | **true** pour cloner récursivement le sous‑arbre sous le nœud spécifié ; **false** pour cloner uniquement le nœud lui‑même. Comme les nœuds CDATA n’ont pas d’enfants, quel que soit le paramètre, le nœud cloné contiendra toujours le contenu des données. |

### ReturnValue

Le nœud cloné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
