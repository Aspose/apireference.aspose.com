---
title: "System::Xml::XmlNodeReader::LookupNamespace metodo"
linktitle: "LookupNamespace"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNodeReader::LookupNamespace metodo. Risolve un prefisso di spazio dei nomi nell'ambito dell'elemento corrente in C++."
type: docs
weight: 2500
url: /it/cpp/system.xml/xmlnodereader/lookupnamespace/
---
## XmlNodeReader::LookupNamespace method


Risolvi un prefisso di spazio dei nomi nell'ambito dell'elemento corrente.

```cpp
String System::Xml::XmlNodeReader::LookupNamespace(const String &prefix) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefisso | const String\& | Il prefisso il cui URI di spazio dei nomi si desidera risolvere. Per corrispondere allo spazio dei nomi predefinito, passare una stringa vuota. Questa stringa non deve essere atomizzata. |

### ReturnValue

L'URI dello spazio dei nomi a cui il prefisso è mappato o **nullptr** se non viene trovato alcun prefisso corrispondente.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
