---
title: "System::Net::Security::SslStream::SslStream 构造函数"
linktitle: "SslStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::SslStream::SslStream 构造函数。构造一个新的实例（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例对 'InnerStream' 没有影响。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例对 'InnerStream' 没有影响。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 用于验证远程方提供的证书的委托。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例对 'InnerStream' 没有影响。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 用于验证远程方提供的证书的委托。 |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | 用于选择用于身份验证的证书的委托。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


构造一个新实例。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 用于发送和接收数据的流。 |
| leaveInnerStreamOpen | bool | 如果为 true，关闭当前实例对 'InnerStream' 没有影响。 |
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
* Library [Aspose.Font for C++](../../../)
