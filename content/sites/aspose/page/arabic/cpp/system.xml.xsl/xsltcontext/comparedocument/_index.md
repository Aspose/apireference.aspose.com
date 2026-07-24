---
title: "طريقة System::Xml::Xsl::XsltContext::CompareDocument"
linktitle: "CompareDocument"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Xsl::XsltContext::CompareDocument. عند تجاوزها في فئة مشتقة، تقارن معرفات الموارد الموحدة (URIs) الأساسية لمستندين بناءً على ترتيب تحميل المستندات بواسطة معالج XSLT (أي فئة XslTransform) في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


عند تجاوزها في فئة مشتقة، تقارن معرفات الموارد الموحدة (URIs) الأساسية لمستندين بناءً على ترتيب تحميل المستندات بواسطة معالج XSLT (أي فئة [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| baseUri | String | معرف URI الأساسي للمستند الأول للمقارنة. |
| nextbaseUri | String | معرف URI الأساسي للمستند الثاني للمقارنة. |

### ReturnValue

قيمة عددية صحيحة تصف الترتيب النسبي للمعرفين الأساسيين: -1 إذا كان **baseUri** يحدث قبل **nextbaseUri**؛ 0 إذا كان المعرفان الأساسيان متطابقان؛ و 1 إذا كان **baseUri** يحدث بعد **nextbaseUri**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
