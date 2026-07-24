---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetNameInfo メソッド"
linktitle: "GetNameInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetNameInfo メソッド。C++ で証明書からサブジェクトまたは発行者名を取得します。"
type: docs
weight: 2100
url: /ja/cpp/system.security.cryptography.x509certificates/x509certificate2/getnameinfo/
---
## X509Certificate2::GetNameInfo method


証明書からサブジェクトまたは発行者名を取得します。

```cpp
String System::Security::Cryptography::X509Certificates::X509Certificate2::GetNameInfo(X509NameType name_type, bool for_issuer) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name_type | X509NameType | 名前の書式設定オプション。 |
| for_issuer | bool | true の場合は発行者名を返し、false の場合はサブジェクト名を返します。 |

### ReturnValue

書式化された発行者またはサブジェクト名。

## 参照

* Class [String](../../../system/string/)
* Enum [X509NameType](../../x509nametype/)
* Class [X509Certificate2](../)
* Namespace [System::Security::Cryptography::X509Certificates](../../)
* Library [Aspose.Page for C++](../../../)
