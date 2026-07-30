---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs 方法"
linktitle: "ValueAs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs 方法。返回已验证的 XML 元素或属性的值，类型由使用 IXmlNamespaceResolver 对象解析命名空间前缀指定，在 C++ 中使用。"
type: docs
weight: 1300
url: /zh/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


返回已验证的 XML 元素或属性的值，类型由使用 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀指定。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 返回已验证的 XML 元素或属性的值的目标类型。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

已验证的 XML 元素或属性的值，类型为请求的类型。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
