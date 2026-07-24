---
title: "System::Threading::Interlocked::CompareExchange method"
linktitle: "比較交換"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Interlocked::CompareExchange メソッド。変数の値を比較交換します：変数が特定の値と等しいかを確認し、期待値と一致した場合にのみ新しい値を格納します（C++）。"
type: docs
weight: 200
url: /ja/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


変数の値を比較交換します：変数が特定の値と等しいかチェックし、格納された値が期待値と一致する場合にのみ新しい値を格納します。

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| location1 | int32_t\& | 変更する変数参照。 |
| value | int32_t | 格納する値。 |
| comparand | int32_t | 交換前に変数の値と比較する値。 |
| 成功 | bool\& | 交換が行われた場合は true、そうでない場合は false に設定される変数への参照。 |

### ReturnValue

操作開始時の変数の値（変更されたかどうかに関わらず）。

## 参照

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


変数の値を比較交換します：変数が特定の値と等しいかチェックし、格納された値が期待値と一致する場合にのみ新しい値を格納します。

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| パラメーター | 説明 |
| --- | --- |
| T | 変数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| location1 | T\& | 変更する変数参照。 |
| value | T | 格納する値。 |
| comparand | T | 交換前に変数の値と比較する値。 |

### ReturnValue

操作開始時の変数の値（変更されたかどうかに関わらず）。

## 参照

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


変数の値を比較交換します：変数が特定の値と等しいかチェックし、格納された値が期待値と一致する場合にのみ新しい値を格納します。未実装です。

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| パラメーター | 説明 |
| --- | --- |
| T | 変数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| location1 | T\& | 変更する変数参照。 |
| value | T | 格納する値。 |
| comparand | T | 交換前に変数の値と比較する値。 |

### ReturnValue

操作開始時の変数の値（変更されたかどうかに関わらず）。

## 参照

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
