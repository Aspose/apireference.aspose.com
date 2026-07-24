---
title: "System::UriComponents 列挙型"
linktitle: "UriComponents"
second_title: "C++ 用 Aspose.Page"
description: "System::UriComponents 列挙型。C++ における URI コンポーネントを表します。"
type: docs
weight: 8900
url: /ja/cpp/system/uricomponents/
---
## UriComponents enum


URI コンポーネントを表します。

```cpp
enum class UriComponents
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| スキーム | 1 | Scheme データ。 |
| UserInfo | 2 | UserInfo データ。 |
| Host | 4 | Host データ。 |
| ポート | 8 | Port データ。 |
| SchemeAndServer | n/a | Scheme、Host、Port データ。 |
| パス | 16 | LocalPath データ。 |
| クエリ | 32 | Query データ。 |
| PathAndQuery | n/a | LocalPath と Query データ。 |
| HttpRequestUrl | n/a | Scheme、Host、Port、Query、LocalPath データ。 |
| Fragment | 64 | Fragment データ。 |
| AbsoluteUri | n/a | スキーム、ホスト、ポート、Quer、ローカルパス、およびフラグメントのデータです。 |
| StrongPort | 128 | ポートデータ; ポートデータが[Uri](../uri/)に存在せず、スキームにデフォルトポートが割り当てられている場合、デフォルトポートが返されます; デフォルトポートがない場合、-1 が返されます。 |
| HostAndPort | n/a | ホストおよびポートデータ; ポートデータが[Uri](../uri/)に存在せず、スキームにデフォルトポートが割り当てられている場合、デフォルトポートが返されます。デフォルトポートがない場合、-1 が返されます。 |
| StrongAuthority | n/a | UserInfo、ホスト、およびポートデータ。ポートデータが[Uri](../uri/)に存在せず、スキームにデフォルトポートが割り当てられている場合、デフォルトポートが返されます。デフォルトポートがない場合、-1 が返されます。 |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | 区切り文字を含めることを指定します。 |
| SerializationInfoString | n/a | [Uri](../uri/) シリアライザに必要な完全な [Uri](../uri/) コンテキストです。コンテキストには IPv6 スコープが含まれます。 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
