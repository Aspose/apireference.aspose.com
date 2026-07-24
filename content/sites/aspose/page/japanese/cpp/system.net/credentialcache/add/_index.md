---
title: "System::Net::CredentialCache::Add メソッド"
linktitle: "Add"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CredentialCache::Add メソッド。指定されたネットワーク資格情報を C++ のキャッシュに追加します。"
type: docs
weight: 400
url: /ja/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


指定されたネットワーク認証情報をキャッシュに追加します。

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | String | 資格情報が関連付けられるホスト名。 |
| ポート | int32_t | ポート番号です。 |
| authenticationType | String | 認証スキーム。 |
| credential | System::SharedPtr\<NetworkCredential\> | 追加する資格情報。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


指定されたネットワーク認証情報をキャッシュに追加します。

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | 資格情報が関連付けられるリソースの URI プレフィックス。 |
| authenticationType | String | 認証スキーム。 |
| credential | System::SharedPtr\<NetworkCredential\> | 追加する資格情報。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
