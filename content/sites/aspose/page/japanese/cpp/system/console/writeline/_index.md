---
title: "System::Console::WriteLine メソッド"
linktitle: "WriteLine"
second_title: "C++ 用 Aspose.Page"
description: "System::Console::WriteLine メソッド。C++ の標準出力ストリームに現在の行終端子を出力します。"
type: docs
weight: 1100
url: /ja/cpp/system/console/writeline/
---
## Console::WriteLine() method


現在の行終端文字を標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine()
```

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(bool) method


bool 値の文字列表現を現在の行終端文字とともに標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(bool value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | bool | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(char_t) method


指定された文字値を現在の行終端文字とともに標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(char_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char_t | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&) method


指定された文字配列の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 出力する配列 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&, int, int) method


指定された文字配列の指定された範囲の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char_t\>\& | 文字配列 |
| インデックス | int | 出力範囲が開始する配列内のインデックス |
| count | int | 出力範囲の要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const char *) method




```cpp
static void System::Console::WriteLine(const char *)=delete
```

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const char_t *) method


指定された C 文字列を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(const char_t *value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const char_t * | 出力する C 文字列 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const Decimal\&) method


標準出力ストリームに、現在の行終端子を続けて、[Decimal](../../decimal/) 値の文字列表現を出力します。

```cpp
static void System::Console::WriteLine(const Decimal &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Decimal\& | 出力する値 |

## 参照

* Class [Decimal](../../decimal/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const Exception\&) method


標準出力ストリームに、現在の行終端子を続けて、指定された [Exception](../../exception/) オブジェクトの文字列表現を出力します。

```cpp
static void System::Console::WriteLine(const Exception &e)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| e | const Exception\& | 出力する値 |

## 参照

* Typedef [Exception](../../exception/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const SharedPtr\<T\>\&) method


指定されたオブジェクトの文字列表現を現在の行終端文字とともに標準出力ストリームに出力します。

```cpp
template<class T> static void System::Console::WriteLine(const SharedPtr<T> &object)
```


| パラメーター | 説明 |
| --- | --- |
| T | 出力するオブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | 出力する [Object](../../object/) |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const String\&, Args\&&...) method


指定された書式に従ってフォーマットされた指定引数の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
template<class...> static void System::Console::WriteLine(const String &format, Args &&... args)
```


| パラメーター | 説明 |
| --- | --- |
| この | 出力する値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| フォーマット | const String\& | 文字列フォーマット |
| args | Args\&&... | 出力する値 |

## 参照

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const String\&) method


指定された文字列オブジェクトを、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(const String &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 出力する文字列オブジェクト |

## 参照

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const TypeInfo\&) method


標準出力ストリームに、現在の行終端子を続けて、[TypeInfo](../../typeinfo/) 値の文字列表現を出力します。

```cpp
static void System::Console::WriteLine(const TypeInfo &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const TypeInfo\& | 出力する値 |

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(double) method


倍精度浮動小数点値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(double value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | double | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(float) method


単精度浮動小数点値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(float value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | 単精度浮動小数点数 | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(int32_t) method


32 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(int32_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int32_t | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(int64_t) method


64 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(int64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int64_t | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(uint32_t) method


符号なし 32 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(uint32_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint32_t | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(uint64_t) method


符号なし 64 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。

```cpp
static void System::Console::WriteLine(uint64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint64_t | 出力する値 |

## 参照

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
