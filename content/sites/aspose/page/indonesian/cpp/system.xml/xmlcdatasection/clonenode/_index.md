---
title: "metode System::Xml::XmlCDataSection::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Page untuk C++"
description: "metode System::Xml::XmlCDataSection::CloneNode. Membuat duplikat node ini dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


Membuat duplikat dari node ini.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dalam | bool | **true** untuk secara rekursif menggandakan subtree di bawah node yang ditentukan; **false** untuk menggandakan hanya node itu sendiri. Karena node CDATA tidak memiliki anak, terlepas dari pengaturan parameter, node yang digandakan akan selalu menyertakan konten data. |

### ReturnValue

Node yang dikloning.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
