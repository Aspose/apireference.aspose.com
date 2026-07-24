---
title: "طريقة System::Xml::XPath::XPathNavigator::LookupPrefix"
linktitle: "LookupPrefix"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::LookupPrefix. تُعيد البادئة المعلنة للـ namespace URI المحدد في C++."
type: docs
weight: 4800
url: /ar/cpp/system.xml.xpath/xpathnavigator/lookupprefix/
---
## XPathNavigator::LookupPrefix method


يعيد البادئة المعلنة للـ URI الفضاء الاسمي المحدد.

```cpp
String System::Xml::XPath::XPathNavigator::LookupPrefix(const String &namespaceURI) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| namespaceURI | const String\& | عنوان الـ namespace URI المراد حله للبادئة. |

### ReturnValue

[String](../../../system/string/) يحتوي على بادئة الـ namespace المعينة لعنوان الـ namespace URI المحدد؛ وإلا، [String::Empty](../../../system/string/empty/) إذا لم تُعيّن أي بادئة لعنوان الـ namespace URI المحدد. الـ [String](../../../system/string/) المُرجع مُذَوّب.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
