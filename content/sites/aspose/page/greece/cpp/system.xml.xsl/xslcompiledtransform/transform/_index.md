---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform method. Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν XmlWriter σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε μια ροή. Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα ορίσματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| αποτελέσματα | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν TextWriter. Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα ορίσματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| αποτελέσματα | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/). Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα ορίσματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/). Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα ορίσματα χρόνου εκτέλεσης και ο [XmlResolver](../../../system.xml/xmlresolver/) επιλύει τη συνάρτηση XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Το έγγραφο προς μετατροπή που καθορίζεται από το αντικείμενο IXPathNavigable. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Λίστα ορισμάτων ως [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Το [XmlReader](../../../system.xml/xmlreader/) που περιέχει το έγγραφο εισόδου. |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε ροή. Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ένα [XmlReader](../../../system.xml/xmlreader/) που περιέχει το έγγραφο εισόδου. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| αποτελέσματα | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν TextWriter. Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ένα [XmlReader](../../../system.xml/xmlreader/) που περιέχει το έγγραφο εισόδου. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| αποτελέσματα | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/). Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ένα [XmlReader](../../../system.xml/xmlreader/) που περιέχει το έγγραφο εισόδου. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/). Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης και το [XmlResolver](../../../system.xml/xmlresolver/) επιλύει τη συνάρτηση XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ένα [XmlReader](../../../system.xml/xmlreader/) που περιέχει το έγγραφο εισόδου. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI του εγγράφου εισόδου. |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε ροή. Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI του εγγράφου εισόδου. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| αποτελέσματα | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να εξάγετε. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε έναν TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI του εγγράφου εισόδου. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| αποτελέσματα | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να εξάγετε. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../../system.xml/xmlwriter/). Η [XsltArgumentList](../../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI του εγγράφου εισόδου. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδο στη μετατροπή. Αυτή η τιμή μπορεί να είναι **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. Εάν το φύλλο στυλ περιέχει στοιχείο **xsl:output**, θα πρέπει να δημιουργήσετε τον [XmlWriter](../../../system.xml/xmlwriter/) χρησιμοποιώντας το αντικείμενο [XmlWriterSettings](../../../system.xml/xmlwritersettings/) που επιστρέφεται από την τιμή [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) . Αυτό εξασφαλίζει ότι ο [XmlWriter](../../../system.xml/xmlwriter/) έχει τις σωστές ρυθμίσεις εξόδου. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε ένα αρχείο.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputUri | const String\& | Το URI του εγγράφου εισόδου. |
| resultsFile | const String\& | Το URI του αρχείου εξόδου. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
