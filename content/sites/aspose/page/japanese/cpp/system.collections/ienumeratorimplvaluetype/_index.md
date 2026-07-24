---
title: "System::Collections::IEnumeratorImplValueType クラス"
linktitle: "IEnumeratorImplValueType"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::IEnumeratorImplValueType クラス。ジェネリック Iterator IEnumeratorImplRefType の上に非ジェネリック IEnumerator 実装を作成するラッパー - C++ における値型のラッパー。"
type: docs
weight: 800
url: /ja/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


ジェネリック Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) の上に非ジェネリック [IEnumerator](../ienumerator/) 実装を作成するラッパー - 値型のラッパー。

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Current](./get_current/)() const override | 現在の要素を取得します。 |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | ラッパーコンストラクタ |
| [MoveNext](./movenext/)() override | 列挙子を次の要素へ移動します。以前に要素が参照されていない場合、利用可能な最初の要素を参照に設定します。コンテナの末尾に達した場合は何もしません。 |

## 参照

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
