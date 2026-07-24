---
title: "System::IO::BinaryWriter::Write メソッド"
linktitle: "Write"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BinaryWriter::Write メソッド。値が ''true'' の場合は 0、''false'' の場合は 1 の単一バイトを書き込み、C++ の出力ストリームに書き込みます。"
type: docs
weight: 800
url: /ja/cpp/system.io/binarywriter/write/
---
## BinaryWriter::Write(bool) method


**value** が 'true' の場合は 0、**value** が 'false' の場合は 1 の単一バイトを出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(bool value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | bool | 出力ストリームに書き込むバイト値を指定するブール値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(char16_t) method


指定された 16 ビット幅の文字値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(char16_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char16_t | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<char_t\>\&, int, int) method


指定された文字配列から指定された UTF-16 文字のサブレンジを出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<char_t> &buffer, int index=0, int count=-1)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 書き込む文字を含む配列 |
| インデックス | int | 書き込むサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int | 書き込むサブレンジの文字数。-1 を指定するとサブレンジは **buffer** 配列の末尾までになります。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<uint8_t\>\&, int, int) method


指定されたバイト配列から指定されたバイトのサブレンジを出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<uint8_t> &buffer, int index=0, int count=-1)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列 |
| インデックス | int | 書き込むサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int | 書き込むサブレンジの要素数。-1 はサブレンジが **buffer** 配列の終端で終了することを指定します |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const char_t *) method


現在のエンコーディングで長さプレフィックス付き文字列を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(const char_t *value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const char_t * | 書き込む C 文字列 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const Decimal\&) method


指定された [Decimal](../../../system/decimal/) 値のバイト表現を書き込み、出力ストリームに送ります。

```cpp
virtual void System::IO::BinaryWriter::Write(const Decimal &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Decimal\& | 書き込む値 |

## 参照

* Class [Decimal](../../../system/decimal/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const String\&) method


現在のエンコーディングで長さプレフィックス付き文字列を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(const String &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 書き込む文字列 |

## 参照

* Class [String](../../../system/string/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(double) method


指定された倍精度浮動小数点値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(double value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | double | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(float) method


指定された単精度浮動小数点値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(float value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | 単精度浮動小数点数 | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int) method


指定された 32 ビット整数値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(int value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int16_t) method


指定された 16 ビット整数値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(int16_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int16_t | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int64_t) method


指定された 64 ビット整数値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(int64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int64_t | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint16_t) method


指定された符号なし 16 ビット整数値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(uint16_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint16_t | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint32_t) method


指定された符号なし 32 ビット整数値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(uint32_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint32_t | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint64_t) method


指定された符号なし 64 ビット整数値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(uint64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint64_t | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint8_t) method


指定された符号なし 8 ビット整数値を出力ストリームに書き込みます。

```cpp
virtual void System::IO::BinaryWriter::Write(uint8_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint8_t | 書き込む値 |

## 参照

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
