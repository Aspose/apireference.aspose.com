---
title: "System::Net::Security::SslStream::AuthenticateAsClient method"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::SslStream::AuthenticateAsClient मेथड। C++ में कनेक्शन के क्लाइंट-साइड को प्रमाणित करता है।"
type: docs
weight: 200
url: /hi/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


कनेक्शन के क्लाइंट-साइड को प्रमाणित करता है।

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| targetHost | String | वर्तमान इंस्टेंस को साझा करने वाले सर्वर का नाम। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


कनेक्शन के क्लाइंट-साइड को प्रमाणित करता है।

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| targetHost | String | वर्तमान इंस्टेंस को साझा करने वाले सर्वर का नाम। |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | क्लाइंट प्रमाणपत्र। |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | प्रमाणीकरण के लिए उपयोग किए जाने वाले SSL प्रोटोकॉल। |
| checkCertificateRevocation | bool | एक मान जो दर्शाता है कि प्रमाणीकरण के दौरान प्रमाणपत्र रिवोकेशन सूची की जाँच करनी चाहिए या नहीं। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
