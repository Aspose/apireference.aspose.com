---
title: "System::IO::StreamWriter::StreamWriter constructor"
linktitle: "StreamWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StreamWriter::StreamWriter コンストラクタ。C++ で UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基礎ストリームに文字を書き込む StreamWriter オブジェクトのインスタンスを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


[StreamWriter](../) オブジェクトのインスタンスを作成し、UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基礎ストリームに文字を書き込みます。

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を書き込むための基礎ストリーム |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基礎ストリームに文字を書き込む [StreamWriter](../) オブジェクトのインスタンスを作成します。

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を書き込むための基礎ストリーム |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


指定されたエンコーディングと指定されたサイズのバッファを使用して、指定された基礎ストリームに文字を書き込む [StreamWriter](../) オブジェクトのインスタンスを作成します。パラメーターは、[StreamWriter](../) オブジェクトが破棄される際に基礎ストリームを閉じるかどうかを指定します。

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を書き込むための基礎ストリーム |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |
| buffer_size | int | バッファの最小サイズ（バイト単位） |
| leave_open | bool | 現在の [StreamWriter](../) オブジェクトが破棄された後に、基礎ストリームを開いたままにするかどうかを指定します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定されたファイルに文字を書き込む [StreamWriter](../) オブジェクトのインスタンスを作成します。

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 文字を書き込むファイルのパス |

## 参照

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


指定されたエンコーディングとバッファサイズを使用して、指定されたファイルに文字を書き込む [StreamWriter](../) オブジェクトのインスタンスを作成します。パラメーターは、データをファイルに追加するか、ファイルを上書きするかを指定します。

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 文字を書き込むファイルのパス |
| append | bool | データを指定されたファイルに追加するか (true)、あるいはファイルを上書きするか (false) を指定します。 |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |
| buffer_size | int | 使用するバッファのサイズ |

## 参照

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定されたファイルに文字を書き込む [StreamWriter](../) オブジェクトのインスタンスを作成します。パラメーターは、データをファイルに追加するか、ファイルを上書きするかを指定します。

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 文字を書き込むファイルのパス |
| append | bool | データを指定されたファイルに追加するか (true)、あるいはファイルを上書きするか (false) を指定します。 |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |

## 参照

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
