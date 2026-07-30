---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType méthode"
linktitle: "PrendEnChargeType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType méthode. Détermine si le résolveur prend en charge d'autres Types que simplement Stream en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


Détermine si le résolveur prend en charge d'autres types que le simple flux.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| uriAbsolue | SharedPtr\<Uri\> | L'URI absolue à vérifier. |
| type | const TypeInfo\& | Le Type à retourner. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
