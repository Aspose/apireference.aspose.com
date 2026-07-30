---
title: "طريقة System::Xml::XPath::XPathNavigator::LookupPrefix"
linktitle: "LookupPrefix"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::LookupPrefix. تُرجع البادئة المعلنة للمساحة الاسمية (URI) المحددة في C++."
type: docs
weight: 4800
url: /ar/cpp/system.xml.xpath/xpathnavigator/lookupprefix/
---
## XPathNavigator::LookupPrefix method


يعيد البادئة المعلنة لعنوان URI للنطاق المحدد.

```cpp
String System::Xml::XPath::XPathNavigator::LookupPrefix(const String &namespaceURI) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| namespaceURI | const String\& | مسار URI للمساحة الاسمية الذي يجب حله للبادئة. |

### ReturnValue

سلسلة [String](../../../system/string/) تحتوي على بادئة المساحة الاسمية المعينة لمسار URI المحدد؛ وإلا، تكون [String::Empty](../../../system/string/empty/) إذا لم تُعيّن أي بادئة لمسار URI المحدد. السلسلة [String](../../../system/string/) المُرجعة مُذابة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
