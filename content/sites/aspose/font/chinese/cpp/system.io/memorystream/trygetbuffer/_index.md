---
title: "System::IO::MemoryStream::TryGetBuffer 方法"
linktitle: "TryGetBuffer"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::MemoryStream::TryGetBuffer 方法。返回用于创建此流的无符号字节数组（C++）。"
type: docs
weight: 1800
url: /zh/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


返回用于创建此流的无符号字节数组。

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArraySegment\<uint8_t\>\& | 字节数组 - 输出参数。当此方法返回 true 时，返回创建此流的字节数组段；当返回 false 时，此参数被设为默认值。 |

### ReturnValue

如果转换成功则为 True。

## 另见

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
