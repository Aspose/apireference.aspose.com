---
title: "System::Web::HttpUtility::UrlDecode 메서드"
linktitle: "UrlDecode"
second_title: "C++용 Aspose.Page"
description: "System::Web::HttpUtility::UrlDecode 메서드. C++에서 바이트 배열로부터 URI 조각을 디코딩합니다."
type: docs
weight: 300
url: /ko/cpp/system.web/httputility/urldecode/
---
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) method


바이트 배열에서 URI 조각을 디코딩합니다.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, const System::SharedPtr<Text::Encoding> &e)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | const System::ArrayPtr\<uint8_t\>\& | 인코딩된 URI 조각. |
| e | const System::SharedPtr\<Text::Encoding\>\& | 사용할 인코딩. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) method


바이트 배열에서 URI 조각을 디코딩합니다.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count, const System::SharedPtr<Text::Encoding> &e)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | const System::ArrayPtr\<uint8_t\>\& | 인코딩된 URI 조각. |
| offset | int32_t | 주어진 바이트 배열의 오프셋. |
| count | int32_t | 읽을 바이트 수. |
| e | const System::SharedPtr\<Text::Encoding\>\& | 사용할 인코딩. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String) method


문자열에서 URI 조각을 디코딩합니다.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | String | 인코딩된 URI 조각. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String, System::SharedPtr\<Text::Encoding\>) method


문자열에서 URI 조각을 디코딩합니다.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str, System::SharedPtr<Text::Encoding> e)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | String | 인코딩된 URI 조각. |
| e | System::SharedPtr\<Text::Encoding\> | 사용할 인코딩. |

### ReturnValue

디코딩된 URI 조각.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
