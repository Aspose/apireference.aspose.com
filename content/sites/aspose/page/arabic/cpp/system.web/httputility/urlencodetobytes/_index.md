---
title: "طريقة System::Web::HttpUtility::UrlEncodeToBytes"
linktitle: "UrlEncodeToBytes"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Web::HttpUtility::UrlEncodeToBytes. تقوم بترميز جزء URI في C++."
type: docs
weight: 600
url: /ar/cpp/system.web/httputility/urlencodetobytes/
---
## HttpUtility::UrlEncodeToBytes(const String\&) method


يُرمّز شظية URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | جزء URI للترميز. |

### ReturnValue

جزء URI المُرمّز.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


يُرمّز شظية URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | جزء URI للترميز. |
| e | const System::SharedPtr\<Text::Encoding\>\& | الترميز للاستخدام. |

### ReturnValue

جزء URI المُرمّز.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


يُرمّز شظية URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI للترميز. |

### ReturnValue

جزء URI المُرمّز.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يُرمّز شظية URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI للترميز. |
| الإزاحة | int32_t | الإزاحة في مصفوفة البايتات المعطاة. |
| count | int32_t | عدد البايتات للقراءة من. |

### ReturnValue

جزء URI المُرمّز.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
