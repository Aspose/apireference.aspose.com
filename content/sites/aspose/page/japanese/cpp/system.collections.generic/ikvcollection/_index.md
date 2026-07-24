---
title: "System::Collections::Generic::IKVCollection クラス"
linktitle: "IKVCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IKVCollection クラス。辞書型コンテナのキーまたは値を保持するコンテナのインターフェイス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 2500
url: /ja/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


辞書型コンテナのキーまたは値を保持するコンテナのインターフェイス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) 型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const T\&) override | コンテナに項目を追加します。 |
| [Clear](./clear/)() override | コンテナからすべての要素を削除します。 |
| [Contains](./contains/)(const T\&) const override | アイテムがコンテナに存在するかチェックします。 |
| virtual [get_Count](./get_count/)() const | コンテナ内の要素数を取得します。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | コンテナが読み取り専用かどうかを確認します。 |
| virtual [GetEnumerator](./getenumerator/)() | RTTI 情報。 |
| virtual [idx_get](./idx_get/)(int) const | ゲッタ関数。 |
| [idx_set](./idx_set/)(int, T) override | セッタ関数。 |
| [IndexOf](./indexof/)(const T\&) const override | コンテナ内のアイテムのインデックスを取得します。 |
| [Insert](./insert/)(int, const T\&) override | 指定された位置に項目を挿入します。 |
| [Remove](./remove/)(const T\&) override | コンテナからアイテムを削除します。 |
| [RemoveAt](./removeat/)(int) override | 指定された位置の項目を削除します。 |

## 参照

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
