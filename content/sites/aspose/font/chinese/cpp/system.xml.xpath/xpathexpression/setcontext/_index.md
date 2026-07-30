---
title: "System::Xml::XPath::XPathExpression::SetContext 方法"
linktitle: "SetContext"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathExpression::SetContext 方法。当在派生类中重写时，指定在 C++ 中用于命名空间解析的 IXmlNamespaceResolver 对象。"
type: docs
weight: 500
url: /zh/cpp/system.xml.xpath/xpathexpression/setcontext/
---
## XPathExpression::SetContext(SharedPtr\<IXmlNamespaceResolver\>) method


当在派生类中重写时，指定用于命名空间解析的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。

```cpp
virtual void System::Xml::XPath::XPathExpression::SetContext(SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 实现 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 接口以用于命名空间解析的对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::SetContext(SharedPtr\<XmlNamespaceManager\>) method


在派生类中重写时，指定用于命名空间解析的 [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/) 对象。

```cpp
virtual void System::Xml::XPath::XPathExpression::SetContext(SharedPtr<XmlNamespaceManager> nsManager)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nsManager | SharedPtr\<XmlNamespaceManager\> | 用于命名空间解析的 [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/) 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
