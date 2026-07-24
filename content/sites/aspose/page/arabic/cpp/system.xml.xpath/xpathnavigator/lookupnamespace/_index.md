---
title: "طريقة System::Xml::XPath::XPathNavigator::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::LookupNamespace. تُرجع URI مساحة الاسم للبادئة المحددة في C++."
type: docs
weight: 4700
url: /ar/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


يعيد URI مساحة الاسم للبادئة المحددة.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| prefix | const String\& | البادئة التي تريد حل URI مساحة الاسم الخاصة بها. لمطابقة مساحة الاسم الافتراضية، مرّر [String::Empty](../../../system/string/empty/). |

### ReturnValue

سلسلة [String](../../../system/string/) تحتوي على URI مساحة الاسم المعين للبادئة المحددة؛ **nullptr** إذا لم يُعيّن أي URI للبادئة المحددة. السلسلة [String](../../../system/string/) التي تم إرجاعها مُذرة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
