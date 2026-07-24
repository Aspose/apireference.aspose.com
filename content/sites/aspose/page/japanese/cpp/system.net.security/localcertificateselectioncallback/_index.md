---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef。C++ でローカル SSL 証明書を選択するために使用されるユーザーデリゲートです。"
type: docs
weight: 600
url: /ja/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


ローカル SSL 証明書を選択するために使用されるユーザー デリゲートです。

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## 参照

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
