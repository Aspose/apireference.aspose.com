---
title: "System::Security::Cryptography::RC2Managed 类"
linktitle: "RC2Managed"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RC2Managed 类。受管 RC2 算法。仅支持 ECB、CFB 和 CBC 加密模式。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2800
url: /zh/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


受管的 [RC2](../rc2/) 算法。仅支持 ECB、CFB 和 CBC 加密模式。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 使用显式参数创建解密器对象。 |
| virtual [CreateDecryptor](./createdecryptor/)() | 使用算法对象定义的参数创建解密器对象。 |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 使用显式参数创建加密器对象。 |
| virtual [CreateEncryptor](./createencryptor/)() | 使用算法对象定义的参数创建加密器对象。 |
| [GenerateIV](./generateiv/)() override | 创建随机初始向量并存储在算法内部。 |
| [GenerateKey](./generatekey/)() override | 创建随机密钥并存储在算法内部。 |
## 另见

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
