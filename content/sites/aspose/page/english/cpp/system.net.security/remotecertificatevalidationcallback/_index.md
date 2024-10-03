---
title: System::Net::Security::RemoteCertificateValidationCallback typedef
linktitle: RemoteCertificateValidationCallback
second_title: Aspose.Page for C++
description: 'System::Net::Security::RemoteCertificateValidationCallback typedef. A user delegate used to verify remote SSL certificate in C++.'
type: docs
weight: 600
url: /cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


A user delegate used to verify remote SSL certificate.

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## See Also

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
