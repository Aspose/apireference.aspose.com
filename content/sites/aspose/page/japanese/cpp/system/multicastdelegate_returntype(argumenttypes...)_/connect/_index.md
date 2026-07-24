---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect メソッド"
linktitle: "接続"
second_title: "C++ 用 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect メソッド。指定されたデリゲートを C++ のコレクションに追加します。"
type: docs
weight: 400
url: /ja/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


指定されたデリゲートをコレクションに追加します。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | Callback | コレクションに追加するデリゲート |

### ReturnValue

自身への参照

## 参照

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションに追加します。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| パラメーター | 説明 |
| --- | --- |
| MemberType | デリゲートコレクションに追加される非静的メソッドの型 |
| ClassType | デリゲートに追加されるオブジェクトメソッドの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| メンバー | MemberType ClassType::* | 指定されたオブジェクトの非スタティックメソッドへのポインタ |
| obj | ClassType * | デリゲートコレクションに追加されるオブジェクトメンバーメソッドへのポインタ |

### ReturnValue

自身への参照

## 参照

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションに追加します。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| MemberType | デリゲートコレクションに追加される非静的メソッドの型 |
| ClassType | デリゲートコレクションに追加されるオブジェクトメソッドの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| メンバー | MemberType ClassType::* | 指定されたオブジェクトの非スタティックメソッドへのポインタ |
| obj | const SharedPtr\<ClassType\>\& | デリゲートコレクションに追加されるオブジェクトメンバーメソッドへの shared_ptr |

### ReturnValue

自身への参照

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


指定された MulticastDelegate オブジェクトをデリゲートコレクションに追加します。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | MulticastDelegate\& | デリゲートコレクションに追加する MulticastDelegate クラスのインスタンス |

### ReturnValue

自身への参照

## 参照

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


指定された関数オブジェクトをデリゲートコレクションに追加します。関数オブジェクトはコレクションに追加される前に [Callback](../callback/) デリゲート型に変換されます。

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| パラメーター | 説明 |
| --- | --- |
| R | コレクションに追加する関数オブジェクトの戻り値の型 |
| 引数 | コレクションに追加する関数オブジェクトの引数リスト |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| f | std::function\<R(Args...)> | コレクションに追加する関数オブジェクト |

### ReturnValue

自身への参照

## 参照

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
