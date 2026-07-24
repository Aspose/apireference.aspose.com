---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> クラス"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "C++ 用 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> クラス。デリゲートのコレクションを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 4500
url: /ja/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


デリゲートのコレクションを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。決して [System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| パラメーター | 説明 |
| --- | --- |
| ReturnType | コレクション内の各デリゲートが指す呼び出し可能エンティティの戻り値の型 |
| ArgumentTypes | コレクション内の各デリゲートが指す呼び出し可能エンティティの引数リスト |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | 未実装です。 |
| [connect](./connect/)(Callback) | 指定されたデリゲートをコレクションに追加します。 |
| [connect](./connect/)(std::function\<R(Args...)>) | 指定された関数オブジェクトをデリゲートコレクションに追加します。関数オブジェクトはコレクションに追加される前に [Callback](./callback/) デリゲート型に変換されます。 |
| [connect](./connect/)(MulticastDelegate\&) | 指定された MulticastDelegate オブジェクトをデリゲートコレクションに追加します。 |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | 指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションに追加します。 |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | 指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションに追加します。 |
| [disconnect](./disconnect/)(Callback) | 指定されたデリゲートをデリゲートコレクションから削除します。 |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | 指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションから削除します。 |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | 指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションから削除します。 |
| [disconnect](./disconnect/)(MulticastDelegate\&) | 指定された MulticastDelegate オブジェクトをデリゲートコレクションから削除します。 |
| [disconnect_all_slots](./disconnect_all_slots/)() | デリゲートコレクションからすべてのデリゲートを削除します。 |
| [empty](./empty/)() const | デリゲートコレクションが空かどうかを判定します。 |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | 未実装です。 |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | 現在デリゲートコレクションに存在するすべてのデリゲートを呼び出します。デリゲートはコレクションに追加された順序と同じ順序で呼び出されます。デリゲートの実行中はこのメソッドはブロックされます。 |
| [IsNull](./isnull/)() const | デリゲートコレクションが空かどうかを判定します。 |
| [MulticastDelegate](./multicastdelegate/)() | 空のコレクションを構築します。 |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | デフォルトコンストラクタと同等です。 |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | デリゲートコレクションの浅いコピーを実行します。 |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | ムーブコンストラクタ。 |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | インスタンスを構築し、指定されたデリゲートをデリゲートコレクションに追加します。 |
| [MulticastDelegate](./multicastdelegate/)(T) | インスタンスを構築し、指定された値をデリゲートコレクションに追加します。 |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | インスタンスを構築し、指定された値をデリゲートコレクションに追加します。 |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | デリゲートコレクションが空でないかどうかを判定します。 |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | MulticastDelegate の 2 つのインスタンス（現在のオブジェクトと指定されたオブジェクト）が等しくないかどうかを判定します。 |
| [operator()](./operator()/)(ArgumentTypes...) const | デリゲートコレクションに現在存在するすべてのデリゲートを呼び出します。デリゲートはコレクションに追加された順序と同じ順序で呼び出されます。デリゲートが実行されている間、演算子はブロックされます。 |
| [operator+=](./operator+=/)(Callback) | 指定されたデリゲートをコレクションに追加します。 |
| [operator-=](./operator-=/)(Callback) | 指定されたデリゲートをデリゲートコレクションから削除します。 |
| [operator=](./operator=/)(const MulticastDelegate\&) | 指定されたオブジェクトが表すデリゲートのコレクションを現在のオブジェクトに割り当てます。その結果、両方のオブジェクトは同じデリゲートコレクションを指すようになります。 |
| [operator=](./operator=/)(MulticastDelegate\&&) | ムーブ代入演算子。 |
| [operator==](./operator==/)(const std::nullptr_t\&) const | デリゲートコレクションが空かどうかを判定します。 |
| [operator==](./operator==/)(const MulticastDelegate\&) const | MulticastDelegate の 2 つのインスタンス（現在のオブジェクトと指定されたオブジェクト）が等しいかどうかを判定します。 |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | 空のコールバック（実際に何も呼び出さないもの）を除去します。 |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | MulticastDelegate クラスの型情報を表す [TypeInfo](../typeinfo/) オブジェクトへの参照を返します。 |
| [~MulticastDelegate](./~multicastdelegate/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Callback](./callback/) | MulticastDelegate クラスが表すデリゲートの型です。 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
