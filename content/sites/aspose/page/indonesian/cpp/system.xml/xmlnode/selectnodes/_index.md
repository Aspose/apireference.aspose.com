---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNode::SelectNodes method. Memilih daftar node yang cocok dengan ekspresi XPath dalam C++."
type: docs
weight: 3800
url: /id/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


Memilih daftar node yang cocok dengan ekspresi [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | const String\& | Ekspresi [XPath](../../../system.xml.xpath/). |

### ReturnValue

Sebuah [XmlNodeList](../../xmlnodelist/) yang berisi kumpulan node yang cocok dengan kueri [XPath](../../../system.xml.xpath/).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Memilih daftar node yang cocok dengan ekspresi [XPath](../../../system.xml.xpath/). Setiap prefiks yang ditemukan dalam ekspresi [XPath](../../../system.xml.xpath/) diselesaikan menggunakan [XmlNamespaceManager](../../xmlnamespacemanager/) yang disediakan.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | const String\& | Ekspresi [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Sebuah [XmlNamespaceManager](../../xmlnamespacemanager/) untuk digunakan dalam menyelesaikan namespace untuk prefiks dalam ekspresi [XPath](../../../system.xml.xpath/). |

### ReturnValue

Sebuah [XmlNodeList](../../xmlnodelist/) yang berisi kumpulan node yang cocok dengan kueri [XPath](../../../system.xml.xpath/).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
