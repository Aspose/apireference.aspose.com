---
title: "System::Xml::Resolvers::XmlPreloadedResolver::Add μέθοδος"
linktitle: "Add"
second_title: "Aspose.Page για C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::Add μέθοδος. Προσθέτει έναν πίνακα byte στο αποθηκευτικό χώρο XmlPreloadedResolver και τον αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.resolvers/xmlpreloadedresolver/add/
---
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) method


Προσθέτει έναν πίνακα byte στο αποθηκευτικό χώρο [XmlPreloadedResolver](../) και τον αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Το URI των δεδομένων που προστίθενται στο αποθηκευτικό χώρο [XmlPreloadedResolver](../). |
| τιμή | const ArrayPtr\<uint8_t\>\& | Ένας πίνακας byte με τα δεδομένα που αντιστοιχούν στο παρεχόμενο URI. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Προσθέτει έναν πίνακα byte στο αποθηκευτικό χώρο [XmlPreloadedResolver](../) και τον αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value, int32_t offset, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Το URI των δεδομένων που προστίθενται στο αποθηκευτικό χώρο [XmlPreloadedResolver](../). |
| τιμή | const ArrayPtr\<uint8_t\>\& | Ένας πίνακας byte με τα δεδομένα που αντιστοιχούν στο παρεχόμενο URI. |
| offset | int32_t | Η μετατόπιση στον παρεχόμενο πίνακα byte όπου αρχίζουν τα δεδομένα. |
| count | int32_t | Ο αριθμός των byte που θα διαβαστούν από τον πίνακα byte, ξεκινώντας από τη δοθείσα μετατόπιση. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) method


Προσθέτει ένα Stream στο αποθηκευτικό χώρο [XmlPreloadedResolver](../) και το αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const SharedPtr<IO::Stream> &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Το URI των δεδομένων που προστίθενται στο αποθηκευτικό χώρο [XmlPreloadedResolver](../). |
| τιμή | const SharedPtr\<IO::Stream\>\& | Ένα Stream με τα δεδομένα που αντιστοιχούν στο παρεχόμενο URI. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const String\&) method


Προσθέτει μια συμβολοσειρά με προφορτωμένα δεδομένα στο αποθηκευτικό χώρο [XmlPreloadedResolver](../) και την αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const String &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Το URI των δεδομένων που προστίθενται στο αποθηκευτικό χώρο [XmlPreloadedResolver](../). |
| value | const String\& | Μια [String](../../../system/string/) με τα δεδομένα που αντιστοιχούν στο παρεχόμενο URI. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
