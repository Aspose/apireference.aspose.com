---
title: "System::Xml::XPath::XPathNavigator::AppendChild 方法"
linktitle: "AppendChild"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::AppendChild 方法。返回一个 XmlWriter 对象，用于在 C++ 中在当前节点的子节点列表末尾创建一个或多个新子节点。"
type: docs
weight: 100
url: /zh/cpp/system.xml.xpath/xpathnavigator/appendchild/
---
## XPathNavigator::AppendChild() method


返回一个 [XmlWriter](../../../system.xml/xmlwriter/) 对象，用于在当前节点的子节点列表末尾创建一个或多个新子节点。

```cpp
virtual SharedPtr<XmlWriter> System::Xml::XPath::XPathNavigator::AppendChild()
```


### ReturnValue

一个用于在当前节点的子节点列表末尾创建新子节点的 [XmlWriter](../../../system.xml/xmlwriter/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::AppendChild(SharedPtr\<XmlReader\>) method


使用指定的 [XmlReader](../../../system.xml/xmlreader/) 对象的 XML 内容，在当前节点的子节点列表末尾创建一个新子节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChild(SharedPtr<XmlReader> newChild)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlReader\> | 一个定位在新子节点 XML 数据上的 [XmlReader](../../../system.xml/xmlreader/) 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::AppendChild(SharedPtr\<XPathNavigator\>) method


使用指定的 [XPathNavigator](../) 中的节点，在当前节点的子节点列表末尾创建一个新子节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChild(SharedPtr<XPathNavigator> newChild)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| newChild | SharedPtr\<XPathNavigator\> | 一个定位在要添加为新子节点的节点上的 [XPathNavigator](../) 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::AppendChild(String) method


使用指定的 XML 数据字符串，在当前节点的子节点列表末尾创建一个新的子节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChild(String newChild)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| newChild | 字符串 | 新子节点的 XML 数据字符串。 |

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
