---
title: "System::Collections::IEnumeratorImplRefType クラス"
linktitle: "IEnumeratorImplRefType"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::IEnumeratorImplRefType クラス。ジェネリックでない IEnumerator 実装をジェネリック Iterator IEnumeratorImplRefType の上に作成するラッパー - C++ における参照型のラッパー。"
type: docs
weight: 700
url: /ja/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


ジェネリックでない [IEnumerator](../ienumerator/) 実装をジェネリック Iterator [IEnumeratorImplRefType](./) の上に作成するラッパー - 参照型のラッパー。

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Current](./get_current/)() const override | 現在の要素を取得します。 |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | ラッパーコンストラクタ |
| [MoveNext](./movenext/)() override | 列挙子を次の要素へ移動します。以前に要素が参照されていない場合、利用可能な最初の要素を参照に設定します。コンテナの末尾に達した場合は何もしません。 |

## 参照

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
