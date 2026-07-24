---
title: "System::Xml::XmlUrlResolver::GetEntity method"
linktitle: "GetEntity"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlUrlResolver::GetEntity method. Memetakan URI ke objek yang berisi sumber daya sebenarnya dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Memetakan URI ke objek yang berisi sumber daya sebenarnya.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI yang dikembalikan dari pemanggilan [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/). |
| peran | String | Saat ini tidak digunakan. |
| ofObjectToReturn | const TypeInfo\& | Tipe objek yang akan dikembalikan. Implementasi saat ini hanya mengembalikan objek Stream. |

### ReturnValue

Objek stream atau **nullptr** jika tipe selain stream ditentukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
