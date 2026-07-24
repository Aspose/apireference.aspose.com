---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke metode"
linktitle: "Invoke"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke metode. Menyediakan metode untuk memanggil fungsi dengan argumen yang diberikan dalam konteks yang diberikan di C++."
type: docs
weight: 500
url: /id/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Menyediakan metode untuk memanggil fungsi dengan argumen yang diberikan dalam konteks yang diberikan.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | Konteks XSLT untuk pemanggilan fungsi. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | Argumen dari pemanggilan fungsi. Setiap argumen adalah elemen dalam array. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Node konteks untuk pemanggilan fungsi. |

### ReturnValue

Sebuah [Object](../../../system/object/) yang mewakili nilai kembali fungsi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
