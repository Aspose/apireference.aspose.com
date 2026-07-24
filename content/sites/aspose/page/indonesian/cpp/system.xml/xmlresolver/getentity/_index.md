---
title: "System::Xml::XmlResolver::GetEntity method"
linktitle: "GetEntity"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlResolver::GetEntity method. Ketika dioverride dalam kelas turunan, memetakan sebuah URI ke objek yang berisi sumber daya sebenarnya di C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Ketika dioverride dalam kelas turunan, memetakan sebuah URI ke objek yang berisi sumber daya aktual.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI yang dikembalikan dari pemanggilan [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| peran | String | Saat ini tidak digunakan. |
| ofObjectToReturn | const TypeInfo\& | Tipe objek yang akan dikembalikan. Versi saat ini hanya mengembalikan objek Stream. |

### ReturnValue

Objek stream atau **nullptr** jika tipe selain stream ditentukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
