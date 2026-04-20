---
title: "طريقة System::Xml::XPath::XPathNavigator::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::GetAttribute. تُرجع قيمة السمة ذات الاسم المحلي ومساحة الاسم المحددين في C++."
type: docs
weight: 3800
url: /ar/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


يعيد قيمة السمة ذات الاسم المحلي المحدد ومسار URI مساحة الاسم.

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للصفة. **localName** حسّاس لحالة الأحرف. |
| namespaceURI | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

سلسلة [String](../../../system/string/) تحتوي على قيمة السمة المحددة؛ [String::Empty](../../../system/string/empty/) إذا لم يتم العثور على سمة مطابقة، أو إذا لم يكن الـ [XPathNavigator](../) متموضعًا على عقدة عنصر.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
