---
title: "System::Net::Http::Headers::RangeHeaderValue 类"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::RangeHeaderValue 类。表示 ''Range'' 标头的值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 2000
url: /zh/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


表示 'Range' 标头的值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RangeHeaderValue : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Ranges](./get_ranges/)() | 返回范围的集合。 |
| [get_Unit](./get_unit/)() | RTTI 信息。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 将传入的字符串从指定索引转换为 [RangeHeaderValue](./) 类的实例。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [RangeHeaderValue](./) 类的实例。 |
| [RangeHeaderValue](./rangeheadervalue/)() | 构造一个新实例。 |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | 构造一个新实例。 |
| [set_Unit](./set_unit/)(String) | 设置一个单位。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | 尝试将传入的字符串转换为 [RangeHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
