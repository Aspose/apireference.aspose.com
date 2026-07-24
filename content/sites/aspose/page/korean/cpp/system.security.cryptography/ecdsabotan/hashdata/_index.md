---
title: "System::Security::Cryptography::ECDsaBotan::HashData 메서드"
linktitle: "HashData"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ECDsaBotan::HashData 메서드. C++에서 지정된 해시 알고리즘을 사용하여 지정된 데이터 배열의 해시 값을 계산합니다."
type: docs
weight: 700
url: /ko/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


지정된 해시 알고리즘을 사용하여 지정된 데이터 배열의 해시 값을 계산합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| data | ByteArrayPtr | 해시할 [Data](../../../system.data/) |
| offset | int32_t | **data**의 오프셋. |
| count | int32_t | 해시할 바이트 수. |
| hash_algorithm | HashAlgorithmName | 해시 알고리즘. |

### ReturnValue

해시된 데이터입니다.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


지정된 해시 알고리즘을 사용하여 지정된 바이너리 스트림의 해시 값을 계산합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | StreamPtr | 해시된 바이너리 스트림. |
| hash_algorithm | HashAlgorithmName | 해시 알고리즘. |

### ReturnValue

해시된 데이터입니다.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
