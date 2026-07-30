---
title: "System::Security::Cryptography::TripleDESManaged 类"
linktitle: "TripleDESManaged"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::TripleDESManaged 类。托管的 TripleDES 实现。仅支持 ECB 和 CFB 模式的 None 填充，以及 CBC 模式的 None、Zeros 和 PKCS7 填充。该类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 5200
url: /zh/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


托管的 [TripleDES](../tripledes/) 实现。仅支持 ECB 和 CFB 模式的 None 填充，以及 CBC 模式的 None、Zeros 和 PKCS7 填充。该类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
