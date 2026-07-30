---
title: "System::Text::StringBuilder 类"
linktitle: "StringBuilder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::StringBuilder 类。用于逐段累积字符串的缓冲区。此类型既可以作为值类型在栈上分配，也可以使用 System::MakeObject() 函数在堆上分配。对象分配后，切勿混用这两种情况：在栈分配的对象上持有 SmartPtr 指针在 C++ 中是严格禁止的。"
type: docs
weight: 2400
url: /zh/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Append](./append/)(char_t) | 向构建器添加字符。 |
| [Append](./append/)(char_t, int) | 向构建器添加字符序列。 |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | 向构建器添加字符数组。 |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | 向构建器添加字符数组切片。 |
| [Append](./append/)(const String\&) | 向构建器添加字符串。 |
| [Append](./append/)(const String\&, int, int) | 向构建器添加字符串切片。 |
| [Append](./append/)(const SharedPtr\<T\>\&) | 向构建器添加对象的字符串表示。 |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | 向构建器添加构建器的内容。 |
| [Append](./append/)(float) | 向构建器添加浮点值。 |
| [Append](./append/)(double) | 向构建器添加浮点值。 |
| [Append](./append/)(int) | 向构建器添加整数值。 |
| [Append](./append/)(T) | 向构建器添加算术值。 |
| [Append](./append/)(E) | 向构建器添加枚举值的字符串表示。 |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | 向构建器追加格式化字符串。 |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | 向构建器追加格式化字符串。 |
| [AppendLine](./appendline/)() | 向构建器追加换行字符。 |
| [AppendLine](./appendline/)(const String\&) | 向构建器追加字符串并随后换行字符。 |
| [Clear](./clear/)() | 从构建器中移除所有字符。 |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | 将构建器的数据复制到现有数组位置。 |
| [get_Capacity](./get_capacity/)() const | 获取字符串构建器的当前容量。 |
| [get_Length](./get_length/)() const | 获取当前在构建器中的字符串长度。 |
| [idx_get](./idx_get/)(int) const | 获取指定位置的字符。 |
| [idx_set](./idx_set/)(int, char_t) | 在指定位置设置字符。 |
| [Insert](./insert/)(int, const String\&) | 在构建器的固定位置插入字符串。 |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | 在构建器的固定位置插入重复字符串。 |
| [Insert](./insert/)(int, char_t) | 在构建器的固定位置插入字符。 |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | 在构建器的固定位置插入字符序列。 |
| [Insert](./insert/)(int, T) | 在构建器的固定位置插入值。 |
| [operator[]](./operator[]/)(int) const | 获取指定位置的字符。 |
| [Remove](./remove/)(int, int) | 从构建器中移除片段。 |
| [Replace](./replace/)(const String\&, const String\&) | 通过构建器替换子字符串。 |
| [Replace](./replace/)(const String\&, const String\&, int, int) | 通过构建器的范围替换子字符串。 |
| [Replace](./replace/)(char_t, char_t) | 通过构建器替换字符。 |
| [Replace](./replace/)(char_t, char_t, int, int) | 通过构建器的范围替换字符。 |
| [set_Capacity](./set_capacity/)(int) | 设置字符串构建器的当前容量。 |
| [set_Length](./set_length/)(int) | 截断或扩展字符串构建器至指定长度。 |
| [StringBuilder](./stringbuilder/)() | 构造函数。 |
| [StringBuilder](./stringbuilder/)(int) | 构造函数。 |
| [StringBuilder](./stringbuilder/)(const String\&) | 构造函数。 |
| [StringBuilder](./stringbuilder/)(const String\&, int) | 构造函数。 |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | 构造函数。 |
| [ToString](./tostring/)() const override | 获取当前包含在构建器中的字符串。 |
| [ToString](./tostring/)(int, int) const | 获取当前包含在构建器中的子字符串。 |
| [~StringBuilder](./~stringbuilder/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
