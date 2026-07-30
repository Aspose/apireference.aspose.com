---
title: "System::Xml::Schema::XmlSchemaChoice 类"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaChoice 类。表示由万维网联盟（W3C）在 XML Schema 中指定的 choice 元素（组合器）。在 C++ 中，choice 只允许其子元素中的一个出现在实例中。"
type: docs
weight: 1400
url: /zh/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


表示来自 XML [Schema](../) 的 **choice** 元素（组合器），该元素由万维网联盟（W3C）规定。**choice** 只允许其子元素中的一个出现在实例中。

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Items](./get_items/)() override | 返回包含在组合器 (**choice**) 中的元素集合： [XmlSchemaElement](../xmlschemaelement/)、[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](./)、[XmlSchemaSequence](../xmlschemasequence/) 或 [XmlSchemaAny](../xmlschemaany/)。 |
| [XmlSchemaChoice](./xmlschemachoice/)() | 初始化 [XmlSchemaChoice](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
