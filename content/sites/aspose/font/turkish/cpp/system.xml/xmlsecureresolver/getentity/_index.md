---
title: "System::Xml::XmlSecureResolver::GetEntity yöntemi"
linktitle: "GetEntity"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlSecureResolver::GetEntity yöntemi. Bir URI'yi gerçek kaynağı içeren bir nesneye C++'ta eşler."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


Bir URI'yi gerçek kaynağı içeren bir nesneye eşler.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) çağrısından döndürülen URI. |
| rol | Dize | Şu anda kullanılmıyor. |
| ofObjectToReturn | const TypeInfo\& | Döndürülecek nesnenin türü. Mevcut sürüm yalnızca Stream nesnelerini döndürür. |

### ReturnValue

Temel [XmlResolver](../../xmlresolver/) üzerinde **GetEntity** çağrılarak döndürülen akış. Stream dışındaki bir tür belirtilirse, yöntem **nullptr** döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
