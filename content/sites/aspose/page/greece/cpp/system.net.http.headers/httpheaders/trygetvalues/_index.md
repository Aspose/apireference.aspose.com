---
title: "System::Net::Http::Headers::HttpHeaders::TryGetValues μέθοδος"
linktitle: "TryGetValues"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::HttpHeaders::TryGetValues μέθοδος. Προσπαθεί να λάβει τις αντίστοιχες τιμές με το καθορισμένο όνομα σε C++."
type: docs
weight: 1900
url: /el/cpp/system.net.http.headers/httpheaders/trygetvalues/
---
## HttpHeaders::TryGetValues method


Προσπαθεί να λάβει τις αντίστοιχες τιμές με το συγκεκριμένο όνομα.

```cpp
bool System::Net::Http::Headers::HttpHeaders::TryGetValues(String name, System::SharedPtr<Collections::Generic::IEnumerable<String>> &values)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το όνομα της κεφαλίδας. |
| values | System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Μια περίπτωση όπου θα εκχωρηθούν οι αντίστοιχες τιμές. |

### ReturnValue

Αληθές όταν οι τιμές της κεφαλίδας βρεθούν με το καθορισμένο όνομα, διαφορετικά ψευδές.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
