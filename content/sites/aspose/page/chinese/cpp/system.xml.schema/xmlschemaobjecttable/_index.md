---
title: "System::Xml::Schema::XmlSchemaObjectTable 类"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaObjectTable 类。提供在 C++ 中 XmlSchema 类所包含元素的集合（例如 Attributes、AttributeGroups、Elements 等）。"
type: docs
weight: 5300
url: /zh/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


提供在 [XmlSchema](../xmlschema/) 类中所包含元素的集合（例如 Attributes、AttributeGroups、Elements 等）。

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | 确定指定的限定名称是否存在于集合中。 |
| [get_Count](./get_count/)() | 返回 [XmlSchemaObjectTable](./) 中包含的项数。 |
| [get_Names](./get_names/)() | 返回 [XmlSchemaObjectTable](./) 中所有已命名元素的集合。 |
| [get_Values](./get_values/)() | 返回 [XmlSchemaObjectTable](./) 中所有元素的所有值的集合。 |
| [GetEnumerator](./getenumerator/)() override | 返回可遍历 [XmlSchemaObjectTable](./) 的枚举器。 |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | 返回由限定名称指定的 [XmlSchemaObjectTable](./) 中的元素。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
