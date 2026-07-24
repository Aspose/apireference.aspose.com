---
title: "System::Security::Cryptography::RSA::VerifyData 메서드"
linktitle: "VerifyData"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSA::VerifyData 메서드. C++에서 지정된 데이터의 서명이 유효한지 확인합니다."
type: docs
weight: 1300
url: /ko/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


지정된 데이터의 서명이 유효한지 확인합니다.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 데이터 | const ByteArrayPtr\& | 서명된 데이터. |
| signature | const ByteArrayPtr\& | 서명 데이터. |
| hash_algorithm | const HashAlgorithmName\& | 해시 알고리즘. |
| 패딩 | const SharedPtr\<RSASignaturePadding\>\& | 패딩 모드. 서명이 유효하면 true를 반환하고, 그렇지 않으면 false를 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


지정된 데이터의 서명이 유효한지 확인합니다.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 데이터 | const ByteArrayPtr\& | 서명된 데이터. |
| offset | int32_t | **data**의 오프셋. |
| count | int32_t | 해시할 바이트 수. |
| signature | const ByteArrayPtr\& | 서명 데이터. |
| hash_algorithm | const HashAlgorithmName\& | 해시 알고리즘. |
| 패딩 | const SharedPtr\<RSASignaturePadding\>\& | 패딩 모드. 서명이 유효하면 true를 반환하고, 그렇지 않으면 false를 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


지정된 바이너리 스트림의 서명이 유효한지 확인합니다.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const StreamPtr\& | 서명된 데이터. |
| signature | const ByteArrayPtr\& | 서명 데이터. |
| hash_algorithm | const HashAlgorithmName\& | 해시 알고리즘. |
| 패딩 | const SharedPtr\<RSASignaturePadding\>\& | 패딩 모드. 서명이 유효하면 true를 반환하고, 그렇지 않으면 false를 반환합니다. |

## 또 보기

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
