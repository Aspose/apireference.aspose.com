---
title: "System::IO::SystemIOStreamWrappingMode enum"
linktitle: "SystemIOStreamWrappingMode"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::SystemIOStreamWrappingMode enum。指定包装器将在 C++ 中对类似 System::IO::Stream 的流执行的 I/O 操作模式。"
type: docs
weight: 3800
url: /zh/cpp/system.io/systemiostreamwrappingmode/
---
## SystemIOStreamWrappingMode enum


指定包装器将在 [System::IO::Stream](../stream/)-like 流上执行的 I/O 操作模式。

```cpp
enum class SystemIOStreamWrappingMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Binary | 0 | 一种模式，允许输入操作将流字节编码为 char_type 数据，并在输出操作中将 char_type 数据解码回流字节。 |
| Conversion | 1 | 一种模式，允许输入操作将流字节从 uint8_t 类型转换为 char_type 类型，并在输出操作中反向转换。 |

## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
