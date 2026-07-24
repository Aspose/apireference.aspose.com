---
title: "System::Compare メソッド"
linktitle: "Compare"
second_title: "C++ 用 Aspose.Page"
description: "System::Compare メソッド。C++ で 2 つの値を比較します。"
type: docs
weight: 15800
url: /ja/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


2 つの値を比較します。

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| パラメーター | 説明 |
| --- | --- |
| TA | 最初の比較対象の型 |
| TB | 2 番目の比較対象の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | const TA\& | 最初の比較対象 |
| b | const TB\& | 2 番目の比較対象 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


2 つの浮動小数点値を比較します。

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| パラメーター | 説明 |
| --- | --- |
| TA | 最初の比較対象の型 |
| TB | 2 番目の比較対象の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | const TA\& | 最初の比較対象 |
| b | const TB\& | 2 番目の比較対象 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
