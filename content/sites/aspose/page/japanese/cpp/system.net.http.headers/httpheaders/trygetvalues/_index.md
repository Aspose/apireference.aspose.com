---
title: "System::Net::Http::Headers::HttpHeaders::TryGetValues メソッド"
linktitle: "TryGetValues"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::HttpHeaders::TryGetValues メソッド。指定された名前で対応する値を取得しようとします（C++）。"
type: docs
weight: 1900
url: /ja/cpp/system.net.http.headers/httpheaders/trygetvalues/
---
## HttpHeaders::TryGetValues method


指定された名前で対応する値の取得を試みます。

```cpp
bool System::Net::Http::Headers::HttpHeaders::TryGetValues(String name, System::SharedPtr<Collections::Generic::IEnumerable<String>> &values)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | ヘッダー名です。 |
| values | System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 対応する値が割り当てられるインスタンス。 |

### ReturnValue

指定された名前でヘッダー値が見つかった場合は true、そうでない場合は false。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
