---
title: "System::Uri::HexUnescape 方法"
linktitle: "HexUnescape"
second_title: "Aspose.Page 适用于 C++"
description: "System::Uri::HexUnescape 方法。将指定的字符的十六进制表示转换为字符，适用于 C++。"
type: docs
weight: 4000
url: /zh/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


将指定字符的十六进制表示转换为字符。

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 模式 | const String\& | 包含字符十六进制表示的字符串 |
| 索引 | int32_t\& | 字符十六进制表示在 **pattern** 中开始的位置 |

### ReturnValue

位于 **index** 位置的十六进制编码所表示的字符。如果 **index** 处的字符未进行十六进制编码，则返回 **index** 处的字符。**index** 的值会递增，指向返回字符之后的下一个字符。

## 另见

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
