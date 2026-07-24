---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Page için C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. C++'de yerel SSL sertifikasını seçmek için kullanılan bir kullanıcı temsilcisi."
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
* Library [Aspose.Page for C++](../../)
