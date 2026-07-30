---
title: "System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength 方法"
linktitle: "GetAuthenticationLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength 方法。解析指定的字符串并返回该字符串表示的最后索引（在 C++ 中）。"
type: docs
weight: 800
url: /zh/cpp/system.net.http.headers/authenticationheadervalue/getauthenticationlength/
---
## AuthenticationHeaderValue::GetAuthenticationLength method


解析指定的字符串并返回字符串表示形式的最后索引。

```cpp
static int32_t System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength(String input, int32_t startIndex, System::SharedPtr<Object> &parsedValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 必须解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| parsedValue | System::SharedPtr\<Object\>\& | 解析后将赋值的输出参数。 |

### ReturnValue

已解析子字符串的长度，否则为 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AuthenticationHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
