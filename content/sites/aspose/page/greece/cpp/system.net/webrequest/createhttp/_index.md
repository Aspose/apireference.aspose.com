---
title: "System::Net::WebRequest::CreateHttp μέθοδος"
linktitle: "CreateHttp"
second_title: "Aspose.Page για C++"
description: "System::Net::WebRequest::CreateHttp μέθοδος. Δημιουργεί ένα νέο στιγμιότυπο της κλάσης WebRequest χρησιμοποιώντας το καθορισμένο URI σε C++."
type: docs
weight: 300
url: /el/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Δημιουργεί μια νέα παρουσία της κλάσης [WebRequest](../) χρησιμοποιώντας το καθορισμένο URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| requestUriString | String | Το URI που χρησιμοποιείται για τη δημιουργία ενός νέου αντιγράφου της κλάσης [WebRequest](../). |

### ReturnValue

Μία νεοδημιουργημένη παρουσία της κλάσης WebRequest.
## Παρατηρήσεις



Θα εξαχθεί η εξαίρεση NotSupportedException όταν το καθορισμένο URI αρχίζει με οποιοδήποτε σχήμα εκτός από [http://](http://) ή [https://](https://).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Δημιουργεί μια νέα παρουσία της κλάσης [WebRequest](../) χρησιμοποιώντας το καθορισμένο URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | Το URI που χρησιμοποιείται για τη δημιουργία ενός νέου αντιγράφου της κλάσης [WebRequest](../). |

### ReturnValue

Μία νεοδημιουργημένη παρουσία της κλάσης WebRequest.
## Παρατηρήσεις



Θα εξαχθεί η εξαίρεση NotSupportedException όταν το καθορισμένο URI αρχίζει με οποιοδήποτε σχήμα εκτός από [http://](http://) ή [https://](https://).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
