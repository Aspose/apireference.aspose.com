---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs konstruktor"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs. Menginisialisasi sebuah instance baru dari kelas XmlNodeChangedEventArgs dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Menginisialisasi sebuah instance baru dari kelas [XmlNodeChangedEventArgs](../).

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | [XmlNode](../../xmlnode/) yang menghasilkan peristiwa. |
| oldParent | const SharedPtr\<XmlNode\>\& | Orangtua lama [XmlNode](../../xmlnode/) dari [XmlNode](../../xmlnode/) yang menghasilkan peristiwa. |
| newParent | const SharedPtr\<XmlNode\>\& | Orangtua baru [XmlNode](../../xmlnode/) dari [XmlNode](../../xmlnode/) yang menghasilkan peristiwa. |
| oldValue | const String\& | Nilai lama dari [XmlNode](../../xmlnode/) yang menghasilkan peristiwa. |
| newValue | const String\& | Nilai baru dari [XmlNode](../../xmlnode/) yang menghasilkan peristiwa. |
| action | XmlNodeChangedAction | [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
