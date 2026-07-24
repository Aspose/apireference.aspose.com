---
title: "System::Xml::XmlResolver::SupportsType méthode"
linktitle: "SupportsType"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlResolver::SupportsType méthode. Permet au résolveur de renvoyer des types autres que Stream en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml/xmlresolver/supportstype/
---
## XmlResolver::SupportsType method


Permet au résolveur de renvoyer des types autres que Stream.

```cpp
virtual bool System::Xml::XmlResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI. |
| type | const TypeInfo\& | Le type à renvoyer. |

### ReturnValue

**true** if the **type** is supported; otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
