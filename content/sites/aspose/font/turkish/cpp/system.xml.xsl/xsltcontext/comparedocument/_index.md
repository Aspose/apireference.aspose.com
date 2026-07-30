---
title: "System::Xml::Xsl::XsltContext::CompareDocument method"
linktitle: "CompareDocument"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, iki belgenin temel Uniform Resource Identifier'larını (URI'ler) belgelerin XSLT işlemcisi (yani XslTransform sınıfı) tarafından C++'ta yüklenme sırasına göre karşılaştırır."
type: docs
weight: 100
url: /tr/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


Türetilmiş bir sınıfta geçersiz kılındığında, iki belgenin temel Uniform Resource Identifier'larını (URI'ler) belgelerin XSLT işlemcisi tarafından (yani [XslTransform](../../xsltransform/) sınıfı) yüklenme sırasına göre karşılaştırır.

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| baseUri | Dize | Karşılaştırılacak ilk belgenin temel URI'si. |
| nextbaseUri | Dize | Karşılaştırılacak ikinci belgenin temel URI'si. |

### ReturnValue

İki temel URI'nın göreceli sırasını tanımlayan bir tamsayı değeri: **baseUri**, **nextbaseUri**'den önce geliyorsa -1; iki temel URI aynıysa 0; ve **baseUri**, **nextbaseUri**'den sonra geliyorsa 1.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
