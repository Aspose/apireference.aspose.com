---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. Ένας αντιπρόσωπος χρήστη που χρησιμοποιείται για την επιλογή τοπικού πιστοποιητικού SSL σε C++."
type: docs
weight: 600
url: /el/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


Ένας αντιπρόσωπος χρήστη που χρησιμοποιείται για την επιλογή τοπικού πιστοποιητικού SSL.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Δείτε επίσης

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
