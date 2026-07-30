---
title: "System::Net::Security::SslStream::SslStream Konstruktor"
linktitle: "SslStream"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::SslStream::SslStream Konstruktor. Erstellt eine neue Instanz in C++."
type: docs
weight: 100
url: /de/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


Erstellt eine neue Instanz.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Der Stream, der zum Senden und Empfangen von Daten verwendet wird. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


Erstellt eine neue Instanz.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Der Stream, der zum Senden und Empfangen von Daten verwendet wird. |
| leaveInnerStreamOpen | bool | Wenn true, hat das Schließen der aktuellen Instanz keine Auswirkung auf 'InnerStream'. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


Erstellt eine neue Instanz.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Der Stream, der zum Senden und Empfangen von Daten verwendet wird. |
| leaveInnerStreamOpen | bool | Wenn true, hat das Schließen der aktuellen Instanz keine Auswirkung auf 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Der Delegat, der zum Validieren des vom Remote-Partner bereitgestellten Zertifikats verwendet wird. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


Erstellt eine neue Instanz.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Der Stream, der zum Senden und Empfangen von Daten verwendet wird. |
| leaveInnerStreamOpen | bool | Wenn true, hat das Schließen der aktuellen Instanz keine Auswirkung auf 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Der Delegat, der zum Validieren des vom Remote-Partner bereitgestellten Zertifikats verwendet wird. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Der Delegat, der zum Auswählen des für die Authentifizierung verwendeten Zertifikats verwendet wird. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


Erstellt eine neue Instanz.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Der Stream, der zum Senden und Empfangen von Daten verwendet wird. |
| leaveInnerStreamOpen | bool | Wenn true, hat das Schließen der aktuellen Instanz keine Auswirkung auf 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Der Delegat, der zum Validieren des vom Remote-Partner bereitgestellten Zertifikats verwendet wird. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Der Delegat, der zum Auswählen des für die Authentifizierung verwendeten Zertifikats verwendet wird. |
| encryptionPolicy | EncryptionPolicy | Die Verschlüsselungsrichtlinie. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
