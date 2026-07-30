---
title: "System::Web::HttpUtility::UrlDecode طريقة"
linktitle: "UrlDecode"
second_title: "Aspose.Font لـ C++"
description: "System::Web::HttpUtility::UrlDecode طريقة. يقوم بفك ترميز جزء URI من مصفوفة بايتات في C++."
type: docs
weight: 300
url: /ar/cpp/system.web/httputility/urldecode/
---
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) method


يفك تشفير جزء URI من مصفوفة البايتات.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, const System::SharedPtr<Text::Encoding> &e)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI مُرمّز. |
| e | const System::SharedPtr\<Text::Encoding\>\& | الترميز للاستخدام. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) method


يفك تشفير جزء URI من مصفوفة البايتات.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count, const System::SharedPtr<Text::Encoding> &e)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI مُرمّز. |
| إزاحة | int32_t | الإزاحة في مصفوفة البايتات المعطاة. |
| count | int32_t | عدد البايتات للقراءة من. |
| e | const System::SharedPtr\<Text::Encoding\>\& | الترميز للاستخدام. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(String) method


يفك ترميز مقطع URI من سلسلة.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | String | جزء URI مُرمّز. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(String, System::SharedPtr\<Text::Encoding\>) method


يفك ترميز مقطع URI من سلسلة.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str, System::SharedPtr<Text::Encoding> e)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | String | جزء URI مُرمّز. |
| e | System::SharedPtr\<Text::Encoding\> | الترميز للاستخدام. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
