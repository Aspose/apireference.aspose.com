---
title: "System::Net::Security::SslStream::SslStream 构造函数"
linktitle: "SslStream"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Security::SslStream::SslStream 构造函数。在 C++ 中构造一个新实例。"
type: docs
weight: 100
url: /zh/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例不会影响 'InnerStream'。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例不会影响 'InnerStream'。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 用于验证远程方提供的证书的委托。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例不会影响 'InnerStream'。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 用于验证远程方提供的证书的委托。 |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | 用于选择用于身份验证的证书的委托。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例不会影响 'InnerStream'。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 用于验证远程方提供的证书的委托。 |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | 用于选择用于身份验证的证书的委托。 |
| encryptionPolicy | EncryptionPolicy | 加密策略。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
