---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RemoteCertificateValidationCallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef. C++ में दूरस्थ SSL प्रमाणपत्र को सत्यापित करने के लिए उपयोग किया जाने वाला उपयोगकर्ता डेलीगेट।"
type: docs
weight: 700
url: /hi/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


रिमोट SSL प्रमाणपत्र को सत्यापित करने के लिए उपयोग किया जाने वाला उपयोगकर्ता डेलीगेट।

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## संबंधित देखें

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
