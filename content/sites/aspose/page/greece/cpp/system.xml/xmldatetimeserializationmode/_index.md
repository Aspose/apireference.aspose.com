---
title: "System::Xml::XmlDateTimeSerializationMode απαρίθμηση"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. Καθορίζει πώς να αντιμετωπιστεί η τιμή χρόνου κατά τη μετατροπή μεταξύ συμβολοσειράς και DateTime σε C++."
type: docs
weight: 5800
url: /el/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Καθορίζει πώς να αντιμετωπιστεί η τιμή χρόνου κατά τη μετατροπή μεταξύ συμβολοσειράς και [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Local | 0 | Αντιμετωπίζεται ως τοπική ώρα. Εάν το αντικείμενο [DateTime](../../system/datetime/) αντιπροσωπεύει Συντονισμένο Παγκόσμιο Χρόνο (UTC), μετατρέπεται στην τοπική ώρα. |
| Utc | 1 | Αντιμετωπίζεται ως UTC. Εάν το αντικείμενο [DateTime](../../system/datetime/) αντιπροσωπεύει τοπική ώρα, μετατρέπεται σε UTC. |
| Unspecified | 2 | Αντιμετωπίζεται ως τοπική ώρα εάν ένα [DateTime](../../system/datetime/) μετατρέπεται σε συμβολοσειρά. Εάν μια συμβολοσειρά μετατρέπεται σε [DateTime](../../system/datetime/), μετατρέψτε την σε τοπική ώρα εάν έχει καθοριστεί ζώνη ώρας. |
| RoundtripKind | 3 | Οι πληροφορίες ζώνης ώρας πρέπει να διατηρούνται κατά τη μετατροπή. |

## Δείτε επίσης

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
