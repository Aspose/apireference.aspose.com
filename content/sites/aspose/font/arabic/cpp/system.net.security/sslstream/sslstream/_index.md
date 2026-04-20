---
title: "منشئ System::Net::Security::SslStream::SslStream"
linktitle: "SslStream"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Net::Security::SslStream::SslStream. يُنشئ نسخة جديدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


ينشئ نسخة جديدة.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | الدفق الذي يُستخدم لإرسال واستقبال البيانات. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


ينشئ نسخة جديدة.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | الدفق الذي يُستخدم لإرسال واستقبال البيانات. |
| leaveInnerStreamOpen | bool | إذا كان true، فإن إغلاق النسخة الحالية لا يؤثر على 'InnerStream'. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


ينشئ نسخة جديدة.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | الدفق الذي يُستخدم لإرسال واستقبال البيانات. |
| leaveInnerStreamOpen | bool | إذا كان true، فإن إغلاق النسخة الحالية لا يؤثر على 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | المندوب الذي يُستخدم للتحقق من صحة الشهادة التي يقدمها الطرف البعيد. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


ينشئ نسخة جديدة.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | الدفق الذي يُستخدم لإرسال واستقبال البيانات. |
| leaveInnerStreamOpen | bool | إذا كان true، فإن إغلاق النسخة الحالية لا يؤثر على 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | المندوب الذي يُستخدم للتحقق من صحة الشهادة التي يقدمها الطرف البعيد. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | المندوب الذي يُستخدم لاختيار الشهادة المستخدمة للمصادقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


ينشئ نسخة جديدة.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | الدفق الذي يُستخدم لإرسال واستقبال البيانات. |
| leaveInnerStreamOpen | bool | إذا كان true، فإن إغلاق النسخة الحالية لا يؤثر على 'InnerStream'. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | المندوب الذي يُستخدم للتحقق من صحة الشهادة التي يقدمها الطرف البعيد. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | المندوب الذي يُستخدم لاختيار الشهادة المستخدمة للمصادقة. |
| encryptionPolicy | EncryptionPolicy | سياسة التشفير. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
