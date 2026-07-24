---
title: "System::MakeObject method"
linktitle: "MakeObject"
second_title: "Aspose.Page για C++"
description: "System::MakeObject method. Δημιουργεί αντικείμενο στη σωρό και επιστρέφει κοινό δείκτη σε αυτό σε C++."
type: docs
weight: 24500
url: /el/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Δημιουργεί αντικείμενο στη σωρό και επιστρέφει κοινό δείκτη σε αυτό.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Κλάση για δημιουργία. |
| Παράμετροι | Τύποι των ορισμάτων του κατασκευαστή. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| args | Args\&&... | Ορίσματα κατασκευής. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


Δημιουργεί αντικείμενο στη σωρό και επιστρέφει κοινό δείκτη σε αυτό.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | [SmartPtr](../smartptr/) σε κλάση για δημιουργία. |
| Παράμετροι | Τύποι των ορισμάτων του κατασκευαστή. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| args | Args\&&... | Ορίσματα κατασκευής. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
