---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength-Methode"
linktitle: "GetNameValueLength"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength-Methode. Konvertiert eine übergebene Zeichenkette ab dem angegebenen Index in eine Instanz der NameValueHeaderValue‑Klasse in C++."
type: docs
weight: 900
url: /de/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


Konvertiert eine übergebene Zeichenkette ab dem angegebenen Index in eine Instanz der [NameValueHeaderValue](../)-Klasse.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | String | Ein zu parsender String. |
| startIndex | int32_t | Eine Startposition für das Parsen. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | Eine Funktion, die verwendet wird, um neue Instanzen der [NameValueHeaderValue](../)-Klasse zu erstellen. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Eine Instanz, in der ein geparstes Objekt zugewiesen wird. |

### ReturnValue

Gibt die Länge eines geparsten Teilstrings zurück, andernfalls 0.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


Konvertiert eine übergebene Zeichenkette ab dem angegebenen Index in eine Instanz der [NameValueHeaderValue](../)-Klasse.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | String | Ein zu parsender String. |
| startIndex | int32_t | Eine Startposition für das Parsen. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Eine Instanz, in der ein geparstes Objekt zugewiesen wird. |

### ReturnValue

Gibt die Länge eines geparsten Teilstrings zurück, andernfalls 0.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
