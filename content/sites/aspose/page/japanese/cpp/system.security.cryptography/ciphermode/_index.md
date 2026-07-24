---
title: "System::Security::Cryptography::CipherMode 列挙型"
linktitle: "CipherMode"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::CipherMode 列挙型。C++ のブロック暗号モードです。"
type: docs
weight: 5300
url: /ja/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


ブロック暗号モードです。

```cpp
enum class CipherMode
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| CBC | 1 | 現在のブロックを前のブロックと結合して暗号化を強化する Cipher block chaining です。 |
| ECB | 2 | ブロック間の影響がない電子コードブック（Electronic codebook）モードで、暗号化が弱くなります。 |
| OFB | 3 | 大きな入力ブロックを小さな単位で処理する出力フィードバック（Output feedback）モードです。 |
| CFB | 4 | 大きな入力ブロックを小さな単位で処理する暗号フィードバック（Cipher feedback）モードです。変形規則は OFB と異なります。 |
| CTS | 5 | 暗号テキスト盗用（Cipher text stealing）モードで、最後の 2 ブロックを除くすべてで CBC と同様に動作します。 |

## 参照

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
