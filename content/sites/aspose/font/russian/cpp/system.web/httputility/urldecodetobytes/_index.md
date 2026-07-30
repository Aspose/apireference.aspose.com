---
title: "System::Web::HttpUtility::UrlDecodeToBytes метод"
linktitle: "UrlDecodeToBytes"
second_title: "Aspose.Font для C++"
description: "System::Web::HttpUtility::UrlDecodeToBytes метод. Декодирует фрагмент URI из строки байтов в C++."
type: docs
weight: 400
url: /ru/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


Декодирует фрагмент URI из строки байтов.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | Закодированный фрагмент URI. |

### ReturnValue

Декодированный фрагмент URI.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


Декодирует фрагмент URI из строки.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | Закодированный фрагмент URI. |
| e | const System::SharedPtr\<Text::Encoding\>\& | Кодировка для использования. |

### ReturnValue

Декодированный фрагмент URI.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


Декодирует фрагмент URI из массива байтов.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | const System::ArrayPtr\<uint8_t\>\& | Закодированный фрагмент URI. |

### ReturnValue

Декодированный фрагмент URI.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Декодирует фрагмент URI из массива байтов.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | const System::ArrayPtr\<uint8_t\>\& | Закодированный фрагмент URI. |
| смещение | int32_t | Смещение в данном массиве байтов. |
| count | int32_t | Количество байтов для чтения. |

### ReturnValue

Декодированный фрагмент URI.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
