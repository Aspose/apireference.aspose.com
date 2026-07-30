---
title: "System::Net::Http::Headers::HttpHeaders::TryGetValues 方法"
linktitle: "TryGetValues"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::HttpHeaders::TryGetValues 方法。尝试在 C++ 中按指定名称获取对应的值。"
type: docs
weight: 1900
url: /zh/cpp/system.net.http.headers/httpheaders/trygetvalues/
---
## HttpHeaders::TryGetValues method


尝试根据指定名称获取对应的值。

```cpp
bool System::Net::Http::Headers::HttpHeaders::TryGetValues(String name, System::SharedPtr<Collections::Generic::IEnumerable<String>> &values)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 标头名称。 |
| 值 | System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 将分配对应值的实例。 |

### ReturnValue

如果按指定名称找到标头值则为 true，否则为 false。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
