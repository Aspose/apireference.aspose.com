---
title: "System::Xml::XmlResolver::ResolveUri method"
linktitle: "ResolveUri"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlResolver::ResolveUri yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, C++'ta temel ve göreli URI'lerden mutlak URI'yi çözer."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Türetilmiş bir sınıfta geçersiz kılındığında, temel ve göreli URI'lerden mutlak URI'yı çözer.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Göreli URI'yi çözmek için kullanılan temel URI. |
| relativeUri | String | Çözülecek URI. URI mutlak ya da göreli olabilir. Mutlak ise, bu değer **baseUri** değerini etkili bir şekilde değiştirir. Göreli ise, **baseUri** ile birleştirilerek mutlak bir URI oluşturur. |

### ReturnValue

Göreli URI çözülemezse mutlak URI veya **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
