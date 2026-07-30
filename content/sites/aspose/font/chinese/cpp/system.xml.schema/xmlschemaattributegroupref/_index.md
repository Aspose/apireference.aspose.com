---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef 类"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef 类。表示 XML Schema 中具有 ref 属性的 attributeGroup 元素（如规范所述）。AttributesGroupRef 是 attributeGroup 的引用，name 属性包含在 C++ 中被引用的属性组。"
type: docs
weight: 1300
url: /zh/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


表示来自 XML [Schema](../) 且符合 [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454) 规范的 **attributeGroup** 元素及其 **ref** 属性。AttributesGroupRef 是 attributeGroup 的引用，name 属性包含被引用的属性组。

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_RefName](./get_refname/)() | 返回被引用的 **attributeGroup** 元素的名称。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置被引用的 **attributeGroup** 元素的名称。 |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | 初始化 [XmlSchemaAttributeGroupRef](./) 类的新实例。 |
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
