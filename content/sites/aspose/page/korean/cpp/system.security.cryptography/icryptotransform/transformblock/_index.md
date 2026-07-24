---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock 메서드"
linktitle: "TransformBlock"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock 메서드. C++에서 RTTI 정보."
type: docs
weight: 300
url: /ko/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI 정보.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 에서 데이터를 읽기 위해. |
| inputOffset | int | 입력 버퍼 오프셋. |
| inputCount | int | 처리할 바이트 수. |
| outputBuffer | ArrayPtr\<uint8_t\> | 데이터를 복사할 출력 버퍼; 복사를 하지 않으려면 nullptr. |
| outputOffset | int | 출력 버퍼 오프셋. |

### ReturnValue

작성된 바이트 수.
## 비고


데이터 블록을 처리하고 데이터를 출력 배열에 복사합니다.
## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
