---
title: "System::Xml::Schema::XmlSchemaImport 类"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaImport 类。表示由万维网联盟 (W3C) 指定的 XML 架构中的 import 元素。此类用于在 C++ 中从其他架构导入架构组件。"
type: docs
weight: 3500
url: /zh/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


表示由万维网 [Web](../../system.web/) 联盟 (W3C) 指定的 XML [Schema](../) 中的 **import** 元素。此类用于导入其他架构中的架构组件。

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | 返回 **annotation** 值。 |
| [get_Namespace](./get_namespace/)() | 返回导入的架构的目标命名空间，作为统一资源标识符 (URI) 引用。 |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | 设置 **annotation** 值。 |
| [set_Namespace](./set_namespace/)(const String\&) | 设置导入的架构的目标命名空间，作为统一资源标识符 (URI) 引用。 |
| [XmlSchemaImport](./xmlschemaimport/)() | 初始化 [XmlSchemaImport](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
