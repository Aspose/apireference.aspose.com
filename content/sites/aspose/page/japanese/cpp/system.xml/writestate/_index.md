---
title: "System::Xml::WriteState 列挙体"
linktitle: "WriteState"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::WriteState 列挙体。C++ における XmlWriter の状態を指定します。"
type: docs
weight: 5700
url: /ja/cpp/system.xml/writestate/
---
## WriteState enum


[XmlWriter](../xmlwriter/) の状態を指定します。

```cpp
enum class WriteState
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| 開始 | 0 | XmlWriter::Write メソッドがまだ呼び出されていないことを示します。 |
| Prolog | 1 | プロローグが書き込まれていることを示します。 |
| Element | 2 | 要素の開始タグが書き込まれていることを示します。 |
| Attribute | 3 | 属性値が書き込まれていることを示します。 |
| Content | 4 | 要素の内容が書き込まれていることを示します。 |
| Closed | 5 | [XmlWriter::Close](../xmlwriter/close/) メソッドが呼び出されたことを示します。 |
| Error | 6 | 例外がスローされ、[XmlWriter](../xmlwriter/) が無効な状態になっています。[XmlWriter::Close](../xmlwriter/close/) メソッドを呼び出すことで、[XmlWriter](../xmlwriter/) を [WriteState::Closed](./) 状態にすることができます。他のすべての [XmlWriter](../xmlwriter/) メソッド呼び出しは InvalidOperationException を引き起こします。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
