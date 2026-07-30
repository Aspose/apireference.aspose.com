---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength 方法"
linktitle: "GetNameValueLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength 方法。 在 C++ 中将从指定索引开始的传入字符串转换为 NameValueHeaderValue 类的实例。"
type: docs
weight: 900
url: /zh/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


将从指定索引开始的传入字符串转换为 [NameValueHeaderValue](../) 类的实例。

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 要解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | 用于创建 [NameValueHeaderValue](../) 类新实例的函数。 |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | 已解析对象将被分配的实例。 |

### ReturnValue

返回已解析子字符串的长度，否则返回 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


将从指定索引开始的传入字符串转换为 [NameValueHeaderValue](../) 类的实例。

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 要解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | 已解析对象将被分配的实例。 |

### ReturnValue

返回已解析子字符串的长度，否则返回 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
