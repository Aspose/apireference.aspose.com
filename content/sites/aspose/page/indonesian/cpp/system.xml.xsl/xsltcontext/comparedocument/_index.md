---
title: "System::Xml::Xsl::XsltContext::CompareDocument metode"
linktitle: "CompareDocument"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument metode. Ketika dioverride dalam kelas turunan, membandingkan Uniform Resource Identifiers (URIs) dasar dari dua dokumen berdasarkan urutan pemuatan dokumen oleh proses XSLT (yaitu kelas XslTransform) dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


Ketika dioverride dalam kelas turunan, membandingkan Uniform Resource Identifiers (URIs) dasar dari dua dokumen berdasarkan urutan pemuatan dokumen oleh proses XSLT (yaitu kelas [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| baseUri | String | URI dasar dokumen pertama yang akan dibandingkan. |
| nextbaseUri | String | URI dasar dokumen kedua yang akan dibandingkan. |

### ReturnValue

Nilai integer yang menggambarkan urutan relatif dari dua URI dasar: -1 jika **baseUri** muncul sebelum **nextbaseUri**; 0 jika kedua URI dasar identik; dan 1 jika **baseUri** muncul setelah **nextbaseUri**.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
