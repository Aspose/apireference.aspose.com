---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "RappelSélectionCertificatLocal"
second_title: "Aspose.Font pour C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. Un délégué utilisateur utilisé pour sélectionner le certificat SSL local en C++."
type: docs
weight: 600
url: /fr/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


Un délégué utilisateur utilisé pour sélectionner le certificat SSL local.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Voir aussi

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
