---
title: "System::Xml::XmlNotation::CloneNode metodo"
linktitle: "CloneNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNotation::CloneNode metodo. Crea un duplicato di questo nodo. I nodi Notation non possono essere clonati. Chiamare questo metodo su un oggetto XmlNotation genera un'eccezione in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


Crea un duplicato di questo nodo. I nodi Notation non possono essere clonati. Chiamare questo metodo su un oggetto [XmlNotation](../) genera un'eccezione.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| profondo | bool | **true** per clonare ricorsivamente il sottoalbero sotto il nodo specificato; **false** per clonare solo il nodo stesso. |

### ReturnValue

Una copia [XmlNode](../../xmlnode/) del nodo da cui viene chiamato il metodo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
