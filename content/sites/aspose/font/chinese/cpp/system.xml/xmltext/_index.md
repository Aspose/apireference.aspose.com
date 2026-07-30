---
title: "System::Xml::XmlText 类"
linktitle: "XmlText"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlText 类。表示 C++ 中元素或属性的文本内容。"
type: docs
weight: 3800
url: /zh/cpp/system.xml/xmltext/
---
## XmlText class


表示元素或属性的文本内容。

```cpp
class XmlText : public System::Xml::XmlCharacterData
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| [get_LocalName](./get_localname/)() override | 返回节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_PreviousText](./get_previoustext/)() override | 返回紧接此节点之前的文本节点。 |
| [get_Value](./get_value/)() override | 返回节点的值。 |
| [set_Value](./set_value/)(String) override | 设置节点的值。 |
| virtual [SplitText](./splittext/)(int32_t) | 在指定的偏移处将节点拆分为两个节点，并将它们作为兄弟节点保留在树中。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。[XmlText](./) 节点没有子节点，因此此方法无效。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
