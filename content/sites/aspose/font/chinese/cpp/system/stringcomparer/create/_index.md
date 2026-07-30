---
title: "System::StringComparer::Create 方法"
linktitle: "Create"
second_title: "Aspose.Font 适用于 C++"
description: "System::StringComparer::Create 方法。创建特定区域设置的比较器（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system/stringcomparer/create/
---
## StringComparer::Create method


创建特定文化的比较器。

```cpp
static StringComparerPtr System::StringComparer::Create(const System::SharedPtr<System::Globalization::CultureInfo> &culture, bool ignoreCase)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文化 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 用于创建比较器的区域设置。 |
| ignoreCase | bool | 比较器是否应忽略大小写。 |

### ReturnValue

指向新创建的比较器对象的指针。

## 另见

* Typedef [StringComparerPtr](../../stringcomparerptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [StringComparer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
