---
title: "System::IO::BinaryWriter::BinaryWriter コンストラクタ"
linktitle: "BinaryWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BinaryWriter::BinaryWriter コンストラクタ。C++ で指定されたエンコーディングを使用して、指定されたストリームにデータを書き込む BinaryWriter クラスのインスタンスを構築します。"
type: docs
weight: 100
url: /ja/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


指定されたエンコーディングを使用して、指定されたストリームにデータを書き込む [BinaryWriter](../) クラスのインスタンスを構築します。

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const StreamPtr\& | 出力ストリーム |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |
| leaveopen | bool | 現在のオブジェクトが破棄された後に、ストリーム **stream** を開いたままにするか (true) それとも閉じるか (false) を指定します。 |

## 参照

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
