---
title: "System::Net::Http::Headers::HttpHeaders::TryGetValues 方法"
linktitle: "TryGetValues"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Http::Headers::HttpHeaders::TryGetValues 方法。尝试通过指定的名称获取相应的值（在 C++ 中）。"
type: docs
weight: 1900
url: /zh/cpp/system.net.http.headers/httpheaders/trygetvalues/
---
## HttpHeaders::TryGetValues method


尝试根据指定的名称获取对应的值。

```cpp
bool System::Net::Http::Headers::HttpHeaders::TryGetValues(String name, System::SharedPtr<Collections::Generic::IEnumerable<String>> &values)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 标头名称。 |
| 值 | System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 一个将被分配相应值的实例。 |

### ReturnValue

如果通过指定的名称找到标头值则为 true，否则为 false。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
