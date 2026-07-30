---
title: "System::Xml::XmlProcessingInstruction 类"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlProcessingInstruction 类。表示处理指令，XML 定义它用于在文档文本中保留特定处理器的信息（C++）。"
type: docs
weight: 3100
url: /zh/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


表示处理指令，XML 定义它用于在文档文本中保留特定处理器的信息。

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| [get_Data](./get_data/)() | 返回处理指令的内容，不包括目标。 |
| [get_InnerText](./get_innertext/)() override | 返回节点及其所有子节点的串联值。 |
| [get_LocalName](./get_localname/)() override | 返回节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_Target](./get_target/)() | 返回处理指令的目标。 |
| [get_Value](./get_value/)() override | 返回节点的值。 |
| [set_Data](./set_data/)(const String\&) | 设置处理指令的内容，不包括目标。 |
| [set_InnerText](./set_innertext/)(String) override | 设置节点及其所有子节点的连接值。 |
| [set_Value](./set_value/)(String) override | 设置节点的值。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。由于 ProcessingInstruction 节点没有子节点，此方法无效。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
