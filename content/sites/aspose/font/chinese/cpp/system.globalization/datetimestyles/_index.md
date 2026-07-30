---
title: "System::Globalization::DateTimeStyles 枚举"
linktitle: "DateTimeStyles"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::DateTimeStyles 枚举。定义日期和时间格式化选项。C++ 中的位标志。"
type: docs
weight: 3500
url: /zh/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


定义日期和时间格式选项。位标志。

```cpp
enum class DateTimeStyles : int32_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 默认。 |
| AllowLeadingWhite | 1 | 忽略前导空白字符。 |
| AllowTrailingWhite | 2 | 忽略尾随空白字符。 |
| AllowInnerWhite | 4 | 忽略内部空白字符。 |
| AllowWhiteSpaces | n/a | 忽略所有空白字符。 |
| NoCurrentDateDefault | 8 | 在解析日期/时间字符串时，如果年份/月份/日期全部缺失，则将默认日期设置为 0001/1/1，而不是当前的年份/月份/日期。 |
| AdjustToUniversal | 16 | 在解析日期/时间字符串时，如果存在时区指定符（"GMT","Z","+xxxx","-xxxx"），我们将根据 GMT 调整解析后的时间。 |
| AssumeLocal | 32 | 如果未提供时区，则使用本地时区。 |
| AssumeUniversal | 64 | 如果未提供时区，则使用 UTC。 |
| RoundtripKind | 128 | 尝试保留输入是未指定、本地还是 UTC。 |

## 另见

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
