---
title: "System::Xml::Schema::XmlSchemaNotation 类"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaNotation 类。表示由万维网联盟（W3C）指定的 XML Schema 中的 notation 元素。XML Schemanotation 声明是对 XML 1.0 NOTATION 声明的重建。notation 的目的是描述 XML 文档中非 XML 数据的格式，在 C++ 中实现。"
type: docs
weight: 4800
url: /zh/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


表示由万维网 [Web](../../system.web/) 联盟（W3C）指定的 XML [Schema](../) **notation** 元素。XML [Schema](../)**notation** 声明是对 **XML** 1.0 NOTATION 声明的重建。notation 的目的是描述 XML 文档中非 XML 数据的格式。

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Name](./get_name/)() | 返回 notation 的名称。 |
| [get_Public](./get_public/)() | 返回 **public** 标识符。 |
| [get_System](./get_system/)() | 返回 **system** 标识符。 |
| [set_Name](./set_name/)(const String\&) | 设置符号的名称。 |
| [set_Public](./set_public/)(const String\&) | 设置 **public** 标识符。 |
| [set_System](./set_system/)(const String\&) | 设置 **system** 标识符。 |
| [XmlSchemaNotation](./xmlschemanotation/)() | 初始化 [XmlSchemaNotation](./) 类的新实例。 |
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
