---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags 列挙型"
linktitle: "X509KeyUsageFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags 列挙型。C++ で証明書キーがどのように使用できるかを定義します。"
type: docs
weight: 2200
url: /ja/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


証明書キーの使用方法を定義します。

```cpp
enum class X509KeyUsageFlags : int32_t
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | キー使用パラメータはありません。 |
| EncipherOnly | 1 | キーは暗号化のみに使用できます。 |
| CrlSign | 2 | キーは証明書失効リストに署名するために使用できます。 |
| KeyCertSign | 4 | キーは証明書に署名するために使用できます。 |
| KeyAgreement | 8 | キーは鍵合意を決定するために使用できます。 |
| DataEncipherment | 16 | キーはデータ暗号化に使用できます。 |
| KeyEncipherment | 32 | キーは鍵暗号化に使用できます。 |
| NonRepudiation | 64 | キーは認証に使用できます。 |
| DigitalSignature | 128 | キーはデジタル署名として使用できます。 |
| DecipherOnly | 32768 | キーは復号のみに使用できます。 |

## 参照

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
