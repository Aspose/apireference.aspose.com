---
title: "System::Net::Http::Headers::HttpHeaders::RemoveParsedValue 方法"
linktitle: "RemoveParsedValue"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Http::Headers::HttpHeaders::RemoveParsedValue 方法。通过指定的名称获取标头并在 C++ 中移除该标头的解析值。"
type: docs
weight: 1300
url: /zh/cpp/system.net.http.headers/httpheaders/removeparsedvalue/
---
## HttpHeaders::RemoveParsedValue method


根据指定的名称获取标头并从标头中移除已解析的值。

```cpp
bool System::Net::Http::Headers::HttpHeaders::RemoveParsedValue(String name, System::SharedPtr<Object> value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 标头名称。 |
| value | System::SharedPtr\<Object\> | 必须被移除的值。 |

### ReturnValue

当成功删除该值时返回 true，否则返回 false。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
