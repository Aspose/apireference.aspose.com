---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. 用于在 C++ 中选择本地 SSL 证书的用户委托。"
type: docs
weight: 600
url: /zh/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


用于选择本地 SSL 证书的用户委托。

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## 另见

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
