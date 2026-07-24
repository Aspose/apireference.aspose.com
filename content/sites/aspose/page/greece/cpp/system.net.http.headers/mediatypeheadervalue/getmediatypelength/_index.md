---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength μέθοδος"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength μέθοδος. Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης MediaTypeHeaderValue σε C++."
type: docs
weight: 1000
url: /el/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [MediaTypeHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | String | Μια συμβολοσειρά για ανάλυση. |
| startIndex | int32_t | Μια θέση έναρξης για ανάλυση. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | Ο delegate που χρησιμοποιείται για τη δημιουργία παρουσιών της κλάσης [MediaTypeHeaderValue](../). |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | Μια παρουσία όπου θα εκχωρηθεί ένα αναλυμένο αντικείμενο. |

### ReturnValue

Επιστρέφει το μήκος μιας αναλυμένης υποσυμβολοσειράς, διαφορετικά 0.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
