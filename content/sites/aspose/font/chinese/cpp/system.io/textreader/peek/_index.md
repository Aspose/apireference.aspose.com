---
title: "System::IO::TextReader::Peek 方法"
linktitle: "Peek"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::TextReader::Peek 方法。读取流中的单个字符，而不更改流的读取光标（在 C++ 中）。"
type: docs
weight: 300
url: /zh/cpp/system.io/textreader/peek/
---
## TextReader::Peek method


从流中读取单个字符且不更改流的读取指针。

```cpp
virtual int System::IO::TextReader::Peek()
```


### ReturnValue

读取使用 UTF-16 编码的字符；如果读取的字符在 UTF-16 编码中由两个代码点表示，则仅返回高位代理项；如果未读取到字符，则返回 -1。

## 另见

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
