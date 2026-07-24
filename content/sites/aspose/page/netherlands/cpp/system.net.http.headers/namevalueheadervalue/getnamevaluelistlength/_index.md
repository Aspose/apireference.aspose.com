---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength method"
linktitle: "GetNameValueListLength"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength method. Converteert een opgegeven tekenreeks vanaf de gespecificeerde index naar de collectie van NameValueHeaderValue‑klasse‑instanties en retourneert de lengte van een geparseerde subtekenreeks in C++."
type: docs
weight: 1000
url: /nl/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


Converteert een meegegeven string vanaf de opgegeven index naar de collectie van NameValueHeaderValue‑klasse‑instanties en retourneert de lengte van de geparseerde sub‑string.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | String | Een tekenreeks om te analyseren. |
| startIndex | int32_t | Een startpositie voor analyse. |
| scheidingsteken | char16_t | Een tekenreeks die wordt gebruikt om items in de opgegeven tekenreeks te scheiden. |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | De uitvoerparameter waar een geparseerde collectie aan wordt toegewezen. |

### ReturnValue

De lengte van een geparseerde subreeks.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
