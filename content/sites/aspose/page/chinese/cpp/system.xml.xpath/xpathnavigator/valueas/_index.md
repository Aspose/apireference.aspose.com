---
title: "System::Xml::XPath::XPathNavigator::ValueAs 方法"
linktitle: "ValueAs"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs 方法。返回当前节点的值，按指定的 Type 类型返回，使用在 C++ 中指定的 IXmlNamespaceResolver 对象来解析命名空间前缀。"
type: docs
weight: 8100
url: /zh/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


返回当前节点的值，按指定的 Type 类型返回，使用指定的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象来解析命名空间前缀。

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 要将当前节点的值返回为的 Type 类型。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

当前节点的值，以请求的 Type 类型返回。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
