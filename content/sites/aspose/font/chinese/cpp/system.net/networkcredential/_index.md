---
title: "System::Net::NetworkCredential 类"
linktitle: "NetworkCredential"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::NetworkCredential 类。提供基于密码的身份验证方案的凭据。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2900
url: /zh/cpp/system.net/networkcredential/
---
## NetworkCredential class


提供基于密码的身份验证方案的凭据。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Domain](./get_domain/)() | 获取验证凭据的域。 |
| [get_Password](./get_password/)() | 获取密码。 |
| [get_UserName](./get_username/)() | RTTI 信息。 |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | 返回指定 URI 和身份验证类型的凭据。 |
| [GetCredential](./getcredential/)(String, int32_t, String) override | 返回指定主机名、端口和身份验证类型的凭据。 |
| [NetworkCredential](./networkcredential/)() | 构造一个新实例。 |
| [NetworkCredential](./networkcredential/)(String, String) | 构造一个新实例。 |
| [NetworkCredential](./networkcredential/)(String, String, String) | 构造一个新实例。 |
| [set_Domain](./set_domain/)(String) | 设置验证凭据的域。 |
| [set_Password](./set_password/)(String) | 设置密码。 |
| [set_UserName](./set_username/)(String) | 设置用户名。 |
## 另见

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
