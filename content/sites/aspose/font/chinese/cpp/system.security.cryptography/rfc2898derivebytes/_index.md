---
title: "System::Security::Cryptography::Rfc2898DeriveBytes 类"
linktitle: "Rfc2898DeriveBytes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Rfc2898DeriveBytes 类。实现基于密码的密钥派生，PBKDF2。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 2900
url: /zh/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


实现基于密码的密钥派生，PBKDF2。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | 用伪随机密钥字节填充现有数组元素。 |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | RTTI 信息。 |
## 另见

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
