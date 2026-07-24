---
title: "System::MakeSharedPtr メソッド"
linktitle: "MakeSharedPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::MakeSharedPtr メソッド。生ポインタをスマートポインタに変換します。const ポインタ用のオーバーロードがあります。C# のメソッドが C++ で const として翻訳される際に、''this'' 変数を使用する場合などに便利です。"
type: docs
weight: 24800
url: /ja/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


生ポインタをスマートポインタに変換します。const ポインタ用のオーバーロードがあります。C# のメソッドが const として翻訳される際に 'this' 変数を使用する場合などに便利です。

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| パラメーター | 説明 |
| --- | --- |
| X | 指し示す型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| p | const X * | オブジェクトへの生ポインタです。 |

### ReturnValue

オブジェクトへの共有スマートポインタです。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


生ポインタをスマートポインタに変換します。

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| パラメーター | 説明 |
| --- | --- |
| X | 指し示す型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| p | X * | オブジェクトへの生ポインタです。 |

### ReturnValue

オブジェクトへの共有スマートポインタです。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
