---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri-methode"
linktitle: "ResolveUri"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri-methode. Lost de absolute URI op uit de basis- en relatieve URI's in C++."
type: docs
weight: 600
url: /nl/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Lost de absolute URI op uit de basis‑ en relatieve URI’s.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | De basis-URI die wordt gebruikt om de relatieve URI op te lossen. |
| relativeUri | String | De URI die moet worden opgelost. De URI kan absoluut of relatief zijn. Als deze absoluut is, vervangt deze waarde effectief de **baseUri**-waarde. Als deze relatief is, wordt deze gecombineerd met de **baseUri** om een absolute URI te vormen. |

### ReturnValue

De [Uri](../../../system/uri/) die de absolute URI vertegenwoordigt of **nullptr** als de relatieve URI niet kan worden opgelost.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
