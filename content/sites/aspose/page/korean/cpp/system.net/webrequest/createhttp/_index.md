---
title: "System::Net::WebRequest::CreateHttp 메서드"
linktitle: "CreateHttp"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebRequest::CreateHttp 메서드. C++에서 지정된 URI를 사용하여 WebRequest 클래스의 새 인스턴스를 생성합니다."
type: docs
weight: 300
url: /ko/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


지정된 URI를 사용하여 [WebRequest](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| requestUriString | String | 새 인스턴스를 생성하는 데 사용되는 [WebRequest](../) 클래스의 URI. |

### ReturnValue

새로 생성된 WebRequest 클래스 인스턴스입니다.
## 비고



지정된 URI가 [http://](http://) 또는 [https://](https://)를 제외한 다른 스킴으로 시작하면 NotSupportedException이 발생합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


지정된 URI를 사용하여 [WebRequest](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | 새 인스턴스를 생성하는 데 사용되는 [WebRequest](../) 클래스의 URI. |

### ReturnValue

새로 생성된 WebRequest 클래스 인스턴스입니다.
## 비고



지정된 URI가 [http://](http://) 또는 [https://](https://)를 제외한 다른 스킴으로 시작하면 NotSupportedException이 발생합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
