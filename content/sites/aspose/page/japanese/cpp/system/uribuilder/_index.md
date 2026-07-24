---
title: "System::UriBuilder クラス"
linktitle: "UriBuilder"
second_title: "C++ 用 Aspose.Page"
description: "System::UriBuilder クラス。ユニバーサルリソース識別子（URI）を構築および変更するメソッドを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 6800
url: /ja/cpp/system/uribuilder/
---
## UriBuilder class


ユニバーサルリソース識別子（URI）を構築および変更するメソッドを提供します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class UriBuilder : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | 現在のオブジェクトが構築した URI のスキームを返します。 |
| [get_Uri](./get_uri/)() const | 現在のオブジェクトが構築した [Uri](../uri/) オブジェクトを返します。 |
| [set_Port](./set_port/)(int) | URI のポート番号を設定します。 |
| [set_Scheme](./set_scheme/)(const String\&) | 現在のオブジェクトが構築した URI のスキームを指定された値に設定します。 |
| [ToString](./tostring/)() const override | 現在のオブジェクトが構築した URI の文字列表現を返します。 |
| [UriBuilder](./uribuilder/)(const String\&) | 指定された URI を表す [UriBuilder](./) オブジェクトを構築します。 |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | 指定された URI を表す [UriBuilder](./) オブジェクトを構築します。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
