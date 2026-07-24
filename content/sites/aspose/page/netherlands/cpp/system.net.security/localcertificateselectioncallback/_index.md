---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. Een gebruikersdelegate die wordt gebruikt om een lokaal SSL‑certificaat te selecteren in C++."
type: docs
weight: 600
url: /nl/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


Een gebruikers‑delegate die wordt gebruikt om een lokaal SSL‑certificaat te selecteren.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Zie ook

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
