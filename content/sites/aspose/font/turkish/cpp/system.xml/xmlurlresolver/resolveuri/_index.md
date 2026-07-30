---
title: "System::Xml::XmlUrlResolver::ResolveUri yöntemi"
linktitle: "ResolveUri"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlUrlResolver::ResolveUri yöntemi. C++'ta temel ve göreli URI'lerden mutlak URI'yi çözer."
type: docs
weight: 300
url: /tr/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


Temel ve göreli URI'lerden mutlak URI'yi çözer.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Göreli URI'yi çözmek için kullanılan temel URI. |
| relativeUri | Dize | Çözülecek URI. URI mutlak ya da göreli olabilir. Mutlak ise, bu değer etkili bir şekilde **baseUri** değerini değiştirir. Göreli ise, **baseUri** ile birleştirilerek mutlak bir URI oluşturur. |

### ReturnValue

Mutlak URI, ya da göreli URI çözülemezse **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
