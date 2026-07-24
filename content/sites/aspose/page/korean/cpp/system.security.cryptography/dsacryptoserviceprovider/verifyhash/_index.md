---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash 메서드"
linktitle: "VerifyHash"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash 메서드. C++에서 데이터 서명을 확인합니다."
type: docs
weight: 1800
url: /ko/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


데이터 서명을 검사합니다.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 수신된 데이터에 대해 계산된 해시. |
| str | const String\& | 사용된 해시 알고리즘의 이름. |
| rgb_signature | const ByteArrayPtr\& | 수신된 서명. |

### ReturnValue

서명이 유효하면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
