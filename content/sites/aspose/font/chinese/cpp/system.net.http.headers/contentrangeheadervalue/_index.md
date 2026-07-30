---
title: "System::Net::Http::Headers::ContentRangeHeaderValue 类"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue 类。表示 ''Content-Range'' 标头的值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


表示 'Content-Range' 标头的值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | 构造一个新实例。 |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | 构造一个新实例。 |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | 构造一个新实例。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_From](./get_from/)() | 获取数据发送必须开始的位置。 |
| [get_HasLength](./get_haslength/)() const | 获取一个值，指示当前标头是否已指定长度。 |
| [get_HasRange](./get_hasrange/)() const | 获取一个值，用于指示当前标头是否已指定范围。 |
| [get_Length](./get_length/)() | 获取实体主体的长度。 |
| [get_To](./get_to/)() | 获取数据发送必须停止的位置。 |
| [get_Unit](./get_unit/)() | RTTI 信息。 |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 将传入的字符串从指定位置转换为 [ContentRangeHeaderValue](./) 类的实例。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [ContentRangeHeaderValue](./) 类的实例。 |
| [set_Unit](./set_unit/)(String) | 设置范围中使用的单位。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | 尝试将传入的字符串转换为 [ContentRangeHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
