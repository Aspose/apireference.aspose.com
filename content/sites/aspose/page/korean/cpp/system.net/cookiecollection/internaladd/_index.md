---
title: "System::Net::CookieCollection::InternalAdd method"
linktitle: "InternalAdd"
second_title: "C++용 Aspose.Page"
description: "System::Net::CookieCollection::InternalAdd 메서드. 지정된 쿠키를 컬렉션에 추가합니다 (C++)."
type: docs
weight: 1000
url: /ko/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


지정된 쿠키를 컬렉션에 추가합니다.

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 쿠키 | System::SharedPtr\<Cookie\> | 추가할 쿠키. |
| isStrict | bool | 지정된 쿠키가 기존 쿠키를 교체해야 하면 true, 그렇지 않으면 false. |

### ReturnValue

지정된 쿠키가 기존 쿠키를 교체했을 때 0, 그렇지 않으면 1.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
