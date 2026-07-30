---
title: "System::Xml::XmlDeclaration::CloneNode metodo"
linktitle: "CloneNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlDeclaration::CloneNode metodo. Crea un duplicato di questo nodo in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Crea un duplicato di questo nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| deep | bool | **true** per clonare ricorsivamente il sottoalbero sotto il nodo specificato; **false** per clonare solo il nodo stesso. Poiché i nodi [XmlDeclaration](../) non hanno figli, il nodo clonato include sempre il valore dei dati, indipendentemente dall'impostazione del parametro. |

### ReturnValue

Il nodo clonato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
