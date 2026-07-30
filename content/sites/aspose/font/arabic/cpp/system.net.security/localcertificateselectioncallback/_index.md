---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. مُندوب المستخدم يُستخدم لاختيار شهادة SSL المحلية في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


مفوض مستخدم يُستخدم لاختيار شهادة SSL المحلية.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## انظر أيضًا

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
