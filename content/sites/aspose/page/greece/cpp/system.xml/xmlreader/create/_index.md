---
title: "System::Xml::XmlReader::Create μέθοδος"
linktitle: "Δημιουργία"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::Create μέθοδος. Δημιουργεί μια νέα παρουσία XmlReader χρησιμοποιώντας το καθορισμένο ρεύμα με προεπιλεγμένες ρυθμίσεις σε C++."
type: docs
weight: 7700
url: /el/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Δημιουργεί μια νέα παρουσία [XmlReader](../) χρησιμοποιώντας το καθορισμένο ρεύμα με προεπιλεγμένες ρυθμίσεις.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Το ρεύμα που περιέχει τα δεδομένα XML. Ο [XmlReader](../) σαρώει τα πρώτα byte του ρεύματος αναζητώντας ένα byte order mark ή άλλο σημάδι κωδικοποίησης. Όταν καθοριστεί η κωδικοποίηση, αυτή χρησιμοποιείται για τη συνέχιση της ανάγνωσης του ρεύματος, και η επεξεργασία συνεχίζει την ανάλυση της εισόδου ως ρεύμα (Unicode) χαρακτήρων. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Δημιουργεί μια νέα παρουσία [XmlReader](../) με το καθορισμένο ρεύμα και τις ρυθμίσεις.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Το ρεύμα που περιέχει τα δεδομένα XML. Ο [XmlReader](../) σαρώει τα πρώτα byte του ρεύματος αναζητώντας ένα byte order mark ή άλλο σημάδι κωδικοποίησης. Όταν καθοριστεί η κωδικοποίηση, αυτή χρησιμοποιείται για τη συνέχιση της ανάγνωσης του ρεύματος, και η επεξεργασία συνεχίζει την ανάλυση της εισόδου ως ρεύμα (Unicode) χαρακτήρων. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Οι ρυθμίσεις για τη νέα παρουσία [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Δημιουργεί μια νέα παρουσία [XmlReader](../) χρησιμοποιώντας το καθορισμένο ρεύμα, τις ρυθμίσεις και τις πληροφορίες περιβάλλοντος για την ανάλυση.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Το ρεύμα που περιέχει τα δεδομένα XML. Ο [XmlReader](../) σαρώει τα πρώτα byte του ρεύματος αναζητώντας ένα byte order mark ή άλλο σημάδι κωδικοποίησης. Όταν καθοριστεί η κωδικοποίηση, αυτή χρησιμοποιείται για τη συνέχιση της ανάγνωσης του ρεύματος, και η επεξεργασία συνεχίζει την ανάλυση της εισόδου ως ρεύμα (Unicode) χαρακτήρων. |
| settings | SharedPtr\<XmlReaderSettings\> | Οι ρυθμίσεις για τη νέα παρουσία [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Οι πληροφορίες περιβάλλοντος που απαιτούνται για την ανάλυση του τμήματος XML. Οι πληροφορίες περιβάλλοντος μπορούν να περιλαμβάνουν το [XmlNameTable](../../xmlnametable/) που θα χρησιμοποιηθεί, κωδικοποίηση, πεδίο ονοματοχώρου, το τρέχον πεδίο **xml:lang** και **xml:space**, το βασικό URI και τον ορισμό τύπου εγγράφου. Αυτή η τιμή μπορεί να είναι **nullptr**. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Δημιουργεί μια νέα παρουσία [XmlReader](../) χρησιμοποιώντας το καθορισμένο ρεύμα, το βασικό URI και τις ρυθμίσεις.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Το ρεύμα που περιέχει τα δεδομένα XML. Ο [XmlReader](../) σαρώει τα πρώτα byte του ρεύματος αναζητώντας ένα byte order mark ή άλλο σημάδι κωδικοποίησης. Όταν καθοριστεί η κωδικοποίηση, αυτή χρησιμοποιείται για τη συνέχιση της ανάγνωσης του ρεύματος, και η επεξεργασία συνεχίζει την ανάλυση της εισόδου ως ρεύμα (Unicode) χαρακτήρων. |
| settings | SharedPtr\<XmlReaderSettings\> | Οι ρυθμίσεις για τη νέα παρουσία [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |
| baseUri | const String\& | Το βασικό URI για την οντότητα ή το έγγραφο που διαβάζεται. Αυτή η τιμή μπορεί να είναι **nullptr**. **[Security](../../../system.security/) Σημείωση** Το βασικό URI χρησιμοποιείται για την επίλυση του σχετικού URI του εγγράφου XML. Μην χρησιμοποιείτε ένα βασικό URI από μη αξιόπιστη πηγή. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<IO::TextReader\>\& | Ο αναγνώστης κειμένου από τον οποίο διαβάζονται τα δεδομένα XML. Ένας αναγνώστης κειμένου επιστρέφει μια ροή χαρακτήρων Unicode, έτσι η κωδικοποίηση που καθορίζεται στη δήλωση XML δεν χρησιμοποιείται από τον αναγνώστη XML για την αποκωδικοποίηση της ροής δεδομένων. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου και τις ρυθμίσεις.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<IO::TextReader\>\& | Ο αναγνώστης κειμένου από τον οποίο διαβάζονται τα δεδομένα XML. Ένας αναγνώστης κειμένου επιστρέφει μια ροή χαρακτήρων Unicode, έτσι η κωδικοποίηση που καθορίζεται στη δήλωση XML δεν χρησιμοποιείται από τον αναγνώστη XML για την αποκωδικοποίηση της ροής δεδομένων. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Οι ρυθμίσεις για το νέο [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου, τις ρυθμίσεις και τις πληροφορίες πλαισίου για την ανάλυση.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<IO::TextReader\>\& | Ο αναγνώστης κειμένου από τον οποίο διαβάζονται τα δεδομένα XML. Ένας αναγνώστης κειμένου επιστρέφει μια ροή χαρακτήρων Unicode, έτσι η κωδικοποίηση που καθορίζεται στη δήλωση XML δεν χρησιμοποιείται από τον αναγνώστη XML για την αποκωδικοποίηση της ροής δεδομένων. |
| settings | SharedPtr\<XmlReaderSettings\> | Οι ρυθμίσεις για τη νέα παρουσία [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Οι πληροφορίες περιβάλλοντος που απαιτούνται για την ανάλυση του τμήματος XML. Οι πληροφορίες περιβάλλοντος μπορούν να περιλαμβάνουν το [XmlNameTable](../../xmlnametable/) που θα χρησιμοποιηθεί, κωδικοποίηση, πεδίο ονοματοχώρου, το τρέχον πεδίο **xml:lang** και **xml:space**, το βασικό URI και τον ορισμό τύπου εγγράφου. Αυτή η τιμή μπορεί να είναι **nullptr**. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου, τις ρυθμίσεις και το βασικό URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Ο αναγνώστης κειμένου από τον οποίο διαβάζονται τα δεδομένα XML. Ένας αναγνώστης κειμένου επιστρέφει μια ροή χαρακτήρων Unicode, έτσι η κωδικοποίηση που καθορίζεται στη δήλωση XML δεν χρησιμοποιείται από το [XmlReader](../) για την αποκωδικοποίηση της ροής δεδομένων. |
| settings | SharedPtr\<XmlReaderSettings\> | Οι ρυθμίσεις για τη νέα παρουσία [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |
| baseUri | const String\& | Το βασικό URI για την οντότητα ή το έγγραφο που διαβάζεται. Αυτή η τιμή μπορεί να είναι **nullptr**. **[Security](../../../system.security/) Σημείωση** Το βασικό URI χρησιμοποιείται για την επίλυση του σχετικού URI του εγγράφου XML. Μην χρησιμοποιείτε ένα βασικό URI από μη αξιόπιστη πηγή. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) χρησιμοποιώντας τον καθορισμένο αναγνώστη XML και τις ρυθμίσεις.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αναγνώστης | const SharedPtr\<XmlReader\>\& | Το αντικείμενο που θέλετε να χρησιμοποιήσετε ως τον υποκείμενο αναγνώστη XML. |
| settings | SharedPtr\<XmlReaderSettings\> | Οι ρυθμίσεις για το νέο αντικείμενο [XmlReader](../). Το επίπεδο συμμόρφωσης του αντικειμένου [XmlReaderSettings](../../xmlreadersettings/) πρέπει είτε να ταιριάζει με το επίπεδο συμμόρφωσης του υποκείμενου αναγνώστη, είτε να ορίζεται σε [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

Ένα αντικείμενο που περιβάλλεται γύρω από το καθορισμένο αντικείμενο [XmlReader](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) με το καθορισμένο URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI για το αρχείο που περιέχει τα δεδομένα XML. Η κλάση [XmlUrlResolver](../../xmlurlresolver/) χρησιμοποιείται για τη μετατροπή της διαδρομής σε μια κανονική αναπαράσταση δεδομένων. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) χρησιμοποιώντας το καθορισμένο URI και τις ρυθμίσεις.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI για το αρχείο που περιέχει τα δεδομένα XML. Το αντικείμενο [XmlResolver](../../xmlresolver/) στο αντικείμενο [XmlReaderSettings](../../xmlreadersettings/) χρησιμοποιείται για τη μετατροπή της διαδρομής σε μια κανονική αναπαράσταση δεδομένων. Εάν η τιμή XmlReaderSettings::get_XmlResolver είναι **nullptr**, χρησιμοποιείται ένα νέο αντικείμενο [XmlUrlResolver](../../xmlurlresolver/). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Οι ρυθμίσεις για τη νέα παρουσία [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Δημιουργεί ένα νέο αντικείμενο [XmlReader](../) χρησιμοποιώντας το καθορισμένο URI, τις ρυθμίσεις και τις πληροφορίες πλαισίου για την ανάλυση.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI για το αρχείο που περιέχει τα δεδομένα XML. Το αντικείμενο [XmlResolver](../../xmlresolver/) στο αντικείμενο [XmlReaderSettings](../../xmlreadersettings/) χρησιμοποιείται για τη μετατροπή της διαδρομής σε μια κανονική αναπαράσταση δεδομένων. Εάν η τιμή XmlReaderSettings::get_XmlResolver είναι **nullptr**, χρησιμοποιείται ένα νέο αντικείμενο [XmlUrlResolver](../../xmlurlresolver/). |
| settings | SharedPtr\<XmlReaderSettings\> | Οι ρυθμίσεις για τη νέα παρουσία [XmlReader](../). Αυτή η τιμή μπορεί να είναι **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Οι πληροφορίες περιβάλλοντος που απαιτούνται για την ανάλυση του τμήματος XML. Οι πληροφορίες περιβάλλοντος μπορούν να περιλαμβάνουν το [XmlNameTable](../../xmlnametable/) που θα χρησιμοποιηθεί, κωδικοποίηση, πεδίο ονοματοχώρου, το τρέχον πεδίο **xml:lang** και **xml:space**, το βασικό URI και τον ορισμό τύπου εγγράφου. Αυτή η τιμή μπορεί να είναι **nullptr**. |

### ReturnValue

Ένα αντικείμενο που χρησιμοποιείται για την ανάγνωση των δεδομένων XML στο ρεύμα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
