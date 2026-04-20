---
title: "System::Xml::XPath::XPathNavigator::AppendChild طريقة"
linktitle: "AppendChild"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNavigator::AppendChild طريقة. تُرجع كائن XmlWriter يُستخدم لإنشاء عقدة أو أكثر جديدة كأبناء في نهاية قائمة الأبناء للعقدة الحالية في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.xpath/xpathnavigator/appendchild/
---
## XPathNavigator::AppendChild() method


تُرجع كائن [XmlWriter](../../../system.xml/xmlwriter/) يُستخدم لإنشاء عقدة أو أكثر جديدة كأبناء في نهاية قائمة الأبناء للعقدة الحالية.

```cpp
virtual SharedPtr<XmlWriter> System::Xml::XPath::XPathNavigator::AppendChild()
```


### ReturnValue

كائن [XmlWriter](../../../system.xml/xmlwriter/) يُستخدم لإنشاء عقد أبنية جديدة في نهاية قائمة الأبناء للعقدة الحالية.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::AppendChild(SharedPtr\<XmlReader\>) method


ينشئ عقدة ابن جديدة في نهاية قائمة الأبناء للعقدة الحالية باستخدام محتويات XML لكائن [XmlReader](../../../system.xml/xmlreader/) المحدد.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChild(SharedPtr<XmlReader> newChild)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| newChild | SharedPtr\<XmlReader\> | كائن [XmlReader](../../../system.xml/xmlreader/) موضّح على بيانات XML للعقدة الابن الجديدة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::AppendChild(SharedPtr\<XPathNavigator\>) method


ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام العقد الموجودة في الـ [XPathNavigator](../) المحدد.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChild(SharedPtr<XPathNavigator> newChild)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| newChild | SharedPtr\<XPathNavigator\> | كائن [XPathNavigator](../) موضعه على العقدة التي ستُضاف كعقدة فرعية جديدة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::AppendChild(String) method


ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام سلسلة بيانات XML المحددة.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChild(String newChild)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| newChild | String | سلسلة بيانات XML للعقدة الفرعية الجديدة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
