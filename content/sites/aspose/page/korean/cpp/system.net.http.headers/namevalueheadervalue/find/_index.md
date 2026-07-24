---
title: "System::Net::Http::Headers::NameValueHeaderValue::Find 메서드"
linktitle: "찾기"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::NameValueHeaderValue::Find 메서드. 지정된 이름으로 C++에서 컬렉션 내의 NameValueHeaderValue-class 인스턴스를 찾습니다."
type: docs
weight: 800
url: /ko/cpp/system.net.http.headers/namevalueheadervalue/find/
---
## NameValueHeaderValue::Find method


지정된 이름으로 컬렉션에서 NameValueHeaderValue 클래스 인스턴스를 찾습니다.

```cpp
static System::SharedPtr<NameValueHeaderValue> System::Net::Http::Headers::NameValueHeaderValue::Find(System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> values, String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 값들 | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | NameValueHeaderValue-class 인스턴스들의 컬렉션. |
| name | String | 찾을 이름. |

### ReturnValue

찾은 경우 NameValueHeaderValue-class 인스턴스, 그렇지 않으면 nullptr.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [ObjectCollection](../../objectcollection/)
* Class [String](../../../system/string/)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
