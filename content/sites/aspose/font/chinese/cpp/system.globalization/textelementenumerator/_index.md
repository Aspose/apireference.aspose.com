---
title: "System::Globalization::TextElementEnumerator 类"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::TextElementEnumerator 类。用于遍历字符串元素（字符）的枚举器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2700
url: /zh/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


用于遍历字符串元素（字符）的枚举器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TextElementEnumerator : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Current](./get_current/)() const | 获取当前文本元素。 |
| [get_ElementIndex](./get_elementindex/)() const | 获取当前文本元素的索引。 |
| [GetTextElement](./gettextelement/)() const | 获取当前元素。 |
| [MoveNext](./movenext/)() | 移动到下一个元素。 |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | 将枚举器设置为初始位置。 |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
