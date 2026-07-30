---
title: "System::Xml::Schema::XmlSchemaAppInfo 类"
linktitle: "XmlSchemaAppInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAppInfo 类。表示在 C++ 中的万维网联盟（W3C）appinfo 元素。"
type: docs
weight: 1000
url: /zh/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


表示万维网联盟（W3C）[Web](../../system.web/) 的 **appinfo** 元素。

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Markup](./get_markup/)() | 返回一个 [XmlNode](../../system.xml/xmlnode/) 对象数组，表示 **appinfo** 子节点。 |
| [get_Source](./get_source/)() | 返回应用信息的来源。 |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | 设置一个 [XmlNode](../../system.xml/xmlnode/) 对象数组，表示 **appinfo** 子节点。 |
| [set_Source](./set_source/)(const String\&) | 设置应用信息的来源。 |
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
