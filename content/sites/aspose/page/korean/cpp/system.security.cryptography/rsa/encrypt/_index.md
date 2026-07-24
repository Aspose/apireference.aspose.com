---
title: "System::Security::Cryptography::RSA::Encrypt 메서드"
linktitle: "Encrypt"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSA::Encrypt 메서드. C++에서 지정된 패딩 모드를 사용하여 입력 데이터를 암호화합니다."
type: docs
weight: 300
url: /ko/cpp/system.security.cryptography/rsa/encrypt/
---
## RSA::Encrypt method


지정된 패딩 모드를 사용하여 입력 데이터를 암호화합니다.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| data | ByteArrayPtr | 암호화할 [Byte](../../../system/byte/) 배열. |
| 패딩 | SharedPtr\<RSAEncryptionPadding\> | 패딩 모드. |

### ReturnValue

바이트 배열 형식의 암호화된 데이터.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
