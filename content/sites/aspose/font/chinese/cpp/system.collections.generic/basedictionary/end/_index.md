---
title: "System::Collections::Generic::BaseDictionary::end 方法"
linktitle: "end"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::BaseDictionary::end 方法。返回一个迭代器，指向容器中最后一个元素之后的 KVPair 包装器（键值元素）。采用 C# 风格实现——迭代器应返回具有 get_Key() 和 get_Value() 接口的 KVPair 对象。此元素充当占位符；尝试访问它将在 C++ 中导致未定义行为。"
type: docs
weight: 1100
url: /zh/cpp/system.collections.generic/basedictionary/end/
---
## BaseDictionary::end method


返回指向容器最后一个元素之后的键值元素的 KVPair 包装器的迭代器。采用 C# 风格实现——迭代器应返回具有 get_Key() 和 get_Value() 接口的 KVPair 对象。该元素充当占位符；尝试访问它会导致未定义行为。

```cpp
const_iterator System::Collections::Generic::BaseDictionary<Map>::end() const noexcept
```


### ReturnValue

一个指向集合中结束元素之后的理论元素的迭代器。

## 另见

* Typedef [const_iterator](../const_iterator/)
* Class [BaseDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
