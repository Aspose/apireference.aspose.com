---
title: "System::Net::Http::Headers::HttpHeaders::TryGetValues 메서드"
linktitle: "TryGetValues"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::HttpHeaders::TryGetValues 메서드. C++에서 지정된 이름으로 해당 값을 가져오려고 시도합니다."
type: docs
weight: 1900
url: /ko/cpp/system.net.http.headers/httpheaders/trygetvalues/
---
## HttpHeaders::TryGetValues method


지정된 이름에 해당하는 값을 가져오려 시도합니다.

```cpp
bool System::Net::Http::Headers::HttpHeaders::TryGetValues(String name, System::SharedPtr<Collections::Generic::IEnumerable<String>> &values)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 헤더 이름입니다. |
| 값들 | System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 해당 값이 할당될 인스턴스. |

### ReturnValue

지정된 이름으로 헤더 값을 찾으면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
