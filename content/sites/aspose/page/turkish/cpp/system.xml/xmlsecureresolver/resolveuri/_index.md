---
title: "System::Xml::XmlSecureResolver::ResolveUri yöntemi"
linktitle: "ResolveUri"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlSecureResolver::ResolveUri yöntemi. C++'ta temel ve göreli URI'lerden mutlak URI'yi, temel XmlResolver üzerindeki ResolveUri çağrısı ile çözer."
type: docs
weight: 300
url: /tr/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


Temel ve göreli URI'lerden mutlak URI'yi, temel [XmlResolver](../../xmlresolver/) üzerindeki **ResolveUri** çağrısı ile çözer.

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Göreli URI'yi çözmek için kullanılan temel URI. |
| relativeUri | String | Çözülecek URI. URI mutlak ya da göreli olabilir. Mutlak ise, bu değer **baseUri** değerini etkili bir şekilde değiştirir. Göreli ise, **baseUri** ile birleştirilerek mutlak bir URI oluşturur. |

### ReturnValue

Göreli URI çözülemezse mutlak URI veya **nullptr** (temel [XmlResolver](../../xmlresolver/) üzerindeki **ResolveUri** çağrısı ile döndürülür).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
