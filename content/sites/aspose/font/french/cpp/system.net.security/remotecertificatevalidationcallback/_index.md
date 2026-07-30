---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RappelValidationCertificatDistant"
second_title: "Aspose.Font pour C++"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef. Un délégué utilisateur utilisé pour vérifier le certificat SSL distant en C++."
type: docs
weight: 700
url: /fr/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


Un délégué utilisateur utilisé pour vérifier le certificat SSL distant.

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## Voir aussi

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
