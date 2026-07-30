---
title: "Metodo System::Xml::XmlTextReader::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlTextReader::LookupNamespace. Risolve un prefisso di namespace nell'ambito dell'elemento corrente in C++."
type: docs
weight: 3700
url: /it/cpp/system.xml/xmltextreader/lookupnamespace/
---
## XmlTextReader::LookupNamespace method


Risolvi un prefisso di spazio dei nomi nell'ambito dell'elemento corrente.

```cpp
String System::Xml::XmlTextReader::LookupNamespace(const String &prefix) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefisso | const String\& | Il prefisso il cui URI di spazio dei nomi si desidera risolvere. Per corrispondere allo spazio dei nomi predefinito, passare una stringa vuota. Questa stringa non deve essere atomizzata. |

### ReturnValue

L'URI di spazio dei nomi a cui il prefisso è associato o **nullptr** se non viene trovato alcun prefisso corrispondente.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
