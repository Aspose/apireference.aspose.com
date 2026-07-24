---
title: "System::IO::StreamReader::StreamReader コンストラクタ"
linktitle: "StreamReader"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StreamReader::StreamReader コンストラクタ。C++ で指定された基になるストリームから文字を読み取り、UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用する StreamReader オブジェクトのインスタンスを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


指定された基になるストリームから文字を読み取り、UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用する [StreamReader](../) オブジェクトのインスタンスを作成します。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を読み取る基になるストリーム |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


指定された基になるストリームから文字を読み取り、UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用する [StreamReader](../) オブジェクトのインスタンスを作成します。パラメータはバイトオーダーマーク検出を有効にするかどうかを指定します。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を読み取る基になるストリーム |
| detectEncodingFromByteOrderMarks | bool | ストリームの先頭でバイトオーダーマークを検索する場合は true、そうでない場合は false |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


指定された基になるストリームから文字を読み取り、指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用する [StreamReader](../) オブジェクトのインスタンスを作成します。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を読み取る基になるストリーム |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


指定された基になるストリームから文字を読み取り、指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用する [StreamReader](../) オブジェクトのインスタンスを作成します。パラメータはバイトオーダーマーク検出を有効にするかどうかを指定します。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を読み取る基になるストリーム |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |
| detectEncodingFromByteOrderMarks | bool | ストリームの先頭でバイトオーダーマークを検索する場合は true、そうでない場合は false |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


指定された基になるストリームから文字を読み取り、指定されたエンコーディングと指定されたサイズのバッファを使用する [StreamReader](../) オブジェクトのインスタンスを作成します。パラメータはバイトオーダーマーク検出を有効にするかどうかを指定します。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<Stream\>\& | 文字を読み取る基になるストリーム |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |
| detectEncodingFromByteOrderMarks | bool | ストリームの先頭でバイトオーダーマークを検索する場合は true、そうでない場合は false |
| bufferSize | int | バッファの最小サイズ（バイト単位） |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


指定されたファイルから文字を読み取り、UTF-8 エンコーディングとデフォルトサイズ 4096 バイトのバッファを使用する [StreamReader](../) オブジェクトのインスタンスを作成します。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const System::String\& | 文字を読み取るファイルのパス |

## 参照

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


指定されたファイルから文字を読み取り、UTF-8 エンコーディングとデフォルトサイズ 4096 バイトのバッファを使用する [StreamReader](../) オブジェクトのインスタンスを作成します。パラメータはバイトオーダーマーク検出を有効にするかどうかを指定します。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const System::String\& | 文字を読み取るファイルのパス |
| detectEncodingFromByteOrderMarks | bool | true はファイルの先頭でバイトオーダーマークを検索し、そうでなければ false |

## 参照

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


指定されたエンコーディングを使用し、デフォルトサイズ 4096 バイトのバッファで、指定されたファイルから文字を読み取る [StreamReader](../) オブジェクトのインスタンスを作成します。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const System::String\& | 文字を読み取るファイルのパス |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |

## 参照

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


指定されたエンコーディングを使用し、デフォルトサイズ 4096 バイトのバッファで、指定された基底ストリームから文字を読み取る [StreamReader](../) オブジェクトのインスタンスを作成します。パラメーターはバイトオーダーマーク検出を有効にするかどうかを指定します。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const System::String\& | 文字を読み取るファイルのパス |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |
| detectEncodingFromByteOrderMarks | bool | true はファイルの先頭でバイトオーダーマークを検索し、そうでなければ false |

## 参照

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


指定されたエンコーディングを使用し、指定されたサイズのバッファで、指定されたファイルから文字を読み取る [StreamReader](../) オブジェクトのインスタンスを作成します。パラメーターはバイトオーダーマーク検出を有効にするかどうかを指定します。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const System::String\& | 文字を読み取るファイルのパス |
| エンコーディング | const EncodingPtr\& | 使用するエンコーディング |
| detectEncodingFromByteOrderMarks | bool | true はファイルの先頭でバイトオーダーマークを検索し、そうでなければ false |
| bufferSize | int | バッファの最小サイズ（バイト単位） |

## 参照

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
