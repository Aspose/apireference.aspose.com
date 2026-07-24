---
title: "System::Net::Http::Headers::CacheControlHeaderValue クラス"
linktitle: "CacheControlHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::CacheControlHeaderValue クラス。''Cache-Control'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


'Cache-Control' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数として渡す際にそのポインタを使用してください。

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | 新しいインスタンスを構築します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Extensions](./get_extensions/)() | キャッシュ拡張トークンのコレクションを返します。 |
| [get_MaxAge](./get_maxage/)() | クライアントがレスポンスを受け入れる期間を決定する、最大年齢（秒）値を取得します。 |
| [get_MaxStale](./get_maxstale/)() | クライアントが期限切れのレスポンスを受け入れるかどうかを決定する値を取得します。 |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | クライアントが期限切れのレスポンスを受け入れる期間を決定する秒単位の値を取得します。 |
| [get_MinFresh](./get_minfresh/)() | 新鮮さの有効期間を決定する値を取得します。 |
| [get_MustRevalidate](./get_mustrevalidate/)() | サーバーがキャッシュエントリの再検証を要求するかどうか（エントリが古くなったとき）を決定する値を取得します。 |
| [get_NoCache](./get_nocache/)() | RTTI 情報。 |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | 'Cache-Control' ヘッダーの 'no-cache' ディレクティブに含まれるフィールド名のコレクションを取得します。 |
| [get_NoStore](./get_nostore/)() | キャッシュが HTTP リクエストまたはレスポンスのいずれの部分も保存してはならないかどうかを決定する値を取得します。 |
| [get_NoTransform](./get_notransform/)() | キャッシュまたはプロキシがエンティティ本体のいずれの部分も変更してはならないかどうかを決定する値を取得します。 |
| [get_OnlyIfCached](./get_onlyifcached/)() | クライアントがキャッシュされたエントリのみを使用しなければならないかどうかを決定する値を取得します。 |
| [get_Private](./get_private/)() | HTTP 応答メッセージまたはその一部が単一ユーザー向けであり、共有キャッシュに保存してはならないかどうかを決定する値を取得します。 |
| [get_PrivateHeaders](./get_privateheaders/)() | 'Cache-Control' ヘッダーの 'private' ディレクティブに含まれるフィールド名のコレクションを取得します。 |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | サーバーが共有ユーザーエージェントキャッシュに対して、キャッシュエントリが古くなったときに再検証を要求するかどうかを決定する値を取得します。 |
| [get_Public](./get_public/)() | HTTP 応答が任意のキャッシュによってキャッシュ可能かどうかを決定する値を取得します。 |
| [get_SharedMaxAge](./get_sharedmaxage/)() | 共有キャッシュに対して、'Cache-Control' の 'max-age' ディレクティブまたは 'Expires' ヘッダーを上書きする、秒単位の共有最大有効期間の値を取得します。 |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [CacheControlHeaderValue](./) クラスのインスタンスに変換します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [Parse](./parse/)(String) | 渡された文字列を [CacheControlHeaderValue](./) クラスのインスタンスに変換します。 |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | クライアントがレスポンスを受け入れる期間を決定する、秒単位の最大有効期間の値を設定します。 |
| [set_MaxStale](./set_maxstale/)(bool) | クライアントが期限切れのレスポンスを受け入れるかどうかを決定する値を設定します。 |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | クライアントが期限切れのレスポンスを受け入れる期間を決定する、秒単位の値を設定します。 |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | 新鮮さの有効期間を決定する値を設定します。 |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | サーバーがキャッシュエントリが古くなったときに再検証を要求するかどうかを決定する値を設定します。 |
| [set_NoCache](./set_nocache/)(bool) | クライアントがキャッシュされたレスポンスを受け入れるかどうかを決定する値を設定します。 |
| [set_NoStore](./set_nostore/)(bool) | キャッシュが HTTP リクエストまたはレスポンスのいずれの部分も保存してはならないかどうかを決定する値を設定します。 |
| [set_NoTransform](./set_notransform/)(bool) | キャッシュまたはプロキシがエンティティ本体のいずれの部分も変更してはならないかどうかを決定する値を設定します。 |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | クライアントがキャッシュされたエントリのみを使用しなければならないかどうかを決定する値を設定します。 |
| [set_Private](./set_private/)(bool) | HTTP 応答メッセージまたはその一部が単一ユーザー向けであり、共有キャッシュに保存してはならないかどうかを決定する値を設定します。 |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | サーバーが共有ユーザーエージェントキャッシュに対して、キャッシュエントリが古くなったときに再検証を要求するかどうかを決定する値を設定します。 |
| [set_Public](./set_public/)(bool) | HTTP 応答が任意のキャッシュによってキャッシュ可能かどうかを決定する値を設定します。 |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | 共有キャッシュのために、'Cache-Control' ヘッダーの 'max-age' ディレクティブや 'Expires' ヘッダーを上書きする、共有最大有効期間（秒）を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | 渡された文字列を [CacheControlHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
