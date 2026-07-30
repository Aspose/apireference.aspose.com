---
title: "System::Xml::Schema::XmlSchemaKeyref 类"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaKeyref 类。此类在 C++ 中表示由万维网联盟（W3C）在 XMLSchema 中指定的 keyref 元素。"
type: docs
weight: 4000
url: /zh/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


此类表示由万维网联盟（W3C）在 XMLSchema 中指定的 **keyref** 元素。

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Refer](./get_refer/)() | 返回此约束在另一个简单或复杂类型中引用的键的名称。 |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置此约束在另一个简单或复杂类型中引用的键的名称。 |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | 初始化 [XmlSchemaKeyref](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
