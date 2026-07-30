---
title: "System::Drawing::CharacterRange 类"
linktitle: "CharacterRange"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::CharacterRange 类。表示字符串中字符位置的范围。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 400
url: /zh/cpp/system.drawing/characterrange/
---
## CharacterRange class


表示字符串中字符位置的范围。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类来管理此类型的对象。

```cpp
class CharacterRange
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CharacterRange](./characterrange/)(int32_t, int32_t) | 构造一个表示指定范围的 [CharacterRange](./) 类的新实例。 |
| [CharacterRange](./characterrange/)() | 构造一个表示空范围的 [CharacterRange](./) 类的新实例。 |
| [get_First](./get_first/)() const | 返回当前对象所表示范围的第一个字符的位置。 |
| [get_Length](./get_length/)() const | 返回当前对象所表示范围中的字符数。 |
| [operator!=](./operator!=/)(const CharacterRange\&) const | 确定当前对象和指定对象是否表示不同的范围。 |
| [operator==](./operator==/)(const CharacterRange\&) const | 确定当前对象和指定对象是否表示相同的范围。 |
| [set_First](./set_first/)(int32_t) | 设置当前对象所表示范围的第一个字符的位置。 |
| [set_Length](./set_length/)(int32_t) | 返回当前对象所表示范围中的字符数。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
