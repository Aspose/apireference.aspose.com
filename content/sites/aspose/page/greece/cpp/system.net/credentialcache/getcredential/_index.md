---
title: "System::Net::CredentialCache::GetCredential method"
linktitle: "GetCredential"
second_title: "Aspose.Page για C++"
description: "System::Net::CredentialCache::GetCredential method. Επιστρέφει διαπιστευτήρια για το καθορισμένο όνομα κεντρικού υπολογιστή, θύρα και τύπο πιστοποίησης σε C++."
type: docs
weight: 500
url: /el/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Επιστρέφει διαπιστευτήρια για το καθορισμένο όνομα κεντρικού υπολογιστή, θύρα και τύπο ελέγχου ταυτότητας.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| host | String | Το όνομα κεντρικού υπολογιστή με το οποίο σχετίζονται τα διαπιστευτήρια. |
| θύρα | int32_t | Ο αριθμός θύρας. |
| authenticationType | String | Ο τύπος ελέγχου ταυτότητας. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Επιστρέφει διαπιστευτήρια για το καθορισμένο πρόθεμα URI και τον τύπο πιστοποίησης.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Το πρόθεμα URI. |
| authenticationType | String | Ένας τύπος πιστοποίησης. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
