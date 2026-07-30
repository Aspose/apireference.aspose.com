---
title: "System::Xml::XmlSignificantWhitespace::CloneNode metodo"
linktitle: "CloneNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlSignificantWhitespace::CloneNode metodo. Crea un duplicato di questo nodo in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlsignificantwhitespace/clonenode/
---
## XmlSignificantWhitespace::CloneNode method


Crea un duplicato di questo nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlSignificantWhitespace::CloneNode(bool deep) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| profondo | bool | **true** per clonare ricorsivamente il sottoalbero sotto il nodo specificato; **false** per clonare solo il nodo stesso. Per i nodi di spazio bianco significativo, il nodo clonato include sempre il valore dei dati, indipendentemente dall'impostazione del parametro. |

### ReturnValue

Il nodo clonato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
