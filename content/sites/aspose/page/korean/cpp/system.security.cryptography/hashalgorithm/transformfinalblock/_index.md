---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock 메서드"
linktitle: "TransformFinalBlock"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock 메서드. C++에서 데이터의 마지막 블록을 처리하고 해시를 계산합니다."
type: docs
weight: 900
url: /ko/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


마지막 데이터 블록을 처리하고 해시를 계산합니다.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 에서 데이터를 읽기 위해. |
| inputOffset | int | 입력 버퍼 오프셋. |
| inputCount | int | 처리할 바이트 수. |

### ReturnValue

전체 데이터 시퀀스에 대해 계산된 해시.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
