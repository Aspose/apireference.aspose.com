---
title: "Μέθοδος System::Xml::Schema::XmlSchemaCollection::Add"
linktitle: "Add"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::Schema::XmlSchemaCollection::Add. Προσθέτει το XmlSchema στη συλλογή σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


Προσθέτει το [XmlSchema](../../xmlschema/) στη συλλογή.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Το [XmlSchema](../../xmlschema/) που θα προστεθεί στη συλλογή. |

### ReturnValue

Το αντικείμενο [XmlSchema](../../xmlschema/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Προσθέτει το [XmlSchema](../../xmlschema/) στη συλλογή. Ο καθορισμένος [XmlResolver](../../../system.xml/xmlresolver/) χρησιμοποιείται για την επίλυση τυχόν εξωτερικών αναφορών.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Το [XmlSchema](../../xmlschema/) που θα προστεθεί στη συλλογή. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση των χώρων ονομάτων που αναφέρονται στα στοιχεία **include** και **import**. Εάν είναι **nullptr**, οι εξωτερικές αναφορές δεν επιλύονται. |

### ReturnValue

Το [XmlSchema](../../xmlschema/) που προστέθηκε στη συλλογή σχήματος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Προσθέτει όλους τους χώρους ονομάτων που ορίζονται στη δεδομένη συλλογή (συμπεριλαμβανομένων των σχετικών σχημάτων) σε αυτή τη συλλογή.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | Η [XmlSchemaCollection](../) που θέλετε να προσθέσετε σε αυτή τη συλλογή. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


Προσθέτει το σχήμα που περιέχεται στο [XmlReader](../../../system.xml/xmlreader/) στη συλλογή σχήματος.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ns | const String\& | Το URI του χώρου ονομάτων που σχετίζεται με το σχήμα. Για XML Schemas, αυτό συνήθως είναι το **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) που περιέχει το σχήμα προς προσθήκη. |

### ReturnValue

Το [XmlSchema](../../xmlschema/) που προστέθηκε στη συλλογή σχήματος· **nullptr** εάν το σχήμα που προστίθεται είναι σχήμα XDR ή εάν υπάρχουν σφάλματα μεταγλώττισης στο σχήμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Προσθέτει το σχήμα που περιέχεται στον [XmlReader](../../../system.xml/xmlreader/) στη συλλογή σχημάτων. Ο καθορισμένος [XmlResolver](../../../system.xml/xmlresolver/) χρησιμοποιείται για την επίλυση τυχόν εξωτερικών πόρων.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ns | const String\& | Το URI του χώρου ονομάτων που σχετίζεται με το σχήμα. Για XML Schemas, αυτό συνήθως είναι το **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) που περιέχει το σχήμα προς προσθήκη. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση ονομάτων χώρων που αναφέρονται σε στοιχεία **include** και **import** ή στην ιδιότητα **x-schema** (σχήματα XDR). Εάν αυτό είναι **nullptr**, οι εξωτερικές αναφορές δεν επιλύονται. |

### ReturnValue

Το [XmlSchema](../../xmlschema/) που προστέθηκε στη συλλογή σχήματος· **nullptr** εάν το σχήμα που προστίθεται είναι σχήμα XDR ή εάν υπάρχουν σφάλματα μεταγλώττισης στο σχήμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Προσθέτει το σχήμα που βρίσκεται στη δοθείσα διεύθυνση URL στη συλλογή σχήματος.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ns | const String\& | Το URI του χώρου ονομάτων που σχετίζεται με το σχήμα. Για XML Schemas, αυτό συνήθως είναι το **targetNamespace**. |
| uri | const String\& | Το URL που καθορίζει το σχήμα προς φόρτωση. |

### ReturnValue

Το [XmlSchema](../../xmlschema/) που προστέθηκε στη συλλογή σχήματος· **nullptr** εάν το σχήμα που προστίθεται είναι σχήμα XDR ή εάν υπάρχουν σφάλματα μεταγλώττισης στο σχήμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
