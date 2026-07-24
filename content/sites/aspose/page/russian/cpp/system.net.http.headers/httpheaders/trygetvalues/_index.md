---
title: "System::Net::Http::Headers::HttpHeaders::TryGetValues метод"
linktitle: "TryGetValues"
second_title: "Aspose.Page для C++"
description: "System::Net::Http::Headers::HttpHeaders::TryGetValues метод. Пытается получить соответствующие значения по указанному имени в C++."
type: docs
weight: 1900
url: /ru/cpp/system.net.http.headers/httpheaders/trygetvalues/
---
## HttpHeaders::TryGetValues method


Пытается получить соответствующие значения по указанному имени.

```cpp
bool System::Net::Http::Headers::HttpHeaders::TryGetValues(String name, System::SharedPtr<Collections::Generic::IEnumerable<String>> &values)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Имя заголовка. |
| значения | System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Экземпляр, в котором будут назначены соответствующие значения. |

### ReturnValue

True, если значения заголовка найдены по указанному имени, иначе false.

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
