---
title: "System::Uri::TryCreate 方法"
linktitle: "TryCreate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Uri::TryCreate 方法。根据指定的基 URI 和相对 URI 在 C++ 中构造一个 Uri 对象。"
type: docs
weight: 4400
url: /zh/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


根据指定的基 URI 和相对 URI 构造一个 [Uri](../) 对象。

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | 基 URI |
| relativeUri | const SharedPtr\<Uri\>\& | 要添加到基 URI 的相对 URI |
| result | SharedPtr\<Uri\>\& | 输出参数（如果构造成功），在方法返回时指向新构造的 [Uri](../) 对象 |

### ReturnValue

如果构造成功则为 True，否则为 false

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


根据表示基 URI 的指定 [Uri](../) 对象和相对 URI 的字符串表示构造一个 [Uri](../) 对象。

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | 基 URI |
| relativeUri | const String\& | 要添加到基 URI 的相对 URI |
| result | SharedPtr\<Uri\>\& | 输出参数（如果构造成功），在方法返回时指向新构造的 [Uri](../) 对象 |

### ReturnValue

如果构造成功则为 True，否则为 false

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


构造一个表示指定 URI 的 [Uri](../) 对象；一个参数指定 URI 的类型。

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uriString | const String\& | 待构造对象所表示的字符串 URI |
| uriKind | UriKind | 指定 URI 的类型 |
| result | SharedPtr\<Uri\>\& | 输出参数（如果构造成功），在方法返回时指向新构造的 [Uri](../) 对象 |

### ReturnValue

如果构造成功则为 True，否则为 false

## 另见

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
