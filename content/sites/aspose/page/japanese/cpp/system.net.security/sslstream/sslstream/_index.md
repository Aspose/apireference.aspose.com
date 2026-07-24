---
title: "System::Net::Security::SslStream::SslStream コンストラクタ"
linktitle: "SslStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::SslStream::SslStream コンストラクタ。C++ で新しいインスタンスを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


新しいインスタンスを構築します。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | データの送受信に使用されるストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


新しいインスタンスを構築します。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | データの送受信に使用されるストリームです。 |
| leaveInnerStreamOpen | bool | true の場合、現在のインスタンスを閉じても 'InnerStream' には影響しません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


新しいインスタンスを構築します。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | データの送受信に使用されるストリームです。 |
| leaveInnerStreamOpen | bool | true の場合、現在のインスタンスを閉じても 'InnerStream' には影響しません。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | リモート側が提供する証明書の検証に使用されるデリゲートです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


新しいインスタンスを構築します。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | データの送受信に使用されるストリームです。 |
| leaveInnerStreamOpen | bool | true の場合、現在のインスタンスを閉じても 'InnerStream' には影響しません。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | リモート側が提供する証明書の検証に使用されるデリゲートです。 |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | 認証に使用される証明書を選択するために使用されるデリゲートです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


新しいインスタンスを構築します。

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | データの送受信に使用されるストリームです。 |
| leaveInnerStreamOpen | bool | true の場合、現在のインスタンスを閉じても 'InnerStream' には影響しません。 |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | リモート側が提供する証明書の検証に使用されるデリゲートです。 |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | 認証に使用される証明書を選択するために使用されるデリゲートです。 |
| encryptionPolicy | EncryptionPolicy | 暗号化ポリシーです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
