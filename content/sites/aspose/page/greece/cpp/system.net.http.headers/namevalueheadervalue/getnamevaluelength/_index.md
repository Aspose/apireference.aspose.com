---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength μέθοδος"
linktitle: "GetNameValueLength"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength μέθοδος. Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε ένα αντικείμενο της κλάσης NameValueHeaderValue σε C++."
type: docs
weight: 900
url: /el/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | String | Μια συμβολοσειρά για ανάλυση. |
| startIndex | int32_t | Μια θέση έναρξης για ανάλυση. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | Μια συνάρτηση που χρησιμοποιείται για τη δημιουργία νέων παρουσιών της κλάσης [NameValueHeaderValue](../). |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Μια παρουσία όπου θα εκχωρηθεί ένα αναλυμένο αντικείμενο. |

### ReturnValue

Επιστρέφει το μήκος μιας αναλυμένης υποσυμβολοσειράς, διαφορετικά 0.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | String | Μια συμβολοσειρά για ανάλυση. |
| startIndex | int32_t | Μια θέση έναρξης για ανάλυση. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Μια παρουσία όπου θα εκχωρηθεί ένα αναλυμένο αντικείμενο. |

### ReturnValue

Επιστρέφει το μήκος μιας αναλυμένης υποσυμβολοσειράς, διαφορετικά 0.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
