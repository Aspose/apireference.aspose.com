---
title: "System::Net::Security::SslStream::SslStream निर्माता"
linktitle: "SslStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::SslStream::SslStream कन्स्ट्रक्टर। C++ में एक नया इंस्टेंस बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


एक नया उदाहरण बनाता है।

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | डेटा भेजने और प्राप्त करने के लिए उपयोग किया जाने वाला स्ट्रीम। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


एक नया उदाहरण बनाता है।

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | डेटा भेजने और प्राप्त करने के लिए उपयोग किया जाने वाला स्ट्रीम। |
| leaveInnerStreamOpen | bool | यदि true है, तो वर्तमान इंस्टेंस को बंद करने से 'InnerStream' पर कोई प्रभाव नहीं पड़ता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


एक नया उदाहरण बनाता है।

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | डेटा भेजने और प्राप्त करने के लिए उपयोग किया जाने वाला स्ट्रीम। |
| leaveInnerStreamOpen | bool | यदि true है, तो वर्तमान इंस्टेंस को बंद करने से 'InnerStream' पर कोई प्रभाव नहीं पड़ता है। |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | रिमोट पार्टी द्वारा प्रदान किए गए प्रमाणपत्र को वैध करने के लिए उपयोग किया जाने वाला डेलीगेट। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


एक नया उदाहरण बनाता है।

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | डेटा भेजने और प्राप्त करने के लिए उपयोग किया जाने वाला स्ट्रीम। |
| leaveInnerStreamOpen | bool | यदि true है, तो वर्तमान इंस्टेंस को बंद करने से 'InnerStream' पर कोई प्रभाव नहीं पड़ता है। |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | रिमोट पार्टी द्वारा प्रदान किए गए प्रमाणपत्र को वैध करने के लिए उपयोग किया जाने वाला डेलीगेट। |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | प्रमाणीकरण के लिए उपयोग किए जाने वाले प्रमाणपत्र को चुनने के लिए उपयोग किया जाने वाला डेलीगेट। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


एक नया उदाहरण बनाता है।

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | डेटा भेजने और प्राप्त करने के लिए उपयोग किया जाने वाला स्ट्रीम। |
| leaveInnerStreamOpen | bool | यदि true है, तो वर्तमान इंस्टेंस को बंद करने से 'InnerStream' पर कोई प्रभाव नहीं पड़ता है। |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | रिमोट पार्टी द्वारा प्रदान किए गए प्रमाणपत्र को वैध करने के लिए उपयोग किया जाने वाला डेलीगेट। |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | प्रमाणीकरण के लिए उपयोग किए जाने वाले प्रमाणपत्र को चुनने के लिए उपयोग किया जाने वाला डेलीगेट। |
| encryptionPolicy | EncryptionPolicy | एन्क्रिप्शन नीति। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
