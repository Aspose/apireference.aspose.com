---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Page för C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. En användar-delegat som används för att välja lokalt SSL-certifikat i C++."
type: docs
weight: 600
url: /sv/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


En användardelegat som används för att välja lokalt SSL-certifikat.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Se även

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
