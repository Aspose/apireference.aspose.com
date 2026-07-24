---
title: "System::Net::Security::SslStream::SslStream constructor"
linktitle: "SslStream"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::SslStream::SslStream constructor. Maakt een nieuw exemplaar in C++."
type: docs
weight: 100
url: /nl/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


Construeert een nieuw exemplaar.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | De stream die wordt gebruikt voor het verzenden en ontvangen van gegevens. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


Construeert een nieuw exemplaar.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | De stream die wordt gebruikt voor het verzenden en ontvangen van gegevens. |
| leaveInnerStreamOpen | bool | Als true, heeft het sluiten van de huidige instantie geen effect op 'InnerStream'. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


Construeert een nieuw exemplaar.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | De stream die wordt gebruikt voor het verzenden en ontvangen van gegevens. |
| leaveInnerStreamOpen | bool | Als true, heeft het sluiten van de huidige instantie geen effect op 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | De delegate die wordt gebruikt voor het valideren van het certificaat dat door de externe partij wordt geleverd. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


Construeert een nieuw exemplaar.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | De stream die wordt gebruikt voor het verzenden en ontvangen van gegevens. |
| leaveInnerStreamOpen | bool | Als true, heeft het sluiten van de huidige instantie geen effect op 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | De delegate die wordt gebruikt voor het valideren van het certificaat dat door de externe partij wordt geleverd. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | De delegate die wordt gebruikt voor het selecteren van het certificaat dat wordt gebruikt voor authenticatie. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


Construeert een nieuw exemplaar.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | De stream die wordt gebruikt voor het verzenden en ontvangen van gegevens. |
| leaveInnerStreamOpen | bool | Als true, heeft het sluiten van de huidige instantie geen effect op 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | De delegate die wordt gebruikt voor het valideren van het certificaat dat door de externe partij wordt geleverd. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | De delegate die wordt gebruikt voor het selecteren van het certificaat dat wordt gebruikt voor authenticatie. |
| encryptionPolicy | EncryptionPolicy | Het encryptiebeleid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
