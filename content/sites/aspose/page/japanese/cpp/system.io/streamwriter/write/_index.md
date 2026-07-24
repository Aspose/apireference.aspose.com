---
title: "System::IO::StreamWriter::Write メソッド"
linktitle: "Write"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StreamWriter::Write メソッド。C++ で指定された文字をストリームに書き込みます。"
type: docs
weight: 1000
url: /ja/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


指定された文字を書き込みます。

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char_t | 書き込む文字 |

## 参照

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


指定された配列のすべての文字を書き込みます。

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 書き込む文字を含む配列 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


指定された文字配列から指定された UTF-16 文字のサブレンジを書き込みます。

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 書き込む文字を含む配列 |
| インデックス | int32_t | 書き込むサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int32_t | 書き込むサブレンジの文字数。-1 を指定するとサブレンジは **buffer** 配列の末尾までになります。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const char_t *) method


指定された c-string を書き込みます。

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const char_t * | 書き込む C 文字列 |

## 参照

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


指定されたオブジェクトの文字列表現を書き込みます。

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | 書き込むオブジェクト |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const String\&) method


指定された文字列を書き込みます。

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 書き込む文字列 |

## 参照

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


指定されたオブジェクトの文字列表現を書き込みます。

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | 書き込むオブジェクト |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
