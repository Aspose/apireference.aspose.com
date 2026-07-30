---
title: "System::Globalization::DateTimeFormatInfo::GetFormat 方法"
linktitle: "GetFormat"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::DateTimeFormatInfo::GetFormat 方法。获取 C++ 中特定类型的格式化程序。"
type: docs
weight: 3600
url: /zh/cpp/system.globalization/datetimeformatinfo/getformat/
---
## DateTimeFormatInfo::GetFormat method


获取特定类型的格式化程序。

```cpp
SharedPtr<Object> System::Globalization::DateTimeFormatInfo::GetFormat(const TypeInfo &format_type) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| format_type | const TypeInfo\& | 要获取的格式化程序类型；仅支持 [DateTimeFormatInfo](../) 类型。 |

### ReturnValue

如果不可用，则为 Formatter 或 null。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [DateTimeFormatInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
