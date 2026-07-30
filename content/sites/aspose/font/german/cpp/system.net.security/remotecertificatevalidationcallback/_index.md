---
title: "System::Net::Security::RemoteCertificateValidationCallback typedef"
linktitle: "RemoteCertificateValidationCallback"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::RemoteCertificateValidationCallback typedef. Ein benutzerdefinierter Delegat, der verwendet wird, um das entfernte SSL-Zertifikat in C++ zu überprüfen."
type: docs
weight: 700
url: /de/cpp/system.net.security/remotecertificatevalidationcallback/
---
## RemoteCertificateValidationCallback typedef


Ein Benutzer‑Delegate, der zum Verifizieren des entfernten SSL‑Zertifikats verwendet wird.

```cpp
using System::Net::Security::RemoteCertificateValidationCallback =  System::MulticastDelegate<bool(
    System::SharedPtr<Object>, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate>,
    System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Chain>, SslPolicyErrors)>
```

## Siehe auch

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
