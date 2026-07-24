---
title: "Μέθοδος System::Xml::Xsl::XslCompiledTransform::Load"
linktitle: "Φόρτωση"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::Xsl::XslCompiledTransform::Load. Μεταγλωττίζει το φύλλο στυλ που περιέχεται στο αντικείμενο IXPathNavigable σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Μεταγλωττίζει το φύλλο στυλ που περιέχεται στο αντικείμενο IXPathNavigable.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένα [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένα [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει το φύλλο στυλ. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


Μεταγλωττίζει το φύλλο στυλ XSLT που περιέχεται στο IXPathNavigable. Το [XmlResolver](../../../system.xml/xmlresolver/) επιλύει τυχόν στοιχεία XSLT **import** ή **include** και οι ρυθμίσεις XSLT καθορίζουν τα δικαιώματα για το φύλλο στυλ.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ένα αντικείμενο που υλοποιεί τη διεπαφή IXPathNavigable. Μπορεί να είναι είτε ένα [XmlNode](../../../system.xml/xmlnode/) (συνήθως ένα [XmlDocument](../../../system.xml/xmldocument/)), είτε ένα XPathDocument που περιέχει το φύλλο στυλ. |
| settings | SharedPtr\<XsltSettings\> | Τα [XsltSettings](../../xsltsettings/) που θα εφαρμοστούν στο φύλλο στυλ. Εάν αυτό είναι **nullptr**, εφαρμόζεται η ρύθμιση [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | SharedPtr\<XmlResolver\> | Το [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση τυχόν φύλλων στυλ που αναφέρονται σε στοιχεία XSLT **import** και **include**. Εάν αυτό είναι **nullptr**, οι εξωτερικοί πόροι δεν επιλύονται. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


Μεταγλωττίζει το φύλλο στυλ που περιέχεται στο [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Ένα [XmlReader](../../../system.xml/xmlreader/) που περιέχει το φύλλο στυλ. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Μεταγλωττίζει το φύλλο στυλ XSLT που περιέχεται στο [XmlReader](../../../system.xml/xmlreader/). Το [XmlResolver](../../../system.xml/xmlresolver/) επιλύει τυχόν στοιχεία XSLT **import** ή **include** και οι ρυθμίσεις XSLT καθορίζουν τα δικαιώματα για το φύλλο στυλ.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Το [XmlReader](../../../system.xml/xmlreader/) που περιέχει το φύλλο στυλ. |
| settings | const SharedPtr\<XsltSettings\>\& | Τα [XsltSettings](../../xsltsettings/) που θα εφαρμοστούν στο φύλλο στυλ. Εάν αυτό είναι **nullptr**, εφαρμόζεται η ρύθμιση [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση τυχόν φύλλων στυλ που αναφέρονται σε στοιχεία XSLT **import** και **include**. Εάν αυτό είναι **nullptr**, οι εξωτερικοί πόροι δεν επιλύονται. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Φορτώνει και μεταγλωττίζει το φύλλο στυλ που βρίσκεται στο καθορισμένο URI.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheetUri | const String\& | Το URI του φύλλου στυλ. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Φορτώνει και μεταγλωττίζει το φύλλο στυλ XSLT που καθορίζεται από το URI. Το [XmlResolver](../../../system.xml/xmlresolver/) επιλύει τυχόν στοιχεία XSLT **import** ή **include** και οι ρυθμίσεις XSLT καθορίζουν τα δικαιώματα για το φύλλο στυλ.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| stylesheetUri | const String\& | Το URI του φύλλου στυλ. |
| settings | const SharedPtr\<XsltSettings\>\& | Τα [XsltSettings](../../xsltsettings/) που θα εφαρμοστούν στο φύλλο στυλ. Εάν αυτό είναι **nullptr**, εφαρμόζεται η ρύθμιση [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Το [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση του URI του φύλλου στυλ και τυχόν φύλλων στυλ που αναφέρονται σε στοιχεία XSLT **import** και **include**. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
