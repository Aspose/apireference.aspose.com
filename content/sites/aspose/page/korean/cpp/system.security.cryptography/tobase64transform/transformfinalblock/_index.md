---
title: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock 메서드"
linktitle: "TransformFinalBlock"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock 메서드. C++에서 마지막 데이터 블록을 처리하고 출력 값을 계산합니다."
type: docs
weight: 900
url: /ko/cpp/system.security.cryptography/tobase64transform/transformfinalblock/
---
## ToBase64Transform::TransformFinalBlock method


마지막 데이터 블록을 처리하고 출력 값을 계산합니다.

```cpp
System::ArrayPtr<uint8_t> System::Security::Cryptography::ToBase64Transform::TransformFinalBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 에서 데이터를 읽기 위해. |
| inputOffset | int32_t | 입력 버퍼 오프셋. |
| inputCount | int32_t | 처리할 바이트 수. |

### ReturnValue

전체 입력 시퀀스에 대해 계산된 출력.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
