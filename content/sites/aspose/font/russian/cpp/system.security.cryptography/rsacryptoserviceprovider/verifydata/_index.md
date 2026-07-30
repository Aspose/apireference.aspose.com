---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData метод"
linktitle: "VerifyData"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData метод. Проверяет подпись данных в C++."
type: docs
weight: 1800
url: /ru/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Проверяет подпись данных.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) для проверки подписи. |
| halg | const SharedPtr\<Object\>\& | Алгоритм хеширования для использования. |
| signature | const ByteArrayPtr\& | Подпись в полученном виде. |

### ReturnValue

True, если подпись действительна, false — в противном случае.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
