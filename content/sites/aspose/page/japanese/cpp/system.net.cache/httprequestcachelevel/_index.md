---
title: "System::Net::Cache::HttpRequestCacheLevel 列挙型"
linktitle: "HttpRequestCacheLevel"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Cache::HttpRequestCacheLevel 列挙型。 この列挙型は C++ における HTTP のキャッシュ設定を説明します。"
type: docs
weight: 400
url: /ja/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


この列挙型は HTTP のキャッシュ設定を説明します。

```cpp
enum class HttpRequestCacheLevel
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Default | 0 | リソースのキャッシュコピーを使用するか、サーバーにリソースのリクエストを送信することで、リソースへの要求を満たします。 |
| BypassCache | 1 | サーバーを使用してリクエストを満たします。 |
| CacheOnly | 2 | 常にクライアントキャッシュを使用してリソースを取得します。 |
| CacheIfAvailable | 3 | リソースがキャッシュに存在すればキャッシュからリクエストを満たし、存在しなければサーバーにリクエストを送信します。 |
| 再検証 | 4 | クライアントのタイムスタンプがサーバー上のリソースのタイムスタンプと同じ場合はローカルコピーを使用します。そうでない場合はサーバーからリソースをダウンロードします。 |
| 再読み込み | 5 | リソースは常にサーバーからダウンロードされます。 |
| NoCacheNoStore | 6 | キャッシュからリソースを使用してリクエストを満たすことはなく、リソースをキャッシュしません。 |
| CacheOrNextCacheOnly | 7 | ローカルコンピュータのキャッシュまたは LAN 上のリモートキャッシュのいずれかからリソースのリクエストを満たします。 |
| Refresh | 8 | サーバーまたはローカルキャッシュ以外のキャッシュを使用してリクエストを満たします。 |

## 参照

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
