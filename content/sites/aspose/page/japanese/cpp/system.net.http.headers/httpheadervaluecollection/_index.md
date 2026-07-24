---
title: "System::Net::Http::Headers::HttpHeaderValueCollection クラス"
linktitle: "HttpHeaderValueCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::HttpHeaderValueCollection クラス。ヘッダー値のコレクションを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 800
url: /ja/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


ヘッダー値のコレクションを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| パラメーター | 説明 |
| --- | --- |
| この | コレクション内で表されるヘッダー値の型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const T\&) override | コレクションに要素を追加します。 |
| [Clear](./clear/)() override | コレクションからすべての要素を削除します。 |
| [Contains](./contains/)(const T\&) const override | コレクションに要素が存在するか確認します。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | すべてのコレクション要素を既存の配列要素にコピーします。 |
| [get_Count](./get_count/)() const override | RTTI 情報。 |
| [get_IsReadOnly](./get_isreadonly/)() | 現在のコレクションが読み取り専用かどうかを示す値を取得します。 |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | 現在のコレクションに "special value" が含まれているかどうかを示す値を取得します。 |
| [GetEnumerator](./getenumerator/)() override | 列挙子を取得します。 |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | 現在のコレクションの文字列表現を、"special value" なしで返します。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | 新しいインスタンスを構築します。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | 新しいインスタンスを構築します。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | 新しいインスタンスを構築します。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | 新しいインスタンスを構築します。 |
| [ParseAdd](./parseadd/)(String) | ヘッダー文字列表現を解析し、現在のコレクションに追加します。 |
| [Remove](./remove/)(const T\&) override | コレクションから要素を削除します。 |
| [RemoveSpecialValue](./removespecialvalue/)() | "special value" を削除します。 |
| [SetSpecialValue](./setspecialvalue/)() | "special value" を設定します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| [TryParseAdd](./tryparseadd/)(String) | ヘッダー文字列表現を解析し、現在のコレクションに追加しようとします。 |

## 参照

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
