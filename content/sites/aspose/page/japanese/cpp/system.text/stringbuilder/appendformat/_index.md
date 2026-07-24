---
title: "System::Text::StringBuilder::AppendFormat メソッド"
linktitle: "AppendFormat"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::StringBuilder::AppendFormat メソッド。C++ でフォーマットされた文字列をビルダーに追加します。"
type: docs
weight: 400
url: /ja/cpp/system.text/stringbuilder/appendformat/
---
## StringBuilder::AppendFormat(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) method


書式設定された文字列をビルダーに追加します。

```cpp
template<class...> StringBuilder * System::Text::StringBuilder::AppendFormat(const SharedPtr<IFormatProvider> &fp, const String &format, const TArgs &... args)
```


| パラメーター | 説明 |
| --- | --- |
| TArgs | 引数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fp | const SharedPtr\<IFormatProvider\>\& | フォーマットプロバイダー; 無視されます。 |
| フォーマット | const String\& | 書式文字列です。 |
| args | const TArgs\&... | フォーマット文字列の位置に挿入する引数。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFormatProvider](../../../system/iformatprovider/)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::AppendFormat(const String\&, const TArgs\&...) method


書式設定された文字列をビルダーに追加します。

```cpp
template<class...> StringBuilder * System::Text::StringBuilder::AppendFormat(const String &format, const TArgs &... args)
```


| パラメーター | 説明 |
| --- | --- |
| TArgs | 引数の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| フォーマット | const String\& | 書式文字列です。 |
| args | const TArgs\&... | フォーマット文字列の位置に挿入する引数。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
