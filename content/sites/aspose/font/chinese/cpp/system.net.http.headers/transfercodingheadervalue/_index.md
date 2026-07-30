---
title: "System::Net::Http::Headers::TransferCodingHeaderValue 类"
linktitle: "TransferCodingHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue 类。表示 ''Accept-Encoding'' 标头的值。此类的对象应仅通过 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数（C++）。"
type: docs
weight: 2400
url: /zh/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


表示 'Accept-Encoding' 标头的值。此类的对象应仅通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Parameters](./get_parameters/)() | 返回参数。 |
| [get_Value](./get_value/)() | RTTI 信息。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | 将指定索引处的传入字符串转换为 [TransferCodingHeaderValue](./) 类的实例。 |
| static [Parse](./parse/)(String) | 将传入字符串转换为 [TransferCodingHeaderValue](./) 类的实例。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | 构造一个新实例。 |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | 构造一个新实例。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | 尝试将传入字符串转换为 [TransferCodingHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
