---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType 方法"
linktitle: "GetCertContentType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType 方法。获取指定字节数组中包含的证书类型（C++）。"
type: docs
weight: 3100
url: /zh/cpp/system.security.cryptography.x509certificates/x509certificate2/getcertcontenttype/
---
## X509Certificate2::GetCertContentType(const ByteArrayPtr\&) method


获取指定字节数组中包含的证书类型。

```cpp
static X509ContentType System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType(const ByteArrayPtr &raw_data)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| raw_data | const ByteArrayPtr\& | 证书数据。 |

### ReturnValue

X.509 证书的类型。

## 另见

* Enum [X509ContentType](../../x509contenttype/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [X509Certificate2](../)
* Namespace [System::Security::Cryptography::X509Certificates](../../)
* Library [Aspose.Font for C++](../../../)
## X509Certificate2::GetCertContentType(const String\&) method


获取指定文件中包含的证书类型。

```cpp
static X509ContentType System::Security::Cryptography::X509Certificates::X509Certificate2::GetCertContentType(const String &filename)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | 证书文件名。 |

### ReturnValue

X.509 证书的类型。

## 另见

* Enum [X509ContentType](../../x509contenttype/)
* Class [String](../../../system/string/)
* Class [X509Certificate2](../)
* Namespace [System::Security::Cryptography::X509Certificates](../../)
* Library [Aspose.Font for C++](../../../)
