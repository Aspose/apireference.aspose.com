---
title: "System::Xml::XmlResolver::ResolveUri metodo"
linktitle: "ResolveUri"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlResolver::ResolveUri metodo. Quando sovrascritto in una classe derivata, risolve l'URI assoluto a partire dagli URI base e relativi in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Quando sovrascritto in una classe derivata, risolve l'URI assoluto a partire dall'URI base e da quelli relativi.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L'URI base utilizzato per risolvere l'URI relativo. |
| relativeUri | Stringa | L'URI da risolvere. L'URI può essere assoluto o relativo. Se è assoluto, questo valore sostituisce effettivamente il valore **baseUri**. Se è relativo, si combina con il **baseUri** per creare un URI assoluto. |

### ReturnValue

L'URI assoluto o **nullptr** se l'URI relativo non può essere risolto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
