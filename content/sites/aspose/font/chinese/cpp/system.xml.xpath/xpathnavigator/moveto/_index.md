---
title: "System::Xml::XPath::XPathNavigator::MoveTo 方法"
linktitle: "MoveTo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::MoveTo 方法。 当在派生类中被重写时，在 C++ 中将 XPathNavigator 移动到与指定的 XPathNavigator 相同的位置。"
type: docs
weight: 5000
url: /zh/cpp/system.xml.xpath/xpathnavigator/moveto/
---
## XPathNavigator::MoveTo method


当在派生类中被重写时，将 [XPathNavigator](../) 移动到与指定的 [XPathNavigator](../) 相同的位置。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveTo(SharedPtr<XPathNavigator> other)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | SharedPtr\<XPathNavigator\> | 在您想要移动到的节点上定位的 [XPathNavigator](../)。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the same position as the specified [XPathNavigator](../); otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
