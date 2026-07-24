---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType Methode"
linktitle: "SupportsType"
second_title: "Aspose.Page für C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType Methode. Bestimmt, ob der Resolver in C++ andere Typen als nur Stream unterstützt."
type: docs
weight: 800
url: /de/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


Bestimmt, ob der Resolver andere Typen als nur Stream unterstützt.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Die absolute URI zum Überprüfen. |
| Typ | const TypeInfo\\& | Der Typ, der zurückgegeben werden soll. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
