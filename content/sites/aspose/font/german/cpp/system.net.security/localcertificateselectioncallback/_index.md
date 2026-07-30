---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. Ein benutzerdefinierter Delegat, der verwendet wird, um das lokale SSL-Zertifikat in C++ auszuwählen."
type: docs
weight: 600
url: /de/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


Ein Benutzer‑Delegate, der zum Auswählen des lokalen SSL‑Zertifikats verwendet wird.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Siehe auch

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
