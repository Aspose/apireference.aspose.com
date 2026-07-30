---
title: "System::Xml::Schema::XmlSchemaGroup 类"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaGroup 类。表示由万维网联盟（W3C）指定的 XML Schema 中的 group 元素。此类在 schema 级别定义组，这些组被复杂类型引用。它将一组元素声明组织起来，以便在 C++ 中将其作为组合并到复杂类型定义中。"
type: docs
weight: 3100
url: /zh/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


表示来自 XML [Schema](../) 且由万维网 [Web](../../system.web/) 联盟（W3C）指定的 **group** 元素。此类在 **schema** 级别定义组，这些组被复杂类型引用。它将一组元素声明组织起来，以便在复杂类型定义中作为组合并。

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Name](./get_name/)() | 返回模式组的名称。 |
| [get_Particle](./get_particle/)() | 返回以下类之一：[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/) 或 [XmlSchemaSequence](../xmlschemasequence/) 类。 |
| [get_QualifiedName](./get_qualifiedname/)() | 返回模式组的限定名称。 |
| [set_Name](./set_name/)(const String\&) | 设置模式组的名称。 |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | 设置以下类之一：[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/) 或 [XmlSchemaSequence](../xmlschemasequence/)。 |
| [XmlSchemaGroup](./xmlschemagroup/)() | 初始化 [XmlSchemaGroup](./) 类的新实例。 |
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
