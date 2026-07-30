---
title: "System::Xml::XPath::XPathItem::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathItem::ValueAs 方法。返回该项目的值，以 C++ 中指定的类型。"
type: docs
weight: 1100
url: /zh/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


返回该项的值，作为指定的类型。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 返回项目值的类型。 |

### ReturnValue

项目的值为请求的类型。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


当在派生类中重写时，使用指定的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀，以返回项目的值，类型为指定的类型。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 返回项目值的类型。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

项目的值为请求的类型。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
