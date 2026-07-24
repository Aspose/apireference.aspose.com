---
title: "System::Net::Cache::HttpCacheAgeControl 列挙型"
linktitle: "HttpCacheAgeControl"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Cache::HttpCacheAgeControl 列挙型。CacheAgeControl は C++ においてキャッシュされたアイテムの年齢と新鮮さに関する設定を指定するために使用されます。"
type: docs
weight: 300
url: /ja/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl は、キャッシュされた項目の古さと新鮮さに関する設定を指定するために使用されます。

```cpp
enum class HttpCacheAgeControl
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | 内部使用のみです。 |
| MinFresh | 1 | 有効期限までの残り時間がこの値で指定された時間以上である場合、コンテンツはキャッシュから取得できます。 |
| MaxAge | 2 | コンテンツは、この値で指定された有効期限を超えるまでキャッシュから取得できます。 |
| MaxStale | 4 | コンテンツは期限切れになった後でも、この値で指定された時間が経過するまでキャッシュから取得できます。 |
| MaxAgeAndMinFresh | 3 | MaxAge と MinFresh。 |
| MaxAgeAndMaxStale | 6 | MaxAge と MaxStale。 |

## 参照

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
