---
title: "System::IO::BinaryReader::BinaryReader コンストラクタ"
linktitle: "BinaryReader"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BinaryReader::BinaryReader コンストラクタ。C++ で UTF-8 エンコーディングを使用して、指定されたストリームからデータを読み取る BinaryReader クラスのインスタンスを構築します。"
type: docs
weight: 100
url: /ja/cpp/system.io/binaryreader/binaryreader/
---
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&) constructor


UTF-8 エンコーディングを使用して、指定されたストリームからデータを読み取る [BinaryReader](../) クラスのインスタンスを構築します。

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<Stream\>\& | 入力ストリーム |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


指定されたエンコーディングを使用して、指定されたストリームからデータを読み取る [BinaryReader](../) クラスのインスタンスを構築します。

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<Stream\>\& | 入力ストリーム |
| エンコーディング | const SharedPtr\<Text::Encoding\>\& | 使用するエンコーディング |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) constructor


指定されたエンコーディングを使用して、指定されたストリームからデータを読み取る [BinaryReader](../) クラスのインスタンスを構築します。

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding, bool leaveOpen)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<Stream\>\& | 入力ストリーム |
| エンコーディング | const SharedPtr\<Text::Encoding\>\& | 使用するエンコーディング |
| leaveOpen | bool | 現在のオブジェクトが破棄された後に、ストリーム **input** を開いたままにするか（true）、しないか（false）を指定します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
