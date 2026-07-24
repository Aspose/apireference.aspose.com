---
title: "System::Net::Http::Headers::HttpHeaders クラス"
linktitle: "HttpHeaders"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::HttpHeaders クラス。HTTP ヘッダーのコレクションです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


HTTP ヘッダーのコレクションです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | 新しい名前-値ペアを検証し、現在のコレクションに追加します。 |
| [Add](./add/)(String, String) | 新しい名前と値のペアを検証し、現在のコレクションに追加します。 |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | 指定された HttpHeaders-class インスタンスを現在のものと連結します。 |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | 指定された名前でヘッダーを取得し、解析された値をヘッダーに追加します。 |
| [Clear](./clear/)() | コレクションからすべての項目を削除します。 |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | ヘッダーが指定された値を含んでいるか確認します。 |
| [GetEnumerator](./getenumerator/)() override | 列挙子を取得します。 |
| [GetHeaderString](./getheaderstring/)(String) | 指定されたヘッダー名に対する値の文字列表現を返します。 |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | 指定されたヘッダー名に対する値の文字列表現を返します。 |
| [GetHeaderStrings](./getheaderstrings/)() | ヘッダーの値の文字列表現を含むコレクションを返します。 |
| [GetParsedValues](./getparsedvalues/)(String) | 指定されたヘッダー名に対する解析済みの値を返します。 |
| [GetValues](./getvalues/)(String) | 指定された名前に対応する値を返します。 |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | 解析済みの値をリストに変換します。 |
| [Remove](./remove/)(String) | 指定された名前で項目の削除を試みます。 |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | 指定された名前でヘッダーを取得し、ヘッダーから解析された値を削除します。 |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | 指定された名前でヘッダーを取得し、その値を設定または削除します。'value' パラメーターが nullptr の場合はヘッダーの値が削除され、それ以外の場合は解析された値が設定されます。 |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | 指定された名前でヘッダーを取得し、ヘッダーに解析された値を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | 新しい名前と値のペアを現在のコレクションに追加しようとします。 |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | 名前と値のペアのコレクションを現在のコレクションに追加します。 |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | 指定された名前で対応する値の取得を試みます。 |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | 指定された値を解析し、ヘッダーの値に追加しようとします。 |
## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
