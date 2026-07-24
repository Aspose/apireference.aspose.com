---
title: "System::Security::Cryptography::CipherMode 枚举"
linktitle: "CipherMode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::CipherMode 枚举。C++ 中的块密码模式。"
type: docs
weight: 5300
url: /zh/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


块密码模式。

```cpp
enum class CipherMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| CBC | 1 | 密码块链（Cipher block chaining），将当前块与前一个块组合以增强加密。 |
| ECB | 2 | 电子密码本模式（Electronic codebook），块之间没有相互影响；导致加密强度较弱。 |
| OFB | 3 | 输出反馈模式（Output feedback），将大块输入分成小块处理。 |
| CFB | 4 | 密码反馈模式（Cipher feedback），将大块输入分成小块处理。其混淆规则与 OFB 不同。 |
| CTS | 5 | 密文窃取模式（Cipher text stealing），除最后两个块外，其行为类似于 CBC。 |

## 另见

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
