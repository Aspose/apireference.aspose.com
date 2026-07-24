---
title: "Méthode System::Xml::Resolvers::XmlPreloadedResolver::SupportsType"
linktitle: "SupportsType"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::Resolvers::XmlPreloadedResolver::SupportsType. Détermine si le résolveur prend en charge d’autres Types que le Stream en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


Détermine si le résolveur prend en charge d'autres Types que le simple Stream.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L’URI absolu à vérifier. |
| type | const TypeInfo\& | Le Type à retourner. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
