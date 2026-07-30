---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Font için C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. C++'da yerel SSL sertifikasını seçmek için kullanılan bir kullanıcı temsilcisidir."
type: docs
weight: 600
url: /tr/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


Yerel SSL sertifikasını seçmek için kullanılan bir kullanıcı temsilcisi.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Ayrıca Bakınız

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
