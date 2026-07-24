---
title: "System::Xml::XmlSecureResolver::GetEntity methode"
linktitle: "GetEntity"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlSecureResolver::GetEntity methode. Koppelt een URI aan een object dat de daadwerkelijke bron bevat in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


Koppelt een URI aan een object dat de daadwerkelijke bron bevat.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | De URI die wordt geretourneerd door de aanroep van [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| rol | String | Momenteel niet gebruikt. |
| ofObjectToReturn | const TypeInfo\& | Het type object om terug te geven. De huidige versie retourneert alleen Stream-objecten. |

### ReturnValue

De stream die wordt geretourneerd door **GetEntity** aan te roepen op de onderliggende [XmlResolver](../../xmlresolver/). Als een type anders dan Stream wordt gespecificeerd, retourneert de methode **nullptr**.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
