---
title: "System::Security::Cryptography::Pkcs::CmsSigner 类"
linktitle: "CmsSigner"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner 类。提供使用 CMS 对对象进行签名的 API。它本身不执行签名，请使用 SignedCMS 类来完成。未实现。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


提供使用 CMS 对对象进行签名的 API。它本身不执行签名，请使用 SignedCMS 类来完成。未实现。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CmsSigner : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | 使用 X509 证书初始化签名者。 |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | 获取用于签名的哈希算法。 |
| [get_IncludeOption](./get_includeoption/)() const | 检查链中的哪些证书将被包含到签名中。 |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | 设置用于签名的哈希算法。 |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | 指定链中的哪些证书将被包含到签名中。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)
