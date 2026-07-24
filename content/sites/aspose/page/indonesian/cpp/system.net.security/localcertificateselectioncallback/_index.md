---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. Sebuah delegasi pengguna yang digunakan untuk memilih sertifikat SSL lokal dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


Delegasi pengguna yang digunakan untuk memilih sertifikat SSL lokal.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## Lihat Juga

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
