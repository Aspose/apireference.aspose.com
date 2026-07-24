---
title: "System::Security::Cryptography::RSA::SignData 메서드"
linktitle: "SignData"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSA::SignData 메서드. 지정된 해시 알고리즘과 패딩을 사용하여 지정된 데이터 배열의 해시 값을 계산하고, C++에서 결과에 서명합니다."
type: docs
weight: 1000
url: /ko/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


지정된 해시 알고리즘과 패딩을 사용하여 지정된 데이터 배열의 해시 값을 계산하고 결과에 서명합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 데이터 | const ByteArrayPtr\& | 입력 데이터 배열. |
| hash_algorithm | const HashAlgorithmName\& | 해시 알고리즘. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 패딩 모드. 입력 데이터에 대한 [RSA](../) 서명을 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


지정된 해시 알고리즘과 패딩을 사용하여 지정된 데이터 배열의 해시 값을 계산하고 결과에 서명합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 데이터 | const ByteArrayPtr\& | 입력 데이터 배열. |
| offset | int32_t | **data**의 오프셋. |
| count | int32_t | 입력 데이터로 사용할 바이트 수. |
| hash_algorithm | const HashAlgorithmName\& | 해시 알고리즘. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 패딩 모드. 입력 데이터에 대한 [RSA](../) 서명을 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


지정된 해시 알고리즘과 패딩을 사용하여 지정된 바이너리 스트림의 해시 값을 계산하고 결과에 서명합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const StreamPtr\& | 바이너리 스트림. |
| hash_algorithm | const HashAlgorithmName\& | 해시 알고리즘. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 패딩 모드. 입력 데이터에 대한 [RSA](../) 서명을 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
