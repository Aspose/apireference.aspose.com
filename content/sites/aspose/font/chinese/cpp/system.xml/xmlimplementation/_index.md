---
title: "System::Xml::XmlImplementation 类"
linktitle: "XmlImplementation"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlImplementation 类。定义 C++ 中一组 XmlDocument 对象的上下文。"
type: docs
weight: 2000
url: /zh/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


定义一组 [XmlDocument](../xmldocument/) 对象的上下文。

```cpp
class XmlImplementation : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | 创建一个新的 [XmlDocument](../xmldocument/)。 |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | 测试文档 [Object](../../system/object/) 模型 (DOM) 实现是否实现了特定功能。 |
| [XmlImplementation](./xmlimplementation/)() | 初始化 [XmlImplementation](./) 类的新实例。 |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | 使用指定的 [XmlNameTable](../xmlnametable/) 初始化 [XmlImplementation](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
