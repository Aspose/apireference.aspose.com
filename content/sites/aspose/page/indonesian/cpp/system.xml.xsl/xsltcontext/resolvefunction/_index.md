---
title: "System::Xml::Xsl::XsltContext::ResolveFunction metode"
linktitle: "ResolveFunction"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction metode. Ketika dioverride dalam kelas turunan, menyelesaikan referensi fungsi dan mengembalikan IXsltContextFunction yang mewakili fungsi tersebut. IXsltContextFunction digunakan pada waktu eksekusi untuk mendapatkan nilai kembali fungsi dalam C++."
type: docs
weight: 400
url: /id/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Ketika dioverride dalam kelas turunan, menyelesaikan referensi fungsi dan mengembalikan [IXsltContextFunction](../../ixsltcontextfunction/) yang mewakili fungsi tersebut. [IXsltContextFunction](../../ixsltcontextfunction/) digunakan pada waktu eksekusi untuk mendapatkan nilai kembali fungsi.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| prefix | String | Prefiks fungsi sebagaimana muncul dalam ekspresi [XPath](../../../system.xml.xpath/). |
| name | String | Nama fungsi. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Sebuah array tipe argumen untuk fungsi yang sedang diselesaikan. Ini memungkinkan Anda memilih di antara metode dengan nama yang sama (misalnya, metode yang overload). |

### ReturnValue

Sebuah [IXsltContextFunction](../../ixsltcontextfunction/) yang mewakili fungsi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
