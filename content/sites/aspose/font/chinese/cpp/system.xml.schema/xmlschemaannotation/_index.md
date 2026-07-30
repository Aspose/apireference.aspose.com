---
title: "System::Xml::Schema::XmlSchemaAnnotation 类"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAnnotation 类。表示 C++ 中的万维网联盟 (W3C) 注释元素。"
type: docs
weight: 700
url: /zh/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


表示万维网 [Web](../../system.web/) 联盟 (W3C) **annotation** 元素。

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Id](./get_id/)() | 返回字符串 id。 |
| [get_Items](./get_items/)() | 返回用于存储 **appinfo** 和 **documentation** 子元素的 **Items** 集合。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 返回不属于模式目标命名空间的限定属性。 |
| [set_Id](./set_id/)(const String\&) | 设置字符串 id。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 设置不属于模式目标命名空间的限定属性。 |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | 初始化 [XmlSchemaAnnotation](./) 类的新实例。 |
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
