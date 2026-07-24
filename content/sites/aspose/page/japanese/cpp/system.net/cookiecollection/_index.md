---
title: "System::Net::CookieCollection クラス"
linktitle: "CookieCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CookieCollection クラス。ソートされたクッキーのリストを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.net/cookiecollection/
---
## CookieCollection class


ソートされたクッキーのリストを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| 列挙型 | 説明 |
| --- | --- |
| [Stamp](./stamp/) | RTTI 情報。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | コレクションにクッキーを追加します。 |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | 指定されたコレクションからクッキーを現在のコレクションに追加します。 |
| [Clear](./clear/)() override | コレクションからすべてのクッキーを削除します。 |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | コレクションが指定されたクッキーを含んでいるか確認します。 |
| [CookieCollection](./cookiecollection/)() | 新しいインスタンスを構築します。 |
| [get_Count](./get_count/)() const override | コレクション内の要素数を取得します。 |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | コレクションが [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/) と等しくないバージョンのクッキーを含んでいるかどうかを示す値を返します。 |
| [GetEnumerator](./getenumerator/)() override | 列挙子を取得します。 |
| [idx_get](./idx_get/)(int32_t) | 指定されたインデックスのクッキーコレクションからクッキーを返します。 |
| [idx_get](./idx_get/)(String) | 指定された名前でクッキーコレクションからクッキーを返します。 |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | 指定されたクッキーのインデックスを返します。 |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | 指定されたクッキーをコレクションに追加します。 |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | 指定されたクッキーをコレクションから削除します。 |
| [RemoveAt](./removeat/)(int32_t) | 指定されたインデックスのクッキーを削除します。 |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | 指定されたシナリオでタイムスタンプを更新し、新しい値を返します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## 参照

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
