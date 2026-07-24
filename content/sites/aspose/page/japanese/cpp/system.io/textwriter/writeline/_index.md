---
title: "System::IO::TextWriter::WriteLine メソッド"
linktitle: "WriteLine"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::TextWriter::WriteLine メソッド。C++ でストリームに改行文字を書き込みます。"
type: docs
weight: 1000
url: /ja/cpp/system.io/textwriter/writeline/
---
## TextWriter::WriteLine() method


行終端文字を書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine()
```

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(bool) method


指定されたブール値の文字列表現を書き込み、続いて行終端文字を書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(bool value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | bool | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(char_t) method


指定された文字を書き込み、続いて行終端文字を書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(char_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char_t | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


指定された配列のすべての文字を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 書き込む文字を含む配列 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


指定された文字配列から指定された UTF-16 文字のサブレンジを書き込み、続けて改行文字をストリームに書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 書き込む文字を含む配列 |
| インデックス | int32_t | 書き込むサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int32_t | 書き込むサブレンジの文字数。-1 を指定するとサブレンジは **buffer** 配列の末尾までになります。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const char_t *) method


指定された C 文字列を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(const char_t *value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const char_t * | 書き込む C 文字列 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const SharedPtr\<Object\>\&) method


指定されたオブジェクトの文字列表現を書き込み、続いて行終端文字を書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(const SharedPtr<Object> &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const SharedPtr\<Object\>\& | 書き込むオブジェクト |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&, const TArgs\&...) method


指定された形式に従って書式設定された指定値を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
template<class...> void System::IO::TextWriter::WriteLine(const String &format, const TArgs &... args)
```


| パラメーター | 説明 |
| --- | --- |
| TArgs | 書き込む値の型のリスト |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| フォーマット | const String\& | 文字列フォーマット |
| args | const TArgs\&... | 書き込む値 |

## 参照

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&) method


指定された文字列を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(const String &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 書き込む文字列 |

## 参照

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const TypeInfo\&) method


指定された [TypeInfo](../../../system/typeinfo/) オブジェクトの文字列表現を書き込み、行終端文字を付加してストリームに出力します。

```cpp
virtual void System::IO::TextWriter::WriteLine(const TypeInfo &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const TypeInfo\& | 書き込むオブジェクト |

## 参照

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(Decimal) method


指定された [Decimal](../../../system/decimal/) オブジェクトの文字列表現を書き込み、行終端文字を付加してストリームに出力します。

```cpp
virtual void System::IO::TextWriter::WriteLine(Decimal value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | 十進数 | 書き込むオブジェクト |

## 参照

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(double) method


指定された倍精度浮動小数点値の文字列表現を書き込み、続いて行終端文字を書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(double value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | double | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(float) method


指定された単精度浮動小数点値の文字列表現を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(float value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | 単精度浮動小数点数 | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int) method


指定された 32 ビット整数値の文字列表現を書き込み、続いて行終端文字を書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(int value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int64_t) method


指定された 64 ビット整数値の文字列表現を書き込み、続いて行終端文字を書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(int64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int64_t | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint32_t) method


指定された符号なし 32 ビット整数値の文字列表現を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(uint32_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint32_t | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint64_t) method


指定された符号なし 64 ビット整数値の文字列表現を書き込み、続けて改行文字をストリームに書き込みます。

```cpp
virtual void System::IO::TextWriter::WriteLine(uint64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint64_t | 書き込む値 |

## 参照

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
