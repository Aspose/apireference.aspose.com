---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType yöntemi"
linktitle: "SupportsType"
second_title: "Aspose.Page için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType yöntemi. Çözücünün C++'ta yalnızca Stream dışındaki diğer türleri destekleyip desteklemediğini belirler."
type: docs
weight: 800
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


Çözümleyicinin yalnızca Stream dışında başka Türleri destekleyip desteklemediğini belirler.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Kontrol edilecek mutlak URI. |
| tür | const TypeInfo\& | Döndürülecek Type. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
