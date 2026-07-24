---
title: "System::String::Compare メソッド"
linktitle: "Compare"
second_title: "C++ 用 Aspose.Page"
description: "System::String::Compare メソッド。Less-equal-greater は C++ で 2 つの文字列を比較します。"
type: docs
weight: 6200
url: /ja/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greaterは2つの文字列を比較します。

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| strB | const String\& | 比較対象の2番目の文字列。 |
| ignoreCase | bool | 比較が大文字小文字を区別しないかどうかを指定します。 |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | 比較に使用するカルチャー。 |

### ReturnValue

最初の部分文字列が2番目より小さい場合は負の値、等しい場合は0、そうでない場合は正の値を返します。

## 参照

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greaterは2つの文字列を比較します。

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| strB | const String\& | 比較対象の2番目の文字列。 |
| ignoreCase | bool | 比較が大文字小文字を区別しないかどうかを指定します。 |

### ReturnValue

最初の部分文字列が2番目より小さい場合は負の値、等しい場合は0、そうでない場合は正の値を返します。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greaterは2つの文字列を比較します。

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| strB | const String\& | 比較対象の2番目の文字列。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最初の部分文字列が2番目より小さい場合は負の値、等しい場合は0、そうでない場合は正の値を返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greaterは2つのサブ文字列を比較します。

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| indexA | int | 最初の文字列部分の開始位置。 |
| strB | const String\& | 比較対象の2番目の文字列。 |
| indexB | int | 2番目の文字列部分の開始位置。 |
| length | int | 比較する文字数。 |
| ignoreCase | bool | 比較が大文字小文字を区別しないかどうかを指定します。 |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | 比較に使用するカルチャー。 |

### ReturnValue

最初の部分文字列が2番目より小さい場合は負の値、等しい場合は0、そうでない場合は正の値を返します。

## 参照

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greaterは2つのサブ文字列を比較します。

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| indexA | int | 最初の文字列部分の開始位置。 |
| strB | const String\& | 比較対象の2番目の文字列。 |
| indexB | int | 2番目の文字列部分の開始位置。 |
| length | int | 比較する文字数。 |
| ignoreCase | bool | 比較が大文字小文字を区別しないかどうかを指定します。 |

### ReturnValue

最初の部分文字列が2番目より小さい場合は負の値、等しい場合は0、そうでない場合は正の値を返します。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greaterは2つの文字列を比較します。

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strA | const String\& | 比較対象の最初の文字列。 |
| indexA | int | 最初の文字列部分の開始位置。 |
| strB | const String\& | 比較対象の2番目の文字列。 |
| indexB | int | 2番目の文字列部分の開始位置。 |
| length | int | 比較する文字数。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最初の部分文字列が2番目より小さい場合は負の値、等しい場合は0、そうでない場合は正の値を返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
