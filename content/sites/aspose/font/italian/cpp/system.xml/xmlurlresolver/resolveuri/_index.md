---
title: "Metodo System::Xml::XmlUrlResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlUrlResolver::ResolveUri. Risolve l'URI assoluto a partire dagli URI base e relativo in C++."
type: docs
weight: 300
url: /it/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


Risolvi l'URI assoluto a partire dagli URI base e relativi.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L'URI base utilizzato per risolvere l'URI relativo. |
| relativeUri | Stringa | L'URI da risolvere. L'URI può essere assoluto o relativo. Se è assoluto, questo valore sostituisce effettivamente il valore **baseUri**. Se è relativo, si combina con il **baseUri** per creare un URI assoluto. |

### ReturnValue

L'URI assoluto, o **nullptr** se l'URI relativo non può essere risolto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
