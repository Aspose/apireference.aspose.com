---
title: "System::Xml::Schema::XmlSchemaExternal 类"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaExternal 类。提供有关在 C++ 中包含的模式的信息。"
type: docs
weight: 2800
url: /zh/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


提供有关已包含模式的信息。

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Id](./get_id/)() | 返回字符串 id。 |
| [get_Schema](./get_schema/)() | 返回对引用模式的 [XmlSchema](../xmlschema/)。 |
| [get_SchemaLocation](./get_schemalocation/)() | 返回模式的统一资源标识符（URI）位置，该位置告诉模式处理器模式实际所在的位置。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 返回限定属性，这些属性不属于模式的目标命名空间。 |
| [set_Id](./set_id/)(const String\&) | 设置字符串 id。 |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | 设置对引用模式的 [XmlSchema](../xmlschema/)。 |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | 设置模式的统一资源标识符（URI）位置，该位置告诉模式处理器模式实际所在的位置。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 设置限定属性，这些属性不属于模式的目标命名空间。 |
| [XmlSchemaExternal](./xmlschemaexternal/)() | 初始化 [XmlSchemaExternal](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
