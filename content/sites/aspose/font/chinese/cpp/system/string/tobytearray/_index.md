---
title: "System::String::ToByteArray 方法"
linktitle: "ToByteArray"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::ToByteArray 方法。将字符串或子字符串转换为字节数组（在 C++ 中）。"
type: docs
weight: 4700
url: /zh/cpp/system/string/tobytearray/
---
## String::ToByteArray method


将字符串或子字符串转换为字节数组。

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| startIndex | int32_t | 子字符串的起始索引。 |
| 长度 | int32_t | 子字符串的长度。 |
| LE | bool | 如果为 true，则使用小端序对字符进行编码；否则使用大端序。 |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
