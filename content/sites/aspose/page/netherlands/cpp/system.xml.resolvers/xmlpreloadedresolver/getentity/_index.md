---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity methode"
linktitle: "GetEntity"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity methode. Koppelt een URI aan een object dat de daadwerkelijke bron bevat in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Koppelt een URI aan een object dat de daadwerkelijke bron bevat.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | De URI die wordt geretourneerd door de aanroep van [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/). |
| rol | String | Momenteel niet gebruikt. |
| ofObjectToReturn | const TypeInfo\& | Het type object dat moet worden geretourneerd. De [XmlPreloadedResolver](../) ondersteunt Stream‑objecten en TextReader‑objecten voor URI's die zijn toegevoegd als [String](../../../system/string/). Als het gevraagde type niet wordt ondersteund door de resolver, wordt er een uitzondering gegooid. Gebruik de XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) methode om te bepalen of een bepaald **Type** wordt ondersteund door deze resolver. |

### ReturnValue

Een Stream of TextReader-object dat overeenkomt met de werkelijke bron.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
