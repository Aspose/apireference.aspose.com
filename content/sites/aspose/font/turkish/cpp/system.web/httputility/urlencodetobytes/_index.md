---
title: "System::Web::HttpUtility::UrlEncodeToBytes yöntemi"
linktitle: "UrlEncodeToBytes"
second_title: "Aspose.Font için C++"
description: "System::Web::HttpUtility::UrlEncodeToBytes yöntemi. C++'da URI parçacığını kodlar."
type: docs
weight: 600
url: /tr/cpp/system.web/httputility/urlencodetobytes/
---
## HttpUtility::UrlEncodeToBytes(const String\&) method


URI fragmentini kodlar.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Kodlanacak URI parçacığı. |

### ReturnValue

Kodlanmış URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


URI fragmentini kodlar.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Kodlanacak URI parçacığı. |
| e | const System::SharedPtr\<Text::Encoding\>\& | Kullanılacak kodlama. |

### ReturnValue

Kodlanmış URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


URI fragmentini kodlar.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | const System::ArrayPtr\<uint8_t\>\& | Kodlanacak URI parçacığı. |

### ReturnValue

Kodlanmış URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


URI fragmentini kodlar.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | const System::ArrayPtr\<uint8_t\>\& | Kodlanacak URI parçacığı. |
| offset | int32_t | Verilen bayt dizisindeki offset. |
| count | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Kodlanmış URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
