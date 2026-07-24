---
title: "System::Net::Security::SslStream::SslStream 생성자"
linktitle: "SslStream"
second_title: "C++용 Aspose.Page"
description: "System::Net::Security::SslStream::SslStream 생성자. C++에서 새로운 인스턴스를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.net.security/sslstream/sslstream/
---
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>) constructor


새 인스턴스를 생성합니다.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 데이터 전송 및 수신에 사용되는 스트림. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool) constructor


새 인스턴스를 생성합니다.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 데이터 전송 및 수신에 사용되는 스트림. |
| leaveInnerStreamOpen | bool | true이면 현재 인스턴스를 닫아도 'InnerStream'에 영향을 주지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) constructor


새 인스턴스를 생성합니다.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 데이터 전송 및 수신에 사용되는 스트림. |
| leaveInnerStreamOpen | bool | true이면 현재 인스턴스를 닫아도 'InnerStream'에 영향을 주지 않습니다. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 원격 파티가 제공한 인증서를 검증하는 데 사용되는 대리자입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) constructor


새 인스턴스를 생성합니다.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 데이터 전송 및 수신에 사용되는 스트림. |
| leaveInnerStreamOpen | bool | true이면 현재 인스턴스를 닫아도 'InnerStream'에 영향을 주지 않습니다. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 원격 파티가 제공한 인증서를 검증하는 데 사용되는 대리자입니다. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | 인증에 사용되는 인증서를 선택하는 데 사용되는 대리자입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::SslStream(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) constructor


새 인스턴스를 생성합니다.

```cpp
System::Net::Security::SslStream::SslStream(System::SharedPtr<IO::Stream> innerStream, bool leaveInnerStreamOpen, RemoteCertificateValidationCallback userCertificateValidationCallback, LocalCertificateSelectionCallback userCertificateSelectionCallback, EncryptionPolicy encryptionPolicy)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| innerStream | System::SharedPtr\<IO::Stream\> | 데이터 전송 및 수신에 사용되는 스트림. |
| leaveInnerStreamOpen | bool | true이면 현재 인스턴스를 닫아도 'InnerStream'에 영향을 주지 않습니다. |
| userCertificateValidationCallback | RemoteCertificateValidationCallback | 원격 파티가 제공한 인증서를 검증하는 데 사용되는 대리자입니다. |
| userCertificateSelectionCallback | LocalCertificateSelectionCallback | 인증에 사용되는 인증서를 선택하는 데 사용되는 대리자입니다. |
| encryptionPolicy | EncryptionPolicy | 암호화 정책입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [RemoteCertificateValidationCallback](../../remotecertificatevalidationcallback/)
* Typedef [LocalCertificateSelectionCallback](../../localcertificateselectioncallback/)
* Enum [EncryptionPolicy](../../encryptionpolicy/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
