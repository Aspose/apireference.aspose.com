---
title: "System::Net::Security::LocalCertificateSelectionCallback typedef"
linktitle: "LocalCertificateSelectionCallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::LocalCertificateSelectionCallback typedef. C++ में स्थानीय SSL प्रमाणपत्र चुनने के लिए उपयोग किया जाने वाला उपयोगकर्ता डेलीगेट।"
type: docs
weight: 600
url: /hi/cpp/system.net.security/localcertificateselectioncallback/
---
## LocalCertificateSelectionCallback typedef


स्थानीय SSL प्रमाणपत्र चुनने के लिए उपयोग किया जाने वाला उपयोगकर्ता डेलीगेट।

```cpp
using System::Net::Security::LocalCertificateSelectionCallback = 
    System::MulticastDelegate<System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>(
        System::SharedPtr<Object>, String,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection>,
        System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
        System::ArrayPtr<String>)>
```

## संबंधित देखें

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
