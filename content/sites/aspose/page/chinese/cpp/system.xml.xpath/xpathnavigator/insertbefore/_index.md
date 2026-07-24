---
title: "System::Xml::XPath::XPathNavigator::InsertBefore method"
linktitle: "InsertBefore"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::InsertBefore 方法。返回一个 XmlWriter 对象，用于在 C++ 中在当前选定节点之前创建一个新的兄弟节点。"
type: docs
weight: 4200
url: /zh/cpp/system.xml.xpath/xpathnavigator/insertbefore/
---
## XPathNavigator::InsertBefore() method


返回一个用于在当前选定节点之前创建新兄弟节点的 [XmlWriter](../../../system.xml/xmlwriter/) 对象。

```cpp
virtual SharedPtr<XmlWriter> System::Xml::XPath::XPathNavigator::InsertBefore()
```


### ReturnValue

一个用于在当前选定节点之前创建新兄弟节点的 [XmlWriter](../../../system.xml/xmlwriter/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::InsertBefore(SharedPtr\<XmlReader\>) method


使用指定的 [XmlReader](../../../system.xml/xmlreader/) 对象的 XML 内容，在当前选定节点之前创建一个新的兄弟节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertBefore(SharedPtr<XmlReader> newSibling)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| newSibling | SharedPtr\<XmlReader\> | 一个定位在新兄弟节点的 XML 数据上的 [XmlReader](../../../system.xml/xmlreader/) 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::InsertBefore(SharedPtr\<XPathNavigator\>) method


使用指定的 [XPathNavigator](../) 中的节点，在当前选定节点之前创建一个新的兄弟节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertBefore(SharedPtr<XPathNavigator> newSibling)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| newSibling | SharedPtr\<XPathNavigator\> | 一个定位在要添加为新兄弟节点的节点上的 [XPathNavigator](../) 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::InsertBefore(String) method


使用指定的 XML 字符串在当前选定节点之前创建新兄弟节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertBefore(String newSibling)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| newSibling | 字符串 | 新兄弟节点的 XML 数据字符串。 |

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
