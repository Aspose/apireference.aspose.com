---
title: "System::Xml::Schema::XmlSchemaFacet 类"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaFacet 类。所有在 C++ 中通过限制派生简单类型时使用的 facet 的基类。"
type: docs
weight: 2900
url: /zh/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


一个用于在通过限制派生简单类型时使用的所有 facet 的基类。

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | 返回指示此 facet 为固定的相关信息。 |
| [get_Value](./get_value/)() | 返回 facet 的 **value** 属性。 |
| virtual [set_IsFixed](./set_isfixed/)(bool) | 设置指示此 facet 为固定的相关信息。 |
| [set_Value](./set_value/)(const String\&) | 设置 facet 的 **value** 属性。 |
| [XmlSchemaFacet](./xmlschemafacet/)() | 初始化 [XmlSchemaFacet](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
