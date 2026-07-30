---
title: "System::Net::Http::Headers::NameValueHeaderValue 类"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::NameValueHeaderValue 类。表示用于标头的键/值对。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1400
url: /zh/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


表示用于标头的键/值对。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | 在集合中按指定名称查找 NameValueHeaderValue-class 实例。 |
| [get_Name](./get_name/)() | 返回当前实例的名称。 |
| [get_Value](./get_value/)() | 获取当前实例的值。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | 返回所有集合项的哈希码。 |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | 将从指定索引开始的传入字符串转换为 [NameValueHeaderValue](./) 类的实例。 |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | 将从指定索引开始的传入字符串转换为 [NameValueHeaderValue](./) 类的实例。 |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | 将从指定索引开始的传入字符串转换为 NameValueHeaderValue 类实例的集合，并返回已解析子字符串的长度。 |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | 返回从指定索引开始的值的长度。 |
| [NameValueHeaderValue](./namevalueheadervalue/)() | 构造一个新实例。 |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | 构造一个新实例。 |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | 构造一个新实例。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [NameValueHeaderValue](./) 类的实例。 |
| [set_Value](./set_value/)(String) | 设置当前实例的值。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | 返回 NameValueHeaderValue 类实例集合的字符串表示形式。 |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | 返回 NameValueHeaderValue 类实例集合的字符串表示形式。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | 尝试将传入的字符串转换为 [NameValueHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
