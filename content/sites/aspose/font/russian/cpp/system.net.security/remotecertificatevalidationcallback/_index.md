---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RemoteCertificateValidationCallback"
second_title: "Aspose.Font для C++"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef. Делегат пользователя, используемый для проверки удалённого SSL‑сертификата в C++."
type: docs
weight: 700
url: /ru/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


Делегат пользователя, используемый для проверки удалённого SSL‑сертификата.

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## См. также

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
