---
title: "System::Xml::XmlReader::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlReader::LookupNamespace method. Quando sovrascritto in una classe derivata, risolve un prefisso di spazio dei nomi nell'ambito dell'elemento corrente in C++."
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
| prefisso | const String\& | Il prefisso il cui URI di spazio dei nomi si desidera risolvere. Per corrispondere allo spazio dei nomi predefinito, passare una stringa vuota. |

### ReturnValue

L'URI dello spazio dei nomi a cui il prefisso è mappato o **nullptr** se non viene trovato alcun prefisso corrispondente.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
