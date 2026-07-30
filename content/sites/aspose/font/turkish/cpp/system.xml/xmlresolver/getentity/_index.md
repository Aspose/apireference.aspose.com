---
title: "System::Xml::XmlResolver::GetEntity yöntemi"
linktitle: "GetEntity"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlResolver::GetEntity yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, bir URI'yi gerçek kaynağı içeren bir nesneye C++'ta eşler."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Türetilmiş bir sınıfta geçersiz kılındığında, bir URI'yi gerçek kaynağı içeren bir nesneye eşler.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) çağrısından döndürülen URI. |
| rol | Dize | Şu anda kullanılmıyor. |
| ofObjectToReturn | const TypeInfo\& | Döndürülecek nesnenin türü. Mevcut sürüm yalnızca Stream nesnelerini döndürür. |

### ReturnValue

Bir akış nesnesi veya akış dışı bir tür belirtilmişse **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
