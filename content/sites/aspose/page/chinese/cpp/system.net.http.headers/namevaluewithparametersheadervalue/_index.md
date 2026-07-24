---
title: "System::Net::Http::Headers::NameValueWithParametersHeaderValue 类"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Http::Headers::NameValueWithParametersHeaderValue 类。表示用于标头的带参数的键/值对。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1500
url: /zh/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


表示用于标头的带参数的键/值对。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Parameters](./get_parameters/)() | RTTI 信息。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# 的 [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 将传入的字符串从指定索引转换为 [NameValueWithParametersHeaderValue](./) 类的实例。 |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | 构造一个新实例。 |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | 构造一个新实例。 |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | 构造一个新实例。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [NameValueWithParametersHeaderValue](./) 类的实例。 |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 方法的类似实现。启用将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | 尝试将传入的字符串转换为 [NameValueWithParametersHeaderValue](./) 类的实例。 |
## 另见

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
