---
title: "System::Guid class"
linktitle: "Guid"
second_title: "Aspose.Font 适用于 C++"
description: "System::Guid 类。表示全局唯一标识符（Globally Unique Identifier）。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 3000
url: /zh/cpp/system/guid/
---
## Guid class


表示全局唯一标识符（GUID）。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
class Guid
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | 对当前对象和指定对象所表示的 GUID 执行算术比较。 |
| [Equals](./equals/)(const Guid\&) const | 确定当前对象和指定对象所表示的 GUID 是否相等。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [Guid](./guid/)() | 构造一个表示全零 GUID 的对象。 |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | 构造一个将 GUID 表示为无符号 8 位整数数组的对象。 |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | 构造一个将 GUID 表示为无符号 8 位整数数组视图的对象。 |
| [Guid](./guid/)(const String\&) | 构造一个将 GUID 表示为字符串的对象。 |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | 从指定的 GUID 组件构造 [Guid](./) 类的实例。 |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | 从指定的 GUID 组件构造 [Guid](./) 类的实例。 |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | 从指定的无符号整数和字节构造 [Guid](./) 类的实例。 |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | 从指定的无符号整数和字节构造 [Guid](./) 类的实例。 |
| [Guid](./guid/)(const Guid\&) | 构造一个表示与指定对象相同 GUID 的对象。 |
| static [NewGuid](./newguid/)() | 生成一个新的 GUID 并返回表示它的 [Guid](./) 对象。 |
| [operator!=](./operator!=/)(const Guid\&) const | 确定当前对象和指定对象所表示的 GUID 是否不相等。 |
| [operator=](./operator=/)(const Guid\&) | 将指定的 [Guid](./) 对象所表示的 GUID 值赋给当前对象。 |
| [operator==](./operator==/)(const Guid\&) const | 确定当前对象和指定对象所表示的 GUID 是否相等。 |
| static [Parse](./parse/)(const String\&) | 将指定的 GUID 字符串表示转换为等效的 [Guid](./) 对象。 |
| [ToByteArray](./tobytearray/)() const | 将当前对象所表示的 GUID 转换为字节数组。 |
| [ToString](./tostring/)() const | 将当前对象所表示的 GUID 转换为其字符串表示。 |
| [ToString](./tostring/)(const String\&) const | 使用指定的字符串格式将当前对象所表示的 GUID 转换为其字符串表示。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | 使用指定的字符串格式和区域性将当前对象所表示的 GUID 转换为其字符串表示。 |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | 尝试将指定的字符串转换为 [Guid](./) 对象。 |
| [~Guid](./~guid/)() | 析构函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 表示值为 0 的 GUID。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
