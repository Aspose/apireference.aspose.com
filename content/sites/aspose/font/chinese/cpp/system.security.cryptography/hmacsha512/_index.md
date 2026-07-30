---
title: "System::Security::Cryptography::HMACSHA512 类"
linktitle: "HMACSHA512"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::HMACSHA512 类。基于哈希的消息认证码，使用 SHA512 哈希函数。部分实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1900
url: /zh/cpp/system.security.cryptography/hmacsha512/
---
## HMACSHA512 class


基于哈希的消息 [Authentication](../../system.security.authentication/) 代码，使用 [SHA512](../sha512/) 哈希函数。部分实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HMACSHA512 : public System::Security::Cryptography::HashAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | 计算 [HMAC](../hmac/)。 |
| [HMACSHA512](./hmacsha512/)() | 构造函数。 |
| [HMACSHA512](./hmacsha512/)(const System::ArrayPtr\<uint8_t\>\&) | 构造函数。 |
## 另见

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
