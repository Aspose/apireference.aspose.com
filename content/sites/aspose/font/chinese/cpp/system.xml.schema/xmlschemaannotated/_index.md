---
title: "System::Xml::Schema::XmlSchemaAnnotated 类"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAnnotated 类。该类是任何可以在 C++ 中包含注释元素的元素的基类。"
type: docs
weight: 600
url: /zh/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


任何可以包含注释元素的元素的基类。

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | 返回 **annotation** 属性。 |
| [get_Id](./get_id/)() | 返回字符串 id。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 返回不属于当前模式目标命名空间的限定属性。 |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | 设置 **annotation** 属性。 |
| [set_Id](./set_id/)(const String\&) | 设置字符串 id。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 设置不属于当前模式目标命名空间的限定属性。 |
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
