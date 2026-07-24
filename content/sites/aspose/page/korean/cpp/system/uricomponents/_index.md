---
title: "System::UriComponents 열거형"
linktitle: "UriComponents"
second_title: "C++용 Aspose.Page"
description: "System::UriComponents 열거형. C++에서 URI 구성 요소를 나타냅니다."
type: docs
weight: 8900
url: /ko/cpp/system/uricomponents/
---
## UriComponents enum


URI 구성 요소를 나타냅니다.

```cpp
enum class UriComponents
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Scheme | 1 | Scheme 데이터. |
| UserInfo | 2 | UserInfo 데이터. |
| Host | 4 | Host 데이터. |
| 포트 | 8 | Port 데이터. |
| SchemeAndServer | n/a | Scheme, Host 및 Port 데이터. |
| Path | 16 | LocalPath 데이터. |
| Query | 32 | Query 데이터. |
| PathAndQuery | n/a | LocalPath 및 Query 데이터. |
| HttpRequestUrl | n/a | Scheme, Host, Port, Query 및 LocalPath 데이터. |
| Fragment | 64 | Fragment 데이터. |
| AbsoluteUri | n/a | Scheme, Host, Port, Quer, LocalPath 및 Fragment 데이터. |
| StrongPort | 128 | Port 데이터; 포트 데이터가 [Uri](../uri/)에 없고 Scheme에 기본 포트가 할당된 경우 기본 포트가 반환됩니다; 기본 포트가 없으면 -1이 반환됩니다. |
| HostAndPort | n/a | Host 및 Port 데이터; 포트 데이터가 [Uri](../uri/)에 없고 Scheme에 기본 포트가 할당된 경우 기본 포트가 반환됩니다. 기본 포트가 없으면 -1이 반환됩니다. |
| StrongAuthority | n/a | UserInfo, Host 및 Port 데이터. 포트 데이터가 [Uri](../uri/)에 없고 Scheme에 기본 포트가 할당된 경우 기본 포트가 반환됩니다. 기본 포트가 없으면 -1이 반환됩니다. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | 구분자를 포함해야 함을 지정합니다. |
| SerializationInfoString | n/a | 필요한 전체 [Uri](../uri/) 컨텍스트는 [Uri](../uri/) 직렬 변환기에 사용됩니다. 컨텍스트에는 IPv6 범위가 포함됩니다. |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
