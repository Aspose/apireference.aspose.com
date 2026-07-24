---
title: "System::Web::HttpUtility::UrlDecodeToBytes 메서드"
linktitle: "UrlDecodeToBytes"
second_title: "C++용 Aspose.Page"
description: "System::Web::HttpUtility::UrlDecodeToBytes 메서드. C++에서 바이트 문자열로부터 URI 조각을 디코딩합니다."
type: docs
weight: 400
url: /ko/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


바이트 문자열에서 URI 조각을 디코딩합니다.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 인코딩된 URI 조각. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


문자열에서 URI 조각을 디코딩합니다.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 인코딩된 URI 조각. |
| e | const System::SharedPtr\<Text::Encoding\>\& | 사용할 인코딩. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


바이트 배열에서 URI 조각을 디코딩합니다.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | const System::ArrayPtr\<uint8_t\>\& | 인코딩된 URI 조각. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


바이트 배열에서 URI 조각을 디코딩합니다.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | const System::ArrayPtr\<uint8_t\>\& | 인코딩된 URI 조각. |
| offset | int32_t | 주어진 바이트 배열의 오프셋. |
| count | int32_t | 읽을 바이트 수. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
