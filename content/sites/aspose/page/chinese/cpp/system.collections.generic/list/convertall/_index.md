---
title: "System::Collections::Generic::List::ConvertAll 方法"
linktitle: "ConvertAll"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::List::ConvertAll 方法。创建一个在 C++ 中将元素转换为不同类型的列表。"
type: docs
weight: 1300
url: /zh/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


创建一个已转换为不同类型的元素列表。

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Parameter | 描述 |
| --- | --- |
| OutputType | 输出列表元素类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) 用于项目转换。 |

### ReturnValue

新创建的已转换元素列表。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
