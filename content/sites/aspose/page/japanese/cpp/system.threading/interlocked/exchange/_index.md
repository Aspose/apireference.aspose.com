---
title: "System::Threading::Interlocked::Exchange method"
linktitle: "交換"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Interlocked::Exchange メソッド。変数の値を交換します：新しい値を格納し、格納する直前の変数が保持していた値を返します（C++）。"
type: docs
weight: 400
url: /ja/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


変数の値を交換します：新しい値を格納し、格納直前の変数の値を返します。

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 変数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| location1 | T\& | 変更する変数参照。 |
| value | T | 格納する値。 |

### ReturnValue

変更直前の変数の値。

## 参照

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


変数の値を交換します：新しい値を格納し、格納直前の変数の値を返します。未実装です。

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 変数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| location1 | T\& | 変更する変数参照。 |
| value | T | 格納する値。 |

### ReturnValue

変更直前の変数の値。

## 参照

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
