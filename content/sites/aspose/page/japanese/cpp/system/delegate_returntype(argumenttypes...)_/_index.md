---
title: "System::Delegate< ReturnType(ArgumentTypes...)> class"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "C++ 用 Aspose.Page"
description: "System::Delegate< ReturnType(ArgumentTypes...)> クラス。関数、メソッド、または関数オブジェクトへのポインタを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ では決して System::SmartPtr クラスを使用してこの型のオブジェクトを管理しないでください。"
type: docs
weight: 2100
url: /ja/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


関数、メソッド、または関数オブジェクトへのポインタを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。決して [System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| パラメーター | 説明 |
| --- | --- |
| ReturnType | このクラスが表す関数、メソッド、または関数オブジェクトポインタの戻り値の型 |
| ArgumentTypes | このクラスが表す関数、メソッド、または関数オブジェクトポインタの引数リスト |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Delegate](./delegate/)() | デフォルトコンストラクタ。何も指さない delegate オブジェクトを構築します。 |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | ムービングコピーコンストラクタ。指定された delegate が指すエンティティの所有権を取得します。 |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | コンストラクタ。指定されたフリー関数または静的メソッドへのポインタから delegate オブジェクトを構築します。 |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | コンストラクタ。std::bind() によって生成された関数オブジェクトへの指定ポインタから delegate を構築します。 |
| [Delegate](./delegate/)(int, T\&) | コンストラクタ。指定された関数オブジェクトから delegate を構築します。 |
| [Delegate](./delegate/)(long, T\&&) | ムービングコンストラクタ。指定された関数オブジェクトから delegate を構築します。 |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | コンストラクタ。指定されたオブジェクトの指定された非静的メソッドを指す delegate を構築します。 |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | コンストラクタ。指定されたオブジェクトの指定された非静的メソッドを指す delegate を構築します。 |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | std::function 関数オブジェクトを指す delegate オブジェクトを構築します。 |
| [Empty](./empty/)() const | 現在の delegate オブジェクトが空であるかどうか、すなわち何も指していないかを判定します。 |
| [operator()](./operator()/)(ArgumentTypes...) const | 現在の delegate オブジェクトが指す関数、メソッド、または関数オブジェクトを呼び出します。 |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | ムービング代入演算子。指定された delegate が指すエンティティの所有権を取得します。 |
| [operator==](./operator==/)(const Delegate\&) const | 2 つの delegate オブジェクトを比較し、同じエンティティを指しているかどうかを確認します。 |
## 備考



```cpp
#include "system/delegate.h"
#include <iostream>

// delegate を宣言します。
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // 変数に PrintMessage 関数のアドレスを代入します。
  Message mes = Message(&PrintMessage);

  // 関数を呼び出します。
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
