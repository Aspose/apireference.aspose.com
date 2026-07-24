---
title: "System::MakeObject メソッド"
linktitle: "MakeObject"
second_title: "C++ 用 Aspose.Page"
description: "System::MakeObject メソッド。ヒープ上にオブジェクトを作成し、その共有ポインタを返します（C++）。"
type: docs
weight: 24500
url: /ja/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


ヒープ上にオブジェクトを作成し、その共有ポインタを返します。

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| パラメーター | 説明 |
| --- | --- |
| T | インスタンス化するクラス。 |
| 引数 | コンストラクタ引数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| args | Args\&&... | コンストラクタ引数。 |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


ヒープ上にオブジェクトを作成し、その共有ポインタを返します。

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| パラメーター | 説明 |
| --- | --- |
| T | インスタンス化するクラスへの [SmartPtr](../smartptr/)。 |
| 引数 | コンストラクタ引数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| args | Args\&&... | コンストラクタ引数。 |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
