---
title: "Metode System::Xml::XmlNode::SelectSingleNode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNode::SelectSingleNode. Memilih XmlNode pertama yang cocok dengan ekspresi XPath dalam C++."
type: docs
weight: 3900
url: /id/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


Memilih [XmlNode](../) pertama yang cocok dengan ekspresi [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | const String\& | Ekspresi [XPath](../../../system.xml.xpath/). |

### ReturnValue

[XmlNode](../) pertama yang cocok dengan kueri [XPath](../../../system.xml.xpath/) atau **nullptr** jika tidak ada node yang cocok ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Memilih [XmlNode](../) pertama yang cocok dengan ekspresi [XPath](../../../system.xml.xpath/). Setiap prefiks yang ditemukan dalam ekspresi [XPath](../../../system.xml.xpath/) diselesaikan menggunakan [XmlNamespaceManager](../../xmlnamespacemanager/) yang disediakan.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | const String\& | Ekspresi [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Sebuah [XmlNamespaceManager](../../xmlnamespacemanager/) untuk digunakan dalam menyelesaikan namespace untuk prefiks dalam ekspresi [XPath](../../../system.xml.xpath/). |

### ReturnValue

[XmlNode](../) pertama yang cocok dengan kueri [XPath](../../../system.xml.xpath/) atau **nullptr** jika tidak ada node yang cocok ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
