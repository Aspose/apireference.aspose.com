---
title: "System::Xml::XmlSecureResolver::ResolveUri metodo"
linktitle: "ResolveUri"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlSecureResolver::ResolveUri metodo. Risolve l'URI assoluto dall'URI di base e da quello relativo chiamando ResolveUri sul XmlResolver sottostante in C++."
type: docs
weight: 300
url: /it/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


Risolvi l'URI assoluto dall'URI di base e da quello relativo chiamando **ResolveUri** sul [XmlResolver](../../xmlresolver/) sottostante.

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L'URI base utilizzato per risolvere l'URI relativo. |
| relativeUri | String | L'URI da risolvere. L'URI può essere assoluto o relativo. Se è assoluto, questo valore sostituisce effettivamente il valore **baseUri**. Se è relativo, si combina con il **baseUri** per creare un URI assoluto. |

### ReturnValue

L'URI assoluto o **nullptr** se l'URI relativo non può essere risolto (restituito chiamando **ResolveUri** sul [XmlResolver](../../xmlresolver/) sottostante).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
