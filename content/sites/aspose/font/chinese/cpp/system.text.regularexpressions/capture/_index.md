---
title: "System::Text::RegularExpressions::Capture class"
linktitle: "Capture"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::Capture 类。单个子表达式匹配的结果。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.text.regularexpressions/capture/
---
## Capture class


单个子表达式匹配的结果。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Capture : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Capture](./capture/)(const UStringPtr\&, int, int) | 构造函数。 |
| [get_Index](./get_index/)() const | 获取捕获子串的索引。 |
| [get_Length](./get_length/)() const | 获取捕获子串的长度。 |
| [get_Value](./get_value/)() const | 获取捕获的子串。 |
| [ToString](./tostring/)() const override | 获取捕获的子串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
