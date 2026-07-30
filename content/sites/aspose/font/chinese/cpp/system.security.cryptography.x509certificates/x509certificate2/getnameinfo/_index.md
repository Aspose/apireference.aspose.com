---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetNameInfo 方法"
linktitle: "GetNameInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetNameInfo 方法。获取证书中主题或颁发者的名称（在 C++ 中）。"
type: docs
weight: 2100
url: /zh/cpp/system.security.cryptography.x509certificates/x509certificate2/getnameinfo/
---
## X509Certificate2::GetNameInfo method


获取证书的主题或颁发者名称。

```cpp
String System::Security::Cryptography::X509Certificates::X509Certificate2::GetNameInfo(X509NameType name_type, bool for_issuer) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| name_type | X509NameType | 名称格式化选项。 |
| for_issuer | bool | 如果为 true，则返回颁发者名称；否则返回主题名称。 |

### ReturnValue

格式化的颁发者或主题名称。

## 另见

* Class [String](../../../system/string/)
* Enum [X509NameType](../../x509nametype/)
* Class [X509Certificate2](../)
* Namespace [System::Security::Cryptography::X509Certificates](../../)
* Library [Aspose.Font for C++](../../../)
