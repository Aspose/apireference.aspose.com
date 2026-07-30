---
title: "Constructeur System::Net::Security::SslStream::SslStream"
linktitle: "SslStream"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Net::Security::SslStream::SslStream. Crée une nouvelle instance en C++."
type: docs
weight: 100
url: /fr/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


Construit une nouvelle instance.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Le flux utilisé pour l'envoi et la réception de données. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


Construit une nouvelle instance.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Le flux utilisé pour l'envoi et la réception de données. |
| leaveInnerStreamOpen | bool | Si vrai, la fermeture de l'instance actuelle n'a aucun effet sur 'InnerStream'. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


Construit une nouvelle instance.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Le flux utilisé pour l'envoi et la réception de données. |
| leaveInnerStreamOpen | bool | Si vrai, la fermeture de l'instance actuelle n'a aucun effet sur 'InnerStream'. |
| userCertificateValidationCallback | RappelValidationCertificatDistant | Le délégué utilisé pour valider le certificat fourni par la partie distante. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


Construit une nouvelle instance.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Le flux utilisé pour l'envoi et la réception de données. |
| leaveInnerStreamOpen | bool | Si vrai, la fermeture de l'instance actuelle n'a aucun effet sur 'InnerStream'. |
| userCertificateValidationCallback | RappelValidationCertificatDistant | Le délégué utilisé pour valider le certificat fourni par la partie distante. |
| userCertificateSelectionCallback | RappelSélectionCertificatLocal | Le délégué qui est utilisé pour sélectionner le certificat utilisé pour l'authentification. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


Construit une nouvelle instance.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Le flux utilisé pour l'envoi et la réception de données. |
| leaveInnerStreamOpen | bool | Si vrai, la fermeture de l'instance actuelle n'a aucun effet sur 'InnerStream'. |
| userCertificateValidationCallback | RappelValidationCertificatDistant | Le délégué utilisé pour valider le certificat fourni par la partie distante. |
| userCertificateSelectionCallback | RappelSélectionCertificatLocal | Le délégué qui est utilisé pour sélectionner le certificat utilisé pour l'authentification. |
| encryptionPolicy | PolitiqueChiffrement | La politique de chiffrement. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
