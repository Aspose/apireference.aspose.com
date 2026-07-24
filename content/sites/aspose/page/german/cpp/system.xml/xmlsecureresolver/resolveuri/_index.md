---
title: "System::Xml::XmlSecureResolver::ResolveUri Methode"
linktitle: "ResolveUri"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlSecureResolver::ResolveUri Methode. Löst die absolute URI aus der Basis‑ und relativen URI, indem **ResolveUri** im zugrunde liegenden XmlResolver in C++ aufgerufen wird."
type: docs
weight: 300
url: /de/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


Löst die absolute URI aus der Basis‑ und relativen URI, indem **ResolveUri** im zugrunde liegenden [XmlResolver](../../xmlresolver/) aufgerufen wird.

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Die Basis-URI, die zum Auflösen der relativen URI verwendet wird. |
| relativeUri | String | Die aufzulösende URI. Die URI kann absolut oder relativ sein. Wenn sie absolut ist, ersetzt dieser Wert effektiv den **baseUri**-Wert. Wenn sie relativ ist, wird sie mit dem **baseUri** kombiniert, um eine absolute URI zu erzeugen. |

### ReturnValue

Die absolute URI oder **nullptr**, wenn die relative URI nicht aufgelöst werden kann (zurückgegeben durch Aufruf von **ResolveUri** im zugrunde liegenden [XmlResolver](../../xmlresolver/)).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
