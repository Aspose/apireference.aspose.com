---
title: "System::Web::HttpUtility::UrlDecode méthode"
linktitle: "UrlDecode"
second_title: "Aspose.Font pour C++"
description: "System::Web::HttpUtility::UrlDecode méthode. Décode le fragment d'URI à partir d'un tableau d'octets en C++."
type: docs
weight: 300
url: /fr/cpp/system.web/httputility/urldecode/
---
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) method


Décode le fragment URI à partir d'un tableau d'octets.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, const System::SharedPtr<Text::Encoding> &e)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const System::ArrayPtr\<uint8_t\>\& | Fragment URI encodé. |
| e | const System::SharedPtr\<Text::Encoding\>\& | Encodage à utiliser. |

### ReturnValue

Fragment d'URI décodé.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) method


Décode le fragment URI à partir d'un tableau d'octets.

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count, const System::SharedPtr<Text::Encoding> &e)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const System::ArrayPtr\<uint8_t\>\& | Fragment URI encodé. |
| décalage | int32_t | Décalage dans le tableau d'octets fourni. |
| count | int32_t | Nombre d'octets à lire. |
| e | const System::SharedPtr\<Text::Encoding\>\& | Encodage à utiliser. |

### ReturnValue

Fragment d'URI décodé.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(String) method


Décode le fragment URI à partir d'une chaîne.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | String | Fragment URI encodé. |

### ReturnValue

Fragment d'URI décodé.

## Voir aussi

* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(String, System::SharedPtr\<Text::Encoding\>) method


Décode le fragment URI à partir d'une chaîne.

```cpp
static String System::Web::HttpUtility::UrlDecode(String str, System::SharedPtr<Text::Encoding> e)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | String | Fragment URI encodé. |
| e | System::SharedPtr\<Text::Encoding\> | Encodage à utiliser. |

### ReturnValue

Fragment d'URI décodé.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
