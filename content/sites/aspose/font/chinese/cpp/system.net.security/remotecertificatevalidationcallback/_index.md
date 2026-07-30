---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RemoteCertificateValidationCallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef. 用于在 C++ 中验证远程 SSL 证书的用户委托。"
type: docs
weight: 700
url: /zh/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


用于验证远程 SSL 证书的用户委托。

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## 另见

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
