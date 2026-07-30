---
title: "System::Xml::Schema::XmlSchemaParticle 类"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaParticle 类。它是所有粒子类型（例如 XmlSchemaAny）的基类，在 C++ 中。"
type: docs
weight: 5400
url: /zh/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


它是所有粒子类型（例如 [XmlSchemaAny](../xmlschemaany/)）的基类。

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | 返回粒子可以出现的最大次数。 |
| [get_MaxOccursString](./get_maxoccursstring/)() | 以字符串值返回数字。粒子可以出现的最大次数。 |
| [get_MinOccurs](./get_minoccurs/)() | 返回粒子可以出现的最小次数。 |
| [get_MinOccursString](./get_minoccursstring/)() | 以字符串值返回数字。粒子可以出现的最小次数。 |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | 设置粒子可以出现的最大次数。 |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | 以字符串值设置数字。粒子可以出现的最大次数。 |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | 设置粒子可以出现的最小次数。 |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | 将数字设置为字符串值。粒子可以出现的最小次数。 |
| [XmlSchemaParticle](./xmlschemaparticle/)() | 初始化 [XmlSchemaParticle](./) 类的新实例。 |
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
