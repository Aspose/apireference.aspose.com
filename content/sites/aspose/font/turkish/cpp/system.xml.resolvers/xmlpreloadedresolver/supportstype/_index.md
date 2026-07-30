---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType yöntemi"
linktitle: "SupportsType"
second_title: "Aspose.Font için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType yöntemi. Çözücünün C++'ta yalnızca Stream dışındaki diğer Türleri destekleyip desteklemediğini belirler."
type: docs
weight: 800
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


Çözümleyicinin yalnızca Stream dışındaki diğer türleri destekleyip desteklemediğini belirler.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Kontrol edilecek mutlak URI. |
| tür | const TypeInfo\& | Döndürülecek Tür. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
