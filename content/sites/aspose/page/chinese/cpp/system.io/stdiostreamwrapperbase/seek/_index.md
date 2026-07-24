---
title: "System::IO::STDIOStreamWrapperBase::Seek 方法"
linktitle: "Seek"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::STDIOStreamWrapperBase::Seek 方法。设置当前对象在 C++ 中所表示的流的位置。"
type: docs
weight: 800
url: /zh/cpp/system.io/stdiostreamwrapperbase/seek/
---
## STDIOStreamWrapperBase::Seek method


设置由当前对象表示的流的位置。

```cpp
virtual int64_t System::IO::STDIOStreamWrapperBase<T, typename>::Seek(int64_t offset, SeekOrigin origin) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| offset | int64_t | 相对于 **origin** 指定的位置的字节偏移量 |
| origin | SeekOrigin | 指定计算偏移量的起始位置及其方向 |

### ReturnValue

流的新位置

## 另见

* Enum [SeekOrigin](../../seekorigin/)
* Class [STDIOStreamWrapperBase](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
