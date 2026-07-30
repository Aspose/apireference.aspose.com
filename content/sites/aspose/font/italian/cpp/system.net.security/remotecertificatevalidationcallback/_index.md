---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RemoteCertificateValidationCallback"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef. Un delegato utente usato per verificare il certificato SSL remoto in C++."
type: docs
weight: 700
url: /it/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


Un delegato utente utilizzato per verificare il certificato SSL remoto.

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## Vedi anche

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
