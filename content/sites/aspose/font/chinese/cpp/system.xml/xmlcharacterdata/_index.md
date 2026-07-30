---
title: "System::Xml::XmlCharacterData 类"
linktitle: "XmlCharacterData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlCharacterData 类。提供在 C++ 中多个类使用的文本操作方法。"
type: docs
weight: 900
url: /zh/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


提供多个类使用的文本操作方法。

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | 将指定的字符串追加到节点的字符数据末尾。 |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | 从节点中删除一段字符范围。 |
| virtual [get_Data](./get_data/)() | 返回节点的数据。 |
| [get_InnerText](./get_innertext/)() override | 返回节点及其所有子节点的连接值。 |
| virtual [get_Length](./get_length/)() | 返回数据的长度（字符数）。 |
| [get_Value](./get_value/)() override | 返回节点的值。 |
| virtual [InsertData](./insertdata/)(int32_t, String) | 在指定的字符偏移处插入指定的字符串。 |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | 用指定的字符串替换从指定偏移开始的指定数量的字符。 |
| virtual [set_Data](./set_data/)(String) | 设置节点的数据。 |
| [set_InnerText](./set_innertext/)(String) override | 设置节点及其所有子节点的连接值。 |
| [set_Value](./set_value/)(String) override | 设置节点的值。 |
| virtual [Substring](./substring/)(int32_t, int32_t) | 从指定范围检索完整字符串的子串。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
