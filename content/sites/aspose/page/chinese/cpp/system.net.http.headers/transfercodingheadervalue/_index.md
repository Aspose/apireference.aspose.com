---
title: "System::Net::Http::Headers::TransferCodingHeaderValue 类"
linktitle: "TransferCodingHeaderValue"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue 类。表示 ''Accept-Encoding'' 头的值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2400
url: /zh/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


表示 'Accept-Encoding' 头的值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Parameters](./get_parameters/)() | 返回参数。 |
| [get_Value](./get_value/)() | RTTI 信息。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# 的 [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | 将传入的字符串从指定索引转换为 [TransferCodingHeaderValue](./) 类的实例。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [TransferCodingHeaderValue](./) 类的实例。 |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 方法的类似实现。启用将自定义对象转换为字符串。 |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | 构造一个新实例。 |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | 构造一个新实例。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | 尝试将传入的字符串转换为 [TransferCodingHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
