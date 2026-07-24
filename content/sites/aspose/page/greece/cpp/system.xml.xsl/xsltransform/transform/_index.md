---
title: "System::Xml::Xsl::XslTransform::Transform μέθοδος"
linktitle: "Transform"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XslTransform::Transform μέθοδος. Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα args και εξάγει το αποτέλεσμα σε έναν XmlReader σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |

### ReturnValue

Ένας [XmlReader](../../../system.xml/xmlreader/) που περιέχει τα αποτελέσματα της μετατροπής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να εξάγετε. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση της μεθόδου [XslTransform::Transform](./). |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να εξάγετε. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

### ReturnValue

Ένας [XmlReader](../../../system.xml/xmlreader/) που περιέχει τα αποτελέσματα της μετατροπής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε έναν [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| output | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε έναν [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει τα δεδομένα προς μετασχηματισμό. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| output | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Μετατρέπει τα δεδομένα XML στο XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε έναν [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |

### ReturnValue

Ένας [XmlReader](../../../system.xml/xmlreader/) που περιέχει τα αποτελέσματα της μετατροπής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να εξάγετε. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| έξοδος | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να εξάγετε. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στο XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε έναν [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

### ReturnValue

Ένας [XmlReader](../../../system.xml/xmlreader/) που περιέχει τα αποτελέσματα της μετατροπής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Μετατρέπει τα δεδομένα XML στο XPathNavigator χρησιμοποιώντας τα καθορισμένα args και εξάγει το αποτέλεσμα σε έναν [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| output | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στο XPathNavigator χρησιμοποιώντας τα καθορισμένα args και εξάγει το αποτέλεσμα σε έναν [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένας XPathNavigator που περιέχει τα δεδομένα που θα μετατραπούν. |
| args | const SharedPtr\<XsltArgumentList\>\& | Μια [XsltArgumentList](../../xsltargumentlist/) που περιέχει τα ορίσματα με διακριτικό χώρο ονομάτων που χρησιμοποιούνται ως είσοδος στη μετατροπή. |
| output | const SharedPtr\<XmlWriter\>\& | Ο [XmlWriter](../../../system.xml/xmlwriter/) στον οποίο θέλετε να εξάγετε. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Μετατρέπει τα δεδομένα XML στο αρχείο εισόδου και εξάγει το αποτέλεσμα σε ένα αρχείο εξόδου.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputfile | const String\& | Το URL του πηγαίου εγγράφου που θα μετατραπεί. |
| outputfile | const String\& | Το URL του αρχείου εξόδου. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Μετατρέπει τα δεδομένα XML στο αρχείο εισόδου και εξάγει το αποτέλεσμα σε ένα αρχείο εξόδου.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputfile | const String\& | Το URL του πηγαίου εγγράφου που θα μετατραπεί. |
| outputfile | const String\& | Το URL του αρχείου εξόδου. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση της συνάρτησης XSLT **document()**. Εάν αυτό είναι **nullptr**, η συνάρτηση **document()** δεν επιλύεται. Ο [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση της μεθόδου [XslTransform::Transform](./). |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
