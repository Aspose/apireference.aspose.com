---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDeclaration::CloneNode method. Membuat duplikat dari node ini dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Membuat duplikat dari node ini.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| deep | bool | **true** untuk secara rekursif menggandakan subtree di bawah node yang ditentukan; **false** untuk menggandakan hanya node itu sendiri. Karena node [XmlDeclaration](../) tidak memiliki anak, node yang digandakan selalu menyertakan nilai data, terlepas dari pengaturan parameter. |

### ReturnValue

Node yang dikloning.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
