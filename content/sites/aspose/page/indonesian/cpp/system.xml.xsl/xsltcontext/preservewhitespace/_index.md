---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace metode"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace metode. Ketika dioverride dalam kelas turunan, mengevaluasi apakah harus mempertahankan node spasi putih atau menghapusnya untuk konteks yang diberikan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


Saat dioverride dalam kelas turunan, mengevaluasi apakah akan mempertahankan node spasi putih atau menghapusnya untuk konteks yang diberikan.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| node | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Node spasi putih yang akan dipertahankan atau dihapus dalam konteks saat ini. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
