---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RemoteCertificateValidationCallback"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef. Een gebruikersdelegate die wordt gebruikt om een extern SSL‑certificaat te verifiëren in C++."
type: docs
weight: 700
url: /nl/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


Een gebruikers‑delegate die wordt gebruikt om een extern SSL‑certificaat te verifiëren.

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## Zie ook

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
