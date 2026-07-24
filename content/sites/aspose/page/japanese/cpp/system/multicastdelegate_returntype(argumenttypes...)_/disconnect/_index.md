---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect メソッド"
linktitle: "disconnect"
second_title: "C++ 用 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect メソッド。指定されたデリゲートをデリゲートコレクションから削除します（C++）。"
type: docs
weight: 500
url: /ja/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


指定されたデリゲートをデリゲートコレクションから削除します。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | Callback | コレクションから削除するデリゲート |

### ReturnValue

自身への参照

## 参照

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションから削除します。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| パラメーター | 説明 |
| --- | --- |
| MemberType | デリゲートコレクションから削除される非スタティックメソッドの型 |
| ClassType | デリゲートコレクションから削除されるオブジェクトメソッドの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| メンバー | MemberType ClassType::* | 指定されたオブジェクトの非スタティックメソッドへのポインタ |
| obj | ClassType * | デリゲートコレクションから削除されるオブジェクトメンバーメソッドへのポインタ |

### ReturnValue

自身への参照

## 参照

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


指定されたオブジェクトの指定された非静的メソッドをデリゲートコレクションから削除します。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| MemberType | デリゲートコレクションから削除される非スタティックメソッドの型 |
| ClassType | デリゲートコレクションから削除されるオブジェクトメソッドの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| メンバー | MemberType ClassType::* | 指定されたオブジェクトの非スタティックメソッドへのポインタ |
| obj | const SharedPtr\<ClassType\>\& | デリゲートコレクションから削除されるオブジェクトメンバーメソッドへの共有ポインタ |

### ReturnValue

自身への参照

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


指定された MulticastDelegate オブジェクトをデリゲートコレクションから削除します。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | MulticastDelegate\& | デリゲートコレクションから削除する MulticastDelegate クラスのインスタンス |

### ReturnValue

自身への参照

## 参照

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
