---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength-Methode"
linktitle: "GetNameValueListLength"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength-Methode. Konvertiert einen übergebenen String ab dem angegebenen Index in die Sammlung von NameValueHeaderValue-Instanzen und gibt die Länge eines geparsten Teilstrings in C++ zurück."
type: docs
weight: 1000
url: /de/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


Konvertiert einen übergebenen String ab dem angegebenen Index in die Sammlung von NameValueHeaderValue-Klasseninstanzen und gibt die Länge eines geparsten Teilstrings zurück.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | String | Ein zu analysierender String. |
| startIndex | int32_t | Eine Startposition für die Analyse. |
| Trennzeichen | char16_t | Ein String, der verwendet wird, um Elemente im angegebenen String zu trennen. |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | Der Ausgabeparameter, dem eine geparste Sammlung zugewiesen wird. |

### ReturnValue

Die Länge eines geparsten Teilstrings.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
