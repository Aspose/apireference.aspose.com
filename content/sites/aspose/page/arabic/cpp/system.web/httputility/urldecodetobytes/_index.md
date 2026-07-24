---
title: "طريقة System::Web::HttpUtility::UrlDecodeToBytes"
linktitle: "UrlDecodeToBytes"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Web::HttpUtility::UrlDecodeToBytes. تقوم بفك ترميز جزء URI من سلسلة بايتات في C++."
type: docs
weight: 400
url: /ar/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


يفكّ ترميز شظية URI من سلسلة بايت.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | جزء URI المُرمّز. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


يفكّ ترميز شظية URI من سلسلة.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | جزء URI المُرمّز. |
| e | const System::SharedPtr\<Text::Encoding\>\& | الترميز للاستخدام. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


يفكّ ترميز شظية URI من مصفوفة بايت.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI المُرمّز. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يفكّ ترميز شظية URI من مصفوفة بايت.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI المُرمّز. |
| الإزاحة | int32_t | الإزاحة في مصفوفة البايتات المعطاة. |
| count | int32_t | عدد البايتات للقراءة من. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
