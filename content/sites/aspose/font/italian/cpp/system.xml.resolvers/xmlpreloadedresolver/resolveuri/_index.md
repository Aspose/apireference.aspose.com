---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri method"
linktitle: "ResolveUri"
second_title: "Aspose.Font per C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri method. Risolve l'URI assoluto a partire dagli URI base e relativo in C++."
type: docs
weight: 600
url: /it/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Risolvi l'URI assoluto a partire dagli URI base e relativi.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L'URI base utilizzato per risolvere l'URI relativo. |
| relativeUri | Stringa | L'URI da risolvere. L'URI può essere assoluto o relativo. Se è assoluto, questo valore sostituisce effettivamente il valore **baseUri**. Se è relativo, si combina con il **baseUri** per creare un URI assoluto. |

### ReturnValue

Il [Uri](../../../system/uri/) che rappresenta l'URI assoluto o **nullptr** se l'URI relativo non può essere risolto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
