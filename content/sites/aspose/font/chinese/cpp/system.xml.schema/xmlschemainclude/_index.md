---
title: "System::Xml::Schema::XmlSchemaInclude class"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaInclude 类。表示由万维网联盟（W3C）指定的 XML Schema 中的 include 元素。此类用于从外部模式中包含声明和定义。随后，这些包含的声明和定义可在 C++ 中的包含模式中进行处理。"
type: docs
weight: 3600
url: /zh/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


表示由万维网联盟（W3C）通过 XML [Schema](../) 指定的 **include** 元素。此类用于从外部模式中包含声明和定义。随后，这些包含的声明和定义可在包含的模式中进行处理。

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | 返回 **annotation** 值。 |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | 设置 **annotation** 值。 |
| [XmlSchemaInclude](./xmlschemainclude/)() | 初始化 [XmlSchemaInclude](./) 类的新实例。 |
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
