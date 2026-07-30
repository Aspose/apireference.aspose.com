---
title: "System::Web::HttpUtility::UrlDecodeToBytes طريقة"
linktitle: "UrlDecodeToBytes"
second_title: "Aspose.Font لـ C++"
description: "System::Web::HttpUtility::UrlDecodeToBytes طريقة. يقوم بفك ترميز جزء URI من سلسلة بايتات في C++."
type: docs
weight: 400
url: /ar/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


يفك تشفير جزء URI من سلسلة البايتات.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | جزء URI مُرمّز. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


يفك ترميز مقطع URI من سلسلة.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | جزء URI مُرمّز. |
| e | const System::SharedPtr\<Text::Encoding\>\& | الترميز للاستخدام. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


يفك تشفير جزء URI من مصفوفة البايتات.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI مُرمّز. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يفك تشفير جزء URI من مصفوفة البايتات.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | const System::ArrayPtr\<uint8_t\>\& | جزء URI مُرمّز. |
| إزاحة | int32_t | الإزاحة في مصفوفة البايتات المعطاة. |
| count | int32_t | عدد البايتات للقراءة من. |

### ReturnValue

جزء URI المفكك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
