---
title: "System::Xml::XmlResolver::ResolveUri metod"
linktitle: "ResolveUri"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlResolver::ResolveUri metod. När den åsidosätts i en avledd klass, löser den den absoluta URI:n från bas- och relativa URI:er i C++."
type: docs
weight: 200
url: /sv/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


När den åsidosätts i en avledd klass, löser den absoluta URI:n från bas- och relativa URI:er.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Den bas-URI som används för att lösa den relativa URI:n. |
| relativeUri | String | URI:n att lösa. URI:n kan vara absolut eller relativ. Om den är absolut ersätter detta värde effektivt **baseUri**-värdet. Om den är relativ kombineras den med **baseUri** för att skapa en absolut URI. |

### ReturnValue

Den absoluta URI:n eller **nullptr** om den relativa URI:n inte kan lösas upp.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
