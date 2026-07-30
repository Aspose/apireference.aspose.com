---
title: "System::IO::STDIOStreamPositionPreference 枚举"
linktitle: "STDIOStreamPositionPreference"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::STDIOStreamPositionPreference 枚举。确定在 C++ 中创建包装器时，当 std::basic_iostream 及其派生类在读取和写入位置不同的情况下，流中哪个位置更适合作为通用的读写位置。"
type: docs
weight: 3600
url: /zh/cpp/system.io/stdiostreampositionpreference/
---
## STDIOStreamPositionPreference enum


确定在创建包装器时，当 std::basic_iostream 及其派生类具有不同的读取和写入位置时，流中哪个位置更适合作为公共的读写位置。

```cpp
enum class STDIOStreamPositionPreference
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 零 | 0 | 零位置将被设置为读写位置。 |
| ReadPosition | 1 | gptr 位置将设置为读写位置。 |
| WritePosition | 2 | pptr 位置将设置为读写位置。 |

## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
