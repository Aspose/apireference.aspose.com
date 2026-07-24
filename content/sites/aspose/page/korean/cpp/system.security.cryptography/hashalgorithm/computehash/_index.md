---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash 메서드"
linktitle: "ComputeHash"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash 메서드. C++에서 버퍼를 해시합니다."
type: docs
weight: 200
url: /ko/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


버퍼를 해시합니다.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 소스 버퍼. |

### ReturnValue

계산된 해시 값.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


버퍼 슬라이스를 해시합니다.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 소스 버퍼. |
| offset | int | 소스 버퍼의 오프셋. |
| count | int | 소스 버퍼에서 사용할 바이트 수. |

### ReturnValue

계산된 해시 값.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


스트림을 끝까지 읽고 읽은 데이터에 대한 해시를 계산합니다.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | 데이터를 읽을 스트림. |

### ReturnValue

전체 스트림 데이터에 대한 계산된 해시 값.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
