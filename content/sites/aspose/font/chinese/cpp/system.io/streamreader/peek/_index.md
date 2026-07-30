---
title: "System::IO::StreamReader::Peek 方法"
linktitle: "Peek"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StreamReader::Peek 方法。 在 C++ 中，从流中读取单个字符且不更改流的读取光标。"
type: docs
weight: 800
url: /zh/cpp/system.io/streamreader/peek/
---
## StreamReader::Peek method


从流中读取单个字符且不更改流的读取指针。

```cpp
virtual int System::IO::StreamReader::Peek() override
```


### ReturnValue

读取使用 UTF-16 编码的字符；如果读取的字符在 UTF-16 编码中由两个代码点表示，则仅返回高位代理项；如果未读取到字符，则返回 -1。

## 另见

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
