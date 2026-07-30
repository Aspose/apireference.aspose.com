---
title: "System::Net::Security::SslStream::SslStream costruttore"
linktitle: "SslStream"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::SslStream::SslStream costruttore. Crea una nuova istanza in C++."
type: docs
weight: 100
url: /it/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


Crea una nuova istanza.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Lo stream utilizzato per l'invio e la ricezione dei dati. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


Crea una nuova istanza.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Lo stream utilizzato per l'invio e la ricezione dei dati. |
| leaveInnerStreamOpen | bool | Se true, la chiusura dell'istanza corrente non ha effetto su 'InnerStream'. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


Crea una nuova istanza.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Lo stream utilizzato per l'invio e la ricezione dei dati. |
| leaveInnerStreamOpen | bool | Se true, la chiusura dell'istanza corrente non ha effetto su 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Il delegato utilizzato per convalidare il certificato fornito dalla parte remota. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


Crea una nuova istanza.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Lo stream utilizzato per l'invio e la ricezione dei dati. |
| leaveInnerStreamOpen | bool | Se true, la chiusura dell'istanza corrente non ha effetto su 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Il delegato utilizzato per convalidare il certificato fornito dalla parte remota. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Il delegato utilizzato per selezionare il certificato usato per l'autenticazione. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


Crea una nuova istanza.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Lo stream utilizzato per l'invio e la ricezione dei dati. |
| leaveInnerStreamOpen | bool | Se true, la chiusura dell'istanza corrente non ha effetto su 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Il delegato utilizzato per convalidare il certificato fornito dalla parte remota. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Il delegato utilizzato per selezionare il certificato usato per l'autenticazione. |
| encryptionPolicy | EncryptionPolicy | La politica di crittografia. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
