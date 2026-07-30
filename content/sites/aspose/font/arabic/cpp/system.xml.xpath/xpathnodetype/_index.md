---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNodeType enum. يعرّف أنواع عقد XPath التي يمكن إرجاعها من الفئة XPathNavigator في C++."
type: docs
weight: 1100
url: /ar/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


يعرّف أنواع عقد [XPath](../) التي يمكن إرجاعها من الفئة [XPathNavigator](../xpathnavigator/).

```cpp
enum class XPathNodeType
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| الجذر | 0 | عقدة الجذر في مستند XML أو شجرة العقد. |
| Element | 1 | عنصر، مثل **<element>**. |
| Attribute | 2 | خاصية، مثل **id='123'**. |
| مساحة الاسم | 3 | مساحة اسم، مثل **xmlns=\"namespace\"**. |
| Text | 4 | محتوى النص لعقدة. يعادل نموذج كائن المستند [Object](../../system/object/) (DOM) لأنواع العقد [Text](../../system.text/) و CDATA. يحتوي على حرف واحد على الأقل. |
| مسافة بيضاء هامة | 5 | عقدة تحتوي على أحرف مسافة بيضاء وتكون **xml:space** مضبوطة على **preserve**. |
| مسافة بيضاء | 6 | عقدة تحتوي فقط على أحرف مسافة بيضاء ولا تحتوي على مسافة بيضاء ذات معنى. أحرف المسافة البيضاء هي **'\\x20'**، **'\\x0d'**، **'\\x0a'**، **'\\x09'**. |
| ProcessingInstruction | 7 | تعليمات معالجة، مثل **<?pi test?>**. لا تشمل إعلانات XML، التي لا تكون مرئية لفئة [XPathNavigator](../xpathnavigator/). |
| تعليق | 8 | تعليق، مثل ****. |
| All | 9 | أي من أنواع العقد [XPathNodeType](./). |

## انظر أيضًا

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
