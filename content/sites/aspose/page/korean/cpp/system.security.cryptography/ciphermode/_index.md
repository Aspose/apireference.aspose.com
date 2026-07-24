---
title: "System::Security::Cryptography::CipherMode 열거형"
linktitle: "CipherMode"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::CipherMode 열거형. C++에서 블록 암호 모드."
type: docs
weight: 5300
url: /ko/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


블록 암호 모드.

```cpp
enum class CipherMode
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| CBC | 1 | 현재 블록을 이전 블록과 결합하여 암호화를 향상시키는 Cipher block chaining. |
| ECB | 2 | 블록 간 영향을 주지 않는 전자 코드북 모드; 암호화가 약해집니다. |
| OFB | 3 | 큰 입력 블록을 작은 조각으로 처리하는 Output feedback 모드. |
| CFB | 4 | 큰 입력 블록을 작은 조각으로 처리하는 Cipher feedback 모드. OFB와는 다른 변형 규칙을 가집니다. |
| CTS | 5 | Cipher text stealing 모드, 마지막 두 블록을 제외하고는 CBC처럼 동작합니다. |

## 또 보기

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
