---
title: "System::Xml::XmlEntity::CloneNode metodo"
linktitle: "CloneNode"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlEntity::CloneNode metodo. Crea una copia duplicata di questo nodo. I nodi Entity non possono essere clonati. L'invocazione di questo metodo su un oggetto XmlEntity genera un'eccezione in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Crea una copia duplicata di questo nodo. I nodi Entity non possono essere clonati. L'invocazione di questo metodo su un oggetto [XmlEntity](../) genera un'eccezione.

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
* Library [Aspose.Page for C++](../../../)
