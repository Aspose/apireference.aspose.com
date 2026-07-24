---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RemoteCertificateValidationCallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef。C++ でリモート SSL 証明書を検証するために使用されるユーザーデリゲートです。"
type: docs
weight: 700
url: /ja/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


リモート SSL 証明書を検証するために使用されるユーザー デリゲートです。

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## 参照

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
