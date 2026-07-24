---
title: "System::Uri::TryCreate メソッド"
linktitle: "TryCreate"
second_title: "C++ 用 Aspose.Page"
description: "System::Uri::TryCreate メソッド。指定されたベース URI と相対 URI から Uri オブジェクトを構築します（C++）。"
type: docs
weight: 4400
url: /ja/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


指定されたベースと相対 URI から [Uri](../) オブジェクトを構築します。

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | ベース URI |
| relativeUri | const SharedPtr\<Uri\>\& | ベース URI に追加される相対 URI |
| result | SharedPtr\<Uri\>\& | 構築が成功した場合、メソッドの戻り値で新しく構築された [Uri](../) オブジェクトを指す出力引数 |

### ReturnValue

構築が成功した場合は true、そうでない場合は false

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


ベース URI を表す指定された [Uri](../) オブジェクトと相対 URI の文字列表現から [Uri](../) オブジェクトを構築します。

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | ベース URI |
| relativeUri | const String\& | ベース URI に追加される相対 URI |
| result | SharedPtr\<Uri\>\& | 構築が成功した場合、メソッドの戻り値で新しく構築された [Uri](../) オブジェクトを指す出力引数 |

### ReturnValue

構築が成功した場合は true、そうでない場合は false

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


指定された URI を表す [Uri](../) オブジェクトを構築します。引数で URI の種類を指定します。

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uriString | const String\& | 構築されるオブジェクトが表す文字列 URI |
| uriKind | UriKind | URI の種類を指定します |
| result | SharedPtr\<Uri\>\& | 構築が成功した場合、メソッドの戻り値で新しく構築された [Uri](../) オブジェクトを指す出力引数 |

### ReturnValue

構築が成功した場合は true、そうでない場合は false

## 参照

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
