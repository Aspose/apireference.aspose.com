---
title: "System::Xml::Xsl::XsltContext::ResolveVariable metode"
linktitle: "ResolveVariable"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable metode. Ketika dioverride dalam kelas turunan, menyelesaikan referensi variabel dan mengembalikan sebuah IXsltContextVariable yang mewakili variabel tersebut dalam C++."
type: docs
weight: 500
url: /id/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


Ketika dioverride dalam kelas turunan, menyelesaikan referensi variabel dan mengembalikan sebuah [IXsltContextVariable](../../ixsltcontextvariable/) yang mewakili variabel tersebut.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| prefix | String | Awalan variabel sebagaimana muncul dalam ekspresi [XPath](../../../system.xml.xpath/). |
| name | String | Nama variabel. |

### ReturnValue

Sebuah [IXsltContextVariable](../../ixsltcontextvariable/) yang mewakili variabel pada waktu berjalan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
