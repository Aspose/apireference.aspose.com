---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension 类"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中的 extension 元素。此类用于通过扩展派生的具有复杂内容模型的复杂类型。它通过在 C++ 中添加属性或元素来扩展该复杂类型。"
type: docs
weight: 1900
url: /zh/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


表示来自 XML [Schema](../) 的 **extension** 元素，符合万维网 [Web](../../system.web/) 联盟 (W3C) 的规范。此类用于通过扩展派生的具有复杂内容模型的复杂类型。它通过添加属性或元素来扩展该复杂类型。

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 返回复杂内容模型的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 组件。 |
| [get_Attributes](./get_attributes/)() | 返回复杂内容的属性集合。包含 [XmlSchemaAttribute](../xmlschemaattribute/) 和 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 元素。 |
| [get_BaseTypeName](./get_basetypename/)() | 返回此类型通过扩展派生自的复杂类型的名称。 |
| [get_Particle](./get_particle/)() | 返回以下类之一：[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/) 或 [XmlSchemaSequence](../xmlschemasequence/) 类。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 设置复杂内容模型的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 组件。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置此类型通过扩展派生自的复杂类型的名称。 |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | 设置以下类之一：[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/) 或 [XmlSchemaSequence](../xmlschemasequence/)。 |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | 初始化 [XmlSchemaComplexContentExtension](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
