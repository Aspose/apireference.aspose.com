---
title: "System::Xml::Schema::XmlTypeCode enum"
linktitle: "XmlTypeCode"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlTypeCode enum. Αναπαριστά τους τύπους σχήματος της γλώσσας ορισμού XML Schema (XSD) του W3C σε C++."
type: docs
weight: 8200
url: /el/cpp/system.xml.schema/xmltypecode/
---
## XmlTypeCode enum


Αναπαριστά τους τύπους σχήματος της γλώσσας ορισμού W3C XML [Schema](../) (XSD).

```cpp
enum class XmlTypeCode
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Δεν υπάρχουν πληροφορίες τύπου. |
| Item | 1 | Ένα στοιχείο όπως ένας κόμβος ή μια ατομική τιμή. |
| Node | 2 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| Document | 3 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| Element | 4 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| Attribute | 5 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| Χώρος ονομάτων | 6 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| ProcessingInstruction | 7 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| Comment | 8 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| Text | 9 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| AnyAtomicType | 10 | Οποιαδήποτε ατομική τιμή μιας ένωσης. |
| UntypedAtomic | 11 | Μια ατομική τιμή χωρίς τύπο. |
| String | 12 | Ένας W3C XML [Schema](../)**xs:string** τύπος. |
| Boolean | 13 | Ένας W3C XML [Schema](../)**xs:boolean** τύπος. |
| Decimal | 14 | Ένας W3C XML [Schema](../)**xs:decimal** τύπος. |
| Float | 15 | Ένας W3C XML [Schema](../)**xs:float** τύπος. |
| Double | 16 | Ένας W3C XML [Schema](../)**xs:double** τύπος. |
| Duration | 17 | Ένας W3C XML [Schema](../)**xs:Duration** τύπος. |
| DateTime | 18 | Ένας W3C XML [Schema](../)**xs:dateTime** τύπος. |
| Time | 19 | Ένας W3C XML [Schema](../)**xs:time** τύπος. |
| Date | 20 | Ένας W3C XML [Schema](../)**xs:date** τύπος. |
| GYearMonth | 21 | Ένας W3C XML [Schema](../)**xs:gYearMonth** τύπος. |
| GYear | 22 | Ένας W3C XML [Schema](../)**xs:gYear** τύπος. |
| GMonthDay | 23 | Ένας W3C XML [Schema](../)**xs:gMonthDay** τύπος. |
| GDay | 24 | Ένας W3C XML [Schema](../)**xs:gDay** τύπος. |
| GMonth | 25 | Ένας W3C XML [Schema](../)**xs:gMonth** τύπος. |
| HexBinary | 26 | Ένας W3C XML [Schema](../)**xs:hexBinary** τύπος. |
| Base64Binary | 27 | Ένας W3C XML [Schema](../)**xs:base64Binary** τύπος. |
| AnyUri | 28 | Ένας W3C XML [Schema](../)**xs:anyURI** τύπος. |
| QName | 29 | Ένας W3C XML [Schema](../)**xs:QName** τύπος. |
| Notation | 30 | Ένας W3C XML [Schema](../)**xs:NOTATION** τύπος. |
| NormalizedString | 31 | Ένας W3C XML [Schema](../)**xs:normalizedString** τύπος. |
| Token | 32 | Ένας W3C XML [Schema](../)**xs:token** τύπος. |
| Language | 33 | Ένας W3C XML [Schema](../)**xs:language** τύπος. |
| NmToken | 34 | Ένας W3C XML [Schema](../)**xs:NMTOKEN** τύπος. |
| Name | 35 | Ένας W3C XML [Schema](../)**xs:Name** τύπος. |
| NCName | 36 | Ένας W3C XML [Schema](../)**xs:NCName** τύπος. |
| Id | 37 | Ένας W3C XML [Schema](../)**xs:ID** τύπος. |
| Idref | 38 | Ένας W3C XML [Schema](../)**xs:IDREF** τύπος. |
| Entity | 39 | Ένας W3C XML [Schema](../)**xs:ENTITY** τύπος. |
| Integer | 40 | Ένας W3C XML [Schema](../)**xs:integer** τύπος. |
| NonPositiveInteger | 41 | Ένας W3C XML [Schema](../)**xs:nonPositiveInteger** τύπος. |
| NegativeInteger | 42 | Ένας W3C XML [Schema](../)**xs:negativeInteger** τύπος. |
| Long | 43 | Ένας W3C XML [Schema](../)**xs:long** τύπος. |
| Int | 44 | Ένας W3C XML [Schema](../)**xs:int** τύπος. |
| Short | 45 | Ένας W3C XML [Schema](../)**xs:short** τύπος. |
| Byte | 46 | Ένας W3C XML [Schema](../)**xs:byte** τύπος. |
| NonNegativeInteger | 47 | Ένας W3C XML [Schema](../)**xs:nonNegativeInteger** τύπος. |
| UnsignedLong | 48 | Ένας W3C XML [Schema](../)**xs:unsignedLong** τύπος. |
| UnsignedInt | 49 | Ένας W3C XML [Schema](../)**xs:unsignedInt** τύπος. |
| UnsignedShort | 50 | Ένας τύπος **xs:unsignedShort** του W3C XML [Schema](../). |
| UnsignedByte | 51 | Ένας τύπος **xs:unsignedByte** του W3C XML [Schema](../). |
| PositiveInteger | 52 | Ένας τύπος **xs:positiveInteger** του W3C XML [Schema](../). |
| YearMonthDuration | 53 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |
| DayTimeDuration | 54 | Αυτή η τιμή χρησιμοποιείται για εσωτερικούς σκοπούς και δεν προορίζεται να χρησιμοποιηθεί άμεσα από τον κώδικά σας. |

## Δείτε επίσης

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
