---
title: "System::Net::Cache::HttpRequestCachePolicy クラス"
linktitle: "HttpRequestCachePolicy"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Cache::HttpRequestCachePolicy クラス。RFC2616 HTTP キャッシュのセマンティクスを表す HTTP キャッシュポリシーです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


RFC2616 HTTP キャッシュのセマンティクスを表す HTTP キャッシュポリシーです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | キャッシュに保存されたリソースが再検証される必要がある時刻を取得します。 |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | キャッシュに保存されたリソースが再検証される必要がある UTC 時刻を取得します。内部使用のみです。 |
| [get_Level](./get_level/)() const | RTTI 情報。 |
| [get_MaxAge](./get_maxage/)() const | リソースに許可される最大有効期間を取得します。 |
| [get_MaxStale](./get_maxstale/)() const | リソースに許可される最大陳腐化値を取得します。 |
| [get_MinFresh](./get_minfresh/)() const | リソースに許可される最小有効期間を取得します。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | 新しいインスタンスを構築します。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | 新しいインスタンスを構築します。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | 新しいインスタンスを構築します。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | 新しいインスタンスを構築します。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | 新しいインスタンスを構築します。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | 新しいインスタンスを構築します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
