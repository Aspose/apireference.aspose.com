---
title: "System::Xml::Schema::XmlSchemaCompilationSettings 类"
linktitle: "XmlSchemaCompilationSettings"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaCompilationSettings 类。为 XmlSchemaSet 类提供模式编译选项。此类在 C++ 中不可继承。"
type: docs
weight: 1700
url: /zh/cpp/system.xml.schema/xmlschemacompilationsettings/
---
## XmlSchemaCompilationSettings class


为 [XmlSchemaSet](../xmlschemaset/) 类提供模式编译选项。此类不可继承。

```cpp
class XmlSchemaCompilationSettings : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_EnableUpaCheck](./get_enableupacheck/)() | 返回一个值，指示 [XmlSchemaSet](../xmlschemaset/) 是否应检查唯一粒子归属 (UPA) 违规。 |
| [set_EnableUpaCheck](./set_enableupacheck/)(bool) | 设置一个值，指示 [XmlSchemaSet](../xmlschemaset/) 是否应检查唯一粒子归属 (UPA) 违规。 |
| [XmlSchemaCompilationSettings](./xmlschemacompilationsettings/)() | 初始化 [XmlSchemaCompilationSettings](./) 类的新实例。 |
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
