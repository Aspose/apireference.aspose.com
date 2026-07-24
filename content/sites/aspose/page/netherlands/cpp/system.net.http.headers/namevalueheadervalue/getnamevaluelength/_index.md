---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength method"
linktitle: "GetNameValueLength"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength method. Converteert een opgegeven tekenreeks vanaf de gespecificeerde index naar een instantie van de NameValueHeaderValue‑klasse in C++."
type: docs
weight: 900
url: /nl/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


Converteert een opgegeven tekenreeks vanaf de gespecificeerde index naar een instantie van de [NameValueHeaderValue](../)‑klasse.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | String | Een tekenreeks om te parseren. |
| startIndex | int32_t | Een startpositie voor het parseren. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | Een functie die wordt gebruikt om nieuwe instanties van de [NameValueHeaderValue](../)‑klasse te maken. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Een instantie waar een geparseerd object aan wordt toegewezen. |

### ReturnValue

Retourneert de lengte van een geparseerde subtekenreeks, anders 0.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


Converteert een opgegeven tekenreeks vanaf de gespecificeerde index naar een instantie van de [NameValueHeaderValue](../)‑klasse.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | String | Een tekenreeks om te parseren. |
| startIndex | int32_t | Een startpositie voor het parseren. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Een instantie waar een geparseerd object aan wordt toegewezen. |

### ReturnValue

Retourneert de lengte van een geparseerde subtekenreeks, anders 0.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
