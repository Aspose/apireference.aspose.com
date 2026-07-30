---
title: "System::IO::FileStream::Seek 方法"
linktitle: "定位"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileStream::Seek 方法。设置当前对象所表示的流在 C++ 中的位置。"
type: docs
weight: 1600
url: /zh/cpp/system.io/filestream/seek/
---
## FileStream::Seek method


设置当前对象所表示的流的位置。

```cpp
int64_t System::IO::FileStream::Seek(int64_t offset, SeekOrigin origin) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| offset | int64_t | 相对于 **origin** 指定位置的字节偏移量。 |
| origin | SeekOrigin | 指定计算偏移量的起始位置以及偏移的方向。 |

### ReturnValue

流的新位置。

## 另见

* Enum [SeekOrigin](../../seekorigin/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
