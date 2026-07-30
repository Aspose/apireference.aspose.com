---
title: "طريقة System::Xml::XPath::XPathNavigator::MoveToFollowing"
linktitle: "MoveToFollowing"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::MoveToFollowing. تنقل XPathNavigator إلى العنصر الذي يحمل الاسم المحلي ومعرف مساحة الاسم المحددين بترتيب المستند في C++."
type: docs
weight: 5700
url: /ar/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


ينقل [XPathNavigator](../) إلى العنصر الذي يحمل الاسم المحلي ومعرف مساحة الاسم المحددين بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف مساحة الاسم (URI) للعنصر. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


ينقل [XPathNavigator](../) إلى العنصر الذي يحمل الاسم المحلي ومعرف مساحة الاسم المحددين، إلى الحد المحدد، بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف مساحة الاسم (URI) للعنصر. |
| end | SharedPtr\<XPathNavigator\> | كائن [XPathNavigator](../) الموجود على حد العنصر الذي لن يتجاوزه [XPathNavigator](../) الحالي أثناء البحث عن العنصر التالي. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


ينقل [XPathNavigator](../) إلى العنصر التالي من نوع [XPathNodeType](../../xpathnodetype/) المحدد بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) الخاص بالعنصر. لا يمكن أن يكون [XPathNodeType](../../xpathnodetype/) هو [XPathNodeType::Attribute](../../xpathnodetype/) أو [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


ينقل [XPathNavigator](../) إلى العنصر التالي من نوع [XPathNodeType](../../xpathnodetype/) المحدد، إلى الحد المحدد، بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) الخاص بالعنصر. لا يمكن أن يكون [XPathNodeType](../../xpathnodetype/) هو [XPathNodeType::Attribute](../../xpathnodetype/) أو [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | كائن [XPathNavigator](../) الموجود على حد العنصر الذي لن يتجاوزه [XPathNavigator](../) الحالي أثناء البحث عن العنصر التالي. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
