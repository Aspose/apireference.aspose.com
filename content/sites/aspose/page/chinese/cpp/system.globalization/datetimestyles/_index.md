---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Page 适用于 C++"
description: "System::Globalization::DateTimeStyles enum。定义日期和时间格式选项。C++ 中的位标志。"
type: docs
weight: 3500
url: /zh/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


定义日期和时间格式化选项。位标志。

```cpp
enum class DateTimeStyles : int32_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| None | 0 | 默认。 |
| AllowLeadingWhite | 1 | 忽略前导空白字符。 |
| AllowTrailingWhite | 2 | 忽略尾随空白字符。 |
| 允许内部空白 | 4 | 忽略内部空白字符。 |
| 允许空白字符 | n/a | 忽略所有空白字符。 |
| 不使用当前日期默认 | 8 | 在解析日期/时间字符串时，如果年份、月份和日期全部缺失，则将默认日期设置为 0001/1/1，而不是当前的年份/月份/日期。 |
| 调整为通用时间 | 16 | 在解析日期/时间字符串时，如果存在时区指定符（\"GMT\",\"Z\",\"+xxxx\",\"-xxxx\"），我们将根据 GMT 调整解析后的时间。 |
| 假设本地时区 | 32 | 如果未提供时区，则使用本地时区。 |
| 假设通用时区 | 64 | 如果未提供时区，则使用 UTC。 |
| 往返类型 | 128 | 尝试保留输入是未指定、本地还是 UTC。 |

## 另见

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
