---
title: "System::Net::CookieContainer クラス"
linktitle: "CookieContainer"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CookieContainer クラス。CookieCollection-class インスタンス用のコンテナを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.net/cookiecontainer/
---
## CookieContainer class


CookieCollection-class インスタンス用のコンテナを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class CookieContainer : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | コレクションにクッキーを追加します。 |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | コレクションにクッキーを追加します。 |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | 指定されたコレクションから現在のコレクションへクッキーをコピーします。 |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | 指定された URI 用にクッキーを追加します。 |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | 指定された URI 用の指定されたコレクションからクッキーを現在のコレクションへコピーします。 |
| [CookieContainer](./cookiecontainer/)() | 新しいインスタンスを構築します。 |
| [CookieContainer](./cookiecontainer/)(int32_t) | 新しいインスタンスを構築します。 |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | 新しいインスタンスを構築します。 |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | 指定された URI 用の指定された HTTP ヘッダーからクッキーをコピーします。 |
| [get_Capacity](./get_capacity/)() | コレクションの容量を取得します。 |
| [get_Count](./get_count/)() | コレクションの項目数を返します。 |
| [get_MaxCookieSize](./get_maxcookiesize/)() | クッキーの最大サイズを取得します。 |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | ドメインごとのコレクション容量を取得します。 |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | 指定された URI に関連付けられたクッキーを含む HTTP ヘッダーを返します。 |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | 指定された URI に関連付けられたクッキーを含む HTTP ヘッダーを返します。 |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | 指定された URI に関連付けられたクッキーのコレクションを返します。 |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | 指定された URI に関連付けられたクッキーのコレクションを返します。 |
| [IsLocalDomain](./islocaldomain/)(String) | 指定されたドメインが localhost かどうかをチェックします。 |
| [set_Capacity](./set_capacity/)(int32_t) | コレクションの容量を設定します。 |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | クッキーの最大サイズを設定します。 |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | ドメインごとのコレクション容量を設定します。 |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | 指定されたヘッダーからクッキーをコレクションへコピーし、指定された URI に関連付けます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | 最大クッキーサイズです。 |
| static [DefaultCookieLimit](./defaultcookielimit/) | RTTI 情報。 |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | ドメインごとのコレクション項目の最大数です。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
