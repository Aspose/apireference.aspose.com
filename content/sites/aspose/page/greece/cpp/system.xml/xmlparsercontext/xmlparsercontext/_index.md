---
title: "Κατασκευαστής System::Xml::XmlParserContext::XmlParserContext"
linktitle: "XmlParserContext"
second_title: "Aspose.Page για C++"
description: "Κατασκευαστής System::Xml::XmlParserContext::XmlParserContext. Αρχικοποιεί μια νέα παρουσία της κλάσης XmlParserContext με τα καθορισμένα XmlNameTable, XmlNamespaceManager, βασικό URI, xml:lang, xml:space και τιμές τύπου εγγράφου σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlParserContext](../) με τα καθορισμένα [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), βασικό URI, **xml:lang**, **xml:space** και τιμές τύπου εγγράφου.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Το [XmlNameTable](../../xmlnametable/) που θα χρησιμοποιηθεί για την ατομική επεξεργασία συμβολοσειρών. Εάν είναι **nullptr**, χρησιμοποιείται ο πίνακας ονομάτων που χρησιμοποιήθηκε για τη δημιουργία του **nsMgr**. Για περισσότερες πληροφορίες σχετικά με τις ατομικές συμβολοσειρές, δείτε το [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Το [XmlNamespaceManager](../../xmlnamespacemanager/) που θα χρησιμοποιηθεί για την αναζήτηση πληροφοριών χώρου ονομάτων, ή **nullptr**. |
| docTypeName | const String\& | Το όνομα της δήλωσης τύπου εγγράφου. |
| pubId | const String\& | Ο δημόσιος αναγνωριστής. |
| sysId | const String\& | Το αναγνωριστικό συστήματος. |
| internalSubset | const String\& | Το εσωτερικό υποσύνολο DTD. Το υποσύνολο DTD χρησιμοποιείται για την επίλυση οντοτήτων, όχι για την επικύρωση εγγράφου. |
| baseURI | const String\& | Το βασικό URI για το τμήμα XML (η θέση από την οποία φορτώθηκε το τμήμα). |
| xmlLang | const String\& | Το πεδίο **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Μια τιμή [XmlSpace](../../xmlspace/) που υποδεικνύει το πεδίο **xml:space**. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlParserContext](../) με τον καθορισμένο [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), βασικό URI, **xml:lang**, **xml:space**, κωδικοποίηση και τιμές τύπου εγγράφου.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Το [XmlNameTable](../../xmlnametable/) που θα χρησιμοποιηθεί για την ατομική επεξεργασία συμβολοσειρών. Εάν είναι **nullptr**, χρησιμοποιείται ο πίνακας ονομάτων που χρησιμοποιήθηκε για τη δημιουργία του **nsMgr**. Για περισσότερες πληροφορίες σχετικά με τις ατομικές συμβολοσειρές, δείτε το [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Το [XmlNamespaceManager](../../xmlnamespacemanager/) που θα χρησιμοποιηθεί για την αναζήτηση πληροφοριών χώρου ονομάτων, ή **nullptr**. |
| docTypeName | const String\& | Το όνομα της δήλωσης τύπου εγγράφου. |
| pubId | const String\& | Ο δημόσιος αναγνωριστής. |
| sysId | const String\& | Το αναγνωριστικό συστήματος. |
| internalSubset | const String\& | Το εσωτερικό υποσύνολο DTD. Το DTD χρησιμοποιείται για την επίλυση οντοτήτων, όχι για την επικύρωση εγγράφου. |
| baseURI | const String\& | Το βασικό URI για το τμήμα XML (η θέση από την οποία φορτώθηκε το τμήμα). |
| xmlLang | const String\& | Το πεδίο **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Μια τιμή [XmlSpace](../../xmlspace/) που υποδεικνύει το πεδίο **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Ένα αντικείμενο Encoding που υποδεικνύει τη ρύθμιση κωδικοποίησης. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlParserContext](../) με τον καθορισμένο [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, και **xml:space** τιμές.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Το [XmlNameTable](../../xmlnametable/) που θα χρησιμοποιηθεί για την ατομική επεξεργασία συμβολοσειρών. Εάν είναι **nullptr**, χρησιμοποιείται ο πίνακας ονομάτων που χρησιμοποιήθηκε για τη δημιουργία του **nsMgr**. Για περισσότερες πληροφορίες σχετικά με τις ατομικές συμβολοσειρές, δείτε το [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Το [XmlNamespaceManager](../../xmlnamespacemanager/) που θα χρησιμοποιηθεί για την αναζήτηση πληροφοριών χώρου ονομάτων, ή **nullptr**. |
| xmlLang | const String\& | Το πεδίο **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Μια τιμή [XmlSpace](../../xmlspace/) που υποδεικνύει το πεδίο **xml:space**. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlParserContext](../) με τον καθορισμένο [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space**, και κωδικοποίηση.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Το [XmlNameTable](../../xmlnametable/) για χρήση στην ατομικοποίηση συμβολοσειρών. Εάν αυτό είναι **nullptr**, χρησιμοποιείται ο πίνακας ονομάτων που χρησιμοποιείται για την κατασκευή του **nsMgr**. Για περισσότερες πληροφορίες σχετικά με τις ατομικές συμβολοσειρές, δείτε το [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Το [XmlNamespaceManager](../../xmlnamespacemanager/) που θα χρησιμοποιηθεί για την αναζήτηση πληροφοριών χώρου ονομάτων, ή **nullptr**. |
| xmlLang | const String\& | Το πεδίο **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Μια τιμή [XmlSpace](../../xmlspace/) που υποδεικνύει το πεδίο **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Ένα αντικείμενο Encoding που υποδεικνύει τη ρύθμιση κωδικοποίησης. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
