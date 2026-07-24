---
title: "System::Xml::XmlComment::CloneNode metode"
linktitle: "CloneNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlComment::CloneNode metode. Membuat duplikat node ini dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


Membuat duplikat dari node ini.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dalam | bool | **true** untuk secara rekursif mengkloning subtree di bawah node yang ditentukan; **false** untuk mengkloning hanya node itu sendiri. Karena node komentar tidak memiliki anak, node yang dikloning selalu menyertakan konten teks, terlepas dari pengaturan parameter. |

### ReturnValue

Node yang dikloning.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
