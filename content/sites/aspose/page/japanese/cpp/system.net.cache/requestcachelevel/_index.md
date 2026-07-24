---
title: "System::Net::Cache::RequestCacheLevel 列挙型"
linktitle: "RequestCacheLevel"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Cache::RequestCacheLevel 列挙型。 この列挙型は C++ の任意の WebRequest に適用できるキャッシュ設定を説明します。"
type: docs
weight: 500
url: /ja/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


この列挙型は任意の [WebRequest](../../system.net/webrequest/) に適用できるキャッシュ設定を説明します。

```cpp
enum class RequestCacheLevel
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Default | 0 | リソースのキャッシュコピーを使用するか、サーバーにリソースのリクエストを送信することで、リソースへの要求を満たします。 |
| BypassCache | 1 | サーバーを使用して要求を満たします。キャッシュからエントリは取得されません。 |
| CacheOnly | 2 | リソースへの要求をキャッシュからのみ満たします。リソースがクライアントキャッシュに存在しない場合、[WebException](../../system.net/webexception/) がスローされます。 |
| CacheIfAvailable | 3 | リソースがキャッシュに存在すればキャッシュからリクエストを満たし、存在しなければサーバーにリクエストを送信します。 |
| 再検証 | 4 | クライアントのタイムスタンプがサーバー上のリソースのタイムスタンプと同じ場合はローカルコピーを使用します。そうでない場合はサーバーからリソースをダウンロードします。 |
| 再読み込み | 5 | リソースは常にサーバーからダウンロードされます。 |
| NoCacheNoStore | 6 | キャッシュからリソースを使用してリクエストを満たすことはなく、リソースをキャッシュしません。 |

## 参照

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
