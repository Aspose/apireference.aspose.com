---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "C++용 Aspose.Page"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. C++에서 로컬 SSL 인증서를 선택하는 데 사용되는 사용자 대리자입니다."
type: docs
weight: 600
url: /ko/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


로컬 SSL 인증서를 선택하는 데 사용되는 사용자 대리자.

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## 또 보기

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
