---
title: "System::Security::Cryptography::X509Certificates::X509ChainPolicy 类"
linktitle: "X509ChainPolicy"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509ChainPolicy 类。将在构建 X509 证书链时应用的链策略。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1000
url: /zh/cpp/system.security.cryptography.x509certificates/x509chainpolicy/
---
## X509ChainPolicy class


将在构建 X509 证书链时应用的链策略。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class X509ChainPolicy : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_CustomTrustStore](./get_customtruststore/)() |  |
| [get_ExtraStore](./get_extrastore/)() |  |
| [get_RevocationFlag](./get_revocationflag/)() |  |
| [get_UrlRetrievalTimeout](./get_urlretrievaltimeout/)() |  |
| [get_VerificationFlags](./get_verificationflags/)() |  |
| [get_VerificationTime](./get_verificationtime/)() |  |
| [Reset](./reset/)() |  |
| [set_RevocationFlag](./set_revocationflag/)(X509RevocationFlag) |  |
| [set_UrlRetrievalTimeout](./set_urlretrievaltimeout/)(TimeSpan) |  |
| [set_VerificationFlags](./set_verificationflags/)(X509VerificationFlags) |  |
| [set_VerificationTime](./set_verificationtime/)(DateTime) |  |
| [X509ChainPolicy](./x509chainpolicy/)() |  |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
