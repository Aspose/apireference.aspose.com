---
title: "System::ExceptionWrapper クラス"
linktitle: "ExceptionWrapper"
second_title: "C++ 用 Aspose.Page"
description: "System::ExceptionWrapper クラス。C++ の Exception クラスから派生した例外のラッパーを表すテンプレートです。"
type: docs
weight: 2600
url: /ja/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


例外から派生したラッパーを表すテンプレートです。[Exception](../exception/) クラス。

```cpp
template<typename T>class ExceptionWrapper
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | [ExceptionWrapper](./) クラスの null インスタンスを構築します。これは例外を表しません。 |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | 渡されたポインタを含む [ExceptionWrapper](./) クラスのインスタンスを構築します。 |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | コピーコンストラクタ。 |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | ムーブコンストラクタ。 |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | [Exception](../exception/) クラスのコンストラクタへパラメータを転送し、新しい [Exception](../exception/) クラスのインスタンスを保持するスマートポインタを作成するコンストラクタです。 |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | [SharedPtr<Object>](../sharedptr/) への暗黙的キャスト演算子です。 |
| [operator->](./operator-_/)() const | [Exception](../exception/) オブジェクトのメンバーにアクセスできます。 |
| [operator=](./operator=/)(const ExceptionWrapper\&) | 代入演算子。 |
| [operator=](./operator=/)(ExceptionWrapper\&&) | ムーブ代入演算子。 |
| static [Type](./type/)() | [Exception](../exception/) 型の [System::TypeInfo](../typeinfo/) オブジェクトを取得するショートカットです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ExceptionType](./exceptiontype/) | キャスト関数で使用されます。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
