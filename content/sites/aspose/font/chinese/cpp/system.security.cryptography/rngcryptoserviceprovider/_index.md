---
title: "System::Security::Cryptography::RNGCryptoServiceProvider 类"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider 类。遵循 CSP 概念的随机数生成器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 3300
url: /zh/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


遵循 CSP 概念的随机数生成器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | 用随机字节填充现有数组元素。 |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | 用随机字节填充现有数组视图元素。 |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | 用随机非零字节填充现有数组元素。 |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | 用随机非零字节填充现有数组视图元素。 |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | 构造函数。 |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | 析构函数。 |
## 另见

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
