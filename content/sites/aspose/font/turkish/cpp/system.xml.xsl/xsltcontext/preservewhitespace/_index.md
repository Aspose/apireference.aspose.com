---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace method"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, verilen bağlam için boşluk düğümlerinin korunup korunmayacağını C++'ta değerlendirir."
type: docs
weight: 300
url: /tr/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


Türetilmiş bir sınıfta geçersiz kılındığında, verilen bağlam için boşluk düğümlerinin korunup korunmayacağını ya da kaldırılacağını değerlendirir.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| düğüm | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Mevcut bağlamda korunacak veya kaldırılacak boşluk düğümü. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
