---
title: "System::Net::Security::SslStream::SslStream yapıcı"
linktitle: "SslStream"
second_title: "Aspose.Font için C++"
description: "System::Net::Security::SslStream::SslStream yapıcı. C++'da yeni bir örnek oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


Yeni bir örnek oluşturur.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Veri gönderme ve alma için kullanılan akış. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


Yeni bir örnek oluşturur.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Veri gönderme ve alma için kullanılan akış. |
| leaveInnerStreamOpen | bool | Doğru ise, mevcut örneği kapatmak 'InnerStream' üzerinde hiçbir etki yapmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


Yeni bir örnek oluşturur.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Veri gönderme ve alma için kullanılan akış. |
| leaveInnerStreamOpen | bool | Doğru ise, mevcut örneği kapatmak 'InnerStream' üzerinde hiçbir etki yapmaz. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Uzak taraf tarafından sağlanan sertifikayı doğrulamak için kullanılan temsilci. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


Yeni bir örnek oluşturur.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Veri gönderme ve alma için kullanılan akış. |
| leaveInnerStreamOpen | bool | Doğru ise, mevcut örneği kapatmak 'InnerStream' üzerinde hiçbir etki yapmaz. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Uzak taraf tarafından sağlanan sertifikayı doğrulamak için kullanılan temsilci. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Kimlik doğrulama için kullanılan sertifikayı seçmek için kullanılan temsilci. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


Yeni bir örnek oluşturur.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Veri gönderme ve alma için kullanılan akış. |
| leaveInnerStreamOpen | bool | Doğru ise, mevcut örneği kapatmak 'InnerStream' üzerinde hiçbir etki yapmaz. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Uzak taraf tarafından sağlanan sertifikayı doğrulamak için kullanılan temsilci. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Kimlik doğrulama için kullanılan sertifikayı seçmek için kullanılan temsilci. |
| encryptionPolicy | EncryptionPolicy | Şifreleme politikası. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
