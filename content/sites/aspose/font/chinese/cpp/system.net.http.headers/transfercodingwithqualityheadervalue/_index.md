---
title: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue 类"
linktitle: "TransferCodingWithQualityHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue 类。表示 ''Accept-Encoding'' 标头的值并附加质量信息。此类的对象应仅通过 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数（C++）。"
type: docs
weight: 2500
url: /zh/cpp/system.net.http.headers/transfercodingwithqualityheadervalue/
---
## TransferCodingWithQualityHeaderValue class


表示 'Accept-Encoding' 标头的值并附加质量信息。此类的对象应仅通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TransferCodingWithQualityHeaderValue : public System::Net::Http::Headers::TransferCodingHeaderValue
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI 信息。 |
| static [Parse](./parse/)(String) | 将传入字符串转换为 [TransferCodingWithQualityHeaderValue](./) 类的实例。 |
| [set_Quality](./set_quality/)(Nullable\<double\>) | 设置 'Accept-Encoding' 标头的质量值。 |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)() | 构造一个新实例。 |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String) | 构造一个新实例。 |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String, double) | 构造一个新实例。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingWithQualityHeaderValue\>\&) | 尝试将传入字符串转换为 [TransferCodingWithQualityHeaderValue](./) 类的实例。 |
## 另见

* Class [TransferCodingHeaderValue](../transfercodingheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
