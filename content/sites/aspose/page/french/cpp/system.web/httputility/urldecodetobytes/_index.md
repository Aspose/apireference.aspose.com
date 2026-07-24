---
title: "System::Web::HttpUtility::UrlDecodeToBytes méthode"
linktitle: "UrlDecodeToBytes"
second_title: "Aspose.Page pour C++"
description: "System::Web::HttpUtility::UrlDecodeToBytes méthode. Décode le fragment URI à partir d'une chaîne d'octets en C++."
type: docs
weight: 400
url: /fr/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


Décode le fragment URI à partir d'une chaîne d'octets.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | Fragment d'URI encodé. |

### ReturnValue

Fragment URI décodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


Décode le fragment URI à partir d'une chaîne.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | Fragment d'URI encodé. |
| e | const System::SharedPtr\<Text::Encoding\>\& | Encodage à utiliser. |

### ReturnValue

Fragment URI décodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


Décode le fragment URI à partir d'un tableau d'octets.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const System::ArrayPtr\<uint8_t\>\& | Fragment d'URI encodé. |

### ReturnValue

Fragment URI décodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Décode le fragment URI à partir d'un tableau d'octets.

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const System::ArrayPtr\<uint8_t\>\& | Fragment d'URI encodé. |
| offset | int32_t | Décalage dans le tableau d'octets donné. |
| count | int32_t | Nombre d'octets à lire. |

### ReturnValue

Fragment URI décodé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
