---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData 메서드"
linktitle: "SignData"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData 메서드. 지정된 입력 값의 서명을 C++에서 계산합니다."
type: docs
weight: 1600
url: /ko/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


지정된 입력 값의 서명을 계산합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) 에서 입력 데이터를 읽습니다. |
| halg | const SharedPtr\<Object\>\& | 사용할 해시 알고리즘. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


지정된 입력 값의 서명을 계산합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) 에서 입력 데이터를 읽습니다. |
| offset | int32_t | 입력 버퍼 슬라이스 시작 인덱스. |
| count | int32_t | 입력 버퍼 슬라이스 크기. |
| halg | const SharedPtr\<Object\>\& | 사용할 해시 알고리즘. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


지정된 입력 값의 서명을 계산합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | 서명되는 데이터를 읽을 스트림. |
| halg | const SharedPtr\<Object\>\& | 사용할 해시 알고리즘. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
