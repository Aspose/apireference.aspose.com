---
title: "System::Net::Cookie::VerifySetDefaults 메서드"
linktitle: "VerifySetDefaults"
second_title: "C++용 Aspose.Page"
description: "System::Net::Cookie::VerifySetDefaults 메서드. C++에서 기본 속성''의 값을 확인하고 설정합니다."
type: docs
weight: 4200
url: /ko/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


기본 속성의 값을 확인하고 설정합니다.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 변형 | CookieVariant | 쿠키의 사양입니다. |
| uri | System::SharedPtr\<Uri\> | 내부 필드를 초기화하는 데 사용되는 Uri 클래스 인스턴스. |
| isLocalDomain | bool | 쿠키가 로컬 도메인에 푸시되는지를 나타내는 값. |
| localDomain | String | 로컬 도메인 이름. |
| setDefault | bool | 쿠키의 속성을 기본값으로 초기화해야 하는지를 나타내는 값. |
| shouldThrow | bool | 지정된 값이 유효하지 않을 때 예외를 발생시켜야 하는지를 나타내는 값. |

### ReturnValue

모든 값이 유효하면 true, 그렇지 않으면 false.

## 또 보기

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
