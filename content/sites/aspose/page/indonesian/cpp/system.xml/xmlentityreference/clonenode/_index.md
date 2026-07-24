---
title: "metode System::Xml::XmlEntityReference::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Page untuk C++"
description: "metode System::Xml::XmlEntityReference::CloneNode. Membuat duplikat node ini dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


Membuat duplikat dari node ini.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| deep | bool | **true** untuk menyalin secara rekursif subtree di bawah node yang ditentukan; **false** untuk menyalin hanya node itu sendiri. Untuk node [XmlEntityReference](../), metode ini selalu mengembalikan node referensi entitas tanpa anak. Teks pengganti diatur ketika node dimasukkan ke dalam induk. |

### ReturnValue

Node yang dikloning.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
