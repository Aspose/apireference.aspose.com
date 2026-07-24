---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlDeclaration::CloneNode method. Crea una copia duplicata di questo nodo in C++."
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
* Library [Aspose.Page for C++](../../../)
