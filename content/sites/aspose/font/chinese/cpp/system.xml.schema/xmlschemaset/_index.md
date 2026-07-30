---
title: "System::Xml::Schema::XmlSchemaSet 类"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet 类。包含 C++ 中的 XML 模式定义语言 (XSD) 架构缓存。"
type: docs
weight: 5800
url: /zh/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


包含 XML [Schema](../) 定义语言 (XSD) 架构的缓存。

```cpp
class XmlSchemaSet : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(String, const String\&) | 将指定 URL 处的 XML [Schema](../) 定义语言 (XSD) 架构添加到 [XmlSchemaSet](./)。 |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | 将包含在 [XmlReader](../../system.xml/xmlreader/) 中的 XML [Schema](../) 定义语言 (XSD) 架构添加到 [XmlSchemaSet](./)。 |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | 将给定的 [XmlSchemaSet](./) 中的所有 XML [Schema](../) 定义语言 (XSD) 架构添加到 [XmlSchemaSet](./)。 |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | 将给定的 [XmlSchema](../xmlschema/) 添加到 [XmlSchemaSet](./)。 |
| [Compile](./compile/)() | 将添加到 [XmlSchemaSet](./) 的 XML [Schema](../) 定义语言 (XSD) 架构编译为一个逻辑架构。 |
| [Contains](./contains/)(String) | 指示具有指定目标命名空间 URI 的 XML [Schema](../) 定义语言 (XSD) 架构是否在 [XmlSchemaSet](./) 中。 |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | 指示指定的 XML [Schema](../) 定义语言 (XSD) [XmlSchema](../xmlschema/) 对象是否在 [XmlSchemaSet](./) 中。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | 将 [XmlSchemaSet](./) 中的所有 [XmlSchema](../xmlschema/) 对象复制到给定的数组，从给定的索引开始。 |
| [get_CompilationSettings](./get_compilationsettings/)() | 返回用于 [XmlSchemaSet](./) 的 [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/)。 |
| [get_Count](./get_count/)() | 返回 [XmlSchemaSet](./) 中逻辑 XML [Schema](../) 定义语言 (XSD) 架构的数量。 |
| [get_GlobalAttributes](./get_globalattributes/)() | 返回 [XmlSchemaSet](./) 中所有 XML [Schema](../) 定义语言 (XSD) 架构的全局属性。 |
| [get_GlobalElements](./get_globalelements/)() | 返回 [XmlSchemaSet](./) 中所有 XML [Schema](../) 定义语言 (XSD) 架构的全局元素。 |
| [get_GlobalTypes](./get_globaltypes/)() | 返回 [XmlSchemaSet](./) 中所有 XML [Schema](../) 定义语言 (XSD) 架构的全局简单类型和复杂类型。 |
| [get_IsCompiled](./get_iscompiled/)() | 返回一个值，指示 [XmlSchemaSet](./) 中的 XML [Schema](../) 定义语言 (XSD) 架构是否已编译。 |
| [get_NameTable](./get_nametable/)() | 返回 [XmlSchemaSet](./) 在加载新 XML [Schema](../) 定义语言 (XSD) 架构时使用的默认 [XmlNameTable](../../system.xml/xmlnametable/)。 |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | 从 [XmlSchemaSet](./) 中移除指定的 XML [Schema](../) 定义语言 (XSD) 架构。 |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | 从 [XmlSchemaSet](./) 中移除指定的 XML [Schema](../) 定义语言 (XSD) 架构及其导入的所有架构。 |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | 重新处理已存在于 [XmlSchemaSet](./) 中的 XML [Schema](../) 定义语言 (XSD) 架构。 |
| [Schemas](./schemas/)() | 返回 [XmlSchemaSet](./) 中所有 XML [Schema](../) 定义语言 (XSD) 架构的集合。 |
| [Schemas](./schemas/)(String) | 返回属于给定命名空间的 [XmlSchemaSet](./) 中所有 XML [Schema](../) 定义语言 (XSD) 架构的集合。 |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | 为 [XmlSchemaSet](./) 设置 [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/)。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 设置用于解析模式中 include 和 import 元素引用的命名空间或位置的 [XmlResolver](../../system.xml/xmlresolver/)。 |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | 添加事件处理程序以接收有关 XML [Schema](../) 定义语言 (XSD) 架构验证错误的信息。 |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | 移除用于接收有关 XML [Schema](../) 定义语言 (XSD) 架构验证错误信息的事件处理程序。 |
| [XmlSchemaSet](./xmlschemaset/)() | 初始化 [XmlSchemaSet](./) 类的新实例。 |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | 使用指定的 [XmlNameTable](../../system.xml/xmlnametable/) 初始化 [XmlSchemaSet](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
