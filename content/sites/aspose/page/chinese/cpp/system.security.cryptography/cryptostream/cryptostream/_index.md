---
title: "System::Security::Cryptography::CryptoStream::CryptoStream 构造函数"
linktitle: "CryptoStream"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::CryptoStream::CryptoStream 构造函数。 在 C++ 中的构造函数。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/cryptostream/cryptostream/
---
## CryptoStream::CryptoStream constructor


构造函数。

```cpp
System::Security::Cryptography::CryptoStream::CryptoStream(const SharedPtr<System::IO::Stream> &stream, const SharedPtr<ICryptoTransform> &transform, CryptoStreamMode mode)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<System::IO::Stream\>\& | 要包装的流。 |
| 变换 | const SharedPtr\<ICryptoTransform\>\& | 在向流发送/从流读取时用于处理数据的转换函数。 |
| mode | CryptoStreamMode | 流的方向。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [ICryptoTransform](../../icryptotransform/)
* Enum [CryptoStreamMode](../../cryptostreammode/)
* Class [CryptoStream](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
