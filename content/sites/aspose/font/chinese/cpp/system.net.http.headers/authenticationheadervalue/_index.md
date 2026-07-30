---
title: "System::Net::Http::Headers::AuthenticationHeaderValue 类"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue 类。表示 ''Authorization''、''ProxyAuthorization''、''WWW-Authenticate'' 和 ''Proxy-Authenticate'' 标头的值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


表示 'Authorization'、'ProxyAuthorization'、'WWW-Authenticate' 和 'Proxy-Authenticate' 标头的值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | 构造函数。 |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | 构造函数。 |
| [Clone](./clone/)() override | RTTI 信息。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Parameter](./get_parameter/)() | 获取包含身份验证信息的凭据。 |
| [get_Scheme](./get_scheme/)() | RTTI 信息。 |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 解析指定的字符串并返回字符串表示形式的最后索引。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [AuthenticationHeaderValue](./) 类的实例。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | 尝试将传入的字符串转换为 [AuthenticationHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
