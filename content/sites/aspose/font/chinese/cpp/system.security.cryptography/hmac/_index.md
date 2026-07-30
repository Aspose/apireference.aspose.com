---
title: "System::Security::Cryptography::HMAC 类"
linktitle: "HMAC"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::HMAC 类。所有基于散列的消息认证码 (HMAC) 的实现必须继承此抽象类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1700
url: /zh/cpp/system.security.cryptography/hmac/
---
## HMAC class


所有基于散列的消息[Authentication](../../system.security.authentication/)代码（[HMAC](./)）的实现必须继承此抽象类。此类的对象只能使用[System::MakeObject()](../../system/makeobject/)函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在[System::SmartPtr](../../system/smartptr/)指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HMAC : public System::Security::Cryptography::HashAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)() | 未实现。 |
## 另见

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
