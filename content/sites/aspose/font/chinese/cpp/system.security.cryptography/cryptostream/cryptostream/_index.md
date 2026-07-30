---
title: "System::Security::Cryptography::CryptoStream::CryptoStream 构造函数"
linktitle: "CryptoStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::CryptoStream::CryptoStream 构造函数。C++ 中的构造函数。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/cryptostream/cryptostream/
---
## CryptoStream::CryptoStream constructor


构造函数。

```cpp
System::Security::Cryptography::CryptoStream::CryptoStream(const SharedPtr<System::IO::Stream> &stream, const SharedPtr<ICryptoTransform> &transform, CryptoStreamMode mode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<System::IO::Stream\>\& | 要包装的流。 |
| 转换 | const SharedPtr\<ICryptoTransform\>\& | 用于在发送/读取流时处理数据的转换函数。 |
| mode | CryptoStreamMode | 流方向。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [ICryptoTransform](../../icryptotransform/)
* Enum [CryptoStreamMode](../../cryptostreammode/)
* Class [CryptoStream](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
