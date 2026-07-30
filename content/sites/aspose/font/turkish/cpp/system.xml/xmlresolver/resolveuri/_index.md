---
title: "System::Xml::XmlResolver::ResolveUri yöntemi"
linktitle: "ResolveUri"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlResolver::ResolveUri yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, temel ve göreceli URI'lerden mutlak URI'yi C++'ta çözer."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Türetilmiş bir sınıfta geçersiz kılındığında, temel ve göreli URI'lerden mutlak URI'yi çözer.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Göreli URI'yi çözmek için kullanılan temel URI. |
| relativeUri | Dize | Çözülecek URI. URI mutlak ya da göreli olabilir. Mutlak ise, bu değer etkili bir şekilde **baseUri** değerini değiştirir. Göreli ise, **baseUri** ile birleştirilerek mutlak bir URI oluşturur. |

### ReturnValue

Mutlak URI veya **nullptr**, göreceli URI çözülemezse.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
