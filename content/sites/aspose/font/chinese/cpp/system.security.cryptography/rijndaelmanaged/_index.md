---
title: "System::Security::Cryptography::RijndaelManaged 类"
linktitle: "RijndaelManaged"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RijndaelManaged 类。受管 Rijndael 算法。仅支持使用 None 填充的 ECB 和 CFB 模式，以及使用 None 和 Zeros 填充的 CBC 模式。该类的对象应仅通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3100
url: /zh/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


受管 [Rijndael](../rijndael/) 算法。仅支持使用 None 填充的 ECB 和 CFB 模式，以及使用 None 和 Zeros 填充的 CBC 模式。该类的对象应仅通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
