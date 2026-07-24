---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri yöntemi"
linktitle: "ResolveUri"
second_title: "Aspose.Page için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri yöntemi. Temel ve göreli URI'lerden mutlak URI'yi C++ içinde çözer."
type: docs
weight: 600
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Temel ve göreceli URI'lerden mutlak URI'yi çözer.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Göreli URI'yi çözmek için kullanılan temel URI. |
| relativeUri | String | Çözülecek URI. URI mutlak ya da göreli olabilir. Mutlak ise, bu değer **baseUri** değerini etkili bir şekilde değiştirir. Göreli ise, **baseUri** ile birleştirilerek mutlak bir URI oluşturur. |

### ReturnValue

[Uri](../../../system/uri/) mutlak URI'yi temsil eder veya göreli URI çözülemezse **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
