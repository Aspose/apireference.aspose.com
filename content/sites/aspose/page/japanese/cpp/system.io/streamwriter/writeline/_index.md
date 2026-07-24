---
title: "System::IO::StreamWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StreamWriter::WriteLine メソッド。C++ でストリームに改行文字を記述します。"
type: docs
weight: 1100
url: /ja/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


行終端文字を書き込みます。

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## 参照

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


指定された配列のすべての文字を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 書き込む文字を含む配列 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


指定された文字配列から指定された UTF-16 文字のサブレンジを書き込み、続けて改行文字をストリームに書き込みます。

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
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
## StreamWriter::WriteLine(const char_t *) method


指定された C 文字列を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const char_t * | 書き込む C 文字列 |

## 参照

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


指定されたオブジェクトの文字列表現を書き込み、続いて行終端文字を書き込みます。

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
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
## StreamWriter::WriteLine(const String\&) method


指定された文字列を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 書き込む文字列 |

## 参照

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


指定されたオブジェクトの文字列表現を書き込み、続いて行終端文字を書き込みます。

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
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
