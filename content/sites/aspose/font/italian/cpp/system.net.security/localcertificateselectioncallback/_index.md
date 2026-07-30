---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. Un delegato utente usato per selezionare il certificato SSL locale in C++."
type: docs
weight: 600
url: /it/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


Un delegato utente utilizzato per selezionare il certificato SSL locale.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Vedi anche

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
