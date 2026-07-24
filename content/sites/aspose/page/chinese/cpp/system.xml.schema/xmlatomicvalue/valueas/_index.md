---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method。返回在 C++ 中使用 IXmlNamespaceResolver 对象解析命名空间前缀时指定的类型的验证 XML 元素或属性的值。"
type: docs
weight: 1300
url: /zh/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


返回验证的 XML 元素或属性的值，使用 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象指定的类型，以解析命名空间前缀。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 返回验证的 XML 元素或属性的值所使用的类型。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

已验证的 XML 元素或属性的值，按请求的类型。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
