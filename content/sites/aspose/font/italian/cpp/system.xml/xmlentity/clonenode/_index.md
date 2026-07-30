---
title: "Metodo System::Xml::XmlEntity::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlEntity::CloneNode. Crea un duplicato di questo nodo. I nodi Entity non possono essere clonati. Chiamare questo metodo su un oggetto XmlEntity genera un'eccezione in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Crea un duplicato di questo nodo. I nodi Entity non possono essere clonati. Chiamare questo metodo su un oggetto [XmlEntity](../) genera un'eccezione.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| profondo | bool | **true** per clonare ricorsivamente il sottoalbero sotto il nodo specificato; **false** per clonare solo il nodo stesso. |

### ReturnValue

Una copia del [XmlNode](../../xmlnode/) da cui è chiamato il metodo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
