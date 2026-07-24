---
title: "System::Xml::XmlSecureResolver::ResolveUri methode"
linktitle: "ResolveUri"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlSecureResolver::ResolveUri methode. Lost de absolute URI op van de basis- en relatieve URI's door ResolveUri aan te roepen op de onderliggende XmlResolver in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


Lost de absolute URI op van de basis- en relatieve URI's door **ResolveUri** aan te roepen op de onderliggende [XmlResolver](../../xmlresolver/).

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | De basis-URI die wordt gebruikt om de relatieve URI op te lossen. |
| relativeUri | String | De URI die moet worden opgelost. De URI kan absoluut of relatief zijn. Als deze absoluut is, vervangt deze waarde effectief de **baseUri**-waarde. Als deze relatief is, wordt deze gecombineerd met de **baseUri** om een absolute URI te vormen. |

### ReturnValue

De absolute URI of **nullptr** als de relatieve URI niet kan worden opgelost (geretourneerd door **ResolveUri** aan te roepen op de onderliggende [XmlResolver](../../xmlresolver/)).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
