---
title: "System::Xml::XmlComment::CloneNode metodo"
linktitle: "CloneNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlComment::CloneNode metodo. Crea un duplicato di questo nodo in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


Crea un duplicato di questo nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| profondo | bool | **true** per clonare ricorsivamente il sottoalbero sotto il nodo specificato; **false** per clonare solo il nodo stesso. Poiché i nodi commento non hanno figli, il nodo clonato include sempre il contenuto testuale, indipendentemente dall'impostazione del parametro. |

### ReturnValue

Il nodo clonato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
