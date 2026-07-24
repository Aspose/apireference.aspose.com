---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData 메서드"
linktitle: "VerifyData"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData 메서드. C++에서 데이터 서명을 확인합니다."
type: docs
weight: 1800
url: /ko/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


데이터 서명을 검사합니다.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) 의 서명을 확인합니다. |
| halg | const SharedPtr\<Object\>\& | 사용할 해시 알고리즘. |
| signature | const ByteArrayPtr\& | 수신된 서명. |

### ReturnValue

서명이 유효하면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
