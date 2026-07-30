---
title: "System::Xml::XmlEntityReference::CloneNode metodo"
linktitle: "CloneNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlEntityReference::CloneNode metodo. Crea un duplicato di questo nodo in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


Crea un duplicato di questo nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| deep | bool | **true** per clonare ricorsivamente il sottoalbero sotto il nodo specificato; **false** per clonare solo il nodo stesso. Per i nodi [XmlEntityReference](../), questo metodo restituisce sempre un nodo di riferimento di entità senza figli. Il testo di sostituzione viene impostato quando il nodo viene inserito in un genitore. |

### ReturnValue

Il nodo clonato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
