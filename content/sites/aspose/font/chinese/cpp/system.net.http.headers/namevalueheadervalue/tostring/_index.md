---
title: "System::Net::Http::Headers::NameValueHeaderValue::ToString 方法"
linktitle: "ToString"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::ToString 方法。 相当于 C# 的 Object.ToString() 方法。 使得在 C++ 中可以将自定义对象转换为字符串。"
type: docs
weight: 700
url: /zh/cpp/system.net.http.headers/namevalueheadervalue/tostring/
---
## NameValueHeaderValue::ToString() const method


类似 C# [Object.ToString()](../../../system/object/tostring/) 方法。 实现将自定义对象转换为字符串的功能。

```cpp
String System::Net::Http::Headers::NameValueHeaderValue::ToString() const override
```


### ReturnValue

[String](../../../system/string/) representation as provided by final class.

## 另见

* Class [String](../../../system/string/)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::ToString(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) method


返回 NameValueHeaderValue 类实例集合的字符串表示形式。

```cpp
static String System::Net::Http::Headers::NameValueHeaderValue::ToString(System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> values, char16_t separator, bool leadingSeparator)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | NameValueHeaderValue 类实例的集合。 |
| 分隔符 | char16_t | 字符串分隔符。 |
| leadingSeparator | bool | 指示是否在第一个集合项之前添加字符串分隔符的值。 |

### ReturnValue

NameValueHeaderValue 类实例集合的字符串表示形式。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::ToString(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) method


返回 NameValueHeaderValue 类实例集合的字符串表示形式。

```cpp
static void System::Net::Http::Headers::NameValueHeaderValue::ToString(System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> values, char16_t separator, bool leadingSeparator, System::SharedPtr<Text::StringBuilder> destination)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | NameValueHeaderValue 类实例的集合。 |
| 分隔符 | char16_t | 字符串分隔符。 |
| leadingSeparator | bool | 指示是否在第一个集合项之前添加字符串分隔符的值。 |
| destination | System::SharedPtr\<Text::StringBuilder\> | 将分配字符串表示形式的实例。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
