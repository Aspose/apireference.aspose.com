---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri Methode"
linktitle: "ResolveUri"
second_title: "Aspose.Font für C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri Methode. Ermittelt die absolute URI aus der Basis- und relativen URI in C++."
type: docs
weight: 600
url: /de/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Löst den absoluten URI aus dem Basis- und relativen URI auf.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Die Basis-URI, die zum Auflösen der relativen URI verwendet wird. |
| relativeUri | String | Die aufzulösende URI. Die URI kann absolut oder relativ sein. Wenn sie absolut ist, ersetzt dieser Wert effektiv den **baseUri**-Wert. Wenn sie relativ ist, wird sie mit dem **baseUri** kombiniert, um eine absolute URI zu erzeugen. |

### ReturnValue

Die [Uri](../../../system/uri/) die die absolute URI darstellt oder **nullptr**, falls die relative URI nicht aufgelöst werden kann.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
