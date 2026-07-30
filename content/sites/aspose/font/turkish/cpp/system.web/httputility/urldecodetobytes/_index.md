---
title: "System::Web::HttpUtility::UrlDecodeToBytes yöntemi"
linktitle: "UrlDecodeToBytes"
second_title: "Aspose.Font için C++"
description: "System::Web::HttpUtility::UrlDecodeToBytes yöntemi. C++'da bayt dizesinden URI parçacığını çözer."
type: docs
weight: 400
url: /tr/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


Bayt dizesinden URI fragmentini çözer.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Kodlanmış URI parçacığı. |

### ReturnValue

Çözülmüş URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


Bir dizeden URI fragmentini çözer.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Kodlanmış URI parçacığı. |
| e | const System::SharedPtr\<Text::Encoding\>\& | Kullanılacak kodlama. |

### ReturnValue

Çözülmüş URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


Bayt dizisinden URI fragmentini çözer.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | const System::ArrayPtr\<uint8_t\>\& | Kodlanmış URI parçacığı. |

### ReturnValue

Çözülmüş URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Bayt dizisinden URI fragmentini çözer.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | const System::ArrayPtr\<uint8_t\>\& | Kodlanmış URI parçacığı. |
| offset | int32_t | Verilen bayt dizisindeki offset. |
| count | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Çözülmüş URI parçacığı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
