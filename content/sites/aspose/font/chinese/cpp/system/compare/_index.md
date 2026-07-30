---
title: "System::Compare 方法"
linktitle: "Compare"
second_title: "Aspose.Font 适用于 C++"
description: "System::Compare 方法。比较 C++ 中的两个值。"
type: docs
weight: 15900
url: /zh/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


比较两个值。

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| 参数 | 描述 |
| --- | --- |
| TA | 第一个比较项的类型 |
| TB | 第二个比较项的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | const TA\& | 第一个比较数 |
| b | const TB\& | 第二个比较数 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Compare(const TA\&, const TB\&) method


比较两个浮点值。

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| 参数 | 描述 |
| --- | --- |
| TA | 第一个比较项的类型 |
| TB | 第二个比较项的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | const TA\& | 第一个比较数 |
| b | const TB\& | 第二个比较数 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
