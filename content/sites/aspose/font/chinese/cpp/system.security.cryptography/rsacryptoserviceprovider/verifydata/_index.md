---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData 方法"
linktitle: "VerifyData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData 方法。检查数据签名（在 C++ 中）。"
type: docs
weight: 1800
url: /zh/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


检查数据签名。

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) 用于检查签名。 |
| halg | const SharedPtr\<Object\>\& | 要使用的哈希算法。 |
| 签名 | const ByteArrayPtr\& | 接收到的签名。 |

### ReturnValue

如果签名有效则为 True，否则为 false。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
