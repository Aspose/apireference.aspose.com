---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity yöntemi"
linktitle: "GetEntity"
second_title: "Aspose.Page için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity yöntemi. Bir URI'yi C++'ta gerçek kaynağı içeren bir nesneye eşler."
type: docs
weight: 400
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Bir URI'yi gerçek kaynağı içeren bir nesneye eşler.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/) çağrısından döndürülen URI. |
| rol | String | Şu anda kullanılmıyor. |
| ofObjectToReturn | const TypeInfo\& | Döndürülecek nesnenin türü. [XmlPreloadedResolver](../), [String](../../../system/string/) olarak eklenen URI'ler için Stream nesnelerini ve TextReader nesnelerini destekler. İstenen tür çözücü tarafından desteklenmiyorsa bir istisna fırlatılır. Bu çözücünün belirli bir **Type**'ı destekleyip desteklemediğini belirlemek için XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) yöntemini kullanın. |

### ReturnValue

Gerçek kaynağa karşılık gelen bir Stream veya TextReader nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
