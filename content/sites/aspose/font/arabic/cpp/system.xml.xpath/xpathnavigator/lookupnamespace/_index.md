---
title: "طريقة System::Xml::XPath::XPathNavigator::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Font لـ C++"
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


| معامل | نوع | الوصف |
| --- | --- | --- |
| prefix | const String\& | البادئة التي تريد حل معرف مساحة الاسم لها. لمطابقة مساحة الاسم الافتراضية، مرّر [String::Empty](../../../system/string/empty/). |

### ReturnValue

‏[String](../../../system/string/) يحتوي على URI مساحة الاسم المعين للبادئة المحددة؛ **nullptr** إذا لم يتم تعيين URI مساحة اسم للبادئة المحددة. الـ [String](../../../system/string/) المُرجع مُذَكَّر.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
