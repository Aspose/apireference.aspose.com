---
title: "System::Xml::XmlResolver::GetEntity method"
linktitle: "GetEntity"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlResolver::GetEntity method. Wanneer deze wordt overschreven in een afgeleide klasse, mappt deze een URI naar een object dat de daadwerkelijke bron bevat in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Wanneer overschreven in een afgeleide klasse, mappt een URI naar een object dat de feitelijke bron bevat.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | De URI die wordt geretourneerd door de aanroep van [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| rol | String | Momenteel niet gebruikt. |
| ofObjectToReturn | const TypeInfo\& | Het type object om terug te geven. De huidige versie retourneert alleen Stream-objecten. |

### ReturnValue

Een stream-object of **nullptr** als een ander type dan stream is opgegeven.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
