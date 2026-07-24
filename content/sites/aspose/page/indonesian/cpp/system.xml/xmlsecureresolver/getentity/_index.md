---
title: "System::Xml::XmlSecureResolver::GetEntity metode"
linktitle: "GetEntity"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlSecureResolver::GetEntity metode. Memetakan URI ke objek yang berisi sumber daya sebenarnya dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


Memetakan URI ke objek yang berisi sumber daya sebenarnya.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI yang dikembalikan dari pemanggilan [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| peran | String | Saat ini tidak digunakan. |
| ofObjectToReturn | const TypeInfo\& | Tipe objek yang akan dikembalikan. Versi saat ini hanya mengembalikan objek Stream. |

### ReturnValue

Stream yang dikembalikan dengan memanggil **GetEntity** pada [XmlResolver](../../xmlresolver/) yang mendasari. Jika tipe selain Stream ditentukan, metode mengembalikan **nullptr**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
