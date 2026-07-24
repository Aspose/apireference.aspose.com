---
title: "System::SmartPtr::operator= メソッド"
linktitle: "operator="
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtr::operator= メソッド。SmartPtr オブジェクトをコピー代入します。C++ で必要な型変換を行います。"
type: docs
weight: 2800
url: /ja/cpp/system/smartptr/operator=/
---
## SmartPtr::operator=(const SmartPtr\<Q\>\&) method


[SmartPtr](../) オブジェクトをコピー代入します。必要な型変換を行います。

```cpp
template<typename Q> SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr<Q> &x)
```


| パラメーター | 説明 |
| --- | --- |
| Q | x が指すオブジェクトの型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | コピー代入用のポインタです。 |

### ReturnValue

このオブジェクトへの参照です。

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


[SmartPtr](../) オブジェクトをコピー代入します。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const SmartPtr_\& | コピー代入用のポインタです。 |

### ReturnValue

このオブジェクトへの参照です。

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


生ポインタを [SmartPtr](../) オブジェクトに代入します。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| p | Pointee_ * | 代入するポインタ値です。 |

### ReturnValue

このオブジェクトへの参照です。

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


[SmartPtr](../) オブジェクトをムーブ代入します。x は使用できなくなります。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | SmartPtr_\&& | ムーブ代入用のポインタです。 |

### ReturnValue

このオブジェクトへの参照です。

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(std::nullptr_t) method


ポインタの値を nullptr に設定します。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(std::nullptr_t)
```


### ReturnValue

このオブジェクトへの参照です。

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
