---
title: "System::Xml::Serialization::IXmlSerializable 类"
linktitle: "IXmlSerializable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Serialization::IXmlSerializable 类。提供 XML 序列化和反序列化的自定义格式化。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 100
url: /zh/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


提供 XML 序列化和反序列化的自定义格式化。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IXmlSerializable : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetSchema](./getschema/)() | 一个 XmlSchema 对象，描述由 [WriteXml()](./writexml/) 方法返回并由 [ReadXml()](./readxml/) 方法接受的对象的 XML 表示。 |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | 从其 XML 表示反序列化对象。 |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | 将当前对象序列化为 XML 表示。 |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
