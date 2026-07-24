---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType メソッド"
linktitle: "GetCertContentType"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType メソッド。指定されたバイト配列に含まれる証明書のタイプを取得します（C++）。"
type: docs
weight: 3100
url: /ja/cpp/system.security.cryptography.x509certificates/x509certificate2/getcertcontenttype/
---
## X509Certificate2::GetCertContentType(const ByteArrayPtr\&) method


指定されたバイト配列に含まれる証明書のタイプを取得します。

```cpp
static X509ContentType System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType(const ByteArrayPtr &raw_data)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| raw_data | const ByteArrayPtr\& | 証明書データ。 |

### ReturnValue

X.509 証明書のタイプ。

## 参照

* Enum [X509ContentType](../../x509contenttype/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [X509Certificate2](../)
* Namespace [System::Security::Cryptography::X509Certificates](../../)
* Library [Aspose.Page for C++](../../../)
## X509Certificate2::GetCertContentType(const String\&) method


指定されたファイルに含まれる証明書のタイプを取得します。

```cpp
static X509ContentType System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType(const String &filename)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | const String\& | 証明書ファイル名。 |

### ReturnValue

X.509 証明書のタイプ。

## 参照

* Enum [X509ContentType](../../x509contenttype/)
* Class [String](../../../system/string/)
* Class [X509Certificate2](../)
* Namespace [System::Security::Cryptography::X509Certificates](../../)
* Library [Aspose.Page for C++](../../../)
