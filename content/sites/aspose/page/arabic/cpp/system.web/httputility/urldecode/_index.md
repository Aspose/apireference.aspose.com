---
title: "طريقة System::Web::HttpUtility::UrlDecode"
linktitle: "UrlDecode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Web::HttpUtility::UrlDecode. تقوم بفك ترميز جزء URI من مصفوفة بايتات في C++."
type: docs
weight: 300
url: /ar/cpp/system.web/httputility/urldecode/
---
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) method


يفكّ ترميز شظية URI من مصفوفة بايت.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, const System::SharedPtr<Text::Encoding> &e)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI المُرمّز. |
| e | const System::SharedPtr\<Text::Encoding\>\& | الترميز للاستخدام. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) method


يفكّ ترميز شظية URI من مصفوفة بايت.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count, const System::SharedPtr<Text::Encoding> &e)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI المُرمّز. |
| الإزاحة | int32_t | الإزاحة في مصفوفة البايتات المعطاة. |
| count | int32_t | عدد البايتات للقراءة من. |
| e | const System::SharedPtr\<Text::Encoding\>\& | الترميز للاستخدام. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String) method


يفكّ ترميز شظية URI من سلسلة.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | String | جزء URI المُرمّز. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String, System::SharedPtr\<Text::Encoding\>) method


يفكّ ترميز شظية URI من سلسلة.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str, System::SharedPtr<Text::Encoding> e)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | String | جزء URI المُرمّز. |
| e | System::SharedPtr\<Text::Encoding\> | الترميز للاستخدام. |

### ReturnValue

جزء URI تم فك ترميزه.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
