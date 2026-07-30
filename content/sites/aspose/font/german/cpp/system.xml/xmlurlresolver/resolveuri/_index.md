---
title: "System::Xml::XmlUrlResolver::ResolveUri Methode"
linktitle: "ResolveUri"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlUrlResolver::ResolveUri Methode. Ermittelt die absolute URI aus den Basis- und relativen URIs in C++."
type: docs
weight: 300
url: /de/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


Löst den absoluten URI aus dem Basis- und relativen URI auf.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Die Basis-URI, die zum Auflösen der relativen URI verwendet wird. |
| relativeUri | String | Die aufzulösende URI. Die URI kann absolut oder relativ sein. Wenn sie absolut ist, ersetzt dieser Wert effektiv den **baseUri**-Wert. Wenn sie relativ ist, wird sie mit dem **baseUri** kombiniert, um eine absolute URI zu erzeugen. |

### ReturnValue

Die absolute URI oder **nullptr**, falls die relative URI nicht aufgelöst werden kann.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
