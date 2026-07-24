---
title: "System::Xml::Xsl::XslTransform::Load μέθοδος"
linktitle: "Φόρτωση"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XslTransform::Load μέθοδος. Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο IXPathNavigable σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει το φύλλο στυλ XSLT. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένας [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένας [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει το φύλλο στυλ XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για τη φόρτωση τυχόν φύλλων στυλ που αναφέρονται στα στοιχεία **xsl:import** και **xsl:include**. Εάν είναι **nullptr**, οι εξωτερικοί πόροι δεν επιλύονται. Το [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| φύλλο στυλ | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένα αντικείμενο XPathNavigator που περιέχει το φύλλο στυλ XSLT. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| φύλλο στυλ | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ένα αντικείμενο XPathNavigator που περιέχει το φύλλο στυλ XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για τη φόρτωση τυχόν φύλλων στυλ που αναφέρονται στα στοιχεία **xsl:import** και **xsl:include**. Εάν είναι **nullptr**, οι εξωτερικοί πόροι δεν επιλύονται. Το [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Ένα αντικείμενο [XmlReader](../../../system.xml/xmlreader/) που περιέχει το φύλλο στυλ XSLT. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Ένα αντικείμενο [XmlReader](../../../system.xml/xmlreader/) που περιέχει το φύλλο στυλ XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για τη φόρτωση τυχόν φύλλων στυλ που αναφέρονται στα στοιχεία **xsl:import** και **xsl:include**. Εάν είναι **nullptr**, οι εξωτερικοί πόροι δεν επιλύονται. Το [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&) method


Φορτώνει το φύλλο στυλ XSLT που καθορίζεται από ένα URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| url | const String\& | Το URL που καθορίζει το φύλλο στυλ XSLT προς φόρτωση. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Φορτώνει το φύλλο στυλ XSLT που καθορίζεται από ένα URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| url | const String\& | Το URL που καθορίζει το φύλλο στυλ XSLT προς φόρτωση. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) που θα χρησιμοποιηθεί για τη φόρτωση του φύλλου στυλ και τυχόν φύλλων στυλ που αναφέρονται στα στοιχεία **xsl:import** και **xsl:include**. Εάν είναι **nullptr**, χρησιμοποιείται ένας προεπιλεγμένος [XmlUrlResolver](../../../system.xml/xmlurlresolver/) χωρίς διαπιστευτήρια χρήστη για το άνοιγμα του φύλλου στυλ. Ο προεπιλεγμένος [XmlUrlResolver](../../../system.xml/xmlurlresolver/) δεν χρησιμοποιείται για την επίλυση εξωτερικών πόρων στο φύλλο στυλ, έτσι τα στοιχεία **xsl:import** και **xsl:include** δεν επιλύονται. Το [XmlResolver](../../../system.xml/xmlresolver/) δεν αποθηκεύεται στην κρυφή μνήμη μετά την ολοκλήρωση αυτής της μεθόδου. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
