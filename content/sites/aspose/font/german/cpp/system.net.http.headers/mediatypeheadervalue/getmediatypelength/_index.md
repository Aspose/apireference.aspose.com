---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength Methode"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength Methode. Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der MediaTypeHeaderValue‑Klasse in C++."
type: docs
weight: 1000
url: /de/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [MediaTypeHeaderValue](../)-Klasse.

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | String | Ein zu parsender String. |
| startIndex | int32_t | Eine Startposition für das Parsen. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | Der Delegat, der verwendet wird, um Instanzen der [MediaTypeHeaderValue](../)-Klasse zu erstellen. |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | Eine Instanz, in der ein geparstes Objekt zugewiesen wird. |

### ReturnValue

Gibt die Länge eines geparsten Teilstrings zurück, andernfalls 0.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
