---
title: "System::Guid::Guid κατασκευαστής"
linktitle: "Guid"
second_title: "Aspose.Page για C++"
description: "Κατασκευαστής System::Guid::Guid. Δημιουργεί ένα αντικείμενο που αντιπροσωπεύει ένα GUID που αποτελείται εξ ολοκλήρου από μηδενικά σε C++."
type: docs
weight: 100
url: /el/cpp/system/guid/guid/
---
## Guid::Guid() constructor


Δημιουργεί ένα αντικείμενο που αντιπροσωπεύει ένα GUID που αποτελείται εξ ολοκλήρου από μηδενικά.

```cpp
System::Guid::Guid()
```

## Δείτε επίσης

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


Δημιουργεί ένα αντικείμενο που αντιπροσωπεύει ένα GUID που ορίζεται ως ένας πίνακας ακεραίων 8-bit χωρίς πρόσημο.

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | Ένας πίνακας byte που περιέχει ξεχωριστά byte του GUID |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const Guid\&) constructor


Δημιουργεί ένα αντικείμενο που αντιπροσωπεύει το ίδιο GUID με το καθορισμένο αντικείμενο.

```cpp
System::Guid::Guid(const Guid &guid)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| guid | const Guid\& | Το αντικείμενο [Guid](../) από το οποίο θα αντιγραφεί η τιμή GUID |

## Δείτε επίσης

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const String\&) constructor


Δημιουργεί ένα αντικείμενο που αντιπροσωπεύει ένα GUID που ορίζεται ως συμβολοσειρά.

```cpp
System::Guid::Guid(const String &g)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| g | const String\& | Η αναπαράσταση σε συμβολοσειρά ενός GUID που θα αναπαρασταθεί από το αντικείμενο που κατασκευάζεται |

## Δείτε επίσης

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


Δημιουργεί ένα αντικείμενο που αντιπροσωπεύει ένα GUID που ορίζεται ως προβολή πίνακα ακεραίων 8-bit χωρίς πρόσημο.

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | Ένας πίνακας byte που περιέχει ξεχωριστά byte του GUID |

## Δείτε επίσης

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


Δημιουργεί μια παρουσία της κλάσης [Guid](../) από τα καθορισμένα στοιχεία του GUID.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | int32_t | Bits 0-31 του GUID |
| b | int16_t | Bits 32-47 του GUID |
| c | int16_t | Bits 48-63 του GUID |
| d | const ArrayPtr\<uint8_t\>\& | Ένας πίνακας byte που περιέχει τα bits 64-127 του GUID |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


Δημιουργεί μια παρουσία της κλάσης [Guid](../) από τα καθορισμένα στοιχεία του GUID.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | int32_t | Bits 0-31 του GUID |
| b | int16_t | Bits 32-47 του GUID |
| c | int16_t | Bits 48-63 του GUID |
| d | const System::Details::ArrayView\<uint8_t\>\& | Μια προβολή πίνακα byte που περιέχει τα bits 64-127 του GUID |

## Δείτε επίσης

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


Δημιουργεί μια παρουσία της κλάσης [Guid](../) από τα καθορισμένα ακέραια χωρίς πρόσημο και byte.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | int32_t | Bits 0-31 του GUID |
| b | int16_t | Bits 32-47 του GUID |
| c | int16_t | Bits 48-63 του GUID |
| d | uint8_t | Bits 64-71 του GUID |
| e | uint8_t | Bits 72-79 του GUID |
| f | uint8_t | Bits 80-87 του GUID |
| g | uint8_t | Bits 88-95 του GUID |
| h | uint8_t | Bits 96-103 του GUID |
| i | uint8_t | Bits 104-111 του GUID |
| j | uint8_t | Bits 112-119 του GUID |
| k | uint8_t | Bits 120-127 του GUID |

## Δείτε επίσης

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


Δημιουργεί μια παρουσία της κλάσης [Guid](../) από τα καθορισμένα ακέραια χωρίς πρόσημο και byte.

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | uint32_t | Bits 0-31 του GUID |
| b | uint16_t | Bits 32-47 του GUID |
| c | uint16_t | Bits 48-63 του GUID |
| d | uint8_t | Bits 64-71 του GUID |
| e | uint8_t | Bits 72-79 του GUID |
| f | uint8_t | Bits 80-87 του GUID |
| g | uint8_t | Bits 88-95 του GUID |
| h | uint8_t | Bits 96-103 του GUID |
| i | uint8_t | Bits 104-111 του GUID |
| j | uint8_t | Bits 112-119 του GUID |
| k | uint8_t | Bits 120-127 του GUID |

## Δείτε επίσης

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
