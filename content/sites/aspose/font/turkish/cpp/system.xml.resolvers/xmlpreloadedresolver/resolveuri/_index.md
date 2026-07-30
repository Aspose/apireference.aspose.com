---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri metodu"
linktitle: "ResolveUri"
second_title: "Aspose.Font için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri metodu. C++'da temel ve göreli URI'lerden mutlak URI'yi çözer."
type: docs
weight: 600
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Temel ve göreli URI'lerden mutlak URI'yi çözer.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Göreli URI'yi çözmek için kullanılan temel URI. |
| relativeUri | Dize | Çözülecek URI. URI mutlak ya da göreli olabilir. Mutlak ise, bu değer etkili bir şekilde **baseUri** değerini değiştirir. Göreli ise, **baseUri** ile birleştirilerek mutlak bir URI oluşturur. |

### ReturnValue

Mutlak URI'yi temsil eden [Uri](../../../system/uri/) veya göreli URI çözülemezse **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
