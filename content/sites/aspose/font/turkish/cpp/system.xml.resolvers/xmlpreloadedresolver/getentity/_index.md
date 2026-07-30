---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity metodu"
linktitle: "GetEntity"
second_title: "Aspose.Font için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity metodu. Bir URI'yi C++'da gerçek kaynağı içeren bir nesneye eşler."
type: docs
weight: 400
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Bir URI'yi gerçek kaynağı içeren bir nesneye eşler.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/) çağrısından döndürülen URI. |
| rol | Dize | Şu anda kullanılmıyor. |
| ofObjectToReturn | const TypeInfo\& | Döndürülecek nesnenin türü. [XmlPreloadedResolver](../) URI'ler için Stream nesneleri ve TextReader nesnelerini, URI'ler [String](../../../system/string/) olarak eklendiyse destekler. İstenen tür çözümleyici tarafından desteklenmiyorsa bir istisna fırlatılır. Bu çözümleyicinin belirli bir **Type**'ı destekleyip desteklemediğini belirlemek için XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) metodunu kullanın. |

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
* Library [Aspose.Font for C++](../../../)
