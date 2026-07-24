---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate メソッド"
linktitle: "Delegate"
second_title: "C++ 用 Aspose.Page"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate メソッド。デフォルトコンストラクタ。C++ で何も指さない delegate オブジェクトを構築します。"
type: docs
weight: 100
url: /ja/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


デフォルトコンストラクタ。何も指さない delegate オブジェクトを構築します。

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


ムービングコピーコンストラクタ。指定された delegate が指すエンティティの所有権を取得します。

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| o | Delegate\\&& | ポイント先エンティティを移動する元となる Delegate オブジェクト |

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


コンストラクタ。指定された関数オブジェクトから delegate を構築します。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| パラメーター | 説明 |
| --- | --- |
| T | コンストラクタの引数として受け入れられる関数オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| functor_tag | int | 曖昧さを解消するために使用されるダミーの整数値 |
| functor | T\& | 新しく構築された delegate が指す関数オブジェクト |

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


ムービングコンストラクタ。指定された関数オブジェクトから delegate を構築します。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| パラメーター | 説明 |
| --- | --- |
| T | コンストラクタの引数として受け入れられる関数オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| functor_tag | long | 曖昧さを解消するために使用されるダミーの整数値 |
| functor | T\&& | 新しく構築された delegate が指す関数オブジェクト |

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


コンストラクタ。指定されたオブジェクトの指定された非静的メソッドを指す delegate を構築します。

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| パラメーター | 説明 |
| --- | --- |
| MemberType | コンストラクタが引数として受け取る非静的メソッドの型 |
| ClassType | コンストラクタが引数として受け取るオブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| メンバー | MemberType ClassType::* | 新しく作成されたデリゲートが指す非静的メソッドへのポインタ |
| obj | ClassType * | 新しく作成されたデリゲートが指すオブジェクトのメンバーメソッドへのポインタ |

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


コンストラクタ。指定されたオブジェクトの指定された非静的メソッドを指す delegate を構築します。

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| MemberType | コンストラクタが引数として受け取る非静的メソッドの型 |
| ClassType | コンストラクタが引数として受け取るオブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| メンバー | MemberType MemberClass::* | 新しく作成されたデリゲートが指す非静的メソッドへのポインタ |
| obj | const SharedPtr\<ClassType\>\& | 新しく作成されたデリゲートが指すオブジェクトのメンバーメソッドへの共有ポインタ |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


std::function 関数オブジェクトを指す delegate オブジェクトを構築します。

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| パラメーター | 説明 |
| --- | --- |
| R | コンストラクタが引数として受け取る関数オブジェクトの戻り値の型 |
| 引数 | コンストラクタが引数として受け取る関数オブジェクトの引数リスト |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| f | std::function\<R(Args...)> | 新しく作成されたデリゲートオブジェクトが指す関数オブジェクト |

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


コンストラクタ。std::bind() によって生成された関数オブジェクトへの指定ポインタから delegate を構築します。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| パラメーター | 説明 |
| --- | --- |
| この | コンストラクタが引数として受け取る std::bind() によって生成された関数オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 関数 | T | 新しく作成された Delegate インスタンスが指す \"bind expression\"（std::bind() によって生成された関数ポインタ）へのポインタ |

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


コンストラクタ。指定されたフリー関数または静的メソッドへのポインタから delegate オブジェクトを構築します。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| パラメーター | 説明 |
| --- | --- |
| この | コンストラクタが引数として受け取る関数または静的メソッドポインタの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 関数 | T | 新しく作成された Delegate インスタンスが指す関数または静的メソッドへのポインタ |

## 参照

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
