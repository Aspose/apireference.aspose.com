---
title: "System::Xml::XmlCDataSection::CloneNode metodo"
linktitle: "CloneNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlCDataSection::CloneNode metodo. Crea un duplicato di questo nodo in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


Crea un duplicato di questo nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| profondo | bool | **true** per clonare ricorsivamente il sottoalbero sotto il nodo specificato; **false** per clonare solo il nodo stesso. Poiché i nodi CDATA non hanno figli, indipendentemente dall'impostazione del parametro, il nodo clonato includerà sempre il contenuto dei dati. |

### ReturnValue

Il nodo clonato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
