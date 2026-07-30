---
title: "System::Net::Http::Headers::RangeItemHeaderValue 类"
linktitle: "RangeItemHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue 类。表示 ''Range'' 头值中的字节范围。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2100
url: /zh/cpp/system.net.http.headers/rangeitemheadervalue/
---
## RangeItemHeaderValue class


表示 'Range' 头值中的字节范围。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RangeItemHeaderValue : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_From](./get_from/)() | RTTI 信息。 |
| [get_To](./get_to/)() | 返回数据发送必须停止的位置。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetRangeItemLength](./getrangeitemlength/)(String, int32_t, System::SharedPtr\<RangeItemHeaderValue\>\&) | 将传入的字符串从指定索引转换为 [RangeItemHeaderValue](./) 类的实例。 |
| static [GetRangeItemListLength](./getrangeitemlistlength/)(String, int32_t, System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\>) | 将传入的字符串从指定位置转换为 RangeItemHeaderValue 类实例的集合。 |
| [RangeItemHeaderValue](./rangeitemheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | 构造一个新实例。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
