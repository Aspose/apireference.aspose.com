---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength methode"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength methode. Converteert een doorgegeven string vanaf de opgegeven index naar een instantie van de MediaTypeHeaderValue-klasse in C++."
type: docs
weight: 1000
url: /nl/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


Converteert een doorgegeven string vanaf de opgegeven index naar een instantie van de [MediaTypeHeaderValue](../)-klasse.

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | String | Een tekenreeks om te parseren. |
| startIndex | int32_t | Een startpositie voor het parseren. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | De delegate die wordt gebruikt om instanties van de [MediaTypeHeaderValue](../) klasse te maken. |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | Een instantie waar een geparseerd object aan wordt toegewezen. |

### ReturnValue

Retourneert de lengte van een geparseerde subtekenreeks, anders 0.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
