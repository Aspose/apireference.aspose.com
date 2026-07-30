---
title: "System::IO::STDIOStreamWrappingMode 枚举"
linktitle: "STDIOStreamWrappingMode"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::STDIOStreamWrappingMode 枚举。指定包装器将在 C++ 中对类似 std::iostream 的流执行的 I/O 操作模式。"
type: docs
weight: 3700
url: /zh/cpp/system.io/stdiostreamwrappingmode/
---
## STDIOStreamWrappingMode enum


指定包装器将在类似 std::iostream 的流上执行的 I/O 操作模式。

```cpp
enum class STDIOStreamWrappingMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Binary | 0 | 一种模式，允许输入操作将 char_type 类型的流数据解码为字节，并将字节编码为 char_type 数据用于输出操作。 |
| Conversion | 1 | 一种模式，允许输入操作将流数据从 char_type 类型转换为 uint8_t 类型，输出操作则进行相反的转换。 |

## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
