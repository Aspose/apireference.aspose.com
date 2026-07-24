---
title: "System::String::Equals メソッド"
linktitle: "等しい"
second_title: "C++ 用 Aspose.Page"
description: "System::String::Equals メソッド。文字列の等価比較。C++ では System::StringComparison::Ordinal 比較モードを使用します。"
type: docs
weight: 1100
url: /ja/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 現在のものと比較するための [String](../)。 |

### ReturnValue

文字列が一致すれば true、そうでなければ false。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 現在のものと比較するための [String](../)。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード（詳細は [System::StringComparison](../../stringcomparison/) を参照）。 |

### ReturnValue

選択した比較タイプで文字列が一致すれば true、そうでなければ false。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&) method


EqualはOrdinal比較モードを使用して2つの文字列を比較します。

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| strB | const String\& | 比較対象の2番目の文字列。 |

### ReturnValue

文字列が一致すれば true、そうでなければ false。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equalは2つの文字列を比較します。

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| strB | const String\& | 比較対象の2番目の文字列。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

文字列が一致すれば true、そうでなければ false。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
