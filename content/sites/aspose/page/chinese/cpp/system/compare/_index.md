---
title: "System::Compare method"
linktitle: "Compare"
second_title: "Aspose.Page 适用于 C++"
description: "System::Compare 方法。比较 C++ 中的两个值。"
type: docs
weight: 15800
url: /zh/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


比较两个值。

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | 描述 |
| --- | --- |
| TA | 第一个比较对象的类型 |
| TB | 第二个比较对象的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | const TA\& | 第一个比较数 |
| b | const TB\& | 第二个比较数 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


比较两个浮点数值。

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | 描述 |
| --- | --- |
| TA | 第一个比较对象的类型 |
| TB | 第二个比较对象的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | const TA\& | 第一个比较数 |
| b | const TB\& | 第二个比较数 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
