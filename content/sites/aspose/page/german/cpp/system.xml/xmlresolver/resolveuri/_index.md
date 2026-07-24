---
title: "System::Xml::XmlResolver::ResolveUri Methode"
linktitle: "ResolveUri"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlResolver::ResolveUri Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, löst sie die absolute URI aus der Basis- und relativen URIs in C++ auf."
type: docs
weight: 200
url: /de/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Wenn in einer abgeleiteten Klasse überschrieben, löst es den absoluten URI aus dem Basis‑URI und relativen URIs auf.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Die Basis-URI, die zum Auflösen der relativen URI verwendet wird. |
| relativeUri | String | Die aufzulösende URI. Die URI kann absolut oder relativ sein. Wenn sie absolut ist, ersetzt dieser Wert effektiv den **baseUri**-Wert. Wenn sie relativ ist, wird sie mit dem **baseUri** kombiniert, um eine absolute URI zu erzeugen. |

### ReturnValue

Die absolute URI oder **nullptr**, wenn die relative URI nicht aufgelöst werden kann.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
