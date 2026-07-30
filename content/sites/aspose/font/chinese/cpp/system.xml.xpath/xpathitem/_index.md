---
title: "System::Xml::XPath::XPathItem 类"
linktitle: "XPathItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathItem 类。表示 C++ 中 XQuery 1.0 和 XPath 2.0 数据模型中的一个项。"
type: docs
weight: 400
url: /zh/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


表示 XQuery 1.0 和 [XPath](../) 2.0 [Data](../../system.data/) 模型中的一个项。

```cpp
class XPathItem : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | 在派生类中重写时，获取一个值，指示该项是表示 [XPath](../) 节点还是原子值。 |
| virtual [get_TypedValue](./get_typedvalue/)() | 在派生类中重写时，获取当前项，作为根据其模式类型最合适的装箱对象。 |
| virtual [get_Value](./get_value/)() | 在派生类中重写时，获取该项的 **string** 值。 |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | 在派生类中重写时，获取该项的值，作为 [Boolean](../../system/boolean/) 类型。 |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | 在派生类中重写时，获取该项的值，作为 [DateTime](../../system/datetime/) 类型。 |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | 在派生类中重写时，获取该项的值，作为 [Double](../../system/double/) 类型。 |
| virtual [get_ValueAsInt](./get_valueasint/)() | 在派生类中重写时，获取该项的值，作为 [Int32](../../system/int32/) 类型。 |
| virtual [get_ValueAsLong](./get_valueaslong/)() | 在派生类中重写时，获取该项的值，作为 [Int64](../../system/int64/) 类型。 |
| virtual [get_ValueType](./get_valuetype/)() | 在派生类中重写时，获取该项的类型。 |
| virtual [get_XmlType](./get_xmltype/)() | 在派生类中重写时，获取该项的 XmlSchemaType。 |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | 返回该项的值，作为指定的类型。 |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 在派生类中重写时，返回该项的值，使用指定的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀后指定的类型。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
