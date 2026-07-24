---
title: "System::Net::WebRequest::RegisterPrefix μέθοδος"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page για C++"
description: "System::Net::WebRequest::RegisterPrefix μέθοδος. Καταχωρεί το παράγωγο του WebRequest για το καθορισμένο URI σε C++."
type: docs
weight: 600
url: /el/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Καταχωρεί το παράγωγο του [WebRequest](../) για το καθορισμένο URI.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πρόθεμα | String | Το URI ή το πρόθεμα URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Δημιουργεί νέες αντιγραφές της κλάσης [WebRequest](../). |

### ReturnValue

Αληθές όταν το παράγωγο του [WebRequest](../) καταχωρείται επιτυχώς για το καθορισμένο URI, διαφορετικά ψευδές.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
