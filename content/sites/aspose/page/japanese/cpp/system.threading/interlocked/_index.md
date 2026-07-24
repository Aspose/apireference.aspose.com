---
title: "System::Threading::Interlocked クラス"
linktitle: "Interlocked"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Interlocked クラス。スレッドセーフな操作のための API を提供します。これはインスタンスサービスを持たない静的型です。C++ ではいかなる手段でもインスタンスを作成すべきではありません。"
type: docs
weight: 600
url: /ja/cpp/system.threading/interlocked/
---
## Interlocked class


スレッドセーフな操作のための API を提供します。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。

```cpp
class Interlocked
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | 値を原子的に増加させます。 |
| static [Add](./add/)(int64_t\&, int64_t) | 値を原子的に増加させます。 |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | 変数の値を比較交換します：変数が特定の値と等しいかチェックし、格納された値が期待値と一致する場合にのみ新しい値を格納します。 |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | 変数の値を比較交換します：変数が特定の値と等しいかチェックし、格納された値が期待値と一致する場合にのみ新しい値を格納します。未実装です。 |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | 変数の値を比較交換します：変数が特定の値と等しいかチェックし、格納された値が期待値と一致する場合にのみ新しい値を格納します。 |
| static [Decrement](./decrement/)(int32_t\&) | 値を原子的に減少させます。 |
| static [Decrement](./decrement/)(int64_t\&) | 値を原子的に減少させます。 |
| static [Exchange](./exchange/)(T\&, T) | 変数の値を交換します：新しい値を格納し、格納直前の変数の値を返します。 |
| static [Exchange](./exchange/)(T\&, T) | 変数の値を交換します：新しい値を格納し、格納直前の変数の値を返します。未実装です。 |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | 交換加算手順によって値を原子的に増加させます。 |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | 交換加算手順によって値を原子的に増加させます。 |
| static [Increment](./increment/)(int32_t\&) | 値を原子的にインクリメントします。 |
| static [Increment](./increment/)(int64_t\&) | 値を原子的にインクリメントします。 |
| static [Read](./read/)(int64_t\&) | 64 ビットの値を返します。原子的な操作としてロードされます。 |
## 参照

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
