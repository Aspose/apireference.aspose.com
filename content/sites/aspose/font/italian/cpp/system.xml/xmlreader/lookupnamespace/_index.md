---
title: "System::Xml::XmlReader::LookupNamespace metodo"
linktitle: "LookupNamespace"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::LookupNamespace metodo. Quando sovrascritto in una classe derivata, risolve un prefisso di namespace nell'ambito dell'elemento corrente in C++."
type: docs
weight: 3100
url: /it/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


Quando sovrascritto in una classe derivata, risolve un prefisso di spazio dei nomi nell'ambito dell'elemento corrente.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefisso | const String\& | Il prefisso il cui URI di namespace si desidera risolvere. Per corrispondere allo spazio dei nomi predefinito, passare una stringa vuota. |

### ReturnValue

L'URI di spazio dei nomi a cui il prefisso è associato o **nullptr** se non viene trovato alcun prefisso corrispondente.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
