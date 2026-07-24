---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedNameFlags 列挙体"
linktitle: "X500DistinguishedNameFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedNameFlags 列挙体。C++ における X509 証明書の識別名の書式設定規則。"
type: docs
weight: 1700
url: /ja/cpp/system.security.cryptography.x509certificates/x500distinguishednameflags/
---
## X500DistinguishedNameFlags enum


X509 証明書の識別名の書式設定ルール。

```cpp
enum class X500DistinguishedNameFlags
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | 特別な特性はありません。 |
| 逆転 | 1 | 名前は予約されています。 |
| UseSemicolons | 16 | セミコロンを使用します。 |
| DoNotUsePlusSign | 32 | 名前はプラス記号を使用しません。 |
| DoNotUseQuotes | 64 | 名前での引用符を無効にします。 |
| UseCommas | 128 | カンマの使用を有効にします。 |
| UseNewLines | 256 | 改行の使用を有効にします。 |
| UseUTF8Encoding | 4096 | Unicode の使用から UTF-8 エンコーディングへの切り替えを行います。 |
| UseT61Encoding | 8192 | T61 エンコーディングに切り替えます。 |
| ForceUTF8Encoding | 16384 | 特定の X500 キーをエンコードする際に UTF-8 の使用を強制します。 |

## 参照

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
