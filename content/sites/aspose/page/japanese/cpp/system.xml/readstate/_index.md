---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::ReadState enum。C++ におけるリーダーの状態を指定します。"
type: docs
weight: 5300
url: /ja/cpp/system.xml/readstate/
---
## ReadState enum


リーダーの状態を指定します。

```cpp
enum class ReadState
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Initial | 0 | この [XmlReader::Read](../xmlreader/read/) メソッドが呼び出されていません。 |
| Interactive | 1 | この [XmlReader::Read](../xmlreader/read/) メソッドが呼び出されました。リーダー上で追加のメソッドを呼び出すことができます。 |
| エラー | 2 | 読み取り操作の継続を妨げるエラーが発生しました。 |
| EndOfFile | 3 | ファイルの末尾に正常に到達しました。 |
| Closed | 4 | この [XmlReader::Close](../xmlreader/close/) メソッドが呼び出されました。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
