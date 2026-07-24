---
title: "System::Net::CredentialCache::Remove メソッド"
linktitle: "Remove"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CredentialCache::Remove メソッド。指定されたホスト名、ポート、認証タイプのネットワーク資格情報を C++ で削除します。"
type: docs
weight: 600
url: /ja/cpp/system.net/credentialcache/remove/
---
## CredentialCache::Remove(String, int32_t, String) method


指定されたホスト名、ポート、認証タイプに対するネットワーク認証情報を削除します。

```cpp
void System::Net::CredentialCache::Remove(String host, int32_t port, String authenticationType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | String | 資格情報が関連付けられるホスト名。 |
| ポート | int32_t | ポート番号です。 |
| authenticationType | String | 認証タイプ。 |

## 参照

* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::Remove(System::SharedPtr\<Uri\>, String) method


指定された URI プレフィックスと認証タイプに対するネットワーク認証情報を削除します。

```cpp
void System::Net::CredentialCache::Remove(System::SharedPtr<Uri> uriPrefix, String authenticationType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | URI プレフィックス。 |
| authenticationType | String | 認証タイプ。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
