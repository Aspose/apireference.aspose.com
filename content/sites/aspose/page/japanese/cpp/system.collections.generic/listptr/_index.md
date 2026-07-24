---
title: "System::Collections::Generic::ListPtr クラス"
linktitle: "ListPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::ListPtr クラス。アクセス演算子を持つリストポインタ。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、C++ では値渡しまたは const 参照で関数に渡す必要があります。"
type: docs
weight: 3500
url: /ja/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | null ポインタを初期化します。 |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | 指定されたリストへのポインタを初期化します。 |
| [operator==](./operator==/)(std::nullptr_t) const | [List](../list/) ポインタが null かどうかをチェックします。 |
| [operator[]](./operator[]/)(int) | アクセサ。 |
| [operator[]](./operator[]/)(int) const | アクセサ。 |
## 参照

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
