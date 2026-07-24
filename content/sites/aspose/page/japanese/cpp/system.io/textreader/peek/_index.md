---
title: "System::IO::TextReader::Peek メソッド"
linktitle: "Peek"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::TextReader::Peek メソッド。C++ でストリームの読み取りカーソルを変更せずに、ストリームから単一文字を読み取ります。"
type: docs
weight: 300
url: /ja/cpp/system.io/textreader/peek/
---
## TextReader::Peek method


ストリームから単一の文字を読み取りますが、ストリームの読み取りカーソルは変更しません。

```cpp
virtual int System::IO::TextReader::Peek()
```


### ReturnValue

UTF-16 エンコーディングでエンコードされた文字を読み取ります；読み取った文字が UTF-16 で 2 つのコードポイントで表される場合は、上位サロゲートのみが返されます；文字が読み取れなかった場合は -1 が返されます。

## 参照

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
