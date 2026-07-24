---
title: "System::DynamicWeakPtr::Reference クラス"
linktitle: "Reference"
second_title: "C++ 用 Aspose.Page"
description: "System::DynamicWeakPtr::Reference クラス。DynamicWeakPtr::Apply が呼び出されることを保証するリファレンスクラス。C++ で DynamicWeakPtr が SmartPtr の参照パラメータとして関数に渡され、関数がそれに代入する可能性がある場合に使用されます。"
type: docs
weight: 700
url: /ja/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | 変換演算子。[Reference](./) を、[DynamicWeakPtr_](../dynamicweakptr_/) が必要とされるコンテキストで使用できるようにします。 |
| [Reference](./reference/)(DynamicWeakPtr_\&) | スマートポインタのリファレンスを作成します。 |
| [Reference](./reference/)(Reference\&&) | スマートポインタのリファレンスをムーブ構築します。 |
| [~Reference](./~reference/)() | リファレンスを破棄します。参照されたスマートポインタで Apply() が呼び出されることを保証します。 |
## 参照

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
