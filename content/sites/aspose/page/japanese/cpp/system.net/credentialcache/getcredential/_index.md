---
title: "System::Net::CredentialCache::GetCredential メソッド"
linktitle: "GetCredential"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CredentialCache::GetCredential メソッド。C++ で指定されたホスト名、ポート、および認証タイプに対する資格情報を返します。"
type: docs
weight: 500
url: /ja/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


指定されたホスト名、ポート、および認証タイプの資格情報を返します。

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | String | 資格情報が関連付けられるホスト名。 |
| ポート | int32_t | ポート番号です。 |
| authenticationType | String | 認証タイプ。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


指定された URI プレフィックスと認証タイプに対する認証情報を返します。

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | URI プレフィックス。 |
| authenticationType | String | 認証タイプ。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
