---
title: "System::SmartPtr::operator* method"
linktitle: "operator*"
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtr::operator* method. 指されたオブジェクトへの参照を取得します。C++ でポインタが null でないことをアサートします。"
type: docs
weight: 2500
url: /ja/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


指し示されたオブジェクトへの参照を取得します。ポインタが null でないことをアサートします。

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

指されたオブジェクトへの参照。

## 参照

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
タイトル: System::SmartPtr::operator< method
リンクタイトル: operator<
second_title: Aspose.Page for C++
説明: 'System::SmartPtr::operator< method. C++ の SmartPtr クラスに対して、より小さい比較のセマンティクスを提供します。'
type: docs
weight: 2700
URL: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


[SmartPtr](../) クラスに対して、より小さい比較のセマンティクスを提供します。

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| パラメーター | 説明 |
| --- | --- |
| Y | 現在のポインタと比較するためのポインタの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | 現在のポインタと比較するポインタ。 |

### ReturnValue

[SmartPtr](../) が参照するオブジェクトが x より 'less' の場合は true、そうでない場合は false。

## 参照

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


[SmartPtr](../) クラスに対して、より小さい比較のセマンティクスを提供します。

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| パラメーター | 説明 |
| --- | --- |
| Y | 現在のポインタと比較するためのポインタの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| p | Y * | 現在のポインタと比較するポインタ。 |

### ReturnValue

オブジェクトが [SmartPtr](../) によって参照され、p より 'less' な場合は true、そうでなければ false。

## 参照

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
