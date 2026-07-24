---
title: "System::Net::Security::SslStream::SslStream κατασκευαστής"
linktitle: "SslStream"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::SslStream::SslStream constructor. Δημιουργεί ένα νέο αντικείμενο σε C++."
type: docs
weight: 100
url: /el/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


Δημιουργεί μια νέα παρουσία.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Η ροή που χρησιμοποιείται για την αποστολή και λήψη δεδομένων. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


Δημιουργεί μια νέα παρουσία.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Η ροή που χρησιμοποιείται για την αποστολή και λήψη δεδομένων. |
| leaveInnerStreamOpen | bool | Αν είναι true, το κλείσιμο της τρέχουσας παρουσίας δεν επηρεάζει το 'InnerStream'. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


Δημιουργεί μια νέα παρουσία.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Η ροή που χρησιμοποιείται για την αποστολή και λήψη δεδομένων. |
| leaveInnerStreamOpen | bool | Αν είναι true, το κλείσιμο της τρέχουσας παρουσίας δεν επηρεάζει το 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Ο αντιπρόσωπος που χρησιμοποιείται για την επικύρωση του πιστοποιητικού που παρέχεται από το απομακρυσμένο μέρος. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


Δημιουργεί μια νέα παρουσία.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Η ροή που χρησιμοποιείται για την αποστολή και λήψη δεδομένων. |
| leaveInnerStreamOpen | bool | Αν είναι true, το κλείσιμο της τρέχουσας παρουσίας δεν επηρεάζει το 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Ο αντιπρόσωπος που χρησιμοποιείται για την επικύρωση του πιστοποιητικού που παρέχεται από το απομακρυσμένο μέρος. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Ο αντιπρόσωπος που χρησιμοποιείται για την επιλογή του πιστοποιητικού που χρησιμοποιείται για την αυθεντικοποίηση. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


Δημιουργεί μια νέα παρουσία.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Η ροή που χρησιμοποιείται για την αποστολή και λήψη δεδομένων. |
| leaveInnerStreamOpen | bool | Αν είναι true, το κλείσιμο της τρέχουσας παρουσίας δεν επηρεάζει το 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Ο αντιπρόσωπος που χρησιμοποιείται για την επικύρωση του πιστοποιητικού που παρέχεται από το απομακρυσμένο μέρος. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Ο αντιπρόσωπος που χρησιμοποιείται για την επιλογή του πιστοποιητικού που χρησιμοποιείται για την αυθεντικοποίηση. |
| encryptionPolicy | EncryptionPolicy | Η πολιτική κρυπτογράφησης. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
