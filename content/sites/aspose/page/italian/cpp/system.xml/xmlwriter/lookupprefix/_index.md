---
title: "System::Xml::XmlWriter::LookupPrefix metodo"
linktitle: "LookupPrefix"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlWriter::LookupPrefix metodo. Quando sovrascritto in una classe derivata, restituisce il prefisso più vicino definito nell'ambito corrente dello spazio dei nomi per l'URI dello spazio dei nomi in C++."
type: docs
weight: 800
url: /it/cpp/system.xml/xmlwriter/lookupprefix/
---
## XmlWriter::LookupPrefix method


Quando sovrascritto in una classe derivata, restituisce il prefisso più vicino definito nell'ambito del namespace corrente per l'URI del namespace.

```cpp
virtual String System::Xml::XmlWriter::LookupPrefix(String ns)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ns | String | L'URI dello spazio dei nomi il cui prefisso vuoi trovare. |

### ReturnValue

Il prefisso corrispondente o **nullptr** se non viene trovato alcun URI di spazio dei nomi corrispondente nell'ambito corrente.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
