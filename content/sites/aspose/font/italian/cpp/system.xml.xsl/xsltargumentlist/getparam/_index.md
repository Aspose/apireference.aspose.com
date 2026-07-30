---
title: "System::Xml::Xsl::XsltArgumentList::GetParam metodo"
linktitle: "GetParam"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XsltArgumentList::GetParam metodo. Restituisce il parametro associato al nome qualificato per namespace in C++."
type: docs
weight: 600
url: /it/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


Restituisce il parametro associato al nome qualificato dello spazio dei nomi.

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | const String\& | Il nome del parametro. [XsltArgumentList](../) non verifica che il nome fornito sia un nome locale valido; tuttavia, il nome non può essere **nullptr**. |
| namespaceUri | const String\& | L'URI namespace associato al parametro. |

### ReturnValue

L'oggetto parametro o **nullptr** se non è stato trovato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
