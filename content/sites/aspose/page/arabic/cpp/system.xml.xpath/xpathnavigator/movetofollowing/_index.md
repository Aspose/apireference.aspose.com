---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing method"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::MoveToFollowing. تنقل XPathNavigator إلى العنصر الذي له الاسم المحلي ومسار مساحة الاسم URI المحددين بترتيب المستند في C++."
type: docs
weight: 5700
url: /ar/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


ينقل [XPathNavigator](../) إلى العنصر الذي له الاسم المحلي ومسار مساحة الاسم URI المحددين بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف URI للمساحة الاسمية للعنصر. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


ينقل [XPathNavigator](../) إلى العنصر الذي له الاسم المحلي ومسار مساحة الاسم URI المحددين، إلى الحد المحدد، بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف URI للمساحة الاسمية للعنصر. |
| end | SharedPtr\<XPathNavigator\> | كائن [XPathNavigator](../) الموضع على حد العنصر الذي لن يتجاوزه [XPathNavigator](../) الحالي أثناء البحث عن العنصر التالي. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


ينقل [XPathNavigator](../) إلى العنصر التالي من نوع [XPathNodeType](../../xpathnodetype/) المحدد بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | XPathNodeType | نوع [XPathNodeType](../../xpathnodetype/) للعنصر. لا يمكن أن يكون نوع [XPathNodeType](../../xpathnodetype/) هو [XPathNodeType::Attribute](../../xpathnodetype/) أو [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


ينقل الـ[XPathNavigator](../) إلى العنصر التالي من نوع [XPathNodeType](../../xpathnodetype/) المحدد، إلى الحد المحدد، بترتيب المستند.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | XPathNodeType | نوع [XPathNodeType](../../xpathnodetype/) للعنصر. لا يمكن أن يكون نوع [XPathNodeType](../../xpathnodetype/) هو [XPathNodeType::Attribute](../../xpathnodetype/) أو [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | كائن [XPathNavigator](../) الموضع على حد العنصر الذي لن يتجاوزه [XPathNavigator](../) الحالي أثناء البحث عن العنصر التالي. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
