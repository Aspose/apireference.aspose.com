---
title: "Méthode System::Web::HttpUtility::UrlEncodeToBytes"
linktitle: "UrlEncodeToBytes"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Web::HttpUtility::UrlEncodeToBytes. Encode le fragment URI en C++."
type: docs
weight: 600
url: /fr/cpp/system.web/httputility/urlencodetobytes/
---
## HttpUtility::UrlEncodeToBytes(const String\&) method


Encode le fragment URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | Fragment URI à encoder. |

### ReturnValue

Fragment URI encodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


Encode le fragment URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | Fragment URI à encoder. |
| e | const System::SharedPtr\<Text::Encoding\>\& | Encodage à utiliser. |

### ReturnValue

Fragment URI encodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


Encode le fragment URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const System::ArrayPtr\<uint8_t\>\& | Fragment URI à encoder. |

### ReturnValue

Fragment URI encodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Encode le fragment URI.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const System::ArrayPtr\<uint8_t\>\& | Fragment URI à encoder. |
| décalage | int32_t | Décalage dans le tableau d'octets fourni. |
| count | int32_t | Nombre d'octets à lire. |

### ReturnValue

Fragment URI encodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
