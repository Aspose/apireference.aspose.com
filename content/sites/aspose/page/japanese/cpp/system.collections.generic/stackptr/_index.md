---
title: "System::Collections::Generic::StackPtr クラス"
linktitle: "StackPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::StackPtr クラス。スタックポインタ。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、C++ では値渡しまたは const 参照で関数に渡す必要があります。"
type: docs
weight: 4700
url: /ja/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [StackPtr](./stackptr/)() | null ポインタを作成します。 |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | 特定のスタックを参照するポインタを構築します。 |

## 参照

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
