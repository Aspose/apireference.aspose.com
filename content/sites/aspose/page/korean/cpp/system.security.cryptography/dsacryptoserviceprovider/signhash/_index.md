---
title: "System::Security::Cryptography::DSACryptoServiceProvider::SignHash 메서드"
linktitle: "SignHash"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider::SignHash 메서드. C++에서 지정된 입력 값의 서명을 계산합니다."
type: docs
weight: 1600
url: /ko/cpp/system.security.cryptography/dsacryptoserviceprovider/signhash/
---
## DSACryptoServiceProvider::SignHash method


지정된 입력 값의 서명을 계산합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 서명할 데이터의 해시 값. |
| str | const String\& | 해시를 생성하는 데 사용된 해시 알고리즘 식별자. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
