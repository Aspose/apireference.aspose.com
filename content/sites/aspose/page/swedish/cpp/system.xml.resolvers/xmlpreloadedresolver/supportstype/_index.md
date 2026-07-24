---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType metod"
linktitle: "SupportsType"
second_title: "Aspose.Page för C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType metod. Avgör om upplösaren stödjer andra typer än bara Stream i C++."
type: docs
weight: 800
url: /sv/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


Bestämmer om resolvern stödjer andra typer än bara Stream.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Den absoluta URI:n att kontrollera. |
| typ | const TypeInfo\& | Typen att returnera. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
