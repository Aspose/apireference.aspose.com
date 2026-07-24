---
title: "System::Ref メソッド"
linktitle: "Ref"
second_title: "C++ 用 Aspose.Page"
description: "System::Ref メソッド。Ref(std::ref(DynamicWeakPtr)) が C++ で動作することを保証するラッパーです。"
type: docs
weight: 36600
url: /ja/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Ref(std::ref(DynamicWeakPtr)) が動作することを保証するラッパーです。

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| パラメーター | 説明 |
| --- | --- |
| T | 参照された型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ラッパー | const std::reference_wrapper\<T\>\& | アンラップするための std ラッパーです。 |

### ReturnValue

[System](../) に定義された参照型で、std ではなくこちらです。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


[DynamicWeakPtr](../dynamicweakptr/) オブジェクトへの参照を作成します。関数引数を参照渡しする際にトランスレータで使用されます。

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| パラメーター | 説明 |
| --- | --- |
| T | 指し示す型。 |
| trunkMode | スマートポインタ自身のモードです。 |
| weakLeafs | SetTemplateWeakPtr メソッドを呼び出す必要があるテンプレート引数のインデックスです。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | 参照を作成するためのスマートポインタです。 |

### ReturnValue

スマートポインタの参照です。

## 参照

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


オブジェクトへの参照を取得するためのヘルパー関数です。代入後に [System::DynamicWeakPtr](../dynamicweakptr/) が参照されたオブジェクトを更新することを保証するために使用されます。

```cpp
template<typename T> T & System::Ref(T &value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 参照を作成する対象の型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | T\& | 参照を作成する対象の値です。 |

### ReturnValue

この関数に渡された値への参照です。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
