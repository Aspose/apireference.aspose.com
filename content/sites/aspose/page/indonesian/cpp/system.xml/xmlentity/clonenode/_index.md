---
title: "System::Xml::XmlEntity::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlEntity::CloneNode method. Membuat duplikat dari node ini. Node entitas tidak dapat dikloning. Memanggil metode ini pada objek XmlEntity akan melemparkan pengecualian dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Membuat duplikat dari node ini. Node entitas tidak dapat dikloning. Memanggil metode ini pada objek [XmlEntity](../) akan melemparkan pengecualian.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dalam | bool | **true** untuk secara rekursif mengkloning subtree di bawah node yang ditentukan; **false** untuk mengkloning hanya node itu sendiri. |

### ReturnValue

Salinan [XmlNode](../../xmlnode/) dari mana metode dipanggil.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
