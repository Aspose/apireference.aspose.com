---
title: "System::Security::Cryptography::RSA::Decrypt 메서드"
linktitle: "Decrypt"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSA::Decrypt 메서드. C++에서 지정된 패딩 모드를 사용하여 입력 데이터를 복호화합니다."
type: docs
weight: 100
url: /ko/cpp/system.security.cryptography/rsa/decrypt/
---
## RSA::Decrypt method


지정된 패딩 모드를 사용하여 입력 데이터를 복호화합니다.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| data | ByteArrayPtr | 복호화할 [Byte](../../../system/byte/) 배열. |
| 패딩 | SharedPtr\<RSAEncryptionPadding\> | 패딩 모드. |

### ReturnValue

바이트 배열 형식의 복호화된 데이터.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
