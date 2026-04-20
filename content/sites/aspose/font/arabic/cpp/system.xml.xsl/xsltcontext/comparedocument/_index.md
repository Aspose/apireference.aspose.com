---
title: "System::Xml::Xsl::XsltContext::CompareDocument method"
linktitle: "CompareDocument"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument method. عند تجاوزها في فئة مشتقة، تقارن معرفات الموارد الموحدة (URIs) الأساسية لمستندين بناءً على ترتيب تحميل المستندات بواسطة معالج XSLT (أي فئة XslTransform) في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


عند تجاوزها في فئة مشتقة، تقارن معرفات الموارد الموحدة (URIs) الأساسية لمستندين بناءً على ترتيب تحميل المستندات بواسطة معالج XSLT (أي فئة [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| baseUri | String | معرف URI الأساسي للمستند الأول للمقارنة. |
| nextbaseUri | String | معرف URI الأساسي للمستند الثاني للمقارنة. |

### ReturnValue

قيمة عددية تصف الترتيب النسبي للمعرفين الأساسيين: -1 إذا كان **baseUri** يحدث قبل **nextbaseUri**؛ 0 إذا كان المعرفان الأساسيان متطابقان؛ و1 إذا كان **baseUri** يحدث بعد **nextbaseUri**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
