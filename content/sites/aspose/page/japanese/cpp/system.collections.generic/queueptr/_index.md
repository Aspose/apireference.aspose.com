---
title: "System::Collections::Generic::QueuePtr クラス"
linktitle: "QueuePtr"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::QueuePtr クラス。キューのポインタです。この型は他のオブジェクトの削除を管理するためのポインタです。スタック上に割り当て、C++ では値渡しまたは const 参照で関数に渡すべきです。"
type: docs
weight: 3700
url: /ja/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<Queue<T>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [QueuePtr](./queueptr/)() | null ポインタを作成します。 |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | 特定のキューへのポインタを構築します。 |

## 参照

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
