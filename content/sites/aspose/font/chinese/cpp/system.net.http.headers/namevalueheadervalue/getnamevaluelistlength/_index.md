---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength 方法"
linktitle: "GetNameValueListLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength 方法。将指定索引处的传入字符串转换为 NameValueHeaderValue 类实例的集合，并返回在 C++ 中解析的子字符串的长度。"
type: docs
weight: 1000
url: /zh/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


将从指定索引开始的传入字符串转换为 NameValueHeaderValue 类实例的集合，并返回已解析子字符串的长度。

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 要分析的字符串。 |
| startIndex | int32_t | 用于分析的起始位置。 |
| 分隔符 | char16_t | 用于在指定字符串中分隔项目的字符串。 |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | 解析后集合将被分配的输出参数。 |

### ReturnValue

已解析子字符串的长度。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
