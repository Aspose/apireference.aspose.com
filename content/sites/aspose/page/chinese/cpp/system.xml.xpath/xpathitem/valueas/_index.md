---
title: "System::Xml::XPath::XPathItem::ValueAs 方法"
linktitle: "ValueAs"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathItem::ValueAs 方法。 在 C++ 中，返回 item''s 的值为指定的类型。"
type: docs
weight: 1100
url: /zh/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


返回该项的值，作为指定的类型。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 返回该项值的目标类型。 |

### ReturnValue

该项的值，以请求的类型返回。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


当在派生类中重写时，返回该项的值，使用指定的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象来解析命名空间前缀，以获取指定的类型。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 返回该项值的目标类型。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

该项的值，以请求的类型返回。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
