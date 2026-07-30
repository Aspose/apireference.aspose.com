---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint 类"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint 类。用于标识约束（key、keyref 和 unique 元素）的类，适用于 C++。"
type: docs
weight: 3400
url: /zh/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


用于标识约束的类：**key**、**keyref** 和 **unique** 元素。

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Fields](./get_fields/)() | 返回作为子项适用于 XML 路径语言（[XPath](../../system.xml.xpath/)）表达式选择器的字段集合。 |
| [get_Name](./get_name/)() | 返回标识约束的名称。 |
| [get_QualifiedName](./get_qualifiedname/)() | 返回标识约束的限定名称，该名称保存 **QualifiedName** 值的编译后解释。 |
| [get_Selector](./get_selector/)() | 返回 [XPath](../../system.xml.xpath/) 表达式 **selector** 元素。 |
| [set_Name](./set_name/)(const String\&) | 设置标识约束的名称。 |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | 设置 [XPath](../../system.xml.xpath/) 表达式 **selector** 元素。 |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | 初始化 [XmlSchemaIdentityConstraint](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
