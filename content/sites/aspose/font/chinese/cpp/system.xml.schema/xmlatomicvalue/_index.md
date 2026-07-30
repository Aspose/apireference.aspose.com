---
title: "System::Xml::Schema::XmlAtomicValue 类"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlAtomicValue 类。表示已验证的 XML 元素或属性的类型化值。XmlAtomicValue 类在 C++ 中不能被继承。"
type: docs
weight: 300
url: /zh/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


表示已验证的 XML 元素或属性的类型化值。[XmlAtomicValue](./) 类不能被继承。

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 返回此 [XmlAtomicValue](./) 对象的副本。 |
| [get_IsNode](./get_isnode/)() override | 返回一个值，指示已验证的 XML 元素或属性是 [XPath](../../system.xml.xpath/) 节点还是原子值。 |
| [get_TypedValue](./get_typedvalue/)() override | 返回当前已验证的 XML 元素或属性，作为根据其模式类型的最合适类型的装箱对象。 |
| [get_Value](./get_value/)() override | 返回已验证的 XML 元素或属性的 [String](../../system/string/) 值。 |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | 返回已验证的 XML 元素或属性的值，作为 [Boolean](../../system/boolean/) 类型。 |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | 返回已验证的 XML 元素或属性的值，作为 [DateTime](../../system/datetime/) 类型。 |
| [get_ValueAsDouble](./get_valueasdouble/)() override | 返回已验证的 XML 元素或属性的值，作为 [Double](../../system/double/) 类型。 |
| [get_ValueAsInt](./get_valueasint/)() override | 返回已验证的 XML 元素或属性的值，作为 [Int32](../../system/int32/) 类型。 |
| [get_ValueAsLong](./get_valueaslong/)() override | 返回已验证的 XML 元素或属性的值，作为 [Int64](../../system/int64/) 类型。 |
| [get_ValueType](./get_valuetype/)() override | 返回已验证的 XML 元素或属性的类型。 |
| [get_XmlType](./get_xmltype/)() override | 返回已验证的 XML 元素或属性的 [XmlSchemaType](../xmlschematype/)。 |
| [ToString](./tostring/)() const override | 返回已验证的 XML 元素或属性的 [String](../../system/string/) 值。 |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | 返回已验证的 XML 元素或属性的值，使用指定的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀后得到的类型。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
