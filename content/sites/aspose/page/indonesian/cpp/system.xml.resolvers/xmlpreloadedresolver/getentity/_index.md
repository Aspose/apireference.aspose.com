---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity metode"
linktitle: "GetEntity"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity metode. Memetakan URI ke objek yang berisi sumber daya sebenarnya dalam C++."
type: docs
weight: 400
url: /id/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Memetakan URI ke objek yang berisi sumber daya sebenarnya.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI yang dikembalikan dari pemanggilan [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/). |
| peran | String | Saat ini tidak digunakan. |
| ofObjectToReturn | const TypeInfo\& | Tipe objek yang akan dikembalikan. [XmlPreloadedResolver](../) mendukung objek Stream dan objek TextReader untuk URI yang ditambahkan sebagai [String](../../../system/string/). Jika tipe yang diminta tidak didukung oleh resolver, sebuah pengecualian akan dilempar. Gunakan metode XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) untuk menentukan apakah **Type** tertentu didukung oleh resolver ini. |

### ReturnValue

Objek Stream atau TextReader yang sesuai dengan sumber sebenarnya.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
