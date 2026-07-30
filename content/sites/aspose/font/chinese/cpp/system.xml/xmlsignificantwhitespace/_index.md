---
title: "System::Xml::XmlSignificantWhitespace 类"
linktitle: "XmlSignificantWhitespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlSignificantWhitespace 类。表示混合内容节点中标记之间的空白，或 xml:space=''preserve'' 范围内的空白。这在 C++ 中也称为显著空白。"
type: docs
weight: 3700
url: /zh/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


表示混合内容节点中标记之间的空白或 **xml:space='preserve'** 范围内的空白，也称为显著空白。

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
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
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
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
