---
title: "System::Xml::XmlUrlResolver::ResolveUri metod"
linktitle: "ResolveUri"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlUrlResolver::ResolveUri metod. Löser den absoluta URI:n från bas- och relativa URI:er i C++."
type: docs
weight: 300
url: /sv/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


Löser den absoluta URI:n från bas- och relativa URI:er.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Den bas-URI som används för att lösa den relativa URI:n. |
| relativeUri | String | URI:n att lösa. URI:n kan vara absolut eller relativ. Om den är absolut ersätter detta värde effektivt **baseUri**-värdet. Om den är relativ kombineras den med **baseUri** för att skapa en absolut URI. |

### ReturnValue

Den absoluta URI:n, eller **nullptr** om den relativa URI:n inte kan lösas.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
