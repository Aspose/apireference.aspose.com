---
title: "System::Xml::XmlUrlResolver::GetEntity yöntemi"
linktitle: "GetEntity"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlUrlResolver::GetEntity yöntemi. Bir URI'yi gerçek kaynağı içeren bir nesneye eşler C++'ta."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Bir URI'yi gerçek kaynağı içeren bir nesneye eşler.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/) çağrısından döndürülen URI. |
| rol | String | Şu anda kullanılmıyor. |
| ofObjectToReturn | const TypeInfo\& | Döndürülecek nesnenin tipi. Mevcut uygulama yalnızca Stream nesnelerini döndürür. |

### ReturnValue

Bir akış nesnesi veya **nullptr** eğer akış dışı bir tip belirtilmişse.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
