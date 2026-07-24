---
title: "System::Net::Security::SslStream::SslStream konstruktor"
linktitle: "SslStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::SslStream::SslStream constructor. Membuat sebuah instance baru dalam C++."
type: docs
weight: 100
url: /id/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


Membuat instance baru.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Aliran yang digunakan untuk mengirim dan menerima data. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


Membuat instance baru.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Aliran yang digunakan untuk mengirim dan menerima data. |
| leaveInnerStreamOpen | bool | Jika true, menutup instance saat ini tidak berpengaruh pada 'InnerStream'. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


Membuat instance baru.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Aliran yang digunakan untuk mengirim dan menerima data. |
| leaveInnerStreamOpen | bool | Jika true, menutup instance saat ini tidak berpengaruh pada 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Delegate yang digunakan untuk memvalidasi sertifikat yang disediakan oleh pihak remote. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


Membuat instance baru.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Aliran yang digunakan untuk mengirim dan menerima data. |
| leaveInnerStreamOpen | bool | Jika true, menutup instance saat ini tidak berpengaruh pada 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Delegate yang digunakan untuk memvalidasi sertifikat yang disediakan oleh pihak remote. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Delegate yang digunakan untuk memilih sertifikat yang dipakai untuk otentikasi. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


Membuat instance baru.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | Aliran yang digunakan untuk mengirim dan menerima data. |
| leaveInnerStreamOpen | bool | Jika true, menutup instance saat ini tidak berpengaruh pada 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | Delegate yang digunakan untuk memvalidasi sertifikat yang disediakan oleh pihak remote. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | Delegate yang digunakan untuk memilih sertifikat yang dipakai untuk otentikasi. |
| encryptionPolicy | EncryptionPolicy | Kebijakan enkripsi. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
