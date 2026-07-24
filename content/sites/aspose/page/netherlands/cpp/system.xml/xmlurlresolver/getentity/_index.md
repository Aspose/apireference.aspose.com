---
title: "System::Xml::XmlUrlResolver::GetEntity methode"
linktitle: "GetEntity"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlUrlResolver::GetEntity methode. Koppelt een URI aan een object dat de daadwerkelijke bron bevat in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Koppelt een URI aan een object dat de daadwerkelijke bron bevat.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | De URI die wordt geretourneerd door de [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/) oproep. |
| rol | String | Momenteel niet gebruikt. |
| ofObjectToReturn | const TypeInfo\& | Het type object dat moet worden geretourneerd. De huidige implementatie retourneert alleen Stream-objecten. |

### ReturnValue

Een stream-object of **nullptr** als een ander type dan stream is opgegeven.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
